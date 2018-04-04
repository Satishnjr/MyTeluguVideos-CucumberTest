Feature: Google Analytics code check

  Scenario: Check for Google Analytics code in Page Source
    Given user open Telugu Videos website
    Then user validate page source,Google Analytics code should be present

  Scenario: Select Movies Navigation and Check for Google Analytics
    Given user open Telugu Videos website
    And user click on Movies Nav Link
    Then user validate page source,Google Analytics code should be present

  Scenario: Select Music Navigation and Check for Google Analytics
    Given user open Telugu Videos website
    And user click on Music Nav Link
    Then user validate page source,Google Analytics code should be present

  Scenario: Select Video in Trailers Navigation and Check for Google Analytics code
    Given user open Telugu Videos website
    When user click on Trailers Nav Link
    And user click on Video
    Then user validate page source,Google Analytics code should be present

 