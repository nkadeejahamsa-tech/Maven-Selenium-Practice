package week1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.beust.jcommander.internal.Console;

public class Day1 {
	
		@Test
		public void printTitle() {
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://crio-qkart-frontend-qa.vercel.app/");
		String title =  driver.getTitle();
	    System.out.println(title);
	    driver.quit();
	}

}
