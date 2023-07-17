package AutomaçãoWeb;

import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

	public class AutomacaoAdvantagerOnline {
	
	WebDriver driver;	
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "./drive/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://advantageonlineshopping.com/#/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.id("menuUserSVGPath")).click();
		driver.findElement(By.name ("username")).sendKeys("teste");
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("123456");
		//driver.quit();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
