Feature: Login Feature

Scenario Outline: login Test Scenario

Given user is available on login Page
When title of login page is Guru99 Bank Manager HomePage
Then user enter "<username>" and "<password>"
Then user click on login button
Then user is on home page
Then close the browser

Examples:
	| username 		| password |
	| mngr251790  	| atUbevy  |
#	|  tpom    		| tezzzzz  | 	
		






