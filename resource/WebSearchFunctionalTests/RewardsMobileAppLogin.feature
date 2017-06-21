Feature: Niki Mobile App Functional Tests

  @Functional
  Scenario: Verify App is Launched with signedup user
    Given I am launching the application
    Then User should see Niki "chatbot" App

  @Functional
  Scenario: Verify slidebar menu and Myorders activity
    When User touch on "slidemenuIcon"
    Then User should see Niki "slidebarMenu"
    When User touch on "MyOrders"
    Then User should see Niki "MyordersActivity"
    And User touch on "backButtonInActivity"

  @Functional
  Scenario: Verify Improve My experience activity
    When User touch on "slidemenuIcon"
    Then User should see Niki "slidebarMenu"
    When User touch on "ImproveMyExperience"
    Then User should see Niki "ImproveMyExperienceActivity"
    And User touch on "backButtonInActivity"

  @Functional
  Scenario: Verify help ,suggestions and multiple tabs for help in home page
    When User touch on "HelpButton"
    Then User should see Niki "RechargePhoneTab"
    When User swipe from right to left
    Then User should see Niki "LaundryServiceTab"
    #[0,1026][180,1170]
    #[720,1026][900,1170]
