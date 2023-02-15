package pom_mahavitran_cb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NewUserRegistration 
{
	
	private WebDriver driverG;
    private Actions act;
    private WebDriverWait  wait;
    
    @FindBy (xpath="//input[@name='consumerNumber']" )  
	 private WebElement ConsumerNumber;
    
    @FindBy (xpath="//input[@name='mobileNumber']" )  
	 private WebElement MobileNo;
    
    @FindBy (xpath="//input[@name='email']" )  
	 private WebElement Email  ;
    
    @FindBy (xpath="//input[@name='loginName']" )  
	 private WebElement LoginName;
    
    @FindBy (xpath="//input[@name='password']" )  
	 private WebElement Password;
    
    @FindBy (xpath="//input[@name='confirmPassword']" )  
	 private WebElement ConfirmPassword;
    
    @FindBy (xpath="//span[@id='lblSubmit']" )  
	 private WebElement SubmitButton;
	private WebElement NewUserRegistration;
   
    public NewUserRegistration  (WebDriver driver)
    {
  	     PageFactory.initElements(driver,this);
  	     this.driverG=driver;
  	     act=new Actions(driver);
  	     wait=new WebDriverWait(driver,10);
    }
    
    public void newuserregistration()
    {
 	      wait.until(ExpectedConditions.visibilityOf( NewUserRegistration ));
 	      NewUserRegistration.click();
   }

    public void ConsumerNumber()
    {
    	ConsumerNumber .sendKeys("9856786542");
    }
    public void MobileNo()
    {
    	MobileNo.sendKeys("9856786542");
    }
    public void Email()
    {
    	Email.sendKeys("priyapatil21@gmail.com");
    }
    public void LoginName()
    {
    	LoginName.sendKeys("priyapatil");
    }
    public void Password()
    {
    	Password.sendKeys("priyapatil");
    }
    public void ConfirmPassword()
    {
    	Password.sendKeys("priyapatil");
    }
    
   public void Submit()
   {
	   SubmitButton.click();
   }
    
    
    
	private static void click() {
		// TODO Auto-generated method stub
		
	}

	public static void clickOnnewuserregistration() {
		// TODO Auto-generated method stub
		
	}

	public static void sendKeysConsumerNumber() {
		// TODO Auto-generated method stub
		
	}

	public static void sendKeysMobile() {
		// TODO Auto-generated method stub
		
	}

	public static void sendKeysEmail() {
		// TODO Auto-generated method stub
		
	}

	public static void sendKeysLoginName() {
		// TODO Auto-generated method stub
		
	}

	public static void sendKeysPassword() {
		// TODO Auto-generated method stub
		
	}

	public static void sendKeysConfirmPassword() {
		// TODO Auto-generated method stub
		
	}

	public static void sendKeysSubmit() {
		// TODO Auto-generated method stub
		
	}

	public static void clickonNewUserRegistration() {
		// TODO Auto-generated method stub
		
	} 
    
}   

