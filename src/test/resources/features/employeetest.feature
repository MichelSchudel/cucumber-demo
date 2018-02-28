Feature: applicant loans

  Background:
    Given an underaged applicant


  @MP3POC
  Scenario: underaged applicant should not be eligible for loan

    Given an underaged applicant
    When a loan is asked
    Then the applicant should not be eligible

  Scenario: employee with small income should not be eligible for loan

    Given an applicant with an income of 5000 a year
    When a loan is asked
    Then the applicant should not be eligible

  Scenario: employee with temporary contract should not be eligible for loan

    Given an applicant with a temporay contract
    When a loan is asked
    Then the applicant should not be eligible

  Scenario: employee with a medium loan and a permant contract should be eligible for loan

    Given an normal applicant
    When a loan is asked
    Then the applicant should be eligible