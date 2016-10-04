package wasdev.sample.servlet;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
public class SeleniumTest {
	static WebDriver wd;
	static WebElement we;
	
	static void openBrowser() throws InterruptedException {
		ProfilesIni pi = new ProfilesIni();
		
		File pathBinary = new File("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
		
		//C:\\Mozilla Firefox
		FirefoxBinary firefoxBinary = new FirefoxBinary(pathBinary);

		FirefoxProfile fp = pi.getProfile("default");

	//	wd=new FirefoxDriver(fp);
		wd=new FirefoxDriver(firefoxBinary,fp);
		wd.get("http://www.gmail.com");
		WebElement we = wd.findElement(By.name("Email"));
		
		we.sendKeys("surajprakashbehera92@gmail.com");
	
		WebElement ws=wd.findElement(By.name("signIn"));
		ws.click();
		Thread.sleep(5000);
		WebElement wp = wd.findElement(By.name("Passwd"));
        wp.sendKeys("radhagiridhari");
        
        WebElement ws1=wd.findElement(By.xpath(".//*[@id='signIn']"));
		ws1.click();
		//wd.findElement(By.linkText("IBMSales")).click();
		//wd.findElement(By.linkText("New proposal")).click();

		}
	public static void main(String suraj[]) throws InterruptedException
	{
	System.out.println("pankaj is teaching me");
	openBrowser();
	}
	
}
