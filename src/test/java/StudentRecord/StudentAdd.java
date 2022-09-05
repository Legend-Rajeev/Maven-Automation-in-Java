package Student;

import Config.Setup;
import java.util.*;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 *
 * @author Rajeev
 */
public class StudentAdd {
    public void fill_student_details(WebDriver driver) throws InterruptedException{
        Thread.sleep(3000);
       ((JavascriptExecutor)driver).executeScript("window.location.assign('"+Setup.studentadd+"');");

        // All Input Tag 
        List<WebElement> input = driver.findElements(By.tagName("input"));
        Dictionary dict = new Hashtable();
        dict.put("name", Setup.StudentName);
        dict.put("roll", Setup.StudentRoll);
        dict.put("father_name", Setup.StudentFatherName);
        dict.put("mother_name", Setup.StudentMotherName);
        dict.put("email", Setup.email);
        dict.put("phone", Setup.phone);
        dict.put("alternate_contact_no", Setup.alt_contact);
        dict.put("address", Setup.address);
        dict.put("permanent_address", Setup.permanent_address);
        dict.put("password", Setup.StudentPassword);
        dict.put("aadhar_no", Setup.aadhar_no);
        dict.put("father_profession", Setup.father_profession);
        dict.put("mother_profession", Setup.mother_profession);
        dict.put("mother_qualification", Setup.mother_qualification);
        dict.put("father_qualification", Setup.father_qualification);
        dict.put("date_of_admission", Setup.date_of_admission);
        dict.put("dob", Setup.dob);
        dict.put("anniversary_date", Setup.anniversary_date);
        dict.put("photo", Setup.photo);
        for(int i=0; i<input.size(); i++){
            
            String name = input.get(i).getAttribute("name");
            String value = input.get(i).getAttribute("value");
            if(value == null || value == ""){
                switch(name){
                    case "name" -> {
                        input.get(i).sendKeys(dict.get("name").toString());
                        break;
                    }
                    case "roll" -> {
                        input.get(i).sendKeys(dict.get("roll").toString());
                        break;
                    }
                    case "father_name" -> {
                        input.get(i).sendKeys(dict.get("father_name").toString());
                        break;
                    }
                    case "mother_name" -> {
                        input.get(i).sendKeys(dict.get("mother_name").toString());
                        break;
                    }
                    case "email" -> {
                        input.get(i).sendKeys(dict.get("email").toString());
                        break;
                    }
                    case "phone" -> {
                        input.get(i).sendKeys(dict.get("phone").toString());
                        break;
                    }
                    case "alternate_contact_no" -> {
                        input.get(i).sendKeys(dict.get("alternate_contact_no").toString());
                        break;
                    }
                    case "address" -> {
                        input.get(i).sendKeys(dict.get("address").toString());
                        break;
                    }
                    case "permanent_address" -> {
                        input.get(i).sendKeys(dict.get("permanent_address").toString());
                        break;
                    }
                    case "password" -> {
                        input.get(i).sendKeys(dict.get("password").toString());
                        break;
                    }
                    case "aadhar_no" -> {
                        input.get(i).sendKeys(dict.get("aadhar_no").toString());
                        break;
                    }
                    case "father_profession" -> {
                        input.get(i).sendKeys(dict.get("father_profession").toString());
                        break;
                    }
                    case "mother_profession" -> {
                        input.get(i).sendKeys(dict.get("mother_profession").toString());
                        break;
                    }
                    case "mother_qualification" -> {
                        input.get(i).sendKeys(dict.get("mother_qualification").toString());
                        break;
                    }
                    case "father_qualification" -> {
                        input.get(i).sendKeys(dict.get("father_qualification").toString());
                        break;
                    }
                    case "date_of_admission" -> {
                        ((JavascriptExecutor)driver).executeScript ("document.getElementById('date_of_admission').removeAttribute('readonly');"); // Enables the from date box

                        WebElement fromDateBox= driver.findElement(By.id("date_of_admission"));
                        fromDateBox.clear();
                        fromDateBox.sendKeys(dict.get("date_of_admission").toString()); //Enter date in required format
                        break;
                    }
                    case "dob" -> {
                        ((JavascriptExecutor)driver).executeScript ("document.getElementById('dob').removeAttribute('readonly');"); // Enables the from date box

                        WebElement fromDateBox= driver.findElement(By.id("dob"));
                        fromDateBox.clear();
                        fromDateBox.sendKeys(dict.get("dob").toString()); //Enter date in required format
                        break;
                    }
                    case "anniversary_date" -> {
                        ((JavascriptExecutor)driver).executeScript ("document.getElementById('anniversary_date').removeAttribute('readonly');"); // Enables the from date box

                        WebElement fromDateBox= driver.findElement(By.id("anniversary_date"));
                        fromDateBox.clear();
                        fromDateBox.sendKeys(dict.get("anniversary_date").toString()); //Enter date in required format
                        break;
                    }
                    case "photo" -> {
                        input.get(i).sendKeys(dict.get("photo").toString());
                        break;
                    }                    
                    default -> {
                        break;
                    }
                }
            }
        }
        
        // All Select Tag 
        List<WebElement> select = driver.findElements(By.tagName("select"));
        dict.put("sex", Setup.StudentGender);
        dict.put("category", Setup.StudentCategory);
        dict.put("reservationcategory", Setup.StudentResCategory);
        dict.put("classesID", Setup.StudentClassesID);
        dict.put("sectionID", Setup.StudentSectionID);
        dict.put("hostel", Setup.StudentHostel);
        
        for(int i=0; i<select.size(); i++){
            String name = select.get(i).getAttribute("name");
            
            switch(name){
                case "sex" -> {
                    String[] sexData = {"Male", "Female"};
                    for(String val : sexData){
                        if(val.equals(dict.get("sex").toString())){
                            WebElement sexType  = driver.findElement(By.xpath("//*[@id='sex']/option[@value='"+dict.get("sex").toString()+"']"));
                            sexType.click();
                        }
                    }
                    break;
                }
                case "category" -> {
                    String[] categoryData = {"Genral", "O.B.C", "Rural", "Muslim"};
                    for(String val : categoryData){
                        if(val.equals(dict.get("category").toString())){
                            WebElement categoryType  = driver.findElement(By.xpath("//*[@id='category']/option[@value='"+dict.get("category").toString()+"']"));
                            categoryType.click();
                        }
                    }
                    break;
                }
                case "reservationcategory" -> {
                    WebElement SchoolStaff = driver.findElement(By.xpath("//*[@id='reservationcategory']/option[@value='School Staff']"));
                    SchoolStaff.click();
                    break;
                }
                case "classesID" -> {
                    WebElement two = driver.findElement(By.xpath("//*[@id='classesID']/option[@value='5']"));
                    two.click();
                    break;
                }
                case "sectionID" -> {
                    WebElement sectionA = driver.findElement(By.xpath("//*[@id=\"sectionID\"]/option[2]"));
                    sectionA.click(); 
                    break;
                }
                case "hostel" -> {
                    WebElement hostel = driver.findElement(By.xpath("//*[@id=\"hostel\"]/option[2]"));
                    hostel.click();                     
                    break;
                }
                default -> {
                    break;
                }
            }
        }
        
        
        
        
        
       
    } 
    
    // Get student username value
    public String stusernamevalue(WebDriver driver){
        WebElement username = driver.findElement(By.id("username"));
        String usernameValue = username.getAttribute("value");
        return usernameValue;
    }
    
    // Now click on submit button for save student data
    public void submit_student_details(WebDriver driver){
        WebElement submit = driver.findElement(By.xpath("//input[@type='submit'][@value='Save']"));
        submit.click();    
    }
    
    // Go on View Student Page 
    public void view_student(WebDriver driver) throws InterruptedException{
        Thread.sleep(3000);
       ((JavascriptExecutor)driver).executeScript("window.location.assign('"+Setup.studentPageURL+"');");
       
    }
    
    // Search student by student username value
    public void get_student_username(WebDriver driver, String stvalue) throws InterruptedException{
       Thread.sleep(3000);
       WebElement search_box = driver.findElement(By.xpath("//*[@id='example1nx_filter']/label/input[@type='search']"));
       search_box.sendKeys(stvalue);
    }    
    
}