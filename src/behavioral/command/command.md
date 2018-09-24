# Command
## Description
Command is a behavioral design pattern that lets you turn a request into stand-alone object, which can be used to parametrize objects with different requests, queue or log requests, and support undoable operations.


## Pros
* Decouples classes that invoke operations from classes that perform them.
* Allows reversal (undo) of operations.
* Allows deferred execution of operations.
* Allows assembling simple commands into larger ones.
* Follows the Open/Closed Principle.
## Contras
* Increases overall code complexity by creating multiple additional classes.

## Source
[Command - Refactoring Guru](https://refactoring.guru/design-patterns/command)
[Java Command Design Pattern](https://codesjava.com/java-command-design-pattern)