package com.Niki.mobile.Chatbot.StepDefinitions;

import com.Niki.mobile.Chatbot.Common.NikiAppChatbotCommon;
import com.Niki.mobile.Chatbot.Utils.MobileTestUtils;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.android.AndroidDriver;

public class NikiAppStepDefinitions extends MobileTestUtils{
	
	NikiAppChatbotCommon rwdAppCommon = new NikiAppChatbotCommon();
	
	@Given("^I am launching the application$")
	public void i_am_launching_the_application() throws Throwable {
		getMobileDriver();
	}

	@Then("^User should see Niki \"(.*?)\" App$")
	public void user_should_see_Niki_App(String arg1) throws Throwable {
		rwdAppCommon.verifyNikiAppHomePage(driver1);
	}
	
	@When("^User touch on \"(.*?)\"$")
	public void user_touch_on_slide_menu_Icon(String arg1) throws Throwable {
		rwdAppCommon.clickOnElement(driver1,arg1);
	}

	@Then("^User should see Niki \"(.*?)\"$")
	public void user_should_see_Niki(String arg1) throws Throwable {
		rwdAppCommon.verifyAnyElement(driver1,arg1);
	}
	
	@When("^User swipe from right to left$")
	public void user_swipe_from_right_to_left(String arg1) throws Throwable {
		rwdAppCommon.verifyAnyElement(driver1,arg1);
	}


}
