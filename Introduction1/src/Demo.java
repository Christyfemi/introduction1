import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_Chrome 86\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.ebay.com/");
       System.out.println(driver.getCurrentUrl());
	 driver.quit();
	}
     
}
 