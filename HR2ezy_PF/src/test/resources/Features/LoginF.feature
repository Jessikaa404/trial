Feature: To test login feature

Scenario: Test valid login credentials

Given Browser open
When user enters "<username>" in username and "<password>" in password
And user hits login
Then user navigated to home page

Examples:
|username|password|
|AISHU|qaz4321|
|JIN|qaz4321|

