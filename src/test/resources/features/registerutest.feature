Feature: Fill out the registration form Utest

  Scenario: Register in Utest
    Given Go to Utest page
    When Fill in the form with the data
    |firstname|lastname|email|city|zip|password|
    |Andres   |Vasquez |andres3@yopmail.com |Medellin|050011|123456Andres+|
    Then Verify user registration

