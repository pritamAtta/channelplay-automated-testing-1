@currentFile
Feature: Add all type fields under settings

  Background:
    Given after login to crm user will be on the Customer page under Settings
    And user select Add Field button

    Scenario: Add field type Numeric
      When user select numeric from the field type dropdown
      And enter Field Name for Numeric type
      And select Save button
      Then new field will be shown in the list

#    Scenario: Add field type - Multi Select Dropdown
#      When user select Multi Select Dropdown from the field type dropdown
#      And enter Field Name for Multi Select Dropdown type
#      And enter Options
#      And select Save button
#
#    Scenario: Add field type - Date
#      When user select Date from the field type dropdown
#      And enter Field Name for Date type
#      And select Value Type as Custom
#      And select Save button
#
#    Scenario: Add field type - Email
#      When user select Email from the field type dropdown
#      And enter Field Name for Email type
#      And select Save button
#
#    Scenario: Add field type - Document Upload
#      When user select Document Upload from the field type dropdown
#      And enter Field Name for Document Upload type
#      And select Save button
#
#    Scenario: Add field type - Video
#      When user select Video from the field type dropdown
#      And enter Field Name for Video type
#      And select Save button
#
#    Scenario: Add field type - Reference Documents
#      When user select Reference Documents from the field type dropdown
#      And enter Field Name for Reference Documents type
#      And upload a file under Upload File
#      And select Save button
#
#    Scenario: Add field type - Header Text
#      When user select Header Text from the field type dropdown
#      And enter Field Name for Header Text type
#      And select Save button
#
#    Scenario: Add field type - Normal Text
#      When user select Normal Text from the field type dropdown
#      And enter Field Name for Normal Text type
#      And select Save button
#
#    Scenario: Add field type - Page Separator
#      When user select Page Separator from the field type dropdown
#      And enter Field Name for Page Separator type
#      And select Save button

#    Scenario: Add field type - Data List
#      When user select Data List from the field type dropdown
#      And enter Field Name for Data List type
#      And select List Name
#      And select Save button

#    Scenario: Add field type - OTP Validation
#      When user select OTP Validation from the field type dropdown
#      And enter Field Name OTP Validation type
#      And enter Entity
#      And select Entity Field
#      And select Save button

