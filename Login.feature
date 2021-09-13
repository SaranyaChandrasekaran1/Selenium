Feature: Login Functionality of LeafTaps application


Background:

Given Open the chrome browser
And Load the application url 'http://leaftaps.com/opentaps/control/login'

Scenario Outline: TC001_Login test using Positive credential	

And Enter the username as <username>
And Enter the password as <password>
When Click on Login button
Then Homepage should be displayed

Examples:

|username|password|
|"Demosalesmanager"|"crmsfa"|
|"Democsr"|"crmsfa"|

Scenario: TC002_Login test using Negative credential	


And Enter the username as 'Demo123'
And Enter the password as 'crmsfa'
When Click on Login button
But Error message should be displayed