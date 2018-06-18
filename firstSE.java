
package firstSE;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstSE {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\My_java_prog\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver(); 
        driver.get("http://10.0.1.86/tatoc");
        driver.findElement(By.linkText("Basic Course")).click();
      
        driver.findElement(By.className("greenbox")).click();
        /* WebElement element = driver.findElement(By.name("q"));
        element.sendKeys("Alok");
        element.submit();

	*/	
	}

}