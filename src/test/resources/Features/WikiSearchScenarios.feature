Feature: Validating all the Search scenarios under this feature

  @SmokeTest
  Scenario: Validate Wiki Search Test by Search key as India
    Given User launches chrome browser with Wiki application url
    When User search for "India" with language as "en" in home page
    And user clicks on Search icon in homepage
    Then Wiki content page has been displayed
    And user validates header text "India707" in Content page
    And user closes the browser

    @SmokeTest7
    Scenario: Validate Wiki Search Test by Search key as USA
      Given User launches chrome browser with Wiki application url
      When User search for "USA" with language as "en" in home page
      And user clicks on Search icon in homepage
      Then Wiki content page has been displayed
      And user validates header text "United States" in Content page
      And user closes the browser

  @RegressionTest
  Scenario Outline: Validate Wiki Search Test by using multiple Search keys
        Given User launches chrome browser with Wiki application url
        When User search for "<SearchKey>" with language as "<language>" in home page
        And user clicks on Search icon in homepage
        Then Wiki content page has been displayed
        And user validates header text "<ExpectedHeaderText>" in Content page
        And user closes the browser


        Examples:
        |SearchKey | language |ExpectedHeaderText |
        | India    | en       | India             |
        | USA      | en       | United States     |
        | Germany  | en       | Germany707        |



    
    
