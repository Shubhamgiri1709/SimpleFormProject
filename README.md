Simple Form BDD TestNG Cucumber Project:

🧪 Simple Form Automation using BDD, Cucumber, Selenium & TestNG
This project automates the form submission on the below webpage using the BDD approach with Cucumber, Selenium WebDriver, and TestNG:

🔗 Test Site: https://v1.training-support.net/selenium/simple-form

📂 Project Structure
bash
Copy
Edit
~~~
SimpleFormProject/
├── src/
│   ├── main/java/
│   └── test/java/
│       ├── stepDefinitions/
│       │   └── SimpleFormSteps.java
│       └── testRunner/
│           └── TestRunner.java
│   └── test/resources/
│       └── features/
│           └── simpleForm.feature
├── pom.xml
└── README.md
~~~
🔧 Tools & Technologies Used
Language: Java

Build Tool: Maven

BDD Framework: Cucumber

Automation Tool: Selenium WebDriver

Test Framework: TestNG

Browser: Chrome (via ChromeDriver)

✅ Features Covered
Opens the simple form web page

Enters data in:

First Name

Last Name

Email

Contact Number

Submits the form

Handles the confirmation alert

🚀 How to Run the Project
Clone the Repository

bash
Copy
Edit
git clone https://github.com/your-username/SimpleFormProject.git
cd SimpleFormProject
Run Tests via TestNG

bash
Copy
Edit
mvn clean test
View the Report

Open target/cucumber-report.html in your browser for test results.

📝 Sample Gherkin Scenario
gherkin
Copy
Edit
Scenario: Fill out and submit the simple form
  Given I open the simple form page
  When I enter "John" in the first name field
  And I enter "Doe" in the last name field
  And I enter "john.doe@example.com" in the email field
  And I enter "1234567890" in the contact number field
  And I click the submit button
  Then I should see the form submitted successfully
