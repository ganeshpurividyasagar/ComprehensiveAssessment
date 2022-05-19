package pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logincase_2 {


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
	}
}