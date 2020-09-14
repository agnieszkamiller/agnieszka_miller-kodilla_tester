Feature: Cash Withdrawal

  Scenario Outline: Successful withdrawal from a wallet in credit
    Given I have deposited $200 in my wallet
    When I request $<requestedamount>
    Then $<dispensedamount> should be dispensed
    Examples:
      | requestedamount | dispensedamount |
      | 30              | 30              |
      | 200             | 200             |
      | 300             | 0            |
      | 0               | 0               |
      | -20             | 0               |
      | -1             | 0               |

