Feature: Add customer

  Scenario Outline: Add new customer
    Given first login to system and go to MyCustomer page
    When Click on new customer button and Fill up all feilds and save
    Then customer added successfully
