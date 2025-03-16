🚀 Saucedemo Automation Project
📌 Overview

This project automates testing for SauceDemo using Selenium WebDriver and TestNG in a Java environment. It verifies core functionalities like login, adding products to the cart, and completing purchases.

⚙️ Prerequisites
Before running the project, ensure you have the following installed on your system:

✅ 1. Install Java Development Kit (JDK)
The project requires Java 11 or later.
Check if Java is installed by running:
sh
Copy
Edit
java -version
If not installed, download it from Oracle JDK.
✅ 2. Install Maven (Recommended but Optional)
This project uses Maven for dependency management.
Verify installation using:
sh
Copy
Edit
mvn -version
If Maven is not installed, download it from Apache Maven and add it to the system PATH.
✅ 3. Install WebDriver for Your Browser
If using Google Chrome, download ChromeDriver from here.
Ensure the WebDriver version matches your Chrome browser version.
Place chromedriver.exe in a known location and update its path in the project.
📂 Project Setup and Execution
🔹 1. Download the Project
Option A: Clone via Git (Recommended)
If Git is installed, run:

sh
Copy
Edit
git clone https://github.com/mansouratia/saucedemo-automation.git
Then, navigate to the project folder:

sh
Copy
Edit
cd saucedemo-automation
Option B: Manual Download
Go to GitHub Repository
Click "Code" → "Download ZIP", then extract the folder.
🔹 2. Open the Project in IntelliJ IDEA
1️⃣ Open IntelliJ IDEA, click "Open", and select the project folder.
2️⃣ Ensure WebDriver is configured in saucedemo.java:

java
Copy
Edit
System.setProperty("webdriver.chrome.driver", "C:\\path\\to\\chromedriver.exe");
3️⃣ If using Maven, open pom.xml and click "Load Maven Project" or run:

sh
Copy
Edit
mvn clean install
🚀 Running Tests
🔹 Option 1: Run TestNG from IntelliJ
Open saucedemo.java in src/test/java/.
Right-click and select "Run 'saucedemo'".
🔹 Option 2: Run TestNG via XML
Open testng.xml (if available).
Right-click and select "Run 'testng.xml'".
🔹 Option 3: Run Tests Using Maven
If using Maven, execute:

sh
Copy
Edit
mvn test
📊 Viewing Test Results
Test results appear in the Console.
If using TestNG Reports, find the report in:
bash
Copy
Edit
target/surefire-reports/index.html
Open it in a browser to analyze test results.
📌 Advanced Features (Optional)
🔹 Enable Allure Reports for a better visualization of test results:

sh
Copy
Edit
mvn clean test
mvn allure:serve
🔹 Set Up CI/CD Using GitHub Actions to automate test execution for every commit.

✅ Now you have a complete guide to set up and run the project successfully! 🎯
If you need improvements, feel free to ask! 🚀
