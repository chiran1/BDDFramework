Feature: create new Customer 

Scenario: create contact scenario

Given user is available on login Page
When title of login page is Guru99 Bank Manager HomePage
Then user entered username and password
| username 		| password 	|
| mngr251790 	| atUbevy 	|
#| askfdjksdj	| ksjdfjsdk	|
 
 
Then user click on login button

Then user is on manager home page
Then title of the home page is Guru99 Bank Manager HomePage
Then mouse hover to contact and click New Customer
Then user enter customer name 
| name |
|binu  |

Then user enter gender
Then user enter date of birth
Then user enter adderss and city and state and PIN and mobile and email and Password
| address | city 	| state | PIN 		| mobile 		| email 				| Password 		|
| Indiana | carmel  | IN 	| 454545 	| 7074454463 	| gorkha@hotmail.com 	| skaljfdk45 	|
| IIndiana | cCarmel  | IIN 	| 354545 	| 8074454463 	| Gorkha@hotmail.com 	| Skaljfdk45 	| 
| IIndiana | cCarmel  | IIN 	| 354545 	| 8074454463 	| Gorkha@hotmail.com 	| Skaljfdk45 	| 

Then user enter submit

Then close the browser
