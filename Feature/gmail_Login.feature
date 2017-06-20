#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Checking the GMAIL Login
  I want to check if the gmail page can be logged in or not

  @tag1
  Scenario: Title of your scenario
    Given Browser is launched
    When gmail url is entered
    Then check if the gmail page is launched and check if username is visible
    When Enter username and click on yes
    Then check if the password field is displayed
    When enter password and click on yes
    Then check if the login is done
