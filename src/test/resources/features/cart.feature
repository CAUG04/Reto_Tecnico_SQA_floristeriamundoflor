Feature: Cart Operations

  Scenario Outline: Add a product
    Given that "user" has opened the store
    When he select the product from the section
      | category        | product        |
      | <user_category> | <user_product> |
    And he adds the product to the cart with
    Then he should see the added product in the cart

    Examples:
      | user_category | user_product |
      | amor          | MDF 0001     |
      | amor          | MDF 00010    |