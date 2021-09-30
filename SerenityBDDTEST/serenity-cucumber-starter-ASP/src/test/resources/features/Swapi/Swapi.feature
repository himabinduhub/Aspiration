Feature: Swapi

  Scenario Outline: Validate Star Wars API Response
    Given swapi home page is launched
    When Enter "people" endpoint and request response
    And Response received
    And Total number of people are 10 where height is greater than 200
    And Total 10 individuals are returned
    Then Total number of people checked are 82

    Examples: 
      | url    | Totals_A | Totals_B | height | checked |
      | people |       10 |       10 |    200 |      82 |
