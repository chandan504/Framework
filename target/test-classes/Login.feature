
@test
Feature: Login scenario




  Scenario Outline: Login with invalid user name
    When I enter username as "<username>"
    And I enter password as "<password>"
    And I login
    Then login should fail with an error "<err>"
    Examples:
      | username       | password | err |
      | invalidUsername | secret_sauce | Username and password do not match any user in this service. |
  Scenario Outline: Login With invalid Password
    When I enter username as "<username>"
    And  I enter password as "<password>"
    And  I login
    Then login should fail with an error "<err>"
    Examples:
      | username      |password      |err   |
      | standard_user | InvalidPaassword | Username and password do not match any user in this service.   |

  Scenario Outline: Login With valid username and Password
    When I enter username as "<username>"
    And  I enter password as "<password>"
    And  I login
    Then I should see Products page with title "<title>"
    Examples:
      | username | password | title |
      | standard_user | secret_sauce | PRODUCTS |
