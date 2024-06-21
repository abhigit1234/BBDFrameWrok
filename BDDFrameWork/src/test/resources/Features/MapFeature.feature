@all
Feature: register acc
@Tag1 @smoke
Scenario: 1 enter fields using hashmap
		Given launch browser
		When user enters url as "http://localhost/opencart/upload/index.php?route=account/register&language=en-gb"
		Then user enter fields as 
		|firstname|lastname|		email						|password|
		|abhilash |babu1234|abhiayansh@tmail.com|iia888oj|
		Then user clicks on slide bar to agree
		Then user clicks on continue button
		Then verify message as "Your Account Has Been Created!"
		Then User clicks on continue
		Then user clicks on logout button
		
@Tag2		@sanity
Scenario: 2 enter fields using hashmap
		Given launch browser
		When user enters url as "http://localhost/opencart/upload/index.php?route=account/register&language=en-gb"
		Then user enter fields into  
		|firstname|durgumahanthi  |
		|lastname |ayansh babu		|
		|	email 	|londonbabu@gmail.com|
		|password |babu12345678|
		Then user clicks on slide bar to agree
		Then user clicks on continue button
		Then verify message as "Your Account Has Been Created!"
		Then User clicks on continue
		Then user clicks on logout button
		


	
