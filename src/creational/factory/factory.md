#Factory
##Description
Factory Method is a creational design pattern that provides an interface for creating objects in superclass, but allow subclasses to alter the type of objects that will be created.

## Example
During one of the project implementation, we were trying to read the data from multiple sources like a database, CSV and, XML. In this case, we created readers like DatabaseReader, CSVReader and XMLReader etc. But, in the client code we were using the concrete implementations to instantiate the class(For example, XMLReader reader = new XMLReader()) and leading to a lot of duplication of object creational logic across the client code. To overcome this issue, we created an interface called Reader and all the readers implemented the Reader interface. Defined a factory method which will take necessary parameters from the client and creates the required object.


##Pros
* Follows the Open/Closed Principle. 
* Avoids tight coupling between concrete products and code that uses them.
* Simplifies code due to moving all creational code to one place.
* Simplifies adding new products to the program.

##Contras
* Requires extra subclasses.


## source: 
* [The Factory Design Pattern - DZone](https://dzone.com/articles/the-factory-design-pattern)
* [Factory Method - Refactoring Guru](https://refactoring.guru/design-patterns/factory-method)