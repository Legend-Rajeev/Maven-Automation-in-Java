package StudentRecord;

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
public class Registration {
    
    public void registrationDetails(WebDriver driver) throws InterruptedException{
        driver.get(Setup.websiteLink);
        
        Thread.sleep(3000);
        ((JavascriptExecutor)driver).executeScript("window.location.assign('"+Setup.registrationLink+"');");
        
        // Create Dictionary for Student Registration
        Dictionary stReg = new Hashtable();
        stReg.put("registrationYear", Setup.registrationYear);
        stReg.put("registrationClass", Setup.registrationClass);
        stReg.put("regStuPhoto", Setup.regStuPhoto);
        stReg.put("regStuName", Setup.regStuName);
        stReg.put("trans_cert_photo", Setup.trans_cert_photo);
        stReg.put("regStuGender", Setup.regStuGender);
        stReg.put("regStuAdharno", Setup.regStuAdharno);
        stReg.put("regStuDob", Setup.regStuDob);
        stReg.put("regStuLastSchool", Setup.regStuLastSchool);
        stReg.put("regStuSblStudy", Setup.regStuSblStudy);
        stReg.put("regStuFatherName", Setup.regStuFatherName);
        stReg.put("regStuTotalMarks", Setup.regStuTotalMarks);
        stReg.put("regStuMarksObtained", Setup.regStuMarksObtained);
        stReg.put("regStuMotherName", Setup.regStuMotherName);
        stReg.put("regStuAnnualIncome", Setup.regStuAnnualIncome);
        stReg.put("regStuTransCertNo", Setup.regStuTransCertNo);
        stReg.put("regStuMobNo", Setup.regStuMobNo);
        stReg.put("regStuTCisuDate", Setup.regStuTCisuDate);
        stReg.put("regStuEmail", Setup.regStuEmail);
        stReg.put("regStuAddress", Setup.regStuAddress);
        stReg.put("regStuPermAddress", Setup.regStuPermAddress);
        stReg.put("regStuPrevMarksheet", Setup.regStuPrevMarksheet);
        stReg.put("regStuAltContNo", Setup.regStuAltContNo);
        
        
        
        // Registration Year Data 
        String [] sessionYears = {"2022-2023","2023-2024","2024-2025","2025-2026"};
        for(String sessionVal : sessionYears){
            if(sessionVal==stReg.get("registrationYear")){
                WebElement sessionYear = driver.findElement(By.xpath("//*[@id='Adm_schoolyearID']/option[text()='"+stReg.get("registrationYear")+"']"));
                sessionYear.click();
            }
        }
        
        // Select Class Data
        String [] classes = {"Arun","Uday","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve"};
        for(String classesVal : classes){
            if(classesVal==stReg.get("registrationClass")){
                WebElement registrationClass = driver.findElement(By.xpath("//*[@id='Adm_classesID']/option[text()='"+stReg.get("registrationClass")+"']"));
                registrationClass.click();
            }
        }    
        
        // Click on Forward Button for fill next details
        WebElement forward = driver.findElement(By.xpath("//*[@id=\"header\"]/div[4]/div/div[4]/div/center/a"));
        forward.click();
        
        // <======== Fill full registration details ========>
        
        Thread.sleep(3000);
          //click on instruction/guidelines checkbox
          WebElement aggrement = driver.findElement(By.xpath("//*[@id='termscondition']"));
          aggrement.click();
            
        List<WebElement> input = driver.findElements(By.tagName("input"));
        for(int i=0; i<input.size(); i++){
            String name = input.get(i).getAttribute("name");
            String value = input.get(i).getAttribute("value");
            if(value=="" || value==null){
                switch(name){
                    case "Uphoto" -> {
                        // upload student password size photo
                        WebElement st_pass_photo = driver.findElement(By.xpath("//*[@id=\"Uphoto\"]"));
                        st_pass_photo.sendKeys(stReg.get("regStuPhoto").toString());
                        break;
                    }
                    case "name" -> {
                        // Student Name
                        WebElement student_name = driver.findElement(By.id("name"));
                        String student_name_value = student_name.getAttribute("value");
                        if("".equals(student_name_value)){
                            student_name.sendKeys(stReg.get("regStuName").toString());
                        }
                        break;
                    }        
                    case "slc" -> {
                        // upload student Transfer Certificate Photo
                        WebElement trans_cert_photo = driver.findElement(By.xpath("//*[@id=\"Uslc\"]"));
                        trans_cert_photo.sendKeys(stReg.get("trans_cert_photo").toString());
                        break;
                    }        
                    case "aadhar_no" -> {
                        // Student Aadhar No
                        WebElement aadhar_no = driver.findElement(By.id("aadhar_no"));    
                        aadhar_no.sendKeys(stReg.get("regStuAdharno").toString());
                        break;
                    }
                    case "dob" -> {
                        ((JavascriptExecutor)driver).executeScript ("document.getElementById('dob').removeAttribute('readonly');"); // Enables the from date box
                        ((JavascriptExecutor)driver).executeScript ("document.getElementById('dob').setAttribute('value','"+stReg.get("regStuDob").toString()+"');"); // Enables the from date box
                        WebElement fromDateBox= driver.findElement(By.id("dob"));
//                        if(value==""){
  //                          fromDateBox.sendKeys(stReg.get("regStuDob").toString()); //Enter date in required format
    //                    }
                       break;
                    }
                    case "previous_school_name" -> {
                        // Student Last School
                        WebElement last_school = driver.findElement(By.id("previous_school_name"));    
                        last_school.sendKeys(stReg.get("regStuLastSchool").toString());
                        break;
                    }        
                    case "remarks1" -> {
                        // Student Sibling Study in School
                        WebElement sibling_study = driver.findElement(By.id("remarks1"));    
                        sibling_study.sendKeys(stReg.get("regStuSblStudy").toString());
                        break;
                    }
                    case "father_name" -> {
                        // Student Father Name
                        WebElement father_name = driver.findElement(By.id("father_name"));    
                        father_name.sendKeys(stReg.get("regStuFatherName").toString());
                        break;
                    }
                    case "total_marks" -> {
                        // Student Total Marks
                        WebElement total_marks = driver.findElement(By.id("total_marks"));    
                        total_marks.sendKeys(stReg.get("regStuTotalMarks").toString());
                        break;
                    }
                    case "total_marks_obtained" -> {
                        // Student total_marks_obtained
                        WebElement total_marks_obtained = driver.findElement(By.id("total_marks_obtained"));    
                        total_marks_obtained.sendKeys(stReg.get("regStuMarksObtained").toString());
                        break;
                    }
                    case "mother_name" -> {
                        // Student Mother Name
                        WebElement mother_name = driver.findElement(By.id("mother_name"));    
                        mother_name.sendKeys(stReg.get("regStuMotherName").toString());
                        break;
                    }
                    case "annual_income" -> {
                        // Student Annual Income
                        WebElement annual_income = driver.findElement(By.id("annual_income"));    
                        annual_income.sendKeys(stReg.get("regStuAnnualIncome").toString());
                        break;
                    }
                    case "transfer_certificate_no" -> {
                        // Student Transfer Certifiacte No
                        WebElement transfer_certificate_no = driver.findElement(By.id("transfer_certificate_no"));    
                        transfer_certificate_no.sendKeys(stReg.get("regStuTransCertNo").toString());
                        break;
                    }
                    case "phone" -> {
                        // Student Phone Number
                        WebElement phone = driver.findElement(By.id("phone"));    
                        String phone_value = phone.getAttribute("value");
                        if("".equals(phone_value)){
                            phone.sendKeys(stReg.get("regStuMobNo").toString());
                        }
                        break;
                    }
                    case "tc_issue_date" -> {
                        ((JavascriptExecutor)driver).executeScript ("document.getElementById('tc_issue_date').removeAttribute('readonly');"); // Enables the from date box
                        WebElement tcIssuDate= driver.findElement(By.id("tc_issue_date"));
                        tcIssuDate.clear();
                       tcIssuDate.sendKeys(stReg.get("regStuTCisuDate").toString()); //Enter date in required format
                       break;
                    }
                    case "email" -> {
                        // Student Email
                        WebElement email = driver.findElement(By.id("email"));    
                        String email_value = email.getAttribute("value");
                        if("".equals(email_value)){
                            email.sendKeys(stReg.get("regStuEmail").toString());
                        }
                        break;
                    }
                    case "address" -> {
                        // Student Address
                        WebElement address = driver.findElement(By.id("address"));    
                        address.sendKeys(stReg.get("regStuAddress").toString());
                        break;
                    }
                    case "permanent_address" -> {
                        // Student Permanent Address
                        WebElement permanent_address = driver.findElement(By.id("permanent_address"));    
                        permanent_address.sendKeys(stReg.get("regStuPermAddress").toString());
                        break;
                    }
                    case "Uotherfile" -> {
                        // upload student previous marksheet
                        WebElement previous_marksheet = driver.findElement(By.xpath("//*[@id=\"Uotherfile\"]"));
                        previous_marksheet.sendKeys(stReg.get("regStuPrevMarksheet").toString());
                        break;
                    }
                    case "alternate_contact_no" -> {
                        // Student Alternate Contact Number
                        WebElement alternate_contact_no = driver.findElement(By.id("alternate_contact_no"));
                        alternate_contact_no.sendKeys(stReg.get("regStuAltContNo").toString());
                        break;
                    }
                    default -> {
                        break;
                    }
                }//END Switch
            }// end if block
        }// end for loop
        
        List<WebElement> select = driver.findElements(By.tagName("select"));
        for(int i=0; i<select.size(); i++){
            String name = select.get(i).getAttribute("name");
            String value = select.get(i).getAttribute("value");
        
            switch(name){
                case "sex" -> {
                    // Student Gender
                    String[] Genders = {"Male","Female"};
                    for(String genderVal : Genders){
                        if(genderVal==stReg.get("regStuGender").toString()){
                            WebElement gender = driver.findElement(By.xpath("//*[@id=\"sex\"]/option[@value='"+stReg.get("regStuGender")+"']"));
                            gender.click();
                            break;
                        }
                    }
                    break;
                }
                default -> {
                    break;
                } 
            }
        }
    }
    
    // click on submit button for student registration 
    public void clicksubmitbtn(WebDriver driver) throws InterruptedException{
        WebElement submit_btn = driver.findElement(By.xpath("//center/a"));
        submit_btn.click();
    }    
    
    // waiting for alert message 
    public void waitForAlert(WebDriver driver) throws InterruptedException{
        int i=0;
        while(i++<5)
        {
             try
             {
                 Alert alert = driver.switchTo().alert();
                 alert.accept();
                 System.out.println("this is in try");
                 break;
             }
             catch(Exception e)
             {
               Thread.sleep(5000);
               System.out.println("this is in catch");
               continue;
             }
        }
    }
    
    /*
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
*/

    
    
    
    
    
}