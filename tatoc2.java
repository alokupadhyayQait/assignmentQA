package firstSE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tatoc2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\My_java_prog\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver(); 
        driver.get("http://10.0.1.86/tatoc/basic/frame/dungeon");
        driver.switchTo().frame(0);
        String box1 =   driver.findElement(By.id("answer")).getAttribute("class");
        
        while(true){
            
        	driver.findElement(By.cssSelector("a")).click();
        	driver.switchTo().frame("child"); 
                    
        			String box2 = driver.findElement(By.id("answer")).getAttribute("class");
                    driver.switchTo().parentFrame();
                    
                    
                    if(box1.equals(box2))
                    {
                    	driver.findElements(By.cssSelector("a")).get(1).click(); 
                        break;
                    }
                
                    
                }
        	   

}
}