package com.Sign.Page;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasePage {
	public WebDriver driver;
	public Properties prop;

	public BasePage() throws IOException {
		FileInputStream ip = new FileInputStream("G:\\Rahane\\Company\\src\\test\\java\\com.OR.properties");
		prop = new Properties();
		prop.load(ip);

		if (prop.getProperty("browserName").equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "G:\\selenium\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (prop.getProperty("browserName").equalsIgnoreCase("firefox")) {
			System.getProperty("webdriver.gecko.driver", "G:\\selenium\\Softwares\\geckodriver\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else {
			System.out.println("open IE");
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.quidlo.com/");
	}

	public void sendKeys(String xpathKey, String userData) {
		driver.findElement(By.xpath(prop.getProperty(xpathKey))).sendKeys(userData);
		
	}

	public void click(String xpathKey) {
		driver.findElement(By.xpath(prop.getProperty(xpathKey))).click();
	}

}
