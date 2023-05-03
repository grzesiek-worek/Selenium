Feature: Qwant phrase search
  Scenario Outline: Successful phrase search
    Given Page "https://www.qwant.com" opened in browser
    When Phrase "<searchPhrase>" entered in search input box
    And Search button clicked
    Then First <howManyResultsCheck> results link texts contain phrase "<lookupPhrase>"
    Then Save Screenshot
    Then Close browser

    Examples:
      | searchPhrase      | lookupPhrase    | howManyResultsCheck |
      | Szkice piórkiem   | szkice piórkiem | 3                   |
      | Faraon            | faraon          | 5                   |
      | Pogoda na weekend | pogoda          | 3                   |