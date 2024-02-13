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

!!! :zap: Important :zap:
Note : Java is statically typed which means that we can use a variable only if it is declared earlier in the program.
    
For Example : 
```java {data-filename = "staticallyTyped.java"}

// This is wrong.
age = 20;
int age;

//This is right.
int age;
age = 20;
```
!!!

### c. Rules for naming variables in Java

1. Java is ***case sensitive*** which means that Java treats two variable with same name but different cases, as two differenet variables.
Example : `speed`,`Speed`,`SPEED`,`speeD`,`SpEEd` -> All these are completely different variables.
2. Variable name must start with a `ALPHABET`, `_` or a `$` symbol.
Example : `int Speed;`, `int $speed;`, `int _speed_limit;` -> These are valid variable names.  
          `int 1speed;`, `int @speed;` -> These are invalid variable names.
3. Variable names must ***not be a Java keyword***.  
Example : `int for;`, `int while;` -> These are invalid variable names.
4. Variable names must be ***meaningful***.  
Example : `int s;`, `int a;` -> These names are not meaningful but valid.  
          `int speed;`, `int age;` -> These names are meaningful and valid too.

## 2. Data Types
> Data types are used to specify the size and value that can be stored in a variable.  

There are two types of data types in Java :  
1. Primitive Data Types
2. Non-Primitive Data Types (a.k.a Reference)

|DataType|Size|
|--|--|
|boolean|1 bit|
|byte|1 byte|
|short|2 byte|
|int|4 byte|
|long|8 byte|
|char|2 byte|
|float|4 byte|
|double|8 byte|

```mermaid Data Types in Java

flowchart TD
    A(Datatypes) --> B(Primitive)
    A(Datatypes) --> C(Non Primitive)
    B(Primitive) --> D(Boolean)
    B(Primitive) --> E(Numeric)
    D(Boolean) --> F(boolean)
    E(Numeric) --> G(Character)
    E(Numeric) --> H(Integral)
    H(Integral) --> I(Integers)
    H(Integral) --> J(Floating)
    I(Integers) --> K(byte)
    I(Integers) --> L(short)
    I(Integers) --> M(int)
    I(Integers) --> N(long)
    J(Floating) --> O(float)
    J(Floating) --> P(double)
    C(Non Primitve) --> Q(String)
    C(Non Primitve) --> R(Classes)
    C(Non Primitve) --> S(Arrays)
    C(Non Primitve) --> T(etc.)

```

## 3. Comments
> Comments are sections of a program that are completely ignored by the compiler. These are generally used to properly define our segments of program right there in the code.  

There are two types of comments generally used in Java:  
1. Single line comments. `//This is a single line comment.`
2. Multiline comments. `/*This is a multiline comment.*/`