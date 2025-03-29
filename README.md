TutorialsNinja Automation Testing

Project Overview

This project automates the testing of the TutorialsNinja demo e-commerce website using Selenium WebDriver and TestNG. The automation covers login functionality, product search, adding items to the cart, and the checkout process.
link a google driver: (https://drive.google.com/drive/folders/1---YWAYPke_ZjbK0D0C8HxcyGVCNY0Eu?usp=sharing)

Technologies Used

Java

Selenium WebDriver

TestNG

Maven (for dependency management)

ChromeDriver (for browser automation)

Prerequisites

Before running the tests, ensure you have the following installed:

Java (JDK 8 or later)

Maven

Chrome browser

ChromeDriver (compatible with your Chrome version)

Project Structure

tutorialsninja/
│── src/
│   ├── test/
│       ├── java/
│           ├── tutorialsninja/
│               ├── TutorialNinja.java
│── pom.xml (Maven dependencies)
│── README.md (Project documentation)

Test Scenarios

1. Login Test

Navigates to the login page

Enters valid credentials

Verifies successful login

2. Search Test

Searches for a product (e.g., "Phone")

Verifies if the product appears in the search results

3. Add to Cart Test

Selects a product (iPhone)

Enters quantity (2)

Adds the product to the cart

4. Checkout Test

Proceeds to checkout from the cart

Setup and Execution

Clone the Repository

git clone <repository_url>
cd tutorialsninja

Install Dependencies

mvn clean install

Run Tests

Execute the test suite using:

mvn test

Test Reports

After execution, TestNG generates reports in the test-output folder, which can be viewed in any browser.

Contact

For any queries or contributions, feel free to reach out at rohitchouhankgn11@gmail.com.

