# Selenium Automation Framework – OrangeHRM

![CI](https://github.com/Sathish-SDET/selenium-orangehrm-framework/actions/workflows/maven-tests.yml/badge.svg)

## Overview
This project is a Selenium automation framework built using Java, TestNG, and Maven to automate core functionalities of the OrangeHRM application.  
The framework is integrated with GitHub Actions and Jenkins to enable continuous integration and automated test execution.

---

## Tech Stack
- Java  
- Selenium WebDriver  
- TestNG  
- Maven  
- GitHub Actions (CI)  
- Jenkins (CI)  

---

## Framework Features
- Page Object Model (POM) design pattern  
- Maven-based build and execution  
- Headless browser execution for CI environments  
- Explicit waits to handle dynamic web elements  
- TestNG listeners for reporting  
- CI execution using GitHub Actions and Jenkins  
- TestNG HTML reports published as CI artifacts  

---

## Project Structure 
selenium-orangehrm-framework
├── src
│   ├── main/java
│   │   ├── base
│   │   ├── pages
│   │   └── utils
│   └── test/java
│       ├── tests
│       └── listeners
├── testng.xml
├── pom.xml
├── .github/workflows
│   └── maven-tests.yml
└── README.md


---
## Running Tests Locally
Ensure Java and Maven are installed and configured.

---

## CI Execution – GitHub Actions
- Tests are automatically triggered on every push to the main branch  
- Maven executes the TestNG suite in headless mode  
- TestNG HTML reports are uploaded as GitHub Actions artifacts  

### View Test Reports
1. Go to the Actions tab in GitHub  
2. Open the latest workflow run  
3. Download the testng-report artifact  
4. Open index.html locally  

---

## CI Execution – Jenkins
- Jenkins pulls the project from GitHub  
- Executes tests using Maven (mvn clean test)  
- Publishes TestNG results after execution  

This demonstrates CI execution using both GitHub Actions and Jenkins.

---

## Reporting
- TestNG default HTML reports  
- Emailable summary reports  
- XML reports for CI tools  

---

## Key Learnings
- Difference between local and CI execution environments  
- Handling headless browser execution  
- Stabilizing tests using explicit waits  
- Jenkins environment configuration on Windows  
- Publishing and accessing test reports in CI  

---

## Author
Sathish Shankaran  
SDET | Automation Engineer  

---

## Notes
This project focuses on practical CI/CD integration and real-world automation workflows.
