Feature: Simple Form Submission

  Scenario: Fill out and submit the simple form
    Given I open the simple form page
    When I enter "Shubham" in the first name field
    And I enter "Giri" in the last name field
    And I enter "shubhamgiri2040@gmail.com" in the email field
    And I enter "7083578965" in the contact number field
     And I enter "hello" in the meassage field
    And I click the submit button
    Then I should see the form submitted successfully