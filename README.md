RMI BANK ACCOUNT APPLICATION
----------------------------------------

Description:
This application implements a simple bank account system using Java RMI (Remote Method Invocation).

The remote object represents a bank account and implements the following methods:

- deposit()
- withdraw()
- getBalance()

The application contains:
- An RMI server
- An RMI client
- A remote interface
- A bank account implementation

----------------------------------------
REQUIREMENTS
----------------------------------------

- Java JDK installed
- Linux, Windows, or MacOS terminal

----------------------------------------
PROJECT STRUCTURE
----------------------------------------

src/
    BankAccount.java
    BankAccountImpl.java
    BankServer.java
    BankClient.java

----------------------------------------
COMPILATION
----------------------------------------

Open the terminal inside the src folder:

cd src

Compile the files:

javac *.java

----------------------------------------
EXECUTION
----------------------------------------

STEP 1 - Start the RMI Registry

Run in the terminal:

rmiregistry

NOTE:
Keep this terminal open.

----------------------------------------

STEP 2 - Run the server

Open another terminal inside the src folder:

java BankServer

Expected output:

Bank server is running.

----------------------------------------

STEP 3 - Run the client

Open another terminal inside the src folder:

java BankClient

Expected output:

Current balance: $300.0

----------------------------------------
APPLICATION FLOW
----------------------------------------

1. The client performs a lookup for the remote object.
2. The server publishes the bank account object.
3. The client remotely invokes:
   - deposit()
   - withdraw()
   - getBalance()
4. The server processes the requests and returns the results.

----------------------------------------
OBSERVATION
----------------------------------------

The methods were implemented using synchronized
to avoid concurrency issues when multiple clients
access the bank account simultaneously.