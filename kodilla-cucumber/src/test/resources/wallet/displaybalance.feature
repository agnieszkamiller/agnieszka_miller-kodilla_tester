Feature: Display balance

  Scenario Outline: User checks the balance of their wallet
    Given there is $ <amount> in my wallet
    When I check the balance of my wallet
    Then I should see that the balance is $ <balance>
    Examples:
      | amount | balance |
      | 100    | 100     |
      | 10     | 10      |
      | 0      | 0       |
      | -50    | -50     |
