Feature: test

  Scenario: login to application

    Given I register with below info in the application
      | FirstName | Email              | Website           | Experience | Expertise                             | Education | Comments       |
      | Abhi      | abigmail@gmail.com | www.globalsqa.com | 5-7        | Automation Testing;Functional Testing | Graduate  | HI How Are you |

    And I Select "ARG" value from the drop down



