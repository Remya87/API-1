Feature: Facebook feature validation

 
   Scenario: Login sucessful
    Given In Facebook login page
    When enter valid username "username" and password "password"
    And click on the "Log In" button
    Then sucessufully logged in to account 


    Scenario: Login unsucessful
    Given In Facebook login page
    When enter invalid username "username1" and password "password2"
    And click on the "Log In" button
    Then sucessfully logged in to account 
    
   
    Scenario: Forgot password
    Given In Facebook login page
    When click on "forget password"
    And  enter the recovery "email id"
    And  click on the "Search" button
    Then  password recovery link sent to given email
    
    Scenario: Create account
    Given In Facebook login message
    When click on "create account"
    And give the asked details
    And click on "signup"
    
    