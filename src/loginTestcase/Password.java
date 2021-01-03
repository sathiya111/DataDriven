package loginTestcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Password {
	@Test
public void CorrectPassword() {
	System.setProperty("webdriver.chrome.driver","D:\\JavaClass\\Vengatselenium\\driver\\chromedriver.exe" );
	WebDriver driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	WebElement username = driver.findElement(By.id("txtUsername"));
	username.sendKeys("Admin12");
	WebElement password = driver.findElement(By.id("txtPassword"));
	password.sendKeys("Admin");
	WebElement loginbutton = driver.findElement(By.id("btnLogin"));
	loginbutton.click();

	driver.quit();
}
}
