# JVM Basics

## JDK (Java Development Kit)

JDK is the complete software package required to develop Java applications.

It contains:

* JRE
* Java Compiler (javac)
* Debugging Tools
* Development Utilities

The JDK is used by developers to write, compile, and execute Java programs.

## JRE (Java Runtime Environment)

JRE provides the environment required to run Java applications.

It contains:

* JVM
* Java Libraries
* Supporting Runtime Files

Users who only need to run Java applications require the JRE.

## JVM (Java Virtual Machine)

JVM is responsible for executing Java bytecode.

Main responsibilities:

* Class Loading
* Bytecode Verification
* Memory Management
* Garbage Collection
* Program Execution

The JVM enables Java programs to run on different operating systems.

## Bytecode

Java source files (.java) are compiled into bytecode (.class files).

This bytecode is platform-independent and can be executed by any JVM.

## Write Once, Run Anywhere

Java programs are compiled into bytecode rather than machine code.

Since every operating system has its own JVM implementation, the same bytecode can run on Windows, Linux, and macOS without modification.

This feature makes Java platform-independent.
