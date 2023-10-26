## _The SOLID Principles_

The SOLID principles are a set of five design principles that aim to make software systems more understandable, flexible, and maintainable. These principles were introduced by Robert C. Martin and have become a fundamental guide for object-oriented design and programming. 

These are five principle of objet oriented class design pattern.

The SOLID acronym represents the following principles:

#### - Single Responsibility Principle (SRP):
- A class should have only one reason to change. In other words, a class should have a single, well-defined responsibility.
- This principle encourages you to keep classes focused on specific tasks, making the code easier to understand and maintain.

#### - Open-Closed Principle (OCP):
- Software entities (classes, modules, functions, etc.) should be open for extension but closed for modification.
- This means you should be able to add new functionality or behavior to a system without changing existing code. Achieving this often involves using interfaces, abstract classes, and polymorphism.

#### - Liskov Substitution Principle (LSP):

- Derived lor child classes must substitutable for their base or parent classes
- This principle ensures that derived classes (subtypes) can be used interchangeably with their base classes (superclasses) without causing errors or unexpected behavior

#### - Interface Segregation Principle (ISP):
- Clients should not be forced to depend on interfaces they don't use. In other words, an interface should contain only the methods that are relevant to its implementers.
- By keeping interfaces small and specific to the needs of the implementing classes, you reduce unnecessary dependencies and ensure that clients only depend on what they require.

#### - Dependency Inversion Principle (DIP):
- High-level modules should not depend on low-level modules. Both should depend on abstractions.
- Abstractions should not depend on details. Details should depend on abstractions.
- This principle promotes the use of dependency injection, allowing you to decouple high-level and low-level modules, making the system more flexible and easier to change.

These principles collectively help design software that is modular, maintainable, and adaptable to changing requirements. They guide developers in creating well-structured, clean, and flexible code. Adhering to SOLID principles can lead to better software quality and support the development of maintainable and extensible systems.

