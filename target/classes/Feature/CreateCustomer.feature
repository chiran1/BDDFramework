Feature: create new Customer 
Scenario Outline: create contact scenario

Given user is available on login Page
When title of login page is Guru99 Bank Manager HomePage
Then user entered "<username>" and "<password>"
Then user click on login button

Then user is on manager home page
Then title of the home page is Guru99 Bank Manager HomePage
Then mouse hover to contact and click New Customer
Then user enter customer "<name>"
Then user enter gender
Then user enter date of birth
Then user enter "<adderss>" and "<city>" and "<state>" and "<PIN>" and "<mobile>" and "<email>" and "<Password>"
Then user enter submit

Then close the browser

Examples:
| username 		| password | name | address    | city | state | PIN    | mobile     | email           | assword |
| mngr251790 	| atUbevy  | Buni | 506 castle | Bal  | MD    | 575584 | 7078895647 | gur@hotmail.com | Nepal@324 |