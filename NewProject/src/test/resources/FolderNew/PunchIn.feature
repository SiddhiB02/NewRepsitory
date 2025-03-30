Feature: Punch In Functionality

  Scenario Outline: Verify PunchIn Toast Message
    Given I am logged into the system
    When I Click on punch button
    Then I should see toast button
