package pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Urlcase_1 {


	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mindsdet315\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//To open valid url
		driver.get("https://urbanladder.com");
	}
}


