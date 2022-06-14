Feature: Login into the WWE Application
@Regression
Scenario: Check the login scenario
	Given Access the application
	When Enter the username as "bssuqawwev3\JEmail" and click next button
	Then Enter the password as "Genesys" and click submit button
	And Click on the submit button
	And Check that home page is landed