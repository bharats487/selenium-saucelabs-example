package com.example.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

/**
 * Sample test executed on Sauce Labs
 *
 */
public class SampleSauceTest {
	/**
	 * Your Sauce Labs username
	 */
	public static final String USERNAME = "allex777";
	
	/**
	 * Your Sauce Labs access key
	 */
	public static final String ACCESS_KEY = "687ba6d7-f0d7-4119-9fa7-c332c14f2a94";
	
	/**
	 * URL for Sauce Labs
	 */
	public static final String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";

	/**
	 * Execute a simple test on Sauce Labs
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {

		DesiredCapabilities caps = DesiredCapabilities.chrome();
		caps.setCapability("platform", "Windows XP");
		caps.setCapability("version", "43.0");

		WebDriver driver = new RemoteWebDriver(new URL(URL), caps);

	    /**
	     * Goes to Sauce Lab's guinea-pig page and prints title
	     */
	
	    driver.get("https://saucelabs.com/test/guinea-pig");
	    System.out.println("title of page is: " + driver.getTitle());
	
	    driver.quit();
	}
}
