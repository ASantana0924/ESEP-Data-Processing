In-Memory Key-Value Database with Transactions

This project implements a simple in-memory key-value database in Java with support for transactions.

Running the Code

Prerequisites:

Java 11 or later installed (https://www.oracle.com/java/technologies/downloads/)
Instructions:

Clone or download the project repository.
Open a terminal window and navigate to the project directory.
Compile the code using a Java compiler (javac InMemoryDB.java).
Run the program using the following command:
Bash
java InMemoryDB
Use code with caution.

This will run the InMemoryDB class and provide a console to interact with the database using the implemented methods.

Testing the Functionality

The InMemoryDB class provides methods for:

get(key): Retrieves the value associated with a key.
put(key, val): Sets the value for a key.
begin_transaction(): Starts a new transaction.
commit(): Applies changes made within a transaction.
rollback(): Reverts changes made within a transaction.
You can test these functionalities by manually invoking the methods. Refer to the comments within the InMemoryDB class for expected behavior.

Converting this to an Official Assignment

Here are some suggestions to transform this project into a more comprehensive assignment:

Expand Functionality:
Implement error handling for invalid data types or key formats.
Add methods for deleting key-value pairs.
Introduce a time-based expiration for key-value pairs.
Advanced Transactions:
Implement concurrency control mechanisms to handle concurrent transactions.
Explore different transaction isolation levels (READ UNCOMMITTED, READ COMMITTED, etc.).
Testing Framework:
Introduce a unit testing framework (JUnit) to write automated tests for the database functionalities.
Grading:
Provide a set of pre-defined test cases covering various scenarios, including transaction behavior, error handling, and edge cases.
Evaluate code clarity, documentation, and adherence to best practices.
By incorporating these suggestions, you can create a more challenging and informative assignment that assesses students' understanding of in-memory databases and transaction management.
