package trianglesCalcTests;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.*;

public class CalcTest {
	WebDriver driver;
	@Given("I use the calculater")
	public void setDriver() {
		ChromeOptions opt=new ChromeOptions();
		driver = new ChromeDriver(opt);
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\1\\\\Downloads\\\\chromedriver-win64\\\\chromedriver.exe");
		driver.get(" https://www.calculator.net/math-calculator.html");
	}
	
	@When("I enter \"1\" into the calculator")
	public void setValue() {
		  driver.findElement(By.cssSelector("div:nth-child(3) > .scinm:nth-child(1)")).click();
	}
	
	@And("I add \"200\"")
	public void addA() {
		driver.findElement(By.cssSelector("div:nth-child(1) > .sciop:nth-child(4)")).click();
	    driver.findElement(By.cssSelector("div:nth-child(3) > .scinm:nth-child(2)")).click();
	    driver.findElement(By.cssSelector("div:nth-child(4) > .scinm:nth-child(1)")).click();
	    driver.findElement(By.cssSelector("div:nth-child(4) > .scinm:nth-child(1)")).click();
    }
	@And("I subtract \"200\"")
	public void subtractA() {
		driver.findElement(By.cssSelector("div:nth-child(2) > .sciop:nth-child(4)")).click();
	    driver.findElement(By.cssSelector("div:nth-child(3) > .scinm:nth-child(2)")).click();
	    driver.findElement(By.cssSelector("div:nth-child(4) > .scinm:nth-child(1)")).click();
	    driver.findElement(By.cssSelector("div:nth-child(4) > .scinm:nth-child(1)")).click();
    }
	@And("I divide by \"555\"")
	public void divideA() {
	driver.findElement(By.cssSelector("div:nth-child(4) > .sciop:nth-child(4)")).click();
    driver.findElement(By.cssSelector("div:nth-child(2) > .scinm:nth-child(2)")).click();
    driver.findElement(By.cssSelector("div:nth-child(2) > .scinm:nth-child(2)")).click();
    driver.findElement(By.cssSelector("div:nth-child(2) > .scinm:nth-child(2)")).click();
	}
	@And("I multiply by \"555\"")
	public void multiplyA() {
	driver.findElement(By.cssSelector("div:nth-child(3) > .sciop:nth-child(4)")).click();
    driver.findElement(By.cssSelector("div:nth-child(2) > .scinm:nth-child(2)")).click();
    driver.findElement(By.cssSelector("div:nth-child(2) > .scinm:nth-child(2)")).click();
    driver.findElement(By.cssSelector("div:nth-child(2) > .scinm:nth-child(2)")).click();
	}
	
	@Then("the calculated result is \"1\"")
	public void verifyResult() {
		 Assertions.assertEquals(driver.findElement(By.id("sciOutPut")).getText(), " 1");
		 driver.quit();
	}

}
