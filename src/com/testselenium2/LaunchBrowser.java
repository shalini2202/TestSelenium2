package com.testselenium2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Launch IE
		System.setProperty("webdriver.ie.driver", "C:\\Users\\a631020\\Downloads\\IEDriverServer_x64_3.8.0\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.navigate().to("http://www.google.com");

	}

}
