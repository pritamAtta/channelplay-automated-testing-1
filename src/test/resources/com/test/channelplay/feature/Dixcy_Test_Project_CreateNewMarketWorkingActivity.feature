
Feature: Create new market working activity

  Background: 
    Given user is on Manage Activities screen under Market Working Activity menu under Market Working menu

  Scenario: Create new questionnaire
    When user select Questionnaire under Questionnaire Management
    And select add button
    
    And select Question from add dropdown
    And fill the fields
    And fill Question Type Field as Open Ended Question and Validation as Simple Text
    
    And select Question from add dropdown
    And fill the fields
    And fill Question Type Field as Open Ended Question and Validation as Nemuric
    
    And select Question from add dropdown
    And fill the fields
    And fill Question Type Field as Open Ended Question and Validation as Email
    
    And select Question from add dropdown
    And fill the fields
    And fill Question Type Field as Open Ended Question and Validation as Date
    
    And select Question from add dropdown
    And fill the fields
    And fill Question Type Field as Open Ended Question and Validation as Time
    
    And select Question from add dropdown
    And fill the fields
    And fill Question Type Field as Open Ended Question and Validation as OTP
