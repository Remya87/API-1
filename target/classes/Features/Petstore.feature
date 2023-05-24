Feature: Get available pets


  Scenario: Get available pets
    When I send a "GET" request to "https://petstore.swagger.io/v2/pet/findByStatus?status=available"
    Then the response status code should be 200
    And the response body should not be null
    And the response time should be less than or equal to 5000 milliseconds
    And the response body should contain "id"
    #And the response body should contain "category"