/*Assignment Details:
Your task is to login to the web application using Selenium WebDriver.
Requirements:
- Instantiate the Browser driver
- Load the url https://www.facebook.com/
- Enter the email id as testleaf.2023@gmail.com
- Enter the password as Tuna@321
- Click on the Login button.
- Click on the ‘Find your account and log in.’ link
- Verify the title of the current web page.*/
package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement username= driver.findElement(By.id("email"));
		username.sendKeys("testleaf.2023@gmail.com");
	WebElement passwordElement=driver.findElement(By.name("pass"));
	passwordElement.sendKeys("Tuna@321");
	driver.findElement(By.name("login")).click();
	WebElement linkTextElement=driver.findElement(By.linkText("Find your account and log in."));
	linkTextElement.click();
	String title=driver.getTitle();
	if(title.contains("Forgotton page")) {
		System.out.println("Forgotton page is verified");
	}
	else {
		System.out.println("Forgotton page is not verified");
	}
	driver.close();
	
	

}}
