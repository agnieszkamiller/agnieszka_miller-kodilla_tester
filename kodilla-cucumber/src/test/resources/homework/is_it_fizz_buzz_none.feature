Feature: Is it Fizz, Buzz, None?
  3 is "Fizz", 5 is "Buzz", 3 and 5 is "FizzBuzz"

  Scenario Outline : Return Fizz, Buzz, FizzBuzz or None
    Given given <number>
    When I ask about number
    Then I should answer <answer>
    Examples:
      | number | answer     |
      | is 3   | "Fizz"     |
      | is 6   | "Fizz"     |
      | is 5   | "Buzz"     |
      | is 10  | "Buzz"     |
      | is 15  | "FizzBuzz" |
      | is 30  | "FizzBuzz" |
      | is 4   | "None"     |
      | is 7   | "None"     |


