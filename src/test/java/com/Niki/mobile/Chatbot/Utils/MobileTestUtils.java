package com.Niki.mobile.Chatbot.Utils;

import java.applet.Applet;
import java.io.File;
import java.io.FileInputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

import com.Niki.mobile.Chatbot.Config.NikiConfigurations;
import com.Niki.mobile.Chatbot.PageObjects.AppHomePageObjects;
import com.niki.mobile.chatbot.App;

import cucumber.api.Scenario;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.service.*;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class MobileTestUtils {
	@SuppressWarnings("unused")
	//private static final String CapabilityType = null;
	public static AndroidDriver driver1;
	public static IOSDriver driver2;
	public static String filePath = new File("").getAbsolutePath();
	public static Logger APP_LOGS = null;
	public Properties readUserLevelProperties;
	public static AppiumDriverLocalService appiumService;
	public static String appiumServiceUrl;

	
	public MobileTestUtils(){
		APP_LOGS = APP_LOGS= Logger.getLogger("devpinoyLogger");
	}
	public WebDriver getMobileDriver() throws MalformedURLException {
		  
		  APP_LOGS.debug("Open the SP Browser");
		  try {
		   if (NikiConfigurations.browserType.equals("AndroidBrowser")) {
			   
			   File app = new File(filePath+"//Apks//app-test-apk.apk");
	
				appiumService = AppiumDriverLocalService.buildDefaultService();
				appiumService.start();
		        appiumServiceUrl = appiumService.getUrl().toString();
		        System.out.println("Appium Service Address : - "+ appiumServiceUrl);
		        
		    // setup the desired capability and pass the android activity
		    DesiredCapabilities cap = new DesiredCapabilities();
		    cap.setCapability(org.openqa.selenium.remote.CapabilityType.BROWSER_NAME, "");
			cap.setCapability("deviceName", "emulator-5554");
			cap.setCapability("platformVersion", "4.4.2");
			cap.setCapability("platformName", "Android");
			cap.setCapability("app",app.getAbsolutePath() );
			cap.setCapability("appPackage", "jp.co.rakuten.toolbar.raws");
			cap.setCapability("appActivity", "jp.co.rakuten.toolbar.raws.activity.WelcomeActivity");
		    //cap.setCapability("browserName", "browser");
		   //cap.setCapability("appium-version", "1.6.4");
		   // cap.setCapability("VERSION", "5.1.1");
		    //cap.setCapability("deviceName", "ANDROID");
		    //cap.setCapability("platformName", "ANDROID");

		    driver1 = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		    return driver1;
		   } else if (NikiConfigurations.browserType.equals("IOSBrowser")) {
			   File app = new File(filePath+"//Apks//app-test-apk.apk");

		    appiumService = AppiumDriverLocalService.buildDefaultService();
		    appiumService.start();
		    appiumServiceUrl = appiumService.getUrl().toString();
		    System.out.println("Appium Service Address : - "+ appiumServiceUrl);

		    // setup the desired capability and pass the android activity
		    DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		    desiredCapabilities.setCapability("platformName", "iOS");
		    desiredCapabilities.setCapability("deviceName","iPhone 6s Plus");
		    desiredCapabilities.setCapability("platformVersion", "9.3");
		    desiredCapabilities.setCapability(CapabilityType.BROWSER_NAME,"safari");
		    driver2 = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), desiredCapabilities);
		    return driver2;
		   }
		 
		  } catch (Exception e) {
		   e.printStackTrace();
		  }
		  return null;
		 }
//	public static AndroidDriver getDriver() throws Exception{
////		 appiumService = AppiumDriverLocalService.buildDefaultService();
////			appiumService.start();
////	        appiumServiceUrl = appiumService.getUrl().toString();
////	        System.out.println("Appium Service Address : - "+ appiumServiceUrl);
//	        
//		File app = new File(filePath+"//Apks//app-test-apk.apk");
//		DesiredCapabilities capabilities = new DesiredCapabilities();
//		capabilities.setCapability(org.openqa.selenium.remote.CapabilityType.BROWSER_NAME, "");
//		capabilities.setCapability("deviceName", "emulator-5554");
//		capabilities.setCapability("platformVersion", "4.4.2");
//		capabilities.setCapability("platformName", "Android");
//		capabilities.setCapability("app", app.getAbsolutePath());
//		capabilities.setCapability("appPackage", "jp.co.rakuten.toolbar.raws");
//		capabilities.setCapability("appActivity", "jp.co.rakuten.toolbar.raws.activity.WelcomeActivity");
//		try {
//			driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
//			driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
//			Thread.sleep(5000);
//
//		} catch (MalformedURLException e) {
//			e.printStackTrace();
//		}
//		return driver;
//	}
//	
//	public static void setDeviceCapabilities() throws Exception {
//
//		File app = new File(filePath+"//Apks//app-test-apk.apk");
//		//File app = new File("C:/Users/saibindu.bogadapati/git/reward-websearch-mobile-automation/reward-websearch-mobile-automation/Apks/app-test-apk.apk");
//		DesiredCapabilities capabilities = new DesiredCapabilities();
//		capabilities.setCapability(org.openqa.selenium.remote.CapabilityType.BROWSER_NAME, "");
//		capabilities.setCapability("deviceName", "emulator-5556");
//		capabilities.setCapability("platformVersion", "6.0");
//		capabilities.setCapability("platformName", "Android");
//		capabilities.setCapability("app", app.getAbsolutePath());
//		capabilities.setCapability("appPackage", "jp.co.rakuten.toolbar.raws");
//		capabilities.setCapability("appActivity", "jp.co.rakuten.toolbar.raws.activity.WelcomeActivity");
//		try {
//			driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
//			driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
//			Thread.sleep(5000);
//		} catch (MalformedURLException e) {
//			e.printStackTrace();
//		}
//	}
	
	public void enterLoginDetails(AndroidDriver driver) {
		APP_LOGS.debug("Entering username and Password for login into application");	
		try {
			WebElement loginButton = AppHomePageObjects.loginButton(driver);
			Assert.assertEquals(loginButton.isDisplayed(), true);
			loginButton.click();
			Thread.sleep(2000);
			Properties userLevelProperties = readUserLevelProperties();
			AppHomePageObjects.enterUserName(driver).clear();
			AppHomePageObjects.enterUserName(driver).sendKeys(userLevelProperties.getProperty("UserName"));
			Thread.sleep(1000);
			AppHomePageObjects.enterPassword(driver).clear();
			AppHomePageObjects.enterPassword(driver).sendKeys(userLevelProperties.getProperty("Password"));
			Thread.sleep(1000);
			AppHomePageObjects.signInButton(driver).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}	
	
	public Properties readUserLevelProperties()throws Exception {

		try{
			APP_LOGS.debug("Reading the LoginCredentials properties file");
			FileInputStream fs;

			readUserLevelProperties = new Properties();
			fs = new FileInputStream( filePath +"/src/test/java/com/Rakuten/mobile/Rewards/dataset/LoginCredentials.properties");
			readUserLevelProperties.load(fs);

		} catch(Exception e){
			e.printStackTrace();
			APP_LOGS.debug("Error occurred while reading the Email properties file"+e);
		}
		return readUserLevelProperties;
	}
	
	public void getScreenshot(WebDriver driver, Scenario scenarioname) throws Exception {
		byte[] scrFile = ((org.openqa.selenium.TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		scenarioname.embed(scrFile, "image/png");
	}
}
