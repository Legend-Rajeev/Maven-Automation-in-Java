package sourcePack;

import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



/**
 *
 * @author Rajeev
 */

public class ConfigCSV{
    WebDriver driver = null;
    
    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", "C:\\MySkoolERP\\software\\chrome driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://demo.myskoolerp.co.in/signin/index");
        
        driver.findElement(By.id("myInput2")).sendKeys("devadmin");
        driver.findElement(By.id("myInput")).sendKeys("mmpass21");
        
        //Click on Login          
        WebElement loginBtn = driver.findElement(By.id("myBtn"));
        loginBtn.click();
        
        Thread.sleep(2000);
        ((JavascriptExecutor)driver).executeScript("window.location.href = 'https://demo.myskoolerp.co.in/admission2/doadmission?studentID=1788';");

        Thread.sleep(5000);
        WebElement collect_payment_btn = driver.findElement(By.xpath("//*[@id=\"section-sub-view\"]/div[1]/div[3]/div/div/div/div/a[4]"));
        collect_payment_btn.click();
        

        
        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        for(String val : tabs2){
            System.out.println(val);
        }
        
        WebElement get_payment_mode = driver.findElement(By.xpath("//input[@id='getpart3']"));
        get_payment_mode.click(); 

    }
     
    public void windowHandle(WebDriver driver){
        
//        driver.switchTo().window(tabs2.get(1));
//        driver.close();
//        driver.switchTo().window(tabs2.get(0));        
    }
}