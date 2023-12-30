
 /*Initialize the WebDriver (ChromeDriver).
- Load the URL http://leaftaps.com/opentaps/.
- Maximize the browser window.
Requirements:
- Enter a username and password.
- Click the "Login" button.
- Click on the "CRM/SFA" link.
- Click on the "Accounts" tab.
- Click on the "Create Account" button.
- Enter an account name.
- Enter a description as "Selenium Automation Tester."
- Select "ComputerSoftware" as the industry.
- Select "S-Corporation" as ownership using SelectByVisibleText.
- Select "Employee" as the source using SelectByValue.
- Select "eCommerce Site Internal Campaign" as the marketing campaign using SelectByIndex.
- Select "Texas" as the state/province using SelectByValue.
- Click the "Create Account" button.
- Verify that the account name is displayed correctly.
- Close the browser window.*/
package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.service.DriverFinder;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver= new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://leaftaps.com/opentaps/");
driver.findElement(By.id("username")).sendKeys("demosalesmanager");
driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
driver.findElement(By.className("decorativeSubmit")).click();
driver.findElement(By.linkText("CRM/SFA")).click();
driver.findElement(By.linkText("Create Account")).click();
driver.findElement(By.id("accountName")).sendKeys("Anleet nJazlee");
driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
WebElement industryCS= driver.findElement(By.name("industryEnumId"));
Select industryDD= new Select(industryCS);
industryDD.selectByValue("IND_SOFTWARE");
WebElement ownershipSC=driver.findElement(By.name("ownershipEnumId"));
Select ownershipDD=new Select(ownershipSC);
ownershipDD.selectByVisibleText("S-Corporation");
WebElement sourceE=driver.findElement(By.id("dataSourceId"));
Select sourceDD=new Select(sourceE);
sourceDD.selectByValue("LEAD_EMPLOYEE");
WebElement marketingcampaignES= driver.findElement(By.name("marketingCampaignId"));
Select marketingCampaignDD= new Select(marketingcampaignES);
marketingCampaignDD.selectByIndex(6);
WebElement stateTE=driver.findElement(By.name("generalStateProvinceGeoId"));
Select stateDD= new Select(stateTE);
stateDD.selectByValue("TX");
driver.findElement(By.className("smallSubmit")).click();


String taptitle =driver.getTitle();
if(taptitle.contains("Account Details")) {
	System.out.println("Verified");
}
else {
	System.out.println("Unable to verified");

}


	}

}
