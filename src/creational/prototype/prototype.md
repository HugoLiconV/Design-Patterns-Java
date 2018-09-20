# Prototype
## Description
Prototype is a creational design pattern that lets you produce new objects by copying existing ones without compromising their internals.

You have an object and want to create a duplicate. How would you do it? First, you need to create a fresh object of the same class. Then you have to go over through all fields of the original object and copy their values to the new object.

Nice! But there is a catch. Not all objects can be copied this way. Some of the objects can have private fields not accessible from the outside.

## Pros
* Allows cloning objects without coupling to their concrete classes.
* Reduces repeating initialization code.
* Creates complex objects faster.
* Provides an alternative for subclassing when you are dealing with complex objects having lots of configuration options.
## Contras
*  Complex objects with lots of references to other objects can be difficult to clone.
## Source
* [Prototype - Refactoring Guru](https://refactoring.guru/design-patterns/prototype)
* [Java Prototype Design Pattern - Codes Java](https://codesjava.com/java-prototype-design-pattern)