/*Assignment 2:Duplicate Lead
          1. Launch URL "http://leaftaps.com/opentaps/control/login"
		  2. Enter UserName and Password Using Id Locator
		  3. Click on Login Button using Class Locator
		  4. Click on CRM/SFA Link
		  5. Click on Leads Button
		  6. Click on Create Lead 
		  7. Enter CompanyName Field Using id Locator
		  8. Enter FirstName Field Using id Locator
		  9. Enter LastName Field Using id Locator
		  10. Enter FirstName(Local) Field Using id Locator
		  11. Enter Department Field Using any Locator of Your Choice
		  12. Enter Description Field Using any Locator of your choice 
		  13. Enter your email in the E-mail address Field using the locator of your choice
		  14. Click on Create Button
          15. Get the Title of Resulting Page using driver.getTitle()
          16. Click on Duplicate button
          17. Clear the CompanyName Field using .clear() And Enter new CompanyName
          18.Clear the FirstName Field using .clear() And Enter new FirstName
Bu        19.Click on Create Lead Button
          20. Get the Title of Resulting Page using driver.getTitle()*/

package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class DuplicateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Launch the browser
		ChromeDriver driver = new ChromeDriver();
		
		//Maximize
		driver.manage().window().maximize();
		
		//load the url
		driver.get("http://leaftaps.com/opentaps/");
		
		//Locate the username field
		WebElement username = driver.findElement(By.id("username"));
		//Enter the username as demosalesmanager
		username.sendKeys("demosalesmanager");
		
		//Locate the password field
		WebElement password = driver.findElement(By.name("PASSWORD"));
		//Enter the password as crmsfa
		password.sendKeys("crmsfa");
		
		
		// shortcut --> ctrl+2 , l ---> Assign to local variable
		WebElement loginBtn = driver.findElement(By.className("decorativeSubmit"));
		loginBtn.click();
		
		//Get the title
		/* String title = driver.findElement(By.tagName("title")).getText();
		 * System.out.println(title);
		 */
			
		String title = driver.getTitle();
		System.out.println(title);
		
		//Locate and click the crmsfa link
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//get title for my home page
		
		//Click on the Leads tab
		driver.findElement(By.linkText("Leads")).click();
		
		// Click on the create Lead link
		driver.findElement(By.linkText("Create Lead")).click();
		
		//Enter the company name as FIS
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("FIS");
		
		//Enter the firstName as Anlet
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Anlet");
		
		//Enter the lastName as Jazlee
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Jazlee");
		
		//Enter department field
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("MPS");
		//Enter description filed
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Merchant Processing System");
		//Enter email ID
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("lawshika@gmail.com");
		
		
		// click on the create lead button
		driver.findElement(By.name("submitButton")).click();
		//Get the Title of Resulting Page using driver.getTitle()
		  System.out.println("Title Name:"+driver.getTitle());
		//Click duplicate lead
		driver.findElement(By.linkText("Duplicate Lead")).click();
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Nirmala");
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("FISolutions");
		// click on the create lead button
				driver.findElement(By.name("submitButton")).click();
				//Get the Title of Resulting Page using driver.getTitle()
				  System.out.println("Title Name:"+driver.getTitle());
		
		
}

}
	


