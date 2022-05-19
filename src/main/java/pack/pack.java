package pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pack {


	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mindsdet315\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//To open valid url
		driver.get("https://urbanladder.com");
		
		//This is to open the login popup window
		
		driver.findElement(By.xpath("//span[@class='header-icon-link user-profile-icon']")).click();
		driver.findElement(By.xpath("//a[@class='login-link authentication_popup']")).click();
		Thread.sleep(5000);
		
		//verify the valid sign in account
		driver.findElement(By.xpath("//input[@autofocus='autofocus']")).sendKeys("ganeshpurividyasagar@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("vidyaVSS1432@");
		driver.findElement(By.xpath("//input[@class='button primary']")).click();
		Thread.sleep(5000);
		
		//verify the search box with the item name
		WebElement searchBox=driver.findElement(By.id("search"));
		searchBox.sendKeys("study");
		searchBox.submit();
		
		WebElement a1=driver.findElement(By.xpath("//*[@id='search']"));
		a1.click();
		 //verify to get the details of selected item
		WebElement search=driver.findElement(By.id("search"));
	    search.sendKeys("study table");
		search.submit();
		
		//open the details of the selected item in a new window
		WebElement a2=driver.findElement(By.xpath("//*[@id=\"search-results\"]/div[3]/ul/li[1]/div/a/img"));
		a2.click();
	}
}
		
	
