# Software Engineering Principles and Patterns
Compilation of software engineering principles and patterns. A design pattern is a general repeatable solution to a commonly occurring problem in software design. It is a description or template for how to solve a problem that can be used in many different situations.

## Software Architecture Design
### Pipe and Filter
### Shared Repository
### Model View Controller
  
## Design Principles
### Information Hiding (IH)
### Separation of Concerns (SoC)
### Open Close Principle (OCP)
### Program to Interface (P2I)
### Interface Segregation Principle (ISP)
### Dependency Inversion Principle (DIP)
  
## Application Control Design Patterns
### Input Controller Patterns
    * Page Controller Pattern
    * Front Controller Pattern
### Request Control Patterns 
    * Command Pattern
    * Application Controller Pattern
    * Command Processor Pattern
### Output Control
    * Template View Pattern
    * Transform View Pattern
### Access Control Patterns
    * Firewall Proxy Pattern
    * Authroization Pattern

## Object Interaction Design Patterns
### Observer 
### Mediator
### Facade
Facade design pattern is used when a system is very complex or difficult to understand as the system has a large number of interdependent classes. This pattern hides the complexities of the larger system and provides a simpler interface to the client. 
* `Facade` contains all its subsystem Client methods. 
* `Client` simply calls the `Facade` class to access any subsystem Client methods.
<p align="center"><img src="https://github.com/jun159/SoftwareEngineering/blob/master/img/facade.png" height ="200"></p>

### Memento
### Data Transfer
### Double Dispatch
