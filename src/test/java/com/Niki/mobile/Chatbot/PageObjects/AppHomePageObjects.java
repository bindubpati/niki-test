package com.Niki.mobile.Chatbot.PageObjects;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;

public class AppHomePageObjects {
	private static WebElement element = null;
	
	public static WebElement NikiLogo(AndroidDriver driver){
		element = driver.findElement(By.id("com.techbins.niki.beta:id/niki_title_chat"));
		return element;
	}
	public static WebElement slidemenuIcon(AndroidDriver driver){
		element = driver.findElement(By.className("android.widget.ImageButton"));
		return element;
	}
	public static WebElement slidebarMenu(AndroidDriver driver){
		element = driver.findElement(By.id("com.techbins.niki.beta:id/sideMenu"));
		return element;
	}
	public static WebElement MyOrders(AndroidDriver driver){
		element = driver.findElement(By.xpath("android.widget.RelativeLayout[@index=1]"));
		return element;
	}
	public static WebElement ImproveMyExperience(AndroidDriver driver){
		element = driver.findElement(By.xpath("android.widget.RelativeLayout[@index=2]"));
		return element;
	}
	public static WebElement MyOrdersActivity(AndroidDriver driver){
		element = driver.findElement(By.id("com.techbins.niki.beta:id/pastOrdersList"));
		return element;
	}
	public static WebElement ImproveMyExperienceActivity(AndroidDriver driver){
		element = driver.findElement(By.id("com.techbins.niki.beta:id/iyeTitleTv"));
		return element;
	}
	public static WebElement backButtonInActivity(AndroidDriver driver){
		element = driver.findElement(By.className("android.widget.ImageButton"));
		return element;
	}
	public static WebElement HelpButton(AndroidDriver driver){
		element = driver.findElement(By.id("com.techbins.niki.beta:id/btnHelp"));
		return element;
	}
	public static WebElement RechargePhoneTab(AndroidDriver driver){
		element = driver.findElement(By.xpath("android.support.v7.app.ActionBar$Tab[@index=0]"));
		return element;
	}
	public static WebElement LaundryServiceTab(AndroidDriver driver){
		element = driver.findElement(By.xpath("android.support.v7.app.ActionBar$Tab[@index=7]"));
		return element;
	}
	
	
	
	
	
	
	
	public static WebElement loginButton(AndroidDriver driver){
		element = driver.findElement(By.id("jp.co.rakuten.toolbar.raws:id/loginButton"));
		return element;
	}
	
	public static WebElement enterUserName(AndroidDriver driver){
		element = driver.findElement(By.id("jp.co.rakuten.toolbar.raws:id/loginUser"));
		return element;
	}
	
	public static WebElement enterPassword(AndroidDriver driver){
		element = driver.findElement(By.id("jp.co.rakuten.toolbar.raws:id/loginPassword"));
		return element;
	}
	
	public static WebElement signInButton(AndroidDriver driver){
		element = driver.findElement(By.name("Sign In"));
		return element;
	}
	
	public static WebElement signInPopUpButton1(AndroidDriver driver){
		element = driver.findElement(By.name("Re-try"));
		return element;
	}
	
	public static WebElement signInPopUpButton2(AndroidDriver driver){
		element = driver.findElement(By.name("Later"));
		return element;
	}
	
	public static WebElement kuchisuBar(AndroidDriver driver){
	element = driver.findElement(By.id("jp.co.rakuten.toolbar.raws:id/header_seekBar"));
	return element;
}
	
	public static WebElement searchEditTest(AndroidDriver driver){
		element = driver.findElement(By.id("jp.co.rakuten.toolbar.raws:id/searchEdit"));
		return element;
	}
	
	public static WebElement searchImageButton(AndroidDriver driver){
		element = driver.findElement(By.id("jp.co.rakuten.toolbar.raws:id/home_ib_magnigying"));
		return element;
	}
	
	public static WebElement homeSettingButton(AndroidDriver driver){
		element = driver.findElement(By.id("jp.co.rakuten.toolbar.raws:id/home_setting"));
		return element;
	}
	
	public static WebElement RServices(AndroidDriver driver){
		element = driver.findElement(By.id("jp.co.rakuten.toolbar.raws:id/setting_content_header_r_service"));
		return element;
	}
	
	public static WebElement FMService(AndroidDriver driver){
		element = driver.findElement(By.id("jp.co.rakuten.toolbar.raws:id/discover_app_name"));
		return element;
	}
	
	public static WebElement searchResultsPageEnd(AndroidDriver driver){
		element = driver.findElement(By.id("relatedword_down"));
		return element;
	}
	
	public static WebElement searchResultsMain(AndroidDriver driver){
		element = driver.findElement(By.id("resultMain"));
		return element;
	}
}
