# SoftDraft_GoodReads
This project is focused on automated testing for the Goodreads website. It includes a test case that verifies the signin process and book search functionality. The project is implemented in Java using the TestNG framework and Selenium WebDriver for browser automation.

## Test Case: Goodreads Signin and Book Search**
This project contains automated test cases for the Goodreads website. The test case focuses on the signin process and book search functionality.

## Specifications
The test case is implemented using the following technologies and frameworks:

Java
TestNG
Selenium WebDriver
ChromeDriver
Bonigarcia WebDriverManager
Log4j2 for logging
Extent Reports for test report generation

## Prerequisites
To run this test case, you need to have the following software installed on your system:

Java Development Kit (JDK)
Maven
Chrome browser

## Installation
Follow the steps below to set up and run the test case:

Clone the repository: 

> git clone https://github.com/nranjani/SoftDraft_GoodReads.git

Open the project in your preferred Java IDE.

 Update the test data in the test case file (TC_Signin_Test.java):

1. Update baseURL with the Goodreads website URL.
2. Update username and password with valid credentials for signing in.
3. Update searchContent with the desired book search content.
4. Run the test case using your IDE's test runner or via the command line:

> mvn clean test

After the test execution is completed, the test results, including logs and screenshots, will be available in the Extent Reports HTML report located in the test-output directory.

Additionally, log files capturing detailed logging information will be generated in the logs directory.

Screenshots taken during the test execution will be saved in the screenshots directory.

## Screenshots
Screenshots are automatically captured during the test execution and saved in the screenshots directory. These screenshots provide visual evidence of the test steps and can be used for further analysis or debugging purposes.

## Conclusion
This test case verifies the signin process and book search functionality on the Goodreads website. It demonstrates how to use Selenium WebDriver with TestNG, log test execution details using Log4j2, capture screenshots, and generate a comprehensive test report using Extent Reports.
