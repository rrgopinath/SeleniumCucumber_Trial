Feature: annotation

Background: user navigates to Facebook

Given I am on Facebook login page

Scenario: Login to Facebook
When I enter username as "TOM"
And I enter password as "JERRY"
Then Login Should fail