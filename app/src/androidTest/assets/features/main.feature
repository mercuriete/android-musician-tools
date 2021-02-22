Feature: Open application

    Scenario: Successful open application
        Given I start the application
        Then I expect to see "Hello World!" text on "bpmText" TextView
