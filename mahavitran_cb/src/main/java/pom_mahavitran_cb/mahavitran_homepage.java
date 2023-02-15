package pom_mahavitran_cb;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class mahavitran_homepage
{
	   private WebDriver driverG;
       private Actions act;
       private WebDriverWait  wait;
       
	   @FindBy (xpath="(//button[@aria-label='Close'])[2]" ) 
	    private WebElement  Close;
	 
	    @FindBy (xpath="(//span[@style='color: #d82b27;'])[1]" ) 
	     private WebElement  ConsumerPortal;
	 
	    public mahavitran_homepage(WebDriver driver)
	     {
	   	     PageFactory.initElements(driver,this);
	   	     this.driverG=driver;
	   	     act=new Actions(driver);
	   	     wait=new WebDriverWait(driver,10);
	     }
	    
	    public void clickonclose()
	    {
	    	  Close.click();
	    }
	   
	    public void scrollby()
	    {
	    	JavascriptExecutor  js=(JavascriptExecutor)driverG;   
			js.executeScript("arguments[0].scrollIntoView(true);", ConsumerPortal);
			   
	    }

		public void clickonConsumerPortal() {
			// TODO Auto-generated method stub
			
			ConsumerPortal.click();
		}

		public static void clickonApplyForNewConnection() {
			// TODO Auto-generated method stub
			
		}
	    	   
	   	   
}	 
	
	
	
	

