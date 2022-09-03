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
public class Admission {
    
    WebDriver driver = null;
    @Test(priority = 1)
    public void main() throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", "C:\\MySkoolERP\\software\\chrome driver\\chromedriver.exe");
        driver = new ChromeDriver();
    }
    
    
    @Test(priority = 2)
    public void Login() throws InterruptedException{
        driver.get(Setup.loginURL);
        
        String username = Setup.username;
        String password = Setup.password;
        driver.findElement(By.id("myInput2")).sendKeys(username);
        driver.findElement(By.id("myInput")).sendKeys(password);
        
        //Click on Login          
        WebElement loginBtn = driver.findElement(By.id("myBtn"));
        loginBtn.click();    
    }
    
    @Test (priority = 3)
    public void admission() throws InterruptedException{
        Thread.sleep(3000);
        ((JavascriptExecutor)driver).executeScript("window.location.assign('"+Setup.admissionLink+"');");
        /*
        // click for search Student 
        WebElement search_stu = driver.findElement(By.xpath("//*[@id=\"s2id_fadmissionIDs\"]/a"));
        search_stu.click();
        WebElement search_st = driver.findElement(By.xpath("//*[@id='select2-drop']/div/input"));
        search_st.sendKeys(Setup.regStuName+", Class: "+Setup.registrationClass+", Father_name: "+Setup.regStuFatherName+", Mother_name: "+Setup.regStuMotherName+", Address: "+Setup.regStuAddress);
        
        WebElement select_student = driver.findElement(By.xpath("//*[@id=\"select2-drop\"]/ul/li[1]"));
        select_student.click();
        
        // Fetch Student Registration Details 
        WebElement getStudent = driver.findElement(By.id("get-btn"));
        getStudent.click();
        */
        
        // <========= Fill Student Admission Data ========>
    
        Thread.sleep(3000);
        Dictionary adm = new Hashtable();
        
        // All Select Tag 
        List<WebElement> select = driver.findElements(By.tagName("select"));
        adm.put("adm_st_class", Setup.adm_st_class);
        adm.put("adm_st_section", Setup.adm_st_section);
        adm.put("adm_st_hostel", Setup.adm_st_hostel);
        adm.put("adm_st_gender", Setup.adm_st_gender);
        adm.put("adm_st_bloodgroup", Setup.adm_st_bloodgroup);
        adm.put("adm_st_res_cat", Setup.adm_st_res_cat);
        adm.put("adm_st_cat", Setup.adm_st_cat);
        adm.put("adm_st_mother_prof", Setup.adm_st_mother_prof);
        adm.put("adm_st_father_prof", Setup.adm_st_father_prof);
        adm.put("adm_st_religion", Setup.adm_st_religion);
        adm.put("adm_st_state", Setup.adm_st_state);
        adm.put("adm_st_district", Setup.adm_st_district);
    
        for(int i=0; i<select.size(); i++){
        
            String id = select.get(i).getAttribute("id");
            String value = select.get(i).getAttribute("value");
            switch(id){
                case "classesID" -> {
                    if("".equals(value)){
                        WebElement classesID = driver.findElement(By.xpath("//*[@id=\"classesID\"]/option[3]"));
                        classesID.click();
                    }
                    break;
                }
                case "sectionID" -> {
                    if("".equals(value)){        
                    Thread.sleep(3000);
                    WebElement sectionID = driver.findElement(By.xpath("//*[@id=\"sectionID\"]/option[2]"));
                        sectionID.click();
                    }
                    break;
                }
                case "hostel" -> {
                    if("".equals(value)){
                        WebElement hostel = driver.findElement(By.xpath("//*[@id=\"hostel\"]/option[2]"));
                        hostel.click();
                    }
                    break;
                }
                case "sex" -> {
                    if("".equals(value)){
                        WebElement category = driver.findElement(By.xpath("//*[@id=\"sex\"]/option[1]"));
                        category.click();
                    }
                    break;
                }
                case "bloodgroup" -> {
                    if("".equals(value)){
                        WebElement bloodgroup = driver.findElement(By.xpath("//*[@id=\"bloodgroup\"]/option[3]"));
                        bloodgroup.click();
                    }
                    break;
                }
                case "reservationcategory" -> {
                    if("".equals(value)){
                        WebElement reservationcategory = driver.findElement(By.xpath("//*[@id=\"reservationcategory\"]/option[4]"));
                        reservationcategory.click();
                    }
                    break;
                }
                case "category" -> {
                    if("".equals(value)){
                        WebElement category = driver.findElement(By.xpath("//*[@id=\"category\"]/option[3]"));
                        category.click();
                    }
                    break;
                }
                case "mother_profession" -> {
                    if("".equals(value)){
                        WebElement sex = driver.findElement(By.xpath("//*[@id='mother_profession']/option[2]"));
                        sex.click();
                    }
                    break;
                }
                case "father_profession" -> {
                    if("".equals(value)){
                        WebElement sex = driver.findElement(By.xpath("//*[@id=\"father_profession\"]/option[2]"));
                        sex.click();
                    }
                    break;
                }
                case "religion" -> {
                    WebElement religion = driver.findElement(By.xpath("//*[@id=\"religion\"]/option[3]"));
                    religion.click();
                    break;
                }
                case "state" -> {
                    if("".equals(value)){
                        WebElement state = driver.findElement(By.xpath("//*[@id='state']/option[5]"));
                        state.click();
                    }
                    break;
                }
                case "district" -> {
                    Thread.sleep(3000);
                    WebElement disttrict = driver.findElement(By.xpath("//*[@id='district']/option[3]"));
                    disttrict.click();
                    break;
                }
                default -> {
                    break;
                }
            } //  -> End Switch
        } // ->End for loop
        
        // for input fields
        adm.put("adm_st_photo", Setup.adm_st_photo);
        adm.put("adm_st_name", Setup.adm_st_name);
        adm.put("adm_st_roll", Setup.adm_st_roll);
        adm.put("adm_st_dob", Setup.adm_st_dob);
        adm.put("adm_st_aadhar", Setup.adm_st_aadhar);
        adm.put("adm_st_mother_name", Setup.adm_st_mother_qual);
        adm.put("adm_st_mother_qual", Setup.adm_st_mother_qual);
        adm.put("adm_st_father_name", Setup.adm_st_father_name);
        adm.put("adm_st_father_qual", Setup.adm_st_father_qual);
        adm.put("adm_st_whatsapp_no", Setup.adm_st_whatsapp_no);
        adm.put("adm_st_phone_no", Setup.adm_st_phone_no);
        adm.put("adm_st_alt_phone_no", Setup.adm_st_alt_phone_no);
        adm.put("adm_st_email", Setup.adm_st_email);
        adm.put("adm_st_address", Setup.adm_st_address);
        adm.put("adm_st_permanent_address", Setup.adm_st_permanent_address);
        
        List<WebElement> input = driver.findElements(By.tagName("input"));
        
        for(int i=0; i<input.size(); i++){
            String name = input.get(i).getAttribute("id");
            String value = input.get(i).getAttribute("value");
            switch(name){
                case "btn-photo" -> {
                    if("".equals(value)){
                        input.get(i).clear();
                        input.get(i).sendKeys(adm.get("adm_st_photo").toString());                            
                    }
                    break;
                }
                case "name" -> {
                    if("".equals(value)){
                        input.get(i).clear();
                        input.get(i).sendKeys(adm.get("adm_st_name").toString());                            
                    }
                    break;
                }
                case "roll" -> {
                    if("".equals(value)){
                        ((JavascriptExecutor)driver).executeScript ("document.getElementById('roll').removeAttribute('readonly');"); 
                        input.get(i).clear();
                        input.get(i).sendKeys(adm.get("adm_st_roll").toString());                            
                    }
                    break;
                }
                case "father_name" -> {
                    if("".equals(value)){
                        input.get(i).clear();
                        input.get(i).sendKeys(adm.get("adm_st_father_name").toString());                            
                    }
                    break;
                }
                case "mother_name" -> {
                    if("".equals(value)){
                        input.get(i).clear();
                        input.get(i).sendKeys(adm.get("adm_st_mother_name").toString());                            
                    }
                    break;
                }
                case "phone" -> {
                    if("".equals(value)){
                        input.get(i).clear();
                        input.get(i).sendKeys(adm.get("adm_st_phone_no").toString());                            
                    }
                    break;
                }
                case "whatsapp" -> {
                    if("".equals(value)){
                        input.get(i).clear();
                        input.get(i).sendKeys(adm.get("adm_st_whatsapp_no").toString());                            
                    }
                    break;
                }
                case "email" -> {
                    if("".equals(value)){
                        input.get(i).clear();
                        input.get(i).sendKeys(adm.get("adm_st_email").toString());                            
                    }
                    break;
                }
                case "alternate_contact_no" -> {
                    if("".equals(value)){
                        input.get(i).clear();
                        input.get(i).sendKeys(adm.get("adm_st_alt_phone_no").toString());                            
                    }
                    break;
                }
                case "address" -> {
                    if("".equals(value)){
                        input.get(i).clear();
                        input.get(i).sendKeys(adm.get("adm_st_address").toString());                            
                    }
                    break;
                }
                case "permanent_address" -> {
                    if("".equals(value)){
                        input.get(i).clear();
                        input.get(i).sendKeys(adm.get("adm_st_permanent_address").toString());
                    }
                    break;
                }
                case "password" -> {
                    if("".equals(value)){
                        input.get(i).clear();
                        input.get(i).sendKeys(adm.get("password").toString());                            
                    }
                    break;
                }
                case "aadhar_no" -> {
                    if("".equals(value)){
                        input.get(i).clear();
                        input.get(i).sendKeys(adm.get("adm_st_aadhar").toString());                            
                    }
                    break;
                }
                case "mother_qualification" -> {
                    if("".equals(value)){
                        input.get(i).clear();
                        input.get(i).sendKeys(adm.get("adm_st_mother_qual").toString());                            
                    }
                    break;
                }
                case "father_qualification" -> {
                    if("".equals(value)){
                        input.get(i).clear();
                        input.get(i).sendKeys(adm.get("adm_st_father_qual").toString());
                    }
                    break;
                }
                
                // Date 
                case "dob" -> {
                    if("".equals(value)){
                        ((JavascriptExecutor)driver).executeScript ("document.getElementById('dob').value='';"); // null addmission date 
                        ((JavascriptExecutor)driver).executeScript ("document.getElementById('dob').removeAttribute('readonly');"); // Enables the from date box

                        WebElement fromDateBox= driver.findElement(By.id("dob"));
                        fromDateBox.clear();
                        fromDateBox.sendKeys(adm.get("adm_st_dob").toString()); //Enter date in required format
                    }
                    break;
                }
                case "anniversary_date" -> {
                    if("".equals(value)){                        
                        ((JavascriptExecutor)driver).executeScript ("document.getElementById('anniversary_date').setAttribute('value', '');"); // null addmission date 
                        ((JavascriptExecutor)driver).executeScript ("document.getElementById('anniversary_date').removeAttribute('readonly');"); // Enables the from date box

                        WebElement fromDateBox= driver.findElement(By.id("anniversary_date"));
                        fromDateBox.clear();
                        fromDateBox.sendKeys(adm.get("anniversary_date").toString()); //Enter date in required format
                    }
                    break;
                }
                default -> {
                    break;
                }
            }
        }
        
        // click on next btn for go to payment 
        WebElement next_btn = driver.findElement(By.xpath("//*[@id='next-btn']"));
        next_btn.click();
        
        Thread.sleep(5000);
        WebElement collect_payment_btn = driver.findElement(By.xpath("//*[@id=\"section-sub-view\"]/div[1]/div[3]/div/div/div/div/a[4]"));
        collect_payment_btn.click();
        
        Thread.sleep(5000);
        driver.findElement(By.id("getpart3")).click();
//        WebElement get_payment_mode = driver.findElement(By.id("getpart3"));
  //      get_payment_mode.click(); 
        
        // Select payment mode
        WebElement pay_type = driver.findElement(By.xpath("//*[@id='paytypeID']/option[2]"));
        pay_type.click();
        
        // Select payment bank type
        WebElement bank_type = driver.findElement(By.xpath("//*[@id='bank_id']/option[text()='Cash In Hand']"));
        bank_type.click();
        
        // Save Final Payment
        WebElement save_payment = driver.findElement(By.id("savepart3"));
        save_payment.click();
        
        Thread.sleep(2000);
        Alert alert = driver.switchTo().alert(); // switch to alert
        alert.accept();
        
        
    }
}