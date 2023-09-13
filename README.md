# Selenium WebDriver + Java User Creation Project

Welcome to the Selenium WebDriver + Java project dedicated to user creation on a website. This project provides examples of basic Selenium WebDriver functions and automation testing of user registration.

## Project Structure

The project structure is organized as follows:

- `src`: Contains the main source code for the Selenium WebDriver project.
  - `PONo_DDL`: A package containing different test cases.
    - `DDL_MakeSelection.java`: A Java class with a test case for user creation.
    - Other Java classes for additional test cases.
  - `purchasedFor_Field`: A package containing test cases related to the "Purchased For" field.
  - `variables`: A package containing a Variables class with test data and constants.
- `.project`: Project configuration file.
- `README.md`: This file.

## Test Cases

In this project, I have included a basic test case for user creation. The test case performs the following steps:

1. Opens the Chrome browser.
2. Navigates to the specified URL.
3. Logs in using provided credentials.
4. Accesses the user registration page.
5. Fills out the registration form.
6. Submits the form.
7. Verifies if the registration was successful.
8. Logs out and closes the browser.

You can find additional test cases in the respective Java classes within the `PONo_DDL` and other packages.

## Getting Started

To get started with this Selenium WebDriver project:

1. Clone this repository to your local machine.
2. Set up your Selenium WebDriver environment and dependencies.
3. Configure the project based on your testing environment and requirements.
4. Run the desired test cases to perform user creation and testing.

## Dependencies

This project relies on the following dependencies:

- Selenium WebDriver
- ChromeDriver (ensure it matches your Chrome browser version)
- Java
- JUnit (for test cases)

Make sure to download and set up the WebDriver and ChromeDriver accordingly.

## Contributing

Contributions to enhance the framework, add more test cases, or improve test coverage are welcome. If you have improvements or bug fixes to contribute, please fork the repository and submit pull requests.

## License

This project is licensed under the MIT License.
