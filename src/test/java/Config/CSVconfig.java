package Config;

import java.util.ArrayList;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



/**
 *
 * @author Rajeev
 */

public class CSVconfig{
    WebDriver driver = null;
    
    public void main() throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", "C:\\MySkoolERP\\software\\chrome driver\\chromedriver.exe");
        driver = new ChromeDriver();
    }
     
    public void windowHandle(WebDriver driver){
        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        for(String val : tabs2){
            System.out.println(val);
        }
//        driver.switchTo().window(tabs2.get(1));
//        driver.close();
//        driver.switchTo().window(tabs2.get(0));        
    }
}