Feature: Qwant phrase search
  Scenario: Successful phrase search
    Given Page "https://www.qwant.com" opened in browser
    When Phrase "Mały książę" entered in search input box
    And Search button clicked
    Then First 3 results link texts contain phrase "mały książę"