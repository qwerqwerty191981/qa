package trianglesCalcTests;


	
	

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;
	import org.openqa.selenium.Dimension;
import org.openqa.selenium.TakesScreenshot;
import org.junit.jupiter.api.BeforeAll;
	import org.junit.jupiter.api.AfterAll;
	import org.junit.jupiter.api.Test;
	import org.junit.jupiter.api.Assertions;
	import org.junit.jupiter.api.TestInstance;
	import org.junit.jupiter.api.TestInstance.Lifecycle;
	
	@TestInstance(Lifecycle.PER_CLASS)
	public class TriangleTests {
	  private WebDriver driver;
	
	  @BeforeAll
	  public void setUp() {
		  ChromeOptions opt = new ChromeOptions();
		  opt.addArguments("--headless");
	    driver = new ChromeDriver(opt);
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\1\\Downloads\\chromedriver-win64\\chromedriver.exe");
	  }
	  @AfterAll
	  public void tearDown() {
	    driver.quit();
	  }
	  @Test
	  public void test1() {
	    driver.get("https://www.calculator.net/triangle-calculator.html");
	    driver.manage().window().setSize(new Dimension(968, 1040));
	    driver.findElement(By.cssSelector("input:nth-child(3)")).click();
	    driver.findElement(By.name("vx")).click();
	    driver.findElement(By.name("vx")).sendKeys("1");
	    driver.findElement(By.name("vy")).click();
	    driver.findElement(By.name("vy")).sendKeys("1");
	    driver.findElement(By.name("vz")).click();
	    driver.findElement(By.name("vz")).sendKeys("1");
	    driver.findElement(By.name("x")).click();
	    Assertions.assertEquals(driver.findElement(By.cssSelector("td > h3")).getText(), "Equilateral Triangle");
	   
	  }
	  
	  @Test
	  public void test2() {
	    driver.get("https://www.calculator.net/triangle-calculator.html");
	    driver.manage().window().setSize(new Dimension(968, 1040));
	    driver.findElement(By.cssSelector("input:nth-child(3)")).click();
	    driver.findElement(By.name("vx")).click();
	    driver.findElement(By.name("vx")).sendKeys("3");
	    driver.findElement(By.name("vy")).click();
	    driver.findElement(By.name("vy")).sendKeys("4");
	    driver.findElement(By.name("vz")).click();
	    driver.findElement(By.name("vz")).sendKeys("5");
	    driver.findElement(By.name("x")).click();
	    Assertions.assertEquals(driver.findElement(By.cssSelector("td > h3")).getText(), "Right Scalene Triangle");
	   
	  }
	public TakesScreenshot getDriver() {
		// TODO Auto-generated method stub
		return null;
	}
	  

	  
	 
	}


