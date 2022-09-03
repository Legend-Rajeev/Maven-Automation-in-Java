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
import StudentRecord.Registration;


/**
 *
 * @author Rajeev
 */
public class StudentModule {
    
    WebDriver driver = null;
    @Test(priority = 1)
    public void main() throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", "C:\\MySkoolERP\\software\\chrome driver\\chromedriver.exe");
        driver = new ChromeDriver();
        
        Registration obj = new Registration();
        obj.registrationDetails(driver);
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