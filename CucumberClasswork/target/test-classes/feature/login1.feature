Feature: Fcaebook feature login 
Scenario Outline: Facebook feature login with valid credential
Given user verify homepage
|firefox|chrome|
When user clicks on creata an account 
When user provides <"firstname">and <"lastname">
And user puts his mobile numbser 
Then user gives new password
Examples:
|firstname|lastname|
|Ruman     |Ahmed    |
|Miju      |Sayeed   |


