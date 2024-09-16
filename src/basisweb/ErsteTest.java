package basisweb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.decorators.WebDriverDecorator;

public class ErsteTest {
	
	private WebDriver driver;
	
	//private String baseurl;
	
	public void anfangTest() {
		
	driver = new EdgeDriver();
	driver.get("https://www.google.de/");
		
	driver.manage().window().maximize();		

	}
	
	public void clicktest() {
		
		
	}
	
	public void endtest() throws InterruptedException {
		
		Thread.sleep(2000);
		driver.close();
	}
	

}
