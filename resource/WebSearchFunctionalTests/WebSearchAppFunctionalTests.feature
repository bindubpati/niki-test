############################### Web Search App Test Scenario - Search Functionality #####################################
Feature: Reward WebSearch App Functional Tests

  @Functional1
  Scenario Outline: Validation of Web search with Valid inputs
    When User enter "楽天" in search box
    
  @Functional
  Scenario: Validation of Web search with Valid inputs
    When User enter "楽天" in search box
    Then User should scroll to till page end
