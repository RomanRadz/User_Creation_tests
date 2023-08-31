package purchasedFor_Field;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import variables.Variables;

public class EnterUpto255SpecCh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Variables variable = new Variables();


		//Step 1. Open Chrome browser
				System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				System.out.println("Chrome browser starts");
				
				//Step 2. Enter URL
				driver.get(variable.url);
				System.out.println("Login page displayed");

				//Step 3. Enter Username
				driver.findElement(By.name(variable.username_field)).sendKeys(variable.username);
				System.out.println("User name entered");
				
				//Step 4. Enter password
				driver.findElement(By.name(variable.password_field)).sendKeys(variable.password);
				System.out.println("Password entered");
				
				//Step 5. Click LOgin
				driver.findElement(By.name(variable.login_BTN)).click();
				System.out.println("Home page displayed");
				
				//Step 6. Click Create PO
				driver.findElement(By.xpath(variable.createPO_Tab)).click();
				System.out.println("Create PO page diplayed");
				
				//Step 7. Select value in PO DDL
				Select poNo_DDL = new Select(driver.findElement(By.name(variable.poNo_ddl)));
				poNo_DDL.selectByIndex(variable.tormax);
				System.out.println("Value selected");		
						
				//Step 8. enter value in Purchased for field
				driver.findElement(By.name("Orderedby")).sendKeys("!@#$%");
				
				//Step 9. Select value in OpCo DDL
				Select OpCo_DDL = new Select(driver.findElement(By.name("OpCo")));
						OpCo_DDL.selectByIndex(4);
				
				//Step 10. Enter the value into Reason for purchase field		
				driver.findElement(By.name("up_reason")).sendKeys("qwertyu");
				
				//Enter the date into AntDate of Purchase field
				//driver.findElement(By.name("firstinput")).sendKeys("2023/04/03");
				
				//Step 11. Click on select date hyperlink
				driver.findElement(By.xpath("/html/body/table[1]/tbody/tr[3]/td/table/"
						+ "tbody/tr/td/table/tbody/tr/td/div/table/tbody[1]/tr[2]/td/"
						+ "div/table[2]/tbody/tr/td/form/table/tbody[1]/tr/td/table/"
						+ "tbody/tr[2]/td/table/tbody/tr[9]/td[2]/small/a/b")).click();
				
				//Switch to with index 1
				ArrayList<String> calendarWindow = new ArrayList<String>(driver.getWindowHandles());
				driver.switchTo().window(calendarWindow.get(1));
				
				//Step 12. Select current date in Calendar window
				driver.findElement(By.className("currenta")).click();
				
				//Switch back 
				driver.switchTo().window(calendarWindow.get(0));
				
				//Step 13. Select value in Suplier DDL
				Select supplier_DDL = new Select(driver.findElement(By.name("Supplier")));
				supplier_DDL.selectByValue("9");
				
				//Step 14. Select value in Shipping address DDL
				Select shippAddress_DDL = new Select(driver.findElement(By.name("shipping")));
				shippAddress_DDL.selectByValue("999 Boul. De Maisonneuve West Suite # 600, "
						+ "Montreal, H3A 3L4");
				
				//Step 15. Select value in BillAddress DDl
				Select billAddress_DDL = new Select(driver.findElement(By.name("billing")));
				billAddress_DDL.selectByValue("160 Bloor Street East, Suite 700 Toronto, "
						+ "Ontario, M4W 0A2");
				
				//Step 16. Enter value into Item
				driver.findElement(By.name("Item1")).sendKeys("TestItem1");
				
				//Step 17. Enter value into PartNumber
				driver.findElement(By.name("PartNo1")).sendKeys("PartTest");
				
				//Step 18. Enter value into ModelNo
				driver.findElement(By.name("ModelNo1")).sendKeys("ModelTest");
				
				driver.findElement(By.name("Quantity1")).clear();
				
				driver.findElement(By.name("Quantity1")).sendKeys("123");
				
				driver.findElement(By.name("Uprice1")).clear();
				
				driver.findElement(By.name("Uprice1")).sendKeys("555");
				
				driver.findElement(By.name("Description")).sendKeys("TestDescr");
				
				driver.findElement(By.name("submit")).click();
				
				driver.findElement(By.xpath("/html/body/table[1]/tbody/tr[3]/td/"
						+ "table/tbody/tr/td/table/tbody/tr/td/div/table/tbody/tr[1]/td/"
						+ "table/tbody/tr/td/div/table[2]/tbody/tr/td/table/tbody/tr/td/table/tbody/"
						+ "tr/td/table/tbody/tr/td[2]/div/table/tbody/tr[2]/td/b/b/a")).click();
				
				driver.close();
		
	}

}
