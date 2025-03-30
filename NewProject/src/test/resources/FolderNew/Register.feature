Feature: Validate SignUP page

  Scenario Outline: SignUp functionality
    Given Go to SignUp page
    When Click on name field then enter <Name>
    And Select country
    And enter mob no <MobileNumber>
    And enter email Id <emailId>
    Then SignUp <status>

    Examples: 
      | Name   | MobileNumber | emailId                      | status  |
      | 222ss  |       982333 | siddhibhingarde123@gmail.com | Fail    |
      
