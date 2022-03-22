Feature: Facebook create account Test
Scenario Outline: Facebook crate account Scenario.

Given open browser
Then navigate to facebok url 
When click on create an account
When user enters "<firstname>"and "<lastname>"and"<email>"and"<newpassword>"
And user provides birthdate month
And birthdate date 
And provides birthdate for year
And close the browser
Examples:
|firstname | lastname  |  email            |  newpassword  |
|yahia     |sayeed     |sayeed123@gmail    |        miju123|
|ruman     |ahmed      |ruman@gmail.com    |     dfsdf |