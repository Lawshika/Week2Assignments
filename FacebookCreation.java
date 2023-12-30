/*Precondition:
- Initialize ChromeDriver
- Load the URL https://en-gb.facebook.com/
- Maximize the browser window
- Add an implicit wait to ensure the web page elements are fully loaded
Requirements:
- Click on the Create new account button.
- Enter the First name.
- Enter the Surname.
- Enter the Mobile numbe or email address.
- Enter the New password.
- Handle all three dropdowns in Date of birth
- Select the radio button in Gender.*/
package week2.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.findElement(By.linkText("Create new account")).click();
driver.findElement(By.name("firstname")).sendKeys("Anlet");
driver.findElement(By.name("lastname")).sendKeys("Stanly");
driver.findElement(By.name("reg_email__")).sendKeys("9940166099");
driver.findElement(By.name("reg_passwd__")).sendKeys("Lawanst123");

 WebElement dateWE=driver.findElement(By.name("birthday_day")); Select
 dateDD=new Select(dateWE); dateDD.selectByValue("25");
 
WebElement monthWE=driver.findElement(By.name("birthday_month"));
Select monthDD=new Select(monthWE);
monthDD.selectByValue("3");
WebElement yearWE=driver.findElement(By.name("birthday_year"));
Select yearDD=new Select(yearWE);
yearDD.selectByVisibleText("1993");
driver.findElement(By.xpath("//*[text()='Female']")).click();



	}

}
