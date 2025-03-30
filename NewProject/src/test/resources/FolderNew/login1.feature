Feature: Validate SignIn page

  Scenario Outline: To check SignIn page with valid and invalid credentials
    Given Display SignIn page
    When click on EmailIdMobNo field then enter <emailIdMobNo>
    And Click on password and enter <password>
    Then SignIn <status>

    Examples: 
      | emailIdMobNo                 | password  | status  |
      | uytfg                        | siddhi@12 | Fail    |
      | siddhibhingarde123@gmail.com | sid12     | Fail    |
      |                              | siddhi@12 | Fail    |
      |                   8669450158 |           | Fail    |
      |                      8669450 | kiu       | Fail    |
      |                   8669450158 | siddhi@12 | success |
      | siddhibhingarde123@gmail.com | siddhi@12 | success |
