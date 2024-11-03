Feature: Login in test.ewizard.in site

Scenario Outline: PKI Login in test site

Given User Credentials of test site
When on entering "<Username>" and "<Password>" and click Submit button
Then verify PKI Login Page display
And on selection of certificate
And display Logged in page

 Examples: 
      | Username    | Password | 
      | TESTBUYER02 |Ashraf@123| 
 
