[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/JKjrdkzW)
# Assignment 3-2: Vector Class

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

Create a `Vector` class to represent vectors using their `x` and `y` components. The `Vector` class should include the following methods:

- `public Vector(double x, double y)`: A constructor that initializes the vector with the given `x` and `y` components.

- `public double getLength()`: Returns the magnitude (or length) of the vector, calculated as:
  
  $|v| = \sqrt{x^2 + y^2}$.

- `public double getDirection()`: Returns the direction (or angle) of the vector, in radians, within the range $-\pi$ to $\pi$. This can be calculated using:

  $\phi = atan2(y, x)$.

- `public double dot(Vector v)`: Returns the dot product of the current vector with another vector v. The dot product can be computed as:

  $u \cdot v = x_u x_v + y_u y_v$.

- `public Vector getUnitVector()`: Returns a new Vector object representing the unit vector (magnitude of 1) in the same direction as the current vector. This can be calculated as:

  $\hat{v} = \frac{v}{|v|}$.

- `public void print()`: Prints the vector in the format:

  `Vector: x.xxi + y.yyj`, followed by a new line.

  For example, Vector: `1.00i + 2.50j`.

## Instructions

A `MainApp` class with a `main()` method to test the `Vector` class is provided in the file _Main.java_. The output of running the program should be as follows:

```
Vector: 1.00i + 1.00j
Vector: -0.50i + 0.50j
v: length = 0.71, direction = 2.36
u . v = 0.00
Vector: 0.71i + 0.71j
```

## Note

- **Do not change the `MainApp` class!**

## Suggestions

- The `Math` class in Java provides several mathematical methods, such as `sqrt()`, `abs()`, and `cos()`. For example, to calculate the square root of `x`, use `Math.sqrt(x)`. You can look up additional details in the Java documentation.
- Use `Math.atan2(y, x)` to calculate the arctangent for the angle, which takes the opposite and adjacent sides as arguments and returns the angle in the range $-\pi$ to $\pi$.
- In some methods, you may need to use the `this` keyword to refer to the current object.
