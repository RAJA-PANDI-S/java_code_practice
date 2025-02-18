package ImageComparison;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.Instant;

public class TestCode {
 static WebDriver driver = new ChromeDriver();
 static WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
 static TakeSnapshot snapshot;

 public static void main(String args[]) throws InterruptedException {
  System.out.println("This is Step 1");
  driver.navigate().to("https://in.tradingview.com/");
  driver.manage().window().maximize();
  System.out.println("Site opened at \t" + Instant.now());
  driver.findElement(By.xpath("//span[@class='searchText-PCujdK9L']")).click();
  Thread.sleep(3000);

  String input = "SBIN";
  WebElement searchInput = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@class='input-KLRTYDjH' and @type='search']")));
  for (int i = 0; i < input.length(); i++) {
   // Extract the character at the current index and convert it to a string.
   searchInput.sendKeys(String.valueOf(input.charAt(i)));
   // Add a delay or wait (e.g., for user interface responsiveness).
   Thread.sleep(2000);
  }
  Thread.sleep(3000);
  searchInput.sendKeys(Keys.ENTER);

  //button[text()='STATE BANK OF INDIA']
  WebElement search = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[text()='STATE BANK OF INDIA']")));

  String actualTitle = driver.getTitle();
  //snapshot = new TakeSnapshot(driver, "TradingView_Chart");
  //ImageComparisonTest.testImageComparison();
  //String expectedTitle = "";
  //Assert.assertEquals(actualTitle, expectedTitle, "Title does not match the expected value!");
  System.out.println("==========================================================================");
  System.out.println(actualTitle);
  System.out.println("==========================================================================");
  //logger.info("Test 1 completed Successfully");
  System.out.println("TradingView Test completed Successfully");

 }
}
