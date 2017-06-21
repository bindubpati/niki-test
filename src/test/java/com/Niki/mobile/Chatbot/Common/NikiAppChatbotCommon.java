package com.Niki.mobile.Chatbot.Common;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.Niki.mobile.Chatbot.PageObjects.AppHomePageObjects;
import com.Niki.mobile.Chatbot.Utils.MobileTestUtils;

import cucumber.api.Scenario;
import io.appium.java_client.android.AndroidDriver;

public class NikiAppChatbotCommon extends MobileTestUtils {
	public static Logger APP_LOGS = null;
	public Properties prop = null;
	public Properties properties = null;
	AndroidDriver driver;

	public NikiAppChatbotCommon() {
		APP_LOGS = Logger.getLogger("devpinoyLogger");
	}

	public void verifyNikiAppHomePage(AndroidDriver driver) {
		try {
			APP_LOGS.debug("Verifying Websearch home page");
			Thread.sleep(1000);
			boolean isDiaplayed = AppHomePageObjects.NikiLogo(driver).isDisplayed();
			Assert.assertEquals(isDiaplayed, true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterStringForWebSearch(AndroidDriver driver, String strWebElement, String strTextToEnter)
			throws Exception {
		try {
			switch (strWebElement) {
			case "searchTxtBox":
				// updateKuchisuPointsIntoFile(driver);
				APP_LOGS.debug("Entering searchText in search box in websearch page");
				Assert.assertEquals(AppHomePageObjects.searchEditTest(driver).isDisplayed(), true);
				System.out.println("strTextToEnter ---" + strTextToEnter);
				AppHomePageObjects.searchEditTest(driver).clear();
				AppHomePageObjects.searchEditTest(driver).sendKeys("test");
				AppHomePageObjects.searchImageButton(driver).click();
				Thread.sleep(1000);
				break;
			}
		} catch (Exception e) {
			APP_LOGS.debug("Error occurred while loading websearch application" + e);
			e.printStackTrace();
		}
	}
	public void clickOnElement(AndroidDriver driver, String strWebElement)
			throws Exception {
		try {
			switch (strWebElement) {
			case "slidemenuIcon":
				APP_LOGS.debug("Touching on slidemenu icon for opening navigator drawer");
				Assert.assertEquals(AppHomePageObjects.slidemenuIcon(driver).isDisplayed(), true);
				AppHomePageObjects.slidemenuIcon(driver).click();
				Thread.sleep(1000);
				break;
			case "MyOrders":
				APP_LOGS.debug("Touching on Myorders to see Myorders activity");
				Assert.assertEquals(AppHomePageObjects.MyOrders(driver).isDisplayed(), true);
				AppHomePageObjects.MyOrders(driver).click();
				Thread.sleep(1000);
				break;
			}
		} catch (Exception e) {
			APP_LOGS.debug("Error occurred while loading niki application" + e);
			e.printStackTrace();
		}
	}
	public void verifyAnyElement(AndroidDriver driver, String strWebElement)
			throws Exception {
		try {
			switch (strWebElement) {
			case "slidebarMenu":
				APP_LOGS.debug("verify slide bar menu is displayed");
				Assert.assertEquals(AppHomePageObjects.slidebarMenu(driver).isDisplayed(), true);
				Thread.sleep(1000);
				break;
			case "MyordersActivity":
				APP_LOGS.debug("verify my orders activity is displayed");
				Assert.assertEquals(AppHomePageObjects.MyOrdersActivity(driver).isDisplayed(), true);
				Thread.sleep(1000);
			
				break;
			}
		} catch (Exception e) {
			APP_LOGS.debug("Error occurred while loading niki application" + e);
			e.printStackTrace();
		}
	}

      public void swipeRToL(AndroidDriver driver){
	  driver.swipe(900, 1170, 180, 1170, 100);
	  
      }

	public void verticalScroll()
    {
        Dimension size = driver.manage().window().getSize();
        int y_start=(int)(size.height*0.60);
        int y_end=(int)(size.height*0.30);
        int x=size.width/2;
        driver.swipe(x,y_start,x,y_end,4000);
    }
}
