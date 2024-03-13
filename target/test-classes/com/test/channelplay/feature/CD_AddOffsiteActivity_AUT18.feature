@AUT18
Feature: Add new offsite activity from Customer dashboard

  Background:
    Given after successfully logged in to crm user will be on the home page
    And user select CRM and Click on Customers menu

  Scenario: perform offsite activity for customer
    When user click on customer edit button
    And user click on plus button
    And user select Opportunity under offsite activity
    And user enter title under offsite activity
    And user enter Update Opportunity Value under offsite activity
    And user select Update Opportunity Status under offsite activity
    And user select Update Exp Closure Date under offsite activity
    And user select Update Win Probability under offsite activity
    And user select Contact under offsite activity
    And user enter testActivity under offsite activity
    And user select  offsite activity country
    And user select offsite activity State
    And user select offsite activity City
    And hit save button under offsite activity
    Then new offsite activity will show in the list
