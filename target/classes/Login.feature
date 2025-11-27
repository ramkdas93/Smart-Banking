@Smoke @Functional @Regression
Feature: Login function test

Description: Login should pass with valid user and password

@Positive @SB-9
Scenario: As a SmartBanking application user,login should pass with valid credentials.

Given: Open Browser
And go to application 
When put valid user
And put valid pass
And click login
Then login should pass and logout button should be there.

@Negative @SB-13
Scenario: As a SmartBanking application user,login should fail with invalid credentials.

Given: Open Browser
And go to application 
When put wrong user
And put valid pass
And click login
Then login should fail and logout button should not be there.

@Negative @SB-14
Scenario: As a SmartBanking application user,login should fail with invalid credentials.

Given: Open Browser
And go to application 
When put valid user
And put wrong pass
And click login
Then login should fail and logout button should not be there.

@Negative @SB-11
Scenario: As a SmartBanking application user,login should fail with invalid credentials.

Given: Open Browser
And go to application 
When put wrong user
And put wrong pass
And click login
Then login should fail and logout button should not be there.

@Negative @SB-20
Scenario: As a SmartBanking application user,login should fail with empty user and valid password.

Given: Open Browser
And go to application 
When put empty username
And put valid password
And click login
Then login should fail and logout button should not be there.

@Negative @SB-21
Scenario: As a SmartBanking application user,login should fail with valid user and valid password.

Given: Open Browser
And go to application 
When put valid username
And put empty password
And click login
Then login should fail and logout button should not be there.

@Negative @SB-12
Scenario: As a SmartBanking application user,login should fail with empty credential

Given: Open Browser
And go to application 
When leave username empty
And leave password empty
And click login
Then login should fail and logout button should not be there.
