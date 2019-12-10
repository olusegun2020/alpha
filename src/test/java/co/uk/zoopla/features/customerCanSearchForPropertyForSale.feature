Feature: Search
  As a customer
  I want the ability to search for any property of my choice in any location
  So that i  can buy it
  Scenario Outline: Customer can search for any property
    Given I navigate to Zoopla homepage
    When i entered a <Location> into the search field
    And i select "<MinPrice>" from minimum price dropdown
    And I select "<MaxPrice>" from maximum price dropdown
    And I Select "<Property>" from Property type Dropdown
    And I Selet "<Bed>" From Bedrooms From Dropdown
    And I click on search Button
    Then  a list of "<PropertyType>" in "<Location>"are displayed
    Examples:
    |Location| MinPrice| MaxPrice| Property|Bed|PropertyType|
    |Manchester|£ 120,000| £230,000|Houses |3+| House|
    |London    |£250,000 |£400,000 |Farm/Land|No min|Property|
    |Coventry  |£120,000 |230,000  |Flats    |3+     |Flats|
    |Birmingham|         |         |         |      |        |

  Scenario Outline: Customer cannot  search for any property
    Given I navigate to Zoopla homepage
    When i entered a <Location> into the search field
    And i select "<MinPrice>" from minimum price dropdown
    And I select "<MaxPrice>" from maximum price dropdown
    And I Select "<Property>" from Property type Dropdown
    And I Selet "<Bed>" From Bedrooms From Dropdown
    And I click on search Button
    Then  an error result page is displayed
    Examples:
      |Location| MinPrice| MaxPrice| Property|Bed|PropertyType|
      |M39 1xc|£ 120,000| £230,000|Houses |3+| House|
      |£££   |£250,000 |£400,000 |Farm/Land|No min|Property|
      |Coventry  |£120,000 |230,000  |Houses |3+      |Flats|
      |123|         |         |         |      |        |

