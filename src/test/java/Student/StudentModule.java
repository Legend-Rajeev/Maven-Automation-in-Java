package Student;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import StudentRecord.Registration;
import StudentRecord.Admission;
import StudentRecord.Login;
import StudentRecord.StudentDelete;
import StudentRecord.StudentEdit;


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
    }
    
    
    @Test(priority = 2)
    public void register() throws InterruptedException{
        Registration obj = new Registration();
        obj.registrationDetails(driver);
        obj.clicksubmitbtn(driver);
        obj.waitForAlert(driver);
    }
    
    
    @Test(priority = 3)
    public void login() throws InterruptedException{
        Login lg = new Login();
        lg.login(driver);
    }
    
    
    @Test(priority = 4)
    public void admission() throws InterruptedException{
        Admission adm = new Admission();
        adm.fill_admission_details(driver);
        adm.click_next_btn(driver);
        adm.click_collect_payment_btn(driver);
        adm.payment_mode(driver);
        adm.waitForAlert(driver);
    }
    
    
    @Test(priority = 5)
    public void studentadd() throws InterruptedException{
        StudentAdd adm = new StudentAdd();
        adm.fill_student_details(driver);
        String stvalue = adm.stusernamevalue(driver);
        adm.submit_student_details(driver);
        adm.view_student(driver);
        adm.get_student_username(driver, stvalue);
    }
    
    @Test(priority = 6)
    public void studentedit() throws InterruptedException{
        StudentEdit adm = new StudentEdit();
        adm.st_edit_btn(driver);
        adm.fill_student_edit_details(driver);
        adm.click_update_btn(driver);
        adm.student_view_page(driver);
        
    }
    
    @Test(priority = 7)
    public void studentdelete() throws InterruptedException{
        StudentDelete adm = new StudentDelete();
        adm.student_delete_btn(driver);        
        adm.fill_student_delete_details(driver);        
        adm.wait_for_alert(driver);        
        adm.view_student(driver);        
    }
    
}