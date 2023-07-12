package AutomaçãoWeb;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CadastroAdvantage {

	WebDriver driver;
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "./drive/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.grocerycrud.com/v1.x/demo/my_boss_is_in_a_hurry/bootstrap");
		driver.manage().window().maximize();		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"switch-version-select\"]/option[4]")).click();
		driver.findElement(By.xpath("//*[@id=\"gcrud-search-form\"]/div[1]/div[1]/a")).click();
		driver.findElement(By.id("field-customerName")).sendKeys("Lucas de Araujo Silva");
		driver.findElement(By.id("field-contactLastName")).sendKeys("Araujo");
		driver.findElement(By.id("field-contactFirstName")).sendKeys("Lucas");
		driver.findElement(By.id("field-phone")).sendKeys("1194562-2132");
		driver.findElement(By.id("field-addressLine1")).sendKeys("rua");
		driver.findElement(By.id("field-addressLine2")).sendKeys("Afonso Pinheiro");
		driver.findElement(By.id("field-city")).sendKeys("Sp");
		driver.findElement(By.id("field-state")).sendKeys("Sp");
		driver.findElement(By.id("field-postalCode")).sendKeys("09995-444");
		driver.findElement(By.id("field-country")).sendKeys("Brasil");
		driver.findElement(By.id("field-salesRepEmployeeNumber")).sendKeys("565656");
		driver.findElement(By.id("field-creditLimit")).sendKeys("6000");
		driver.findElement(By.id("field-deleted")).sendKeys("no");
		driver.findElement(By.id("form-button-save")).click();	
		Thread.sleep(5000);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
