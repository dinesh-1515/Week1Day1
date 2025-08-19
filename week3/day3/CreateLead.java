package week3.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver =new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get( "http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.partialLinkText("Leads")).click();
		driver.findElement(By.partialLinkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Dinesh kumar");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("G");
		WebElement element = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select obj = new Select(element);
		obj.selectByVisibleText("Employee");
		WebElement element2 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select mark = new Select(element2);
		mark.selectByValue("9001");
		WebElement element3 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select corp = new Select(element3);
		corp.selectByIndex(5);
		WebElement element4 = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select country = new Select(element4);
		country.selectByVisibleText("India");
		driver.findElement(By.name("submitButton")).click();
		System.out.println("View Lead");
		
		
	
	}

}
