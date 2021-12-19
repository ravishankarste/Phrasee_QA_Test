Feature: Create a New campaign on Phrasee
  In order to create a new campaign
  As a valid user
  I should be able to login to app

  Scenario Outline: I login with valid credentials
    Given user navigates to url
    When title of login page is Login | Phrasee
    Then user enters username "<username>"
    And  user enters password "<password>"
    And  user clicks on login button
    Then user clicks create a new campaign link
    Then user selects email tab
    Then user selects external automation project from dropdown
    Then user enters campaign name
    Then user enters subject line
    Then user enters audience size
    Then user enters avg open rate
    Then user clicks next button

    Examples:
      | username                 | password        |
      | ravishankarste@gmail.com | Ravishankar123# |

Scenario: Language Generation
    When user navigates to Language Generation tab
    Then user selects date to send email
    Then user selects campaign type
    And user clicks on Magic button