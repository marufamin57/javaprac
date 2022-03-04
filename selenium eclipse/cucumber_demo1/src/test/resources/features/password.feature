Feature: user enter username and password

  Scenario: login
    Given user on login
    When user enters following
    | asd | 123 |
    | asdjjj | 1fghjk23 |
    | asdtyujbg | 123ertyhbvcftyu |
    Then user should login

    Scenario Outline: asdfghjk
      Given user on login
      When user enters following <id> and <pass>
      Then user should login
      Examples:
        | id | pass |
        | "asd" | "123" |
        | "asdjjj" | "1fghjk23" |
        | "asdtyujbg" | "123ertyhbvcftyu" |
