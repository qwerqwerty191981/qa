package trianglesCalcTests;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.*;

public class TrianglesSteps {
	WebDriver driver;
	@Given("Open Triangle Calculator")
	public void setDriver() {
		ChromeOptions opt=new ChromeOptions();
		driver = new ChromeDriver(opt);
		System.setProperty("webdriver.crome.driver","C:\\\\Users\\\\1\\\\Downloads\\\\chromedriver-win64\\\\chromedriver.exe");
		driver.get("https://www.calculator.net/triangle-calculator.html");
	}
	@When("Clear all parameters")
	public void clearParam() {
		  driver.findElement(By.cssSelector("input:nth-child(3)")).click();
	}
	@And("Set value \"3\" for side \"A\"")
	public void setA() {
	    driver.findElement(By.name("vx")).sendKeys("3");
	}
	@And("Set value \"3\" for side \"B\"")
	public void setB() {
	    driver.findElement(By.name("vy")).sendKeys("3");
	}
	@And("Set value \"5\" for side \"C\"")
	public void setC() {
	    driver.findElement(By.name("vz")).sendKeys("5");
	}
	@And("Click button \"Calculate\"")
	public void clickButton() {
		  driver.findElement(By.name("x")).click();
	}
	
	@Then("Get result is \"Obtuse Isosceles Triangle\"")
	public void verifeResult() {
		 Assertions.assertEquals(driver.findElement(By.cssSelector("td > h3")).getText(), "Obtuse Isosceles Triangle");
		 driver.quit();
	}

}
