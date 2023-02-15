package mahavitran_cbtestclass;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pom_mahavitran_cb.ConsumptionCalculator;
import pom_mahavitran_cb.EnergyBillCalculator;
import pom_mahavitran_cb.NewUserRegistration;
import pom_mahavitran_cb.mahavitran_homepage;

public class test1 
{
	private WebDriver driverG;
	private mahavitran_homepage  MahavitranHomePage1;
    private ConsumptionCalculator consumptioncalculator;
    private EnergyBillCalculator  energybillcalculator ;
	private Object NewUserRegistration;
	private pom_mahavitran_cb.NewUserRegistration newuserRegistration;
    
   @Parameters("browser123")
    	@BeforeTest
	public void launchbrowser(String browser)
	{
	    if(browser.equals("Chrome"))
	    {
	       System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
	       driverG=new ChromeDriver();
	      }
	    if(browser.equals("Edge"))
	    {
	       System.setProperty("webdriver.edge.driver","D:\\selenium\\edgedriver_win64 (1)\\msedgedriver.exe");
	       driverG=new EdgeDriver();
	     }
	    
	      driverG.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      driverG.manage().window().maximize();
	}    
	
	@BeforeClass
	public void beforeClass()
	{
		MahavitranHomePage1=new mahavitran_homepage(driverG);
		energybillcalculator =new EnergyBillCalculator (driverG);
	}	
		
	@BeforeMethod
	public void beforeMethod()
	{
	     driverG.get("https://www.mahadiscom.in/en/home/");
	}
	
	@Test
	public void test1()
	{
		MahavitranHomePage1.clickonclose();
		MahavitranHomePage1.clickonConsumerPortal();
		 ArrayList<String> addr=new ArrayList<String>(driverG.getWindowHandles());
		driverG.switchTo().window(addr.get(1));
		
		mahavitran_homepage.clickonApplyForNewConnection();
		 ArrayList<String> addr1=new ArrayList<String>(driverG.getWindowHandles());
		driverG.switchTo().window(addr1.get(1));
		
		newuserRegistration.clickonNewUserRegistration();
		newuserRegistration.sendKeysConsumerNumber();
		newuserRegistration.sendKeysMobile();
		newuserRegistration.sendKeysEmail();
		newuserRegistration.sendKeysLoginName();
		newuserRegistration.sendKeysPassword();
		newuserRegistration.sendKeysConfirmPassword();
		newuserRegistration.sendKeysSubmit();
	}
		
	@Test
	public void  test2()
	{
		MahavitranHomePage1.clickonclose();
		MahavitranHomePage1.clickonConsumerPortal();
		ArrayList<String> addr=new ArrayList<String>(driverG.getWindowHandles());
		driverG.switchTo().window(addr.get(1));
		
		MahavitranHomePage1.clickonApplyForNewConnection();
		MahavitranHomePage1.clickonConsumerPortal();
		ArrayList<String> addr1=new ArrayList<String>(driverG.getWindowHandles());
		driverG.switchTo().window(addr1.get(1));
		
		energybillcalculator.clickonEnergybillcalculator();
		energybillcalculator.SupplyType();
		energybillcalculator.Tarrif();
		energybillcalculator.voltagelevel();
		energybillcalculator.slot1KVAH();
		energybillcalculator.slot1KVA();
		energybillcalculator.slot2KVAH();
		energybillcalculator.slot2KVA();
		energybillcalculator.slot3KVAH();
		energybillcalculator.slot3KVA();
		energybillcalculator.slot4KVAH();
		energybillcalculator.slot4KVA();
		energybillcalculator.clickOnSubmitButton();
	
}
	
	@AfterMethod
	public void aftermethod()
	{
		ArrayList<String> addr1=new ArrayList<String>(driverG.getWindowHandles());
		driverG.switchTo().window(addr1.get(0));
	}
	
	@AfterClass
	public void afterclass()
	{
		MahavitranHomePage1=null;
		NewUserRegistration=null;
	}
	
	@AfterTest
	public void afterTest()
	{
		driverG.quit();
		driverG=null;
		System.gc();
		
	}
}