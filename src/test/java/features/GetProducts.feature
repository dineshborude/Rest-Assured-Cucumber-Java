
  Feature: Get all the products from the api

    Scenario: Verify the get api for the products
      Given I hit the url of get products api
      When I pass the url of products in the request
      Then I recieve the response code as 200
