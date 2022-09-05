/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StudentRecord;

import org.openqa.selenium.WebDriver;
import Config.Setup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 *
 * @author Rajeev
 */
public class Login {
    public void login(WebDriver driver) throws InterruptedException{
        driver.get(Setup.loginURL);
        
        String username = Setup.username;
        String password = Setup.password;
        driver.findElement(By.id("myInput2")).sendKeys(username);
        driver.findElement(By.id("myInput")).sendKeys(password);
        
        //Click on Login          
        WebElement loginBtn = driver.findElement(By.id("myBtn"));
        loginBtn.click();    
    }
}
