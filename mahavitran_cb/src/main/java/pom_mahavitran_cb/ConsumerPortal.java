package pom_mahavitran_cb;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ConsumerPortal 
{
      private WebDriver driverG;
      private Actions act;
      private WebDriverWait  wait;
      
      @FindBy (xpath="(//span[@style='color: #d82b27;'])[1])")
      private WebElement ConsumerPortal;
      
      public ConsumerPortal(WebDriver driver)
      {
    	     PageFactory.initElements(driver,this);
    	     this.driverG=driver;
    	     act=new Actions(driver);
    	     wait=new WebDriverWait(driver,10);
      }
      
      public void ConsumerPortal()
      {
      	 wait.until(ExpectedConditions.visibilityOf(ConsumerPortal));
      	 ConsumerPortal.click();
      }
     
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      /*public void Close()
      {
           driver.close();
           WebElement CustomerPortal =driver.findElement(By.xpath("//span[@style='color: #d82b27;'])[1]"));
	       JavascriptExecutor  js=(JavascriptExecutor)driver;   //scrolldown 
	       js.executeScript("arguments[0].scrollIntoView(true);", CustomerPortal);
      }    
	   
	  public void ConsumpationPortal(WebDriver driver)
      {
     	 PageFactory.initElements(driver, this);
 		  this.driver=driver;
 		  act=new Actions(driver);
 		  wait =new WebDriverWait(driver,10);
      }
	  
	  public void ClickonConsumpationPortal()
	  {
		  consumptionporatal.click();
	  }*/
	  
	  }
	  
	  
      
      
	
	
	

