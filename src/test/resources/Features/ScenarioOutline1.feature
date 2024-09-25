Feature: Login check on Livedemo

#without examples keyword
  #Scenario: Successful Login scenario test
   # Given given both valid credentials
    #When enters username "DEPTUSER002" and password "Ashraf@12" and click Submit button
    #Then Open PKI login page
    
 #with examples keyword
  Scenario Outline: Successful Login scenario test
    Given given both valid credentials
    When enters "<username>" and "<password>" and click Submit button
    Then Open PKI login page
    
    Examples: 
    |username   |	password |
    |DEPTUSER002|Ashraf@12 |
    |DEPTUSER002|Ashraf@123|