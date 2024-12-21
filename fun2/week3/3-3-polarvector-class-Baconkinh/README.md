[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/jqKfolPf)
# Homework 3-3: PolarVector Class and Vector Class Extension

## Important

We will be working with a more conventional project layout starting from now. All the Java source files must be in the _src/main/java_ directory. There will be some adjustments you will need to follow:

1. Start your IDE (VS Code) in the root (home) directory of the project, not in _src/main/java_.

2. If you need to compile the source files manually with _javac_, the command will now be:

```
javac -d target/classes src/main/java/*.java
```

The `-d` option specifies where the compiler should put the compiled class files. We will use _target/classes_ for that.

3. To run the program, execute:

```
java -cp target/classes MainApp
```

The `-cp` option specifies the _classpath_ where the class files are (the same directory as with `-d` option for _javac_).

## Instructions

This is an extension of the previous **Vector Class** problem. Extend the previous problem by creating a new class called `PolarVector` to represent vectors using polar coordinates. This class should define a vector by its _length_ and _direction_ (specified in radians, with values between -π and π).

### The `PolarVector` class should include the following methods:

- `public PolarVector(double length, double direction)`  
  A _constructor_ that takes the vector's length and direction (in radians) as parameters.  

- `public double getProjectionX()`  
  Returns the projection of the vector on the x-axis, calculated as:  
  $x = r \cos \theta$

- `public double getProjectionY()`  
  Returns the projection of the vector on the y-axis, calculated as:  
  $y = r \sin \theta$

- `public Vector toVector()`  
  Returns a `Vector` object created from the x and y projections of this PolarVector` object.  

- `public void print()`  
  Displays the vector in the format:  
  `PolarVector: r.rr<a.aa`  
  (where `r` is the length and `a` is the direction).  
  For example: `PolarVector: 0.50<1.57` followed by a newline.

### Extend the `Vector` class by adding the following method:

- `public PolarVector toPolarVector()`  
  Returns a `PolarVector` object created from the length and direction (polar coordinates) of this `Vector` object.  

## Output Requirements

The problem includes a pre-defined `MainApp` class, which contains a `main()` method for testing the `Vector` and `PolarVector` classes. The program should produce the following output when executed:

```
Vector: 1.50i + 0.50j
v: length = 1.58, direction = 0.32
PolarVector: 1.58<0.32
p: x = 1.50, y = 0.50
The next two lines should be equal:
Vector: 1.50i + 0.50j
Vector: 1.50i + 0.50j
```

### Note: Do not change the code in _MainApp.java_. You may comment and uncomment part of the code to check things, but you must revert it to the original state when submitting the code.
