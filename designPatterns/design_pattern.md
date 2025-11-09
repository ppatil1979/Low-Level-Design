# Design Patters
1) Something that repeat or occurces frequently 
2) Well established solution for problem that occurce during designing/ writing code

# Creational Design Patterns
- How to create object of class
- Diffrent ways to create object
## Singlton
- Allow us to create only one object for a class when needed e.g. Shared resources like DB connection
- Check detailed implemenation inside /designPatters/singleton/
## Builder
- Instead of calling a long constructor with many arguments,you build the object gradually using easy-to-read methods.
- It allow us to create object with following requirements
1) Class with lot of attributes
2) Validation required before object creation
- Details, create student class which have many attributes, so we have to use builder pattern as per above given 2 criterias.
- Will see how production builder pattern code going to be and for student will try to generate pattern
- #### inside Client class Student std = Student.getStudentBuilder().setName().build(); 
- Student class will have StudentBuilder as internal Builder class
- StudentBuilder will have same student attributes with getter setter methods and build() method, each attribute setter method will return StudentBuilder object,build() will do validation and student object creation.
- Student class will have all attributes without setter getter, private constructor with StudentBuilder parameter and getStudentBuilder method,which will return StudentBuilder object.
- Detailed implementation is inside /designPatterns/builder/ folder

## Prototype

## Factory
- Factory Pattern is a design pattern that provides a way to create objects without exposing the creation logic to the client,and instead, uses a common interface for all created objects.

- Abstract Factory
- Divide the interface in 2 separate interfaces
1) Interface with all attributes and non-factory methods
2) Interface with factory methods.

- Detailed implementation is inside /designPatterns/factory/ folder

# Structural Design Patterns
- How your class/ code should be structured
- How class should intract with another class

# Behavioural Design Patterns
- How to write behaviour
