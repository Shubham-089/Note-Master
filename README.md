# 📝 Notes Maker - QA Automation & Manual Testing Project

A complete QA Testing repository for the **Notes Maker & To-Do Web Application**  
🔗 **Live Project**: [https://notes-makers.vercel.app](https://notes-makers.vercel.app)

---

## 📌 Project Overview

The **Notes Maker** app allows users to create, manage, and organize their notes and to-dos efficiently.  
This QA project focuses on delivering high-quality assurance through **manual testing**, **automated testing**, and proper **test documentation**.

Technologies used for automation:
- 🧪 Selenium WebDriver
- ⚙️ TestNG Framework
- 📦 Page Object Model (POM)
- 💻 Java (Maven project)

---

## 🧪 Testing Approach

### ✅ Functional Modules Tested
- Sign Up
- Login
- Forgot Password
- Home Page UI
- Notes & To-Do Features
- User Profile

### 🧾 Manual Testing Includes
- 📋 Test Plan: Test objective, scope, approach, and deliverables
- 🧠 Test Scenarios & ✔️ Test Cases
- 🐛 Bug Reports (with severity and reproducibility)
- 📊 Summary Report of manual test cycles

### 🤖 Automation Testing Includes
- **Selenium WebDriver + TestNG**
- **POM (Page Object Model)** structure
-  **TestNG usin Create files & POM Files**
- Scalable scripts for login, signup, and home features

---

## 🪲 Bug Reporting Approach

- Bugs are categorized as: `Critical`, `Major`, `Minor`, or `UI`
- Tracked using structured Excel sheets with:
  - Steps to Reproduce
  - Expected vs Actual Result
  - Severity/Priority
  - Status and Comments

---

## 🧾 Test Plan Overview

- **Project Name**: Notes Maker
- **Tested By**: Shubham Yetonde
- **Testing Types**: Functional, UI, Regression
- **Tools Used**: Selenium, TestNG, Excel, Word
- **Browsers Tested**: Chrome
- **Test Deliverables**:
  - Test Plan, Test Cases, Test Scenarios
  - Bug Report
  - Automation Scripts
  - Summary Report
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
│       │   ├── BaseClass/
│       │   │   └── BaseClass.java
│       │   │
│       │   ├── POM/
│       │   │   ├── Login_Page.java
│       │   │   └── SignUP_Page.java
│       │   │
│       │   ├── Scripts/
│       │   │   ├── login.java
│       │   │   └── signup.java
│       │   │
│       │   └── TestNG_FrameWork_UI/
│       │       ├── HomePage.java
│       │       ├── LoginPage.java
│       │       └── signup_TestNGUsingDataProvider.java
│       │
│       └── resources/
│
├── pom.xml
├── testng.xml
├── target/
├── test-output/
