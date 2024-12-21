[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/NipPhjz1)
# Assignment 3-1: Enhanced Account Class

## Important

We will be working with a more conventional project layout starting from now. All the Java source files must be in the _src/main/java_ directory. There will be some adjustments you will need to follow:

1. Start your IDE (VS Code) in the root (home) directory of the project, not in _src/main/java_.

2. If you need to compile the source files manually with _javac_, the command will now be:

```
javac -d target/classes src/main/java/*.java
```

The `-d` option specifies where the compiler should put the compiled class files. We will use _target/classes_ for that.

3. To run the program, execute:

```
java -cp target/classes MainApp
```

The `-cp` option specifies the _classpath_ where the class files are (the same directory as `-d` option with _javac_).

## Instructions

Use the provided _Account.java_ file as a starting point. Modify the `Account` class to support the suspension of accounts, where a suspended account cannot perform deposits or withdrawals until it is reactivated.

## Add the following methods to the Account class:

- `public void suspend()`
  Suspends the account by setting its status to suspended.

- `public void reactivate()`
  Reactivates the account by setting its status back to active.

- `public boolean isActive()`
  Checks whether the account is active. Returns true if the account is active and false if it is suspended.

## Add the following checks:

- If the account is suspended, it should not allow deposits or withdrawals.
- If `deposit()` or `withdraw()` is called while the account is suspended, an `IllegalStateException` should be thrown with the message: `Account is suspended.`

## Notes:

- **Do not modify _MainApp.java_!**
- Use `IllegalStateException` to indicate that an operation is being attempted in an inappropriate state.
- Consider adding an instance variable to store the account’s status.

A `MainApp` class with a `main()` method is provided in the _MainApp.java_ file to test the `Account` class. The expected output when running the program is:

```
Account 1234-0001 has been created with a balance of 100.00 baht.
Account 1234-0001 now has a balance of 200.00 baht.
Account is suspended.
Trying to deposit...
Illegal state: Account is suspended.
Trying to withdraw...
Illegal state: Account is suspended.
Account is active.
Account 1234-0001 now has a balance of 200.00 baht.
Account 1234-0001 now has a balance of 300.00 baht.
```
