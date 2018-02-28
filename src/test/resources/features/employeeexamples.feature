Feature: applicant loans


  Scenario Outline: passing
    Given an applicant with income "<income>" and age "<age>" and "<years>" of working
    When a loan is asked
    Then the request should be "<result>"

    Examples:
      | income | age | years | result |
      | 41000  | 18  | 3     | true   |
      | 41000  | 17  | 3     | false  |
      | 41000  | 18  | 2     | false  |
      | 5000   | 18  | 3     | false  |