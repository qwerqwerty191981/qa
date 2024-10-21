package trianglesCalcTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.Dimension;
import org.junit.jupiter.api.BeforeAll;

import java.io.IOException;
import java.net.URL;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

@Execution(ExecutionMode.CONCURRENT)
@TestInstance(Lifecycle.PER_CLASS)
public class TestsGrid {
  private WebDriver driver1, driver2;
  String baseURL, nodeURL;
  long id1, id2;

  @BeforeAll
  public void setUp() throws IOException {
	  baseURL  =  "https://www.tusur.ru";
	  nodeURL = "http://localhost:4444";
	  
	  ChromeOptions opt1 = new ChromeOptions();
	  FirefoxOptions opt2 = new FirefoxOptions();
	  
	  
    driver1 = new RemoteWebDriver(new URL(nodeURL), opt1);
    driver2 = new RemoteWebDriver(new URL(nodeURL), opt2);
    //System.setProperty("webdriver.chrome.driver", "C:\\Users\\1\\Downloads\\chromedriver-win64\\chromedriver.exe");
  }
  @AfterAll
  public void tearDown() {
    driver1.quit();
    driver2.quit();
  }
  @Test
  public void test1() {
	id1 =Thread.currentThread().getId();
	 System.out.println("выполняем в Chrome: "+id1);
    driver1.get(baseURL);
    String title=driver1.getTitle();
    Assertions.assertEquals(title, "Томский государственный университет систем управления и радиоэлектроники");
   
  }
  
  @Test
  public void test2() {
	  id2 =Thread.currentThread().getId();
		 System.out.println("выполняем в Firefox: "+id2);
    driver2.get(baseURL);
    String title=driver2.getTitle();
    Assertions.assertEquals(title, "Томский государственный университет систем управления и радиоэлектроники");
   
  }
   
  }
  
  
  
  

