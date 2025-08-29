package week4.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SauceDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/v1/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		WebElement element = driver.findElement(By.className("inventory_item_name"));
		System.out.println(element.getText());
		WebElement element2 = driver.findElement(By.className("inventory_item_price"));
		System.out.println(element2.getText());
		driver.findElement(By.xpath("//button[@class='btn_primary btn_inventory']")).click();
		
		//driver.findElement(By.className("//div[@id='shopping_cart_container']//ancestor::path")).click();
		//driver.findElement(By.className("inventory_item_price"));
		driver.get("https://www.saucedemo.com/v1/cart.html");
		System.out.println("product price matches");
		
		driver.findElement(By.partialLinkText("CHECKOUT")).click();
		driver.findElement(By.id("first-name")).sendKeys("Dinesh");
		driver.findElement(By.id("last-name")).sendKeys("kumar");
		driver.findElement(By.id("postal-code")).sendKeys("635124");
		driver.findElement(By.xpath("//input[@class='btn_primary cart_button']")).click();

	}

}
