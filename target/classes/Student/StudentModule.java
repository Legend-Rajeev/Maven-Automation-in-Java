package Student;


import Config.Setup;
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
public class StudentModule {
    WebDriver driver = null;
    
    @Test(priority = 1)
    public void Login(){
        System.out.println("first");
        System.setProperty("webdriver.chrome.driver", "C:\\MySkoolERP\\software\\chrome driver\\chromedriver.exe");
        driver = new ChromeDriver();
        System.out.println("hi");
        driver.get(Setup.loginURL);
        
        String username = Setup.username;
        String password = Setup.password;
        driver.findElement(By.id("myInput2")).sendKeys(username);
        driver.findElement(By.id("myInput")).sendKeys(password);
        
        //Click on Login          
        WebElement loginBtn = driver.findElement(By.id("myBtn"));
        loginBtn.click();
        
        
    }
    
    @Test(priority = 2)
    public void StudentAdd(){
       ((JavascriptExecutor)driver).executeScript ("window.location.href='"+Setup.studentadd+"'"); // Go to Add StudentModule Page
       
    }    
}
