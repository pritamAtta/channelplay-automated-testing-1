@signUp
Feature: Assistive Sign Up

  Background:
    Given user landed on assistive login page

  Scenario: user Sign Up
    When click on Sign Up at login page
    And user enters firstname
    And user enters lastname
    And user enters email address
    And click on terms & conditions checkbox
    Then click on sign Up button

