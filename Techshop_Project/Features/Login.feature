Feature: Testing functionality to the application

Scenario: User can login using correct username and password

Given User open the browser
And user navigates to " https://www.smarttechqa.com"
When User click on the sign In button
And User enters the email
And User enters the password
And User clicks on the login in  button
Then The user is succesfully loged in and user name is displayed 
And User is navigated to home page