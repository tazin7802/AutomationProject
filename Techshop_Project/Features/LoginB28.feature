Feature: Testing functionality to the application

Scenario: User can login using correct username and password

Given User opens the browser
And User navigates to "https://www.smarttechqa.com"  
When User clicks on the Sign In button
And User Enters the email
And User Enters the password
And User clicks on the login in button
Then The user is successfully logged in and username is displayed
And User is navigated to home page
