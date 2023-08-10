package a2_bingTest;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A1_Samplebing {

	@Test
	public void loginBingTest() throws IOException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver wb = new ChromeDriver();
		
		wb.get("https://www.bing.com/");
		System.out.println(wb.getTitle());
		WebElement element = wb.findElement(By.name("q"));

		element.sendKeys("chennai");
		element.submit();
		System.out.println(wb.getTitle());
		wb.navigate().back();
		System.out.println(wb.getTitle());
		wb.navigate().forward();
		System.out.println(wb.getTitle());

		File src = ((TakesScreenshot) wb).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("C:/Users/LENOVO/batch260/GitTest/screenshot/bing.png"));
		wb.quit();

	}

}
