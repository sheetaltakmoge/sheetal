package pom_mahavitran_cb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EnergyBillCalculator 
{
	 private WebDriver driverG;
     private Actions act;
     private WebDriverWait  wait;
     
     @FindBy (xpath="//span[@id='leftnav_lblEnergyBill']" )  
	  private WebElement  EnergyBillcalculator;
     
     @FindBy (xpath=" //select[@name='supplyType'])")
     private WebElement SupplyType;
     
      @FindBy (xpath="//select[@name='tariff']" )  
	  private WebElement  Tarrif;
      
      @FindBy (xpath="//select[@name='HT_S_Voltage_Level']" )  
	  private WebElement voltagelevel ;
      
      @FindBy (xpath="//input[@name='contractDemand']" )  
	  private WebElement contractdemand ;
      
      @FindBy (xpath="//input[@name='kwhSlot1']" )  
	  private WebElement slot1KVAH;
      
      @FindBy (xpath="//input[@name='kvaSlot1']" )  
	  private WebElement slot1KVA;
      
      @FindBy (xpath="//input[@name='kwhSlot2']" )  
	  private WebElement slot2KVAH;
      
      @FindBy (xpath="//input[@name='kvaSlot2']" )  
	  private WebElement slot2KVA;
      
      @FindBy (xpath="//input[@name='kwhSlot3']" )  
	  private WebElement slot3KVAH;
      
      @FindBy (xpath="//input[@name='kvaSlot3']" )  
	  private WebElement slot3KVA;
      
      @FindBy (xpath="//input[@name='kwhSlot4']" )  
	  private WebElement slot4KVAH;
      
      @FindBy (xpath="//input[@name='kvaSlot4']" )  
	  private WebElement slot4KVA;
      
      public  EnergyBillCalculator(WebDriver driver)
      {
    	  PageFactory.initElements(driver,this);
    	  this.driverG=driver;
    	  act=new Actions(driver);
    	  wait=new WebDriverWait(driver,10);
      }
      
      public void clickonEnergybillcalculator()
      {
    	  wait.until(ExpectedConditions.visibilityOf( EnergyBillcalculator));
    	  EnergyBillcalculator.click();
      }
      
      public void SupplyType()
      {
    	  Select s=new Select(SupplyType);
    	  s.selectByIndex(1);
      }
      
      public void Tarrif()
      {
    	  Select s=new Select(Tarrif);
    	  s.selectByIndex(1);
      }
      
      public void voltagelevel ()
      {
    	  Select s=new Select(voltagelevel);
    	  s.selectByIndex(1);
       }
      
      public void contractdemand()
      {
    	  contractdemand.sendKeys("44");
      }
      
      public void slot1KVAH()
      {
    	  slot1KVAH.sendKeys("30");
      }
      
      public void slot1KVA()
      {
    	  slot1KVA.sendKeys("20");
      }
      
      public void slot2KVAH()
      {
    	  slot1KVAH.sendKeys("40");
      }
      
      public void slot2KVA()
      {
    	  slot1KVA.sendKeys("50");
      }
      
      public void slot3KVAH()
      {
    	  slot1KVAH.sendKeys("44");
      }
      
      public void slot3KVA()
      {
    	  slot1KVA.sendKeys("22");
      }
      
      public void slot4KVAH()
      {
    	  slot1KVAH.sendKeys("45");
      }
      
      public void slot4KVA()
      {
    	  slot1KVA.sendKeys("55");
      }

	

	public void clickOnSubmitButton() {
		// TODO Auto-generated method stub
		
	}
}     
      
      
      
      
      
      
      
      
      
	
     
