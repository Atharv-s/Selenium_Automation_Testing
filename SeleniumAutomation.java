import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;

public class SeleniumAutomation {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		WebElement searchBox=driver.findElement(By.name("q"));
		searchBox.sendKeys("Samsung S24");
		searchBox.submit();
		
		String mainPage = driver.getWindowHandle();
		System.out.println("Main page="+ mainPage);
		
		driver.findElement(By.xpath("//div[@class='Nx9bqj _4b5DiR'][text()='₹64,999']")).click();
		
		/*
		 * java.util.Set<String> allPages=driver.getWindowHandles(); for(String page :
		 * allPages) { if(!page.equals(mainPage)) { driver.switchTo().window(page);
		 * break; } } System.out.println(driver.getCurrentUrl());
		 * java.util.List<WebElement> products=
		 * driver.findElements(By.className("_7eSDEz"));
		 * System.out.println(products.size()); for(WebElement product: products) {
		 * System.out.println(product.getText()); }
		 * driver.findElement(By.xpath("//button[@class=\"QqFHMw vslbG+ In9uk2\"]")).
		 * click();
		 */
	}
	
}
