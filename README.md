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
Observer design pattern is used when observable (subject), maintains a list of its dependents, called observers, and notifies them automatically of any state changes, usually by calling one of their methods. The Observer pattern is also a key part in the familiar model–view–controller (MVC) architectural pattern.
<p align="center"><img src="https://github.com/jun159/SoftwareEngineering/blob/master/img/observer.png" height ="180"></p>
#### Push model
  * `Observable` sends directly to the `Observer` all the data `Observer` needs. 
  * `Observer` doesn't need to query the `Observable` for information.
  * `Observer` as `Player`
  * `Observable` as `LightEffectController` and `SoundEffectController`
    * `Player` sends directly to the `Observer` the coordinates.
    * `Observers` do not need to query player for information, just use coordinates given by player.
    
#### Pull model
  * `Observable` merely notifies the `Observer` that something happened
  * `Observer` queries the `Observable` based to get the information it needs.
  * `Observer` as `Player`
  * `Observable` as `LightEffectController` and `SoundEffectController`
    * `Player` notifies `LightEffectController` and `SoundEffectController` that it has moved.
    * `LightEffectController` and `SoundEffectController` query `Player`'s information (coordinates).

### Mediator
### Facade
Facade design pattern is used when a system is very complex or difficult to understand as the system has a large number of interdependent classes. This pattern hides the complexities of the larger system and provides a simpler interface to the client. 
* `Facade` contains all its subsystem client methods. 
* `Client` simply calls the `Facade` class to access any subsystem client methods.
<p align="center"><img src="https://github.com/jun159/SoftwareEngineering/blob/master/img/facade.png" height ="200"></p>

### Memento
### Data Transfer
### Double Dispatch
