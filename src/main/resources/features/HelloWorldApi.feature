@helloworld
Feature: The HelloWorld API

Scenario: Querying the HelloWorld API returns a Hello object
    Given the "HelloWorld" endpoint at "/hello-world"
    When a request is made to the endpoint
    Then a "Hello" object is returned

