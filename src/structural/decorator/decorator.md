# Decorator
## Description
Decorator is a structural design pattern that lets you attach new behaviors to objects by placing them inside wrapper objects that contain these behaviors.

You have to add and remove responsibilities from an object dynamically, but do it in a way so that it stay compatible with the rest of application's code.


## Pros
* Much more flexible than class inheritance.
* Allows adding and removing behaviors at runtime.
* Allows combining several additional behaviors by using multiple wrappers.
* Allows composing complex objects from simple ones instead of having monolithic classes that implement every variant of behavior.

## Contras
* It is hard to configure a multi-wrapped object.
* Lots of small classes.

## Source
* [Prototype - Refactoring Guru](https://refactoring.guru/design-patterns/prototype)