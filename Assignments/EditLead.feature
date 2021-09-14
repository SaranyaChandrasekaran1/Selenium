Feature: Login Functionality of LeafTaps application



Scenario:
#Given Open the chrome browser
#And Load the application url 'http://leaftaps.com/opentaps/control/login'


Given Enter the username as 'Democsr'
And Enter the password as 'crmsfa'
When Click on Login button
Then Homepage should be displayed
When click on 'CRM/SFA' link
Then 'My Home' page should be displayed
When click on 'Leads' link
Then 'My Leads' page should be displayed
When click on 'Find Leads' link
Then 'Find Leads' page should be displayed

			