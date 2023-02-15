package pom_mahavitran_cb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ConsumptionCalculator 
{
     private WebDriver driverG;
     private Actions act;
     private WebDriverWait  wait;
     
     @FindBy (xpath="//span[@id='leftnav_lblConsumptionCalc']" )  
	   private WebElement  ConsumptionCalculator;
     
     @FindBy (xpath="//input[@name='applianceGrid$ctl02$txtCount']" )  
	   private WebElement  Blubwatts25 ;
     
     @FindBy (xpath="//select[@name='applianceGrid$ctl02$usageHours']" )  
	   private WebElement  Blubwatts25hr  ;
   
     @FindBy (xpath="//input[@name='applianceGrid$ctl03$txtCount']")
     private WebElement Blubwatts40;
     
     @FindBy (xpath="//select[@name='applianceGrid$ctl03$usageHours']")
     private WebElement Blubwatts40hr;
     
      @FindBy (xpath="//input[@name='applianceGrid$ctl04$txtCount']" )  
	   private WebElement  Blubwatts60 ;
      
      @FindBy (xpath="//input[@name='applianceGrid$ctl04$txtCount']" )  
	   private WebElement  Blubwatts60hr;
   
     @FindBy (xpath="//input[@name='applianceGrid$ctl05$txtCount']")
     private WebElement Blubwatts100;
     
     @FindBy (xpath="//select[@name='applianceGrid$ctl05$usageHours']")
     private WebElement Blubwatts100hr;
   
   
     @FindBy (xpath="//input[@name='applianceGrid$ctl06$txtCount']")
     private WebElement TubeLight;
     
      @FindBy(xpath="//select[@name='applianceGrid$ctl06$usageHours']")
      private WebElement TubeLighthr;
     
     @FindBy (xpath="//input[@name='applianceGrid$ctl07$txtCount']")
     private WebElement CFL ;
   
     @FindBy (xpath="//select[@name='applianceGrid$ctl07$usageHours']")
     private WebElement CFLhr ;
   
     public ConsumptionCalculator  (WebDriver driver)
     {
   	     PageFactory.initElements(driver,this);
   	     this.driverG=driver;
   	     act=new Actions(driver);
   	     wait=new WebDriverWait(driver,10);
     }
     
     public void consumptioncalculator ()
     {
   	      wait.until(ExpectedConditions.visibilityOf( ConsumptionCalculator ));
   	      ConsumptionCalculator .click();
     }
     
     public void  Blubwatts25 ()
     {
    	 Blubwatts25 .sendKeys("44");
     }
     
     public void  Blubwatts40 ()
     {
    	 Blubwatts25 .sendKeys("30");
     }
     
     public void  Blubwatts60 ()
     {
    	 Blubwatts25 .sendKeys("50");
     }
     
     public void  Blubwatts100 ()
     {
    	 Blubwatts25 .sendKeys("45");
     }
     
     public void Blubwatts25hr()
     {
    	 Blubwatts25hr.sendKeys("8");
     }
     public void Blubwatts40hr()
     {
    	 Blubwatts25hr.sendKeys("5");
     }
     public void Blubwatts60hr()
     {
    	 Blubwatts25hr.sendKeys("9");
     }
     public void Blubwatts100hr()
     {
    	 Blubwatts25hr.sendKeys("3");
     }
     
     public void TubeLighthr()
     {
    	 TubeLighthr.sendKeys("2");
     }
     public void CFLhr()
     {
    	 CFLhr.sendKeys("8"); 
     }
}   
     
   
	 
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     