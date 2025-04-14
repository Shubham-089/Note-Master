# 📝 Notes Maker - QA Automation & Manual Testing Project

A complete QA Testing repository for the **Notes Maker & To-Do Web Application**  
🔗 **Live Project**: [https://notes-makers.vercel.app](https://notes-makers.vercel.app)

---

## 📌 Project Overview

The **Notes Maker** app allows users to create, manage, and organize their notes and to-dos efficiently & focuses on delivering high-quality assurance through **manual testing**, **automated testing**, and proper **test documentation**.
This project focuses on *manual testing* of key modules within the Note Master Website. The testing process involves verifying core functionalities, UI/UX aspects and system responses.

---

##  * 🔍 Scope of Testing*
The *manual testing* process covers the following key modules:

###  *1. Dashboard Homepage*
 Verifying navigation, UI elements, and data consistency.  
 Ensuring that dashboard statistics update correctly.  

###  *2. Plans*
 Checking if different plans are displayed with accurate details.  
 Validating selection and redirection functionalities.  

###  *3. Create Story*
 Creating a story With adding the summary and details, uploading files, and create the story.  

---

##  * 🧪 Testing Approach*
This project follows a *structured manual testing* approach, including:

###  *1. Functional Testing*
- Ensuring each feature works as expected.
- Validating system behaviors under different conditions.

###  *2. UI/UX Testing*
- Checking design consistency and responsiveness.
- Ensuring proper alignment and usability.

###  *3. Boundary Value Analysis*
- Testing input fields with minimum and maximum values.
- Ensuring correct error messages are displayed.

###  *4. Error Handling Testing*
- Checking how the system responds to invalid inputs.
- Verifying failure scenarios like incorrect login credentials Create story.

---

##  * 📄 Test Documents*
The following *test Documents* document the manual testing process:

###  *1.📝 Test Plan*
- *Objectives:* 
- *Scope:* 
- *Testing Approach:* 
- *Test Environment:* 
- *Test Deliverables:* 
- *Risks & Mitigation:* 

###  *2. 📋 Test Scenario*
- *Test Scenario ID*
- *Test Scenario Description*
  
###  *2. 🧪 Test Cases*
Each module has structured test cases, including:
- *Test Case ID*
- *Test Case Description*
- *Pre-Conditions* 
- *Test Steps*
- *Test Data*
- *Expected & Actual Results*
- *Status (Pass/Fail)*

###  *3. 🪲 Bug Report*
- *Bug ID*
- *Description*
- *Steps to Reproduce*
- *Expected & Actual Results*
- *Severity & Priority*
- *Screenshots*


###  *5.📊 Test Summary Report*
- *Summary of Test Execution*
- *Pass/Fail*


##   * ⚙ Agile Methodology in Testing*
This testing process follows an *Agile Methodology* to ensure continuous and iterative testing:

 *Sprint-based Testing* – Dividing testing activities into multiple sprints.  
 *Daily Stand-up Meetings* – Discussing test progress, blockers, and solutions.  
 *Collaboration with Developers* – Continuous integration with the development team.  
 *Frequent Builds & Releases* – Ensuring testing is performed on updated builds.  
 *Exploratory Testing* – Conducting ad-hoc testing to uncover hidden defects.
 
Technologies used for automation:
- 🧪 Selenium WebDriver
- ⚙️ TestNG Framework
- 💻 Java (Maven project)


 ## 📁 Folder Structure

```plaintext
NoteMaster/
├── src/
│   ├── main/
│   │   ├── java/
│   │   └── resources/
│
│   └── test/
│       ├── java/
│       │   │ 
│       │   │
│       │   └── TestNG_FrameWork_UI/
│       │       ├── HomePage.java
│       │       ├── LoginPage.java
│       │       └── SignUp.java
│       │       ├── To_do_List.java
│       │
│       └── resources/
│
├── pom.xml
├── testng.xml
├── target/
├── test-output/
