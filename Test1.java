package first_se;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver(); 
        driver.get("http://www.google.com"); 
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys("Alok");
        element.submit();

		
	}

}