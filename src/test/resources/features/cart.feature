#language:en
Feature: Cart Operations

  Scenario Outline: Add a product
    Given that "user" has opened the ecommerce
    When he selects the product from the sections
      | category        | subcategory        | product        |
      | <user_category> | <user_subcategory> | <user_product> |
    And he adds the products to the cart whith
      | sizeType   | size   | quantity   | discount   |
      | <sizeType> | <size> | <quantity> | <discount> |
    Then he should see the added product in the cart

  Examples:
    | user_category | user_subcategory | user_product               | sizeType    | size  | quantity | discount |
    | Accessories   | Paints           | Light Speed Yellow Paint   | buket size  | 2.5 L | 4        | yes      |
    | Groceries     | Juices           | Apple Juice                | bottle size | 2 L   | 1        | no       |
    | Groceries     | Alcohol          | Red Wine                   |             |       | 8        | yes      |


