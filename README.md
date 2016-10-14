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
  * `Observable (Subject)` knows all its `Observers` and provides an interface for attaching and detaching `Observer` objects.
  * `Observer` is an update interface for objects that should be notified of changes when state changed in `Observable`.
  * `ConcreteObservable (ConcreteSubject)` stores list of its `Observer` objects and sends notification to its `Observer` when its state changes.
  * `ConcreteObserver` receives state from `Observable`, update action if applicable.

#### Push model
  * `Observable` sends directly to the `Observer` all the data `Observer` needs. 
  * `Observer` doesn't need to query the `Observable` for information. </br></br>
<p align="center"><img src="https://github.com/jun159/SoftwareEngineering/blob/master/img/pushmodel.png" height ="300"></p>
  * `Observable` as `Player`
  * `Observer` as `LightEffectController` and `SoundEffectController`
    * `Player` sends directly to the `Observer` the state (coordinates).
    * `Observers` do not need to query player for state (coordinates), just use state (coordinates) given by player.
    
#### Pull model
  * `Observable` merely notifies the `Observer` that something happened
  * `Observer` queries the `Observable` based to get the information it needs. </br></br>
<p align="center"><img src="https://github.com/jun159/SoftwareEngineering/blob/master/img/pullmodel.png" height ="300"></p>
  * `Observable` as `Player`
  * `Observer` as `LightEffectController` and `SoundEffectController`
    * `Player` notifies `LightEffectController` and `SoundEffectController` that it has moved.
    * `LightEffectController` and `SoundEffectController` query `Player`'s state (coordinates).
    
### Push vs Pull model
* Advantage of the 'push' model:
  * Lower coupling between the `Observer` and `Observable`.
* Disadvantage of 'push' model:
  * Less flexibility: `Observable` may not always know what exact information the `Observers` need in order to send it to them.
* Advantage of the 'pull' model:
  * Higher coupling between the `Observer` and `Observable`.
* Disadvantage of 'pull' model:
  * More flexibility: `Observer` can decide for itself what to query, without relying on `Observable` to send the correct information.
  
### Application for Push and Pull model
* Use 'push' model: If all `Observer` needs same states from `Observable` to trigger update action [Less coupling, simpler]
  * `AgeObservers` need simply the age and birthdate of the `Observable`. 
* Use 'pull' model: If `Observer` needs varying states from `Observable` to trigger update action [More coupling]
  * `HeightObservers` need varying information about `Observable` - One needs to query the age, and some others needs weight and height.
  
### Mediator
### Facade
Facade design pattern is used when a system is very complex or difficult to understand as the system has a large number of interdependent classes. This pattern hides the complexities of the larger system and provides a simpler interface to the client. 
* `Facade` contains all its subsystem client methods. 
* `Client` simply calls the `Facade` class to access any subsystem client methods.
<p align="center"><img src="https://github.com/jun159/SoftwareEngineering/blob/master/img/facade.png" height ="400"></p>

### Memento
### Data Transfer
### Double Dispatch
