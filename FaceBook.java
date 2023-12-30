/*Assignment Details:
Launch the Browser and load the given URL
Requirements:
- Add the Selenium dependencies in pom.xml.
- Import the required libraries at the beginning of your Java class.
(import org.openqa.selenium.chrome.ChromeDriver)
- Instantiate the browser driver 
- Load the url: https://www.facebook.com/
- Maximize the browser window.
- Close the browser window.*/

package week2.day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
driver.manage().window().maximize();
Thread.sleep(20000);
driver.close();
	}

}
