Feature: n11 Campaign Feature

  Background:

  @main
  Scenario: Write n11 Campaign to Excel
    When I open "Kampanyalar" page
    Then I goes to category
    And I write campaigns data to excel

  @alternative
  Scenario Outline: Write n11 Campaign to Excel
    When I open "Kampanyalar" page
    Then I goes to "<category_name>"
    And I write campaigns data to excel for "<category_name">
    Examples:
    |       category_name        |
    |Moda                        |
    |Elektronik                  |
    |Ev & Yaşam                  |
    |Anne & Bebek                |
    |Kozmetik & Kişisel Bakım    |
    |Mücevher & Saat             |
    |Spor & Outdoor              |
    |Kitap, Müzik, Film, Oyun    |
    |Otomotiv & Motosiklet       |