Feature: login Operations

  Scenario Outline: Login gmail correct
    Given that "user" has opened the page the email
    When  he enter the login data correct
      | user        | password        |
      | <user_mail> | <password_mail> |
    Then you should see my gmail account
    Examples:
      | user_mail              | password_mail    |
      | josgavirco@gmail.com   | Josegaco.1       |

  Scenario Outline: Login gmail password Incorrect
    Given that "user" has opened the page the email
    When  he enter the login data with password incorrect
      | user        | password        |
      | <user_mail> | <password_mail> |
    Then you should see a message of warning
    Examples:
      | user_mail              | password_mail    |
      | josgavirco@gmail.com   |     -            |
      | josgavirco@gmail.com   |josgavirco@gmail.com|


