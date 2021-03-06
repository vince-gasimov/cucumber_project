@customer_registration
Feature: register_customer

 Background: user is on home page
  Given user opens the browser
  When user navigates to home page

  Scenario: user_register_the_website
   Then user verifies that home page is visible successfully
   And user navigates to signup page
   And user verifies New User Signup! is visible
   And user enters full name
   And user enters email
   Then user clicks Signup button
   And user verifies that ENTER ACCOUNT INFORMATION is visible
   And user clicks on title
   And user enters password
   And user enter Date of birth
   And user selects checkbox Sign up for our newsletter!
   And user selects checkbox Receive special offers from our partners!
   And user fills details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
   Then user clicks Create Account button
   And user verifies that ACCOUNT CREATED! is visible
   And user clicks Continue button
   And user verifies that Logged in as username is visible
   And user clicks Delete Account button
   And user verifies that ACCOUNT DELETED! is visible  and click Continue button
   Then user close the browser



