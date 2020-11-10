Feature: Bing Search

Scenario: Search validation
Given user will be in bing search home page
When the user types the search key word <stxt> in search text box
And clicks on search button
Then result page will be displayed

Examples:
|stxt|
|junit|
|Testing|
|gold|
|cricket|