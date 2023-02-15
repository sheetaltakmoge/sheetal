package mahavitran_cbtestclass;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import pom_mahavitran_cb.NewUserRegistration;
import pom_mahavitran_cb.mahavitran_homepage;

public class test2
{
	
	public static void main(String[] args) throws InterruptedException
	{
		
    System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
     
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     driver.manage().window().maximize();
     
     driver.get("https://www.mahadiscom.in/en/home/");
     
     mahavitran_homepage Mahavitran_homepage=new mahavitran_homepage(driver);
    
     Mahavitran_homepage.clickonclose();
     Mahavitran_homepage.clickonConsumerPortal();
    
     Thread.sleep(5000);
     ArrayList<String> addr=new ArrayList<String>(driver.getWindowHandles());
	driver.switchTo().window(addr.get(1));
		
	   Mahavitran_homepage.clickonApplyForNewConnection();
	   ArrayList<String> addr1=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(addr1.get(1));
		
		
		NewUserRegistration newuserregistration= new NewUserRegistration (driver);
		newuserregistration.clickonNewUserRegistration();
		newuserregistration.ConsumerNumber();
		newuserregistration.MobileNo();
		newuserregistration.Email();
		newuserregistration.LoginName();
		newuserregistration.Password();
		newuserregistration.ConfirmPassword();
		newuserregistration.Submit();
		
		
		
}
}
