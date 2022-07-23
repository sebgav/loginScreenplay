Feature: login Operations

  Scenario Outline: Add a product
    Given that "user" has opened the page the email
    When  he enter the login data correct
      | user        | password        |
      | <user_mail> | <password_mail> |
    Then you should see my gmail account
    Examples:
      | user_mail              | password_mail    |
      | josgavirco@gmail.com   | Josegaco.1       |


