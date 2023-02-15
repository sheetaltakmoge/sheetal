package utils;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class utility 
{
    public static void GetScreenshot(WebDriver driverG,String testid) throws IOException
    {
    	TakesScreenshot t=(TakesScreenshot)driverG;
    	File src=t.getScreenshotAs(OutputType.FILE);
    	
    	Date d=new Date();
    	
    	String filename=t.toString().replace(" ", " _ ").replace(" ", "_ ");
    	
    	File dest=new File("");
    	FileHandler.copy(src, dest);
    	
    	
    }
}
