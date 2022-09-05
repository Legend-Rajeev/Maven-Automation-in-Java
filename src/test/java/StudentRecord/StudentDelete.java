/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StudentRecord;

import Config.Setup;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 *
 * @author Rajeev
 */
public class StudentDelete {
    
    //  click on student delete button 
    public void student_delete_btn(WebDriver driver) throws InterruptedException{
        Thread.sleep(7000);
        WebElement StudentDeleteBtn = driver.findElement(By.xpath("//td[@data-title=\"Action\"]/a[3]"));
        StudentDeleteBtn.click();
    }
    
    // fill all delete reasons and click on delete button 
    public void fill_student_delete_details(WebDriver driver) throws InterruptedException{
        
        Thread.sleep(2000);
        WebElement reason = driver.findElement(By.xpath("//formx//input[@placeholder='Please enter reason']"));
        WebElement approve = driver.findElement(By.xpath("//formx//input[@placeholder='Please enter approved by']"));
        WebElement agree_checkbox = driver.findElement(By.xpath("//formx//input[@type='checkbox'][@class='agree-cb']"));
        WebElement deletebtn = driver.findElement(By.xpath("//formx/p/a"));
        reason.sendKeys("No Reason");
        approve.sendKeys("Appored by Admin");
        agree_checkbox.click();
        deletebtn.click();
        
    }
    
    // accept alert button 
    public void wait_for_alert(WebDriver driver) throws InterruptedException{
        Thread.sleep(2000);
        Alert alert = driver.switchTo().alert(); // switch to alert
        alert.accept();
    }
    
    // go on student view page
    public void view_student(WebDriver driver) throws InterruptedException{
        Thread.sleep(2000);
       ((JavascriptExecutor)driver).executeScript("window.location.assign('"+Setup.studentPageURL+"');");
    }
}
