package djangotest.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestUI {
	
	@Test
	public void test01Firefox(){
		WebDriver driver = new FirefoxDriver();
                driver.get("http://google.es");
                String Expectedtitle = "Google";
                String Actualtitle = driver.getTitle();
                System.out.println("Before Assetion " + Expectedtitle + Actualtitle);
                Assert.assertEquals(Actualtitle, Expectedtitle);
                System.out.println("After Assertion " + Expectedtitle + Actualtitle + " Title matched ");
		System.out.println("Chrome browser opened and navigated to google site");
		driver.quit();
	}
	
	@Test
	public void test02Chrome(){
		System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
		WebDriver driver = new ChromeDriver();
                driver.get("http://google.es");
                String Expectedtitle = "Google";
                String Actualtitle = driver.getTitle();
                System.out.println("Before Assetion " + Expectedtitle + Actualtitle);
                Assert.assertEquals(Actualtitle, Expectedtitle);
                System.out.println("After Assertion " + Expectedtitle + Actualtitle + " Title matched ");
		System.out.println("Chrome browser opened and navigated to google site");
		driver.quit();
	}
}
