package week3.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.partialLinkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.xpath("//input[@class='inputBox']")).sendKeys("Debit Limited Account");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		driver.findElement(By.id("groupNameLocal")).sendKeys("DK");
		driver.findElement(By.id("officeSiteName")).sendKeys("Chennai");
		driver.findElement(By.xpath("(//input[@class='inputBox'])[5]")).sendKeys("1010101011111111");
		WebElement element = driver.findElement(By.name("industryEnumId"));
		Select obj =new Select(element);
		obj.selectByValue("IND_SOFTWARE");
		WebElement element1 = driver.findElement(By.name("ownershipEnumId"));
		Select owner =new Select(element1);
		owner.selectByVisibleText("S-Corporation");
		WebElement element2 = driver.findElement(By.id("dataSourceId"));
		Select source =new Select(element2);
		source.selectByValue("LEAD_EMPLOYEE");
		WebElement element3 = driver.findElement(By.id("marketingCampaignId"));
		Select market =new Select(element3);
		market.selectByIndex(6);
		WebElement element4 = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select state =new Select(element4);
		state.selectByValue("TX");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
	
	}
	

}
