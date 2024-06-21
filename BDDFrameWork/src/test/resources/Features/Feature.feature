Feature: Register New Account

@Tag1	
	Scenario: 1 Enter all mandatory fields
		Given launch browser
		When user enters url as "http://localhost/opencart/upload/index.php?route=account/register&language=en-gb"
		Then user enter firstname as "abhilash"
		Then user enter lastname as "babu"				
		Then user enter email 
		Then user enter password as "abhilash9920202"
		Then user clicks on slide bar to agree
		Then user clicks on continue button
		Then verify message as "Your Account Has Been Created"
		Then User clicks on continue
		Then user clicks on logout button

@Tag2
	Scenario: 2 Enter all mandatory fields
		Given launch browser
		When user enters url as "http://localhost/opencart/upload/index.php?route=account/register&language=en-gb"
		Then user enter firstname as "ayaansh"
		Then user enter lastname as "naidu"				
		Then user enter email 
		Then user enter password as "ayanshnaidu123"
		Then user clicks on slide bar to agree
		Then user clicks on continue button
		Then verify message as "Your Account Has Been Created!"
		Then User clicks on continue
		Then user clicks on logout button
		
@Tag3
Scenario Outline: Data Providing

		Given launch browser
		When user enters url as "http://localhost/opencart/upload/index.php?route=account/register&language=en-gb"
		Then user enters firstname as "<firstname>" "<lastname>" "<email>" "<password>"		
		Then user clicks on slide bar to agree
		Then user clicks on continue button
		Then verify message as "Your Account Has Been Created!"
		Then User clicks on continue
		Then user clicks on logout button
												
		Examples:
		|firstname|lastname |     email					 |password|
		|abhilash |naidubabu|abhi@ayanshgmial.com|12415|
													