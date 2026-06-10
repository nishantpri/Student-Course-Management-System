## LearnTrack -  Student-Course-Management-System
LearnTrack is a console-based Student &amp; Course Management System built using Core Java. It enables student, course, and enrollment management through a menu-driven interface while demonstrating OOP, Collections (ArrayList), Exception Handling, Inheritance, Encapsulation, and clean modular design.

A simple console-based application built using Core Java to manage students, courses, and enrollments. It allows users to add, view, search, and update records through a menu-driven interface while demonstrating Core Java concepts like OOP, ArrayList, exception handling, and clean code organization.

## Features
### Student Management
- Add Student
- View All Students
- Search Student by ID
- Deactivate Student

### Course Management
- Add Course
- View All Courses
- Search Course
- Activate Course
- Deactivate Course

### Enrollment Management
- Enroll Student into a Course
- View Student Enrollments
- Complete Enrollment
- Cancel Enrollment



---



## Technologies Used

- Java
- JDK 20 
- IntelliJ IDEA
- ArrayList
- Object-Oriented Programming

---



## Project Structure

```

.learntrack

│

├── entity

│   ├── Person.java

│   ├── Student.java

│   ├── Trainer.java

│   ├── Course.java

│   └── Enrollment.java

│

├── service

│   ├── StudentService.java

│   ├── CourseService.java

│   └── EnrollmentService.java

│

├── util

│   ├── IdGenerator.java

│   └── InputValidator.java

│

├── exception

│   ├── EntityNotFoundException.java

│   └── InvalidInputException.java

│
 

└── Main.java 

```



---



## Object-Oriented Programming Concepts Used



- Encapsulation
- Inheritance
- Method Overriding
- Constructor Overloading
- Static Members
- Exception Handling
- Collections (ArrayList)
---



## How to Run

1. Install JDK.
2. Open the project in IntelliJ IDEA.
3. Run `Main.java`.
4. Use the console menu to manage students, courses, and enrollments.

---



## Class Diagram

                  Person

                 /      \

            Student    Trainer



Student

   │

Enrollment

   │

Course

```
## Author
Nishant Pritam






