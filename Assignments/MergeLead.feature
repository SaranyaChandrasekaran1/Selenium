Feature: MergeLead for LeafTaps application
Scenario Outline: TC001_MergeLead
Given Enter the username as <username>
And Enter the password as <password>
When Click on Login button
Then Homepage should be displayed
When Click crmsfa link
Given Click on Lead
Given Click on Merge Lead 
When Click on Image1
Given Move to Find Lead Window for From Lead
Given Enter the First Name in Find Lead as 'Saravanan'
Given Click on FindLead Button in Find Lead Window
Given Get the Lead ID from Lead list
And Click on the LeadID for From Lead
When Click on Image2
Then Move to Find Lead Window for To Lead
Given Enter the First Name in Find Lead as 'gopi'
Given Click on FindLead Button in Find Lead Window
And Click on the LeadID for To Lead
Given Click on Merge
Given Handle the Alert
Given Click on Find Lead
Given Enter the leadID
Given Click on Find Lead button
Given Verify Lead ID

Examples:
|username|password|
|'Demosalesmanager'|'crmsfa'|
