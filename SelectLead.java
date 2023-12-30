/*Precondition:
- Initialize the WebDriver (ChromeDriver).
- Load the URL http://leaftaps.com/opentaps/.
- Maximize the browser window.
Requirements:
- Enter the username as ‘demosalesmanager’
- Enter the password as 'crmsfa'
- Click on the Login button.
- Click on the CRM/SFA link
- Click on the Leads tab.
- Click on the Create Lead link from shortcuts.
- Enter the mandatory fields on the web page.
- Select Employee in the source dropdown (using index)
- Select Automobile in the Marketing Campaign (using visibleText)
- Select Corporation in Ownership (using value)
- Click on the Create Lead button.
- Verify the title of the current web page.
- Close the browser window.
*/
package week2.day3;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class SelectLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		//Enter a username and password.
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		// Click the "Login" button.
		driver.findElement(By.className("decorativeSubmit")).click();
		// Click on the "CRM/SFA" link.
		driver.findElement(By.id("label")).click();
		//Click on Leads Button
		  driver.findElement(By.linkText("Leads")).click();
		  //Click on the Create Lead link from shortcuts.
		  driver.findElement(By.linkText("Create Lead")).click();
		  //Enter the mandatory fields on the web page.
		  driver.findElement(By.id("createLeadForm_companyName")).sendKeys("FIS");
		  driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Lawshika");
		  driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Anlet");
		  //Select Employee in the source dropdown (using index)
		  WebElement employeeWE=driver.findElement(By.name("dataSourceId"));
			Select employeeDD=new Select(employeeWE);
			employeeDD.selectByIndex(4);
		  // Select Automobile in the Marketing Campaign (using visibleText)
			WebElement marketWE=driver.findElement(By.name("marketingCampaignId"));
			Select marketDD=new Select(marketWE);
			marketDD.selectByVisibleText("Automobile");
		  // Select Corporation in Ownership (using value)
			WebElement ownerWE=driver.findElement(By.name("ownershipEnumId"));
			Select ownerDD=new Select(ownerWE);
			ownerDD.selectByValue("OWN_CCORP");
		  // Click on the Create Lead button.
			driver.findElement(By.name("submitButton")).click();
		  // Verify the title of the current web page.
			System.out.println("Title Name:"+driver.getTitle());
		  Thread.sleep(2000);
			// Close the browser window.
			driver.close();


	}


	}


