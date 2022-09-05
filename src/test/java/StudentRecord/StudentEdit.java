/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StudentRecord;

import Config.Setup;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 *
 * @author Rajeev
 */
public class StudentEdit {
    
    // click student edit button 
    public void st_edit_btn(WebDriver driver) throws InterruptedException{
        Thread.sleep(8000);
        WebElement StudentEditBtn = driver.findElement(By.xpath("//td[@data-title='Action']/a[2]"));
        StudentEditBtn.click();        
    }
    
    // Fill Student Edit Details
    public void fill_student_edit_details(WebDriver driver) throws InterruptedException{
        List<WebElement> input = driver.findElements(By.tagName("input"));
        
        Dictionary dict = new Hashtable();
        dict.put("name", Setup.EditStudentName);
        dict.put("roll", Setup.EditStudentRoll);
        dict.put("father_name", Setup.EditStudentFatherName);
        dict.put("mother_name", Setup.EditStudentMotherName);
        dict.put("email", Setup.Editemail);
        dict.put("phone", Setup.Editphone);
        dict.put("alternate_contact_no", Setup.Editalt_contact);
        dict.put("address", Setup.Editaddress);
        dict.put("permanent_address", Setup.Editpermanent_address);
        dict.put("password", Setup.EditStudentPassword);
        dict.put("aadhar_no", Setup.Editaadhar_no);
        dict.put("father_profession", Setup.Editfather_profession);
        dict.put("mother_profession", Setup.Editmother_profession);
        dict.put("mother_qualification", Setup.Editmother_qualification);
        dict.put("father_qualification", Setup.Editfather_qualification);
        dict.put("date_of_admission", Setup.Editdate_of_admission);
        dict.put("dob", Setup.Editdob);
        dict.put("anniversary_date", Setup.Editanniversary_date);
        dict.put("photo", Setup.Editphoto);
        dict.put("changesnote", Setup.changesnote);
        dict.put("approvedby", Setup.approvedby);
        for(int i=0; i<input.size(); i++){
            
            String name = input.get(i).getAttribute("name");
            String value = input.get(i).getAttribute("value");
            
            switch(name){
                case "name" -> {
                    if(!"".equals(dict.get("name").toString())){
                        input.get(i).clear();
                        input.get(i).sendKeys(dict.get("name").toString());                            
                    }
                    break;
                }
                case "roll" -> {
                    if(!"".equals(dict.get("roll").toString())){
                        input.get(i).clear();
                        input.get(i).sendKeys(dict.get("roll").toString());                            
                    }
                    break;
                }
                case "father_name" -> {
                    if(!"".equals(dict.get("father_name").toString())){
                        input.get(i).clear();
                        input.get(i).sendKeys(dict.get("father_name").toString());                            
                    }
                    break;
                }
                case "mother_name" -> {
                    if(!"".equals(dict.get("mother_name").toString())){
                        input.get(i).clear();
                        input.get(i).sendKeys(dict.get("mother_name").toString());                            
                    }
                    break;
                }
                case "phone" -> {
                    if(!"".equals(dict.get("phone").toString())){
                        input.get(i).clear();
                        input.get(i).sendKeys(dict.get("phone").toString());                            
                    }
                    break;
                }
                case "email" -> {
                    if(!"".equals(dict.get("email").toString())){
                        input.get(i).clear();
                        input.get(i).sendKeys(dict.get("email").toString());                            
                    }
                    break;
                }
                case "alternate_contact_no" -> {
                    if(!"".equals(dict.get("alternate_contact_no").toString())){
                        input.get(i).clear();
                        input.get(i).sendKeys(dict.get("alternate_contact_no").toString());                            
                    }
                    break;
                }
                case "address" -> {
                    if(!"".equals(dict.get("address").toString())){
                        input.get(i).clear();
                        input.get(i).sendKeys(dict.get("address").toString());                            
                    }
                    break;
                }
                case "permanent_address" -> {
                    if(!"".equals(dict.get("permanent_address").toString())){
                        input.get(i).clear();
                        input.get(i).sendKeys(dict.get("permanent_address").toString());                            
                    }
                    break;
                }
                case "password" -> {
                    if(!"".equals(dict.get("password").toString())){
                        input.get(i).clear();
                        input.get(i).sendKeys(dict.get("password").toString());                            
                    }
                    break;
                }
                case "aadhar_no" -> {
                    if(!"".equals(dict.get("aadhar_no").toString())){
                        input.get(i).clear();
                        input.get(i).sendKeys(dict.get("aadhar_no").toString());                            
                    }
                    break;
                }
                case "father_profession" -> {
                    if(!"".equals(dict.get("father_profession").toString())){
                        input.get(i).clear();
                        input.get(i).sendKeys(dict.get("father_profession").toString());                            
                    }
                    break;
                }
                case "mother_profession" -> {
                    if(!"".equals(dict.get("mother_profession").toString())){
                        input.get(i).clear();
                        input.get(i).sendKeys(dict.get("mother_profession").toString());                            
                    }
                    break;
                }
                case "mother_qualification" -> {
                    if(!"".equals(dict.get("mother_qualification").toString())){
                        input.get(i).clear();
                        input.get(i).sendKeys(dict.get("mother_qualification").toString());                            
                    }
                    break;
                }
                case "father_qualification" -> {
                    if(!"".equals(dict.get("father_qualification").toString())){
                        input.get(i).clear();
                        input.get(i).sendKeys(dict.get("father_qualification").toString());                            
                    }
                    break;
                }
                case "changesnote" -> {
                    if(!"".equals(dict.get("changesnote").toString())){
                        input.get(i).clear();
                        input.get(i).sendKeys(dict.get("changesnote").toString());                            
                    }
                    break;
                }
                case "approvedby" -> {
                    if(!"".equals(dict.get("approvedby").toString())){
                        input.get(i).clear();
                        input.get(i).sendKeys(dict.get("approvedby").toString());
                    }
                    break;
                }
                case "date_of_admission" -> {                        
                    if(!"".equals(dict.get("date_of_admission").toString())){                        
                        ((JavascriptExecutor)driver).executeScript ("document.getElementById('date_of_admission').value='';"); // null addmission date 
                        ((JavascriptExecutor)driver).executeScript ("document.getElementById('date_of_admission').removeAttribute('readonly');"); // Enables the from date box

                        WebElement fromDateBox= driver.findElement(By.id("date_of_admission"));
                        fromDateBox.clear();
                        fromDateBox.sendKeys(dict.get("date_of_admission").toString()); //Enter date in required format
                    }
                    break;
                }
                case "dob" -> {
                    if(!"".equals(dict.get("dob").toString())){                        
                        ((JavascriptExecutor)driver).executeScript ("document.getElementById('dob').value='';"); // null addmission date 
                        ((JavascriptExecutor)driver).executeScript ("document.getElementById('dob').removeAttribute('readonly');"); // Enables the from date box

                        WebElement fromDateBox= driver.findElement(By.id("dob"));
                        fromDateBox.clear();
                        fromDateBox.sendKeys(dict.get("dob").toString()); //Enter date in required format
                    }
                    break;
                }
                case "anniversary_date" -> {
                    if(!"".equals(dict.get("anniversary_date").toString())){                        
                        ((JavascriptExecutor)driver).executeScript ("document.getElementById('anniversary_date').setAttribute('value', '');"); // null addmission date 
                        ((JavascriptExecutor)driver).executeScript ("document.getElementById('anniversary_date').removeAttribute('readonly');"); // Enables the from date box

                        WebElement fromDateBox= driver.findElement(By.id("anniversary_date"));
                        fromDateBox.clear();
                        fromDateBox.sendKeys(dict.get("anniversary_date").toString()); //Enter date in required format
                    }
                    break;
                }
                case "photo" -> {
                    if(!"".equals(dict.get(dict.get("photo").toString()))){                        
                    input.get(i).clear();
                    input.get(i).sendKeys(dict.get("photo").toString());
                    }
                    break;
                }
                default -> {
                    break;
                }
            }
        }
        
        
        // All Select Tag 
        List<WebElement> select = driver.findElements(By.tagName("select"));
        dict.put("sex", Setup.EditStudentGender);
        dict.put("category", Setup.EditStudentCategory);
        dict.put("reservationcategory", Setup.EditStudentResCategory);
        dict.put("classesID", Setup.EditStudentClassesID);
        dict.put("sectionID", Setup.EditStudentSectionID);
        dict.put("hostel", Setup.EditStudentHostel);
        
        for(int i=0; i<select.size(); i++){
            
            String name = select.get(i).getAttribute("name");
            
            switch(name){
                case "category" -> {
                    WebElement category = driver.findElement(By.xpath("//*[@id=\"category\"]/option[3]"));
                    category.click();
                }
                case "reservationcategory" -> {
                    WebElement reservationcategory = driver.findElement(By.xpath("//*[@id=\"reservationcategory\"]/option[4]"));
                    reservationcategory.click();
                }
                case "classesID" -> {
                    WebElement classesID = driver.findElement(By.xpath("//*[@id=\"classesID\"]/option[3]"));
                    classesID.click();
                }
                case "sectionID" -> {
                    WebElement sectionID = driver.findElement(By.xpath("//*[@id=\"sectionID\"]/option[2]"));
                    sectionID.click();
                }
                case "hostel" -> {
                    WebElement hostel = driver.findElement(By.xpath("//*[@id=\"hostel\"]/option[2]"));
                    hostel.click();
                }
                case "sex" -> {
                    WebElement sex = driver.findElement(By.xpath("//*[@id=\"sex\"]/option[2]"));
                    sex.click();
                }
                case "religion" -> {
                    WebElement religion = driver.findElement(By.xpath("//*[@id=\"religion\"]/option[3]"));
                    religion.click();
                }
                case "bloodgroup" -> {
                    WebElement bloodgroup = driver.findElement(By.xpath("//*[@id=\"bloodgroup\"]/option[3]"));
                    bloodgroup.click();
                }
                default -> {
                }
            } //  -> End Switch
        } // ->End for loop
        
        
    }//-> End Method
    
    
    // click on save button for update 
    public void click_update_btn(WebDriver driver){
        WebElement update = driver.findElement(By.xpath("//button[@type='submit' and text() = 'Save']"));
        update.click();
    }
    
    // Go on student view page 
    public void student_view_page(WebDriver driver) throws InterruptedException{
        Thread.sleep(2000);
       ((JavascriptExecutor)driver).executeScript("window.location.assign('"+Setup.studentPageURL+"');");
    }
}
