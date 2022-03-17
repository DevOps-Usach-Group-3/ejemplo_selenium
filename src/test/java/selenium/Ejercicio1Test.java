// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class Ejercicio1Test {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    try {
      Thread.sleep(2000);
    } catch (InterruptedException e) {e.printStackTrace();}
    driver.quit();
  }
  @Test
  public void ejercicio1() {
    driver.get("https://www.google.com/");
    driver.manage().window().setSize(new Dimension(1920, 1080));
    driver.findElement(By.name("q")).click();
    driver.findElement(By.name("q")).sendKeys("DevOps Handbook");
    driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
    driver.findElement(By.name("q")).click();
    driver.findElement(By.name("q")).clear();
    driver.findElement(By.name("q")).sendKeys("DevOps Handbook images");
    driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
    driver.findElement(By.cssSelector(".eA0Zlc:nth-child(1) .fWhgmd")).click();
    js.executeScript("window.scrollTo(0,144.5454559326172)");
    driver.findElement(By.id("REsRA")).click();
    driver.findElement(By.name("q")).clear();
    driver.findElement(By.id("REsRA")).sendKeys("DevOps Handbook buy amazon");
    driver.findElement(By.id("REsRA")).sendKeys(Keys.ENTER);
    driver.findElement(By.linkText("All")).click();
  }
}
