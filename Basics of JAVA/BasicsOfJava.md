# Basics of Java

## 1. Variables
> A variable is a memory location used to store data values, and is being referenced by a variable name in programming.

### a. Declaration of a variable in Java
> Declaration of a variable in Java means that we are instructing the Java Compiler to assign a memory location, which is later being referenced in the program.
#### Syntax
`dataType variableName;`
#### Example
`int age;`

### b. Initialization of a variable in Java
> Initialization of a variable in Java means that we are assigning an initial value to the variable that we had declared earlier.
#### Syntax
`variableName = value;`
#### Example
`age = 20;`

> Note : Java is statically typed which means that we can use a variable only if it is declared earlier in the program.
    
For Example : 
```
/* This is wrong */
age = 20;
int age;

/* This is right */
int age;
age = 20;
```