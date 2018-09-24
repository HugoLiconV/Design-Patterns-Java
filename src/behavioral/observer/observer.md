# Observer
## Description
Observer is a behavioral design pattern that lets you define a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.

### Real-World Analogy
*Magazine subscription*

Once subscribed to a newspaper or magazine, you no longer need to go to the store and check if a next issue is available. Instead, the publisher will send new issues directly to your mailbox right after the publication.

The publisher maintains a list of subscribers and knows which magazines they are interested in. Subscribers can leave the list at any time when they wish to stop publisher sending new magazine issues to them.
## Pros
* Publisher is not coupled to concrete subscriber classes.
* You can subscribe and unsubscribe objects dynamically.
* Follows the Open/Closed Principle.
## Contras
* Subscribers are notified in random order.

[Observer - Refactoring Guru](https://refactoring.guru/design-patterns/observer/)
