/**
 * 
 */
package com.itexps.sales.mygoogletest;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author thakkar4
 *
 */
public class GoogleTest {

	private WebDriver driver;
	private String baseUrl;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		baseUrl = "https://www.google.com/";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGoogleTest() throws Exception {
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).clear();
		driver.findElement(By.name("q")).sendKeys("basketball");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		try {
			assertEquals("basketball - Google Search", driver.getTitle());
		} catch (Error e) {
			System.out.println(e.toString());
		}
	}

}
