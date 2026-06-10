# Design Notes

## Why ArrayList?

ArrayList was chosen because it provides dynamic storage.

Unlike arrays, ArrayList can grow or shrink during program execution, making it suitable for storing students, courses, and enrollments.

## Why Static Members?

The IdGenerator class uses static variables and static methods to generate unique IDs.

Examples:

* getNextStudentId()
* getNextCourseId()
* getNextEnrollmentId()

This eliminates the need to create IdGenerator objects.

## Why Inheritance?

A Person base class was created.

Student and Trainer inherit common attributes such as:

* id
* firstName
* lastName
* email

Inheritance reduces code duplication and improves maintainability.

## Package Organization

The project is divided into packages for better organization.

entity:
Contains domain objects such as Student, Course, and Enrollment.

service:
Contains business logic and operations.

util:
Contains utility classes and helper methods.

exception:
Contains custom exceptions.

ui:
Contains the console interface and Main class.

## Separation of Concerns

Entity Layer:
Stores application data.

Service Layer:
Handles business operations.

Utility Layer:
Provides reusable helper functions.

UI Layer:
Handles user interaction and menu navigation.

## Exception Handling

Custom exceptions are used to provide meaningful error messages.

Examples:

* EntityNotFoundException
* InvalidInputException

This improves application reliability and user experience.

## Conclusion

The LearnTrack project demonstrates Core Java concepts including OOP, Collections, Packages, Exception Handling, Static Members, and Modular Design while maintaining a clean and understandable structure.
