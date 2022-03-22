Feature: Facebook login feature


Scenario Outline: Log into facebook with correct credintial
	Given user opens browser
		|chrome|firefox|
	Given when user already in facebook page
	Then user provides his "<email>" id
	Then user gives his "<password>"
	Then user clicks on log in button
	Then user already in facebook userpage
	
	Examples:
		|email                 |password|
		|something@gmail.com   |miju124|
		
