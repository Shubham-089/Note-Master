# Note-Master
# 📝 Notes Maker - QA Automation & Manual Testing Project

A complete QA Testing repository for the **Notes Maker & To-Do Web Application**  
🔗 Live Project: [https://notes-makers.vercel.app](https://notes-makers.vercel.app)

This repository contains both **Manual Testing** and **Automation Testing** for the project using:
- 🧪 Selenium WebDriver
- ⚙️ TestNG Framework
- 📦 Page Object Model (POM)
- 📋 Well-documented test artifacts

---

## 📌 Project Scope

### ✅ Functional Modules Tested:
- Sign Up
- Login
- Forgot Password
- Notes & To-Do functionality
- User Profile & Home Page

### 📄 Manual Testing Includes:
- Test Plan
- Test Scenarios & Test Cases
- Bug Report
- Summary Report

### 🤖 Automation Testing Includes:
- Selenium WebDriver + TestNG for automation
- Page Object Model (POM) pattern
- Organized test execution with testng.xml

---

## 🧱 Folder Structure
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


📝 Summary
This QA project demonstrates an end-to-end testing approach for a modern web application.
It integrates manual test coverage with automated regression tests using industry-standard tools like Selenium WebDriver, TestNG, and a clean POM structure.

The goal is to ensure application quality through detailed test coverage, efficient automation, and structured documentation.

