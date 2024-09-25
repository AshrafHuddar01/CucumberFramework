Feature: Home Page test in livedemo using tags


@TendersDueForOpen @Smoke
  Scenario: Search Tenders in Tenders Due for Open
    Given I navigate to the "Tenders Due for Open" page
    When Search tender as "Test-Tender-01", enter the captcha and click the search button
    Then I click "View Documents/Details" and "View Tender Item"
    And the Tender Cum Auction should be "Yes"
    And I close the browser
    
  @Smoke
  @OpenedAwardedTenders
  Scenario: Search Tenders in Opened and Awarded Tenders
    Given I navigate to the "Opened and Awarded Tenders" page
    When Search tender as "Test_01", enter the captcha and click the search button
    Then I click "View Documents/Details" and "View Tender Item"
    And the Tender Cum Auction should be "Yes"
    And I close the browser


  @CancelledTenders
  Scenario: Search Tenders in Cancelled Tenders
    Given I navigate to the "Cancelled Tenders" page
    When Search tender as "LiveDemo/01/A", enter the captcha and click the search button
    Then I click "View Documents/Details" and "View Tender Item"
    And the Tender Cum Auction should be "Yes"
    And I close the browser

