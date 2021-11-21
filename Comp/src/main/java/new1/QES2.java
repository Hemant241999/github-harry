package new1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QES2 {


	public static void main(String[] args) throws InterruptedException {
	// Book table Script



	System.setProperty("webdriver.chrome.driver", "C:\\Users\\M1073051\\Downloads\\chromeDriver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.eazydiner.com");

	Thread.sleep(1000);
	driver.findElement(By.xpath("//span[text()='Book a Table']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id='restaurants']/div[3]/div/div[3]/div[2]/div[2]/a")).click();
	// driver.findElement(By.xpath("//*[@id='eazy-booking']/div/div/div/div/ul/li[1]/input")).click();

	driver.findElement(By.xpath("//button[contains(text(),'Continue to book a table')]")).click();
	driver.findElement(By.xpath("//input[@id='guest_name']")).sendKeys("Siddharth Mote");
	driver.findElement(By.xpath("//*[@id='guest-form']/div/div[2]/div/div/input")).sendKeys("8312364876");

	driver.findElement(By.xpath("//input[@id='guest_email']")).sendKeys("Siddharthmote45@gmail.com");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id='checkout-button']")).click();

	}
	}
