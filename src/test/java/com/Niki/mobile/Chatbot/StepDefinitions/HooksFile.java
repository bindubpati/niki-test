package com.Niki.mobile.Chatbot.StepDefinitions;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
	features = {"resource/"},
		plugin = {"pretty","html:target/cucumber-html-report","json:target/cucumber.json"},
		tags = {"@Login,@Functional"}
  )

public class HooksFile{
}
