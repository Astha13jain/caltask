package CalTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import CalCu.Desired;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import java.net.MalformedURLException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class CalTest1 extends Desired {
	
AndroidDriver<AndroidElement> driver;
SoftAssert softAssert =new SoftAssert();

@BeforeTest

public void cap() throws MalformedURLException
{
	driver= capability();
}

@Test
public void CalculatorTest1()
{
	driver.findElement(By.id("com.google.android.calculator:id/digit_7")).click();
	driver.findElement(MobileBy.AccessibilityId("plus")).click();
	driver.findElement(By.id("com.google.android.calculator:id/digit_3")).click();
	WebElement sum =driver.findElement(MobileBy.AccessibilityId("equals"));
	sum.click();
	softAssert.assertTrue(sum.isDisplayed());
	
	driver.findElement(By.id("com.google.android.calculator:id/digit_9")).click();
	driver.findElement(By.id("com.google.android.calculator:id/digit_2")).click();
	driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"minus\"]")).click();
	driver.findElement(By.id("com.google.android.calculator:id/digit_2")).click();
	WebElement subtract=driver.findElement(MobileBy.AccessibilityId("equals"));
	subtract.click();
	softAssert.assertTrue(subtract.isDisplayed());
	
	driver.findElementByAndroidUIAutomator("text(\"3\")").click();
	driver.findElementByAndroidUIAutomator("text(\"2\")").click();
	driver.findElement(MobileBy.AccessibilityId("multiply")).click();
	driver.findElement(By.id("com.google.android.calculator:id/digit_2")).click();
	WebElement multiply =driver.findElement(MobileBy.AccessibilityId("equals"));
	multiply.click();
	softAssert.assertTrue(multiply.isDisplayed());
	
	driver.findElement(By.id("com.google.android.calculator:id/digit_1")).click();
	driver.findElement(By.id("com.google.android.calculator:id/digit_0")).click();
	driver.findElement(By.id("com.google.android.calculator:id/digit_0")).click();
	driver.findElement(MobileBy.AccessibilityId("divide")).click();
	driver.findElement(By.id("com.google.android.calculator:id/digit_2")).click();
	WebElement divide=driver.findElement(MobileBy.AccessibilityId("equals"));
	divide.click();
	softAssert.assertTrue(divide.isDisplayed());
	
	
}
@Test
public void CalculatorTest2()
{
	
	driver.findElement(By.id("com.google.android.calculator:id/digit_2")).click();
	driver.findElement(By.id("com.google.android.calculator:id/digit_4")).click();
	driver.findElement(By.id("com.google.android.calculator:id/digit_0")).click();
	driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"multiply\"]")).click();
	driver.findElement(By.id("com.google.android.calculator:id/digit_2")).click();
	driver.findElement(By.id("com.google.android.calculator:id/digit_0")).click();
	driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"plus\"]")).click();
	driver.findElement(By.id("com.google.android.calculator:id/digit_1")).click();
	driver.findElement(By.id("com.google.android.calculator:id/digit_0")).click();
	driver.findElement(By.id("com.google.android.calculator:id/digit_0")).click();
	driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"minus\"]")).click();
	driver.findElement(By.id("com.google.android.calculator:id/digit_1")).click();
	driver.findElement(By.id("com.google.android.calculator:id/digit_0")).click();
	WebElement result=driver.findElement(MobileBy.AccessibilityId("equals"));
	result.click();
	softAssert.assertTrue(result.isDisplayed());
	
}

@Test
public void CalculatorTest3()
{
	driver.findElement(By.id("com.google.android.calculator:id/digit_4")).click();
	driver.findElement(By.id("com.google.android.calculator:id/digit_8")).click();
	driver.findElement(By.id("com.google.android.calculator:id/digit_0")).click();
	driver.findElement(By.id("com.google.android.calculator:id/digit_0")).click();
	driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"divide\"]")).click();
	driver.findElement(By.id("com.google.android.calculator:id/digit_1")).click();
	driver.findElement(By.id("com.google.android.calculator:id/digit_0")).click();
	driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"plus\"]")).click();
	driver.findElement(By.id("com.google.android.calculator:id/digit_8")).click();
	WebElement result1=driver.findElement(MobileBy.AccessibilityId("equals"));
	result1.click();
	softAssert.assertTrue(result1.isDisplayed());

	
}
@Test
public void CalculatorTest4()
{
	driver.findElement(By.id("com.google.android.calculator:id/digit_3")).click();
	driver.findElement(By.id("com.google.android.calculator:id/digit_2")).click();
	driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"divide\"]")).click();
	driver.findElement(By.id("com.google.android.calculator:id/digit_1")).click();
	driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"multiply\"]")).click();
	driver.findElement(By.id("com.google.android.calculator:id/digit_1")).click();
	driver.findElement(By.id("com.google.android.calculator:id/digit_0")).click();
	driver.findElement(By.id("com.google.android.calculator:id/digit_0")).click();
	driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"minus\"]")).click();
	driver.findElement(By.id("com.google.android.calculator:id/digit_1")).click();
	driver.findElement(By.id("com.google.android.calculator:id/digit_0")).click();
	WebElement result2=driver.findElement(MobileBy.AccessibilityId("equals"));
	result2.click();
	softAssert.assertTrue(result2.isDisplayed());
	
}

@Test
public void CalculatorTest5()
{
	driver.findElement(By.id("com.google.android.calculator:id/digit_6")).click();
	driver.findElement(By.id("com.google.android.calculator:id/digit_8")).click();
	driver.findElement(By.id("com.google.android.calculator:id/digit_0")).click();
	driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"multiply\"]")).click();
	driver.findElement(By.id("com.google.android.calculator:id/digit_1")).click();
	driver.findElement(By.id("com.google.android.calculator:id/digit_0")).click();
	driver.findElement(By.id("com.google.android.calculator:id/digit_0")).click();
	driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"minus\"]")).click();
	driver.findElement(By.id("com.google.android.calculator:id/digit_2")).click();
	driver.findElement(By.id("com.google.android.calculator:id/digit_0")).click();
	WebElement result3=driver.findElement(MobileBy.AccessibilityId("equals"));	
	result3.click();
	softAssert.assertTrue(result3.isDisplayed());
	
}
@AfterTest
public void AppClose()
{
	softAssert.assertAll();
	driver.quit();
}
}
