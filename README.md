🛒 Amazon Selenium Automation Project

![Banner](https://raw.githubusercontent.com/kichu2000/Amazon-Automation-Testing/master/Banner.png)

📜 Project Description
This project demonstrates an end-to-end automation workflow for purchasing a laptop on Amazon.com, using Selenium WebDriver, Java, TestNG, and Maven.
The automation covers searching for a product, selecting it from search results, adding it to the cart, updating quantity, and proceeding towards checkout — all built following the Page Object Model (POM) design pattern.

Key Features
🔎 Product Search: Automates searching for laptops.
🛒 Add to Cart: Selects the first product and adds it to the cart.
🔄 Update Quantity: Changes the quantity of the product to two.
✅ Proceed to Purchase: Simulates proceeding towards checkout.
📊 Custom Reporting: Generates detailed ExtentReports for test execution.

🛠️ Technologies Used
Java 11
Selenium WebDriver
TestNG
Maven
ExtentReports for reporting
Page Object Model (POM) design pattern

🚀 How to Run the Project
Clone this repository:
git clone https://github.com/your-username/amazon-selenium-automation.git
Open the project in Eclipse or IntelliJ IDEA.

Install all Maven dependencies:
mvn clean install
Update your chromedriver.exe path if necessary.

Run the TestNG test files:
CartTest.java
SearchTest.java

📂 Project Structure

Amazon-Selenium-Automation/ ├── src/ │ ├── main/ │ │ └── java/ │ │ ├── com/automation/SeleniumProject/ │ │ │ ├── App.java │ │ │ ├── BaseTest.java │ │ │ └── SearchTest.java │ │ └── com/automation/pages/ │ │ ├── HomePage.java │ │ ├── ProductPage.java │ │ └── SearchResultPage.java │ │ └── com/automation/utilities/ │ │ └── ExtentReportManager.java │ ├── test/ │ │ └── java/ │ │ └── com/automation/SeleniumProject/ │ │ ├── AppTest.java │ │ └── CartTest.java ├── pom.xml ├── reports/ │ └── ExtentReport.html ├── README.md └── .gitignore
🧪 Test Cases Included
CartTest.java → Verifies adding a laptop to cart and updating quantity.

SearchTest.java → Verifies product search functionality.

📈 Reports
After running tests, an ExtentReport (ExtentReport.html) will be generated inside the reports/ folder.

✍️ Author
Krishnapriya N
www.linkedin.com/in/krishnapriya-n-bab8741bb

📣 Contributions, issues, and feature requests are welcome!
Feel free to fork the repo and submit a pull request. 🤝

📜 This project is licensed under the MIT License.

