Feature:

  Scenario Outline: open website in browser
    Given open Browser
    Then Click on contact button on the top menu
      Then switch to frame
      Then Filling details with "<username>" and "<email>" and  "<Message>"
       Then verify text
    Examples:
      | username | email | Message |
      |Archer |acher@gmail.com  |Testing the Application |

