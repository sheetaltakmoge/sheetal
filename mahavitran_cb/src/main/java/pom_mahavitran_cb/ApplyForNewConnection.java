package pom_mahavitran_cb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ApplyForNewConnection
{
	private WebDriver driverG;
    private Actions act;
    private WebDriverWait  wait;
    
    @FindBy (xpath="(//a[@href='https://wss.mahadiscom.in/wss/wss?uiActionName=getNewConnectionRequest'])[4]" )  
	  private WebElement  ApplyForNewConnection;
    
    public ApplyForNewConnection(WebDriver driver)
    {
  	     PageFactory.initElements(driver,this);
  	     this.driverG=driver;
  	     act=new Actions(driver);
  	     wait=new WebDriverWait(driver,10);
    }
    
    public void ClickonApplyForNewConnection()
    {
    	 wait.until(ExpectedConditions.visibilityOf(ApplyForNewConnection));
    	 ApplyForNewConnection.click();
    }
	
}
