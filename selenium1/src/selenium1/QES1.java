package selenium1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QES1 {
	

	public static void main(String[] args) throws InterruptedException {
	//Search bar script
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\M1073051\\Downloads\\chromeDriver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.eazydiner.com");

	Thread.sleep(1000);
	driver.findElement(By.xpath("//a[@id='srchbar']")).click();
	Thread.sleep(1000);
	// driver.findElement(By.xpath("//input[@id='search_city']")).sendKeys("Mumbai");
	driver.findElement(By.xpath("//a[@data-city='Mumbai']")).click();

	//driver.findElement(By.xpath("//input[@id='home-search']")).sendKeys("pizza");
	//Thread.sleep(1000);
	//driver.findElement(By.id("apxor_search")).click();





	}



	}
