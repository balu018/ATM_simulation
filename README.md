
# ATM Management System

## Project Description
The **ATM Management System** is a Java-based console application that simulates basic banking operations. Users can check their bank balance, deposit money, withdraw money, and create accounts. The project is implemented using Java OOP principles and a HashMap to store customer details.

## Features
- **Check Bank Balance**: Allows users to check the balance of an existing account.
- **Deposit Money**: Enables users to deposit money into their account after verifying their account number.
- **Withdraw Money**: Allows users to withdraw money, ensuring sufficient balance.
- **Create Account**: Facilitates account creation by entering user details like first name, last name, phone number, and address.

## Technologies Used
- **Java**: Core language for implementation.
- **HashMap**: Used for storing customer details.
- **OOP Principles**: Implemented using classes and interfaces.

## How to Run the Project
1. Clone or download the project files.
2. Compile the Java file using a Java compiler:
   ```sh
   javac Main.java
   ```
3. Run the compiled class:
   ```sh
   java Main
   ```
4. Follow the on-screen instructions to perform various ATM operations.

## Class & Methods Overview
- **Main Class**: Implements the `ATM` interface and contains the core logic.
- **Methods**:
  - `checkBankbalance()`: Fetches and displays the balance of the provided account.
  - `createAccount()`: Creates a new account and stores customer details.
  - `deposit()`: Allows users to deposit money after confirming their account number.
  - `withdraw()`: Enables users to withdraw money while checking available balance.

## Possible Improvements
- Add authentication with PIN verification.
- Implement a database for better data persistence.
- Provide a graphical user interface (GUI) for an enhanced user experience.

## Author
- **katamgari balaraju**

## License
This project is open-source and available for modifications and improvements.

