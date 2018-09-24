# State
## Description
State is a behavioral design pattern that allows an object to alter its behavior when its internal state changes. The object will appear to change its class.

### Real-World Analogy
*Smartphone*
The controls of your smartphone behave differently depending on the current state of the device:

* When the phone is unlocked, pressing buttons execute various functions.
* When the phone is locked, all buttons lead to the unlock screen.
* When the phone's charge is low, all buttons show the charging screen.
## Pros
* Eliminates state machine conditionals.
* Organizes the code related to particular states into separate classes.
* Simplifies the code of the context.
## Contras
* Can be an overkill if a state machine has only a few states or rarely changes.
## Source
[State - Refactoring Guru](https://refactoring.guru/design-patterns/state)
