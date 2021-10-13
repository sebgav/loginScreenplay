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
    | user_category | user_subcategory | user_product             | sizeType    | size  | quantity | discount |
    | accesories    | paints           | light speed yellow paint | buket size  | 2.5 L | 4        | yes      |
    | groceries     | juices           | apples juice             | bottle size | 2 L   | 1        | no       |
    | groceries     | alcohol          | red wine                 |             |       | 8        | yes      |


