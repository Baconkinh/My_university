[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/kEu8beZU)
# Assignment 2-2: Mean and Standard Deviation

Student ID: 6730300655

Student Name: Atchara Dangdee

## Instructions

Write a class named `MeanAndSd` that will take $n$ floating-point numbers and find the _mean_ and _standard deviation_ of the numbers. The steps are as follows:

- Read the integer $n$ with the prompt "N: ".
- Repeatedly read $n$ floating-point numbers with the prompt "Number $i$" where $1 \leq i \leq N$.
- Display the mean to 2 decimal places.
- Display the standard deviation to 2 decimal places.

The mean $\bar{x}$ is computed using this formula:

$$
\bar{x} = \frac{\sum_{i=1}^n x_i}{n}
$$

The standard deviation $SD$ is computed using this formula:

$$
SD = \sqrt{\frac{1}{n-1}\sum_{i=1}^{n}(x_i-\bar{x})^2}
$$

## Conditions

- $1 < n < 100$
- For each number $x_i$, $|x_i| < 1.0 \times 10^6$

If the user enters a number that is out of any of these ranges, the program should terminate with the message: "Input out of range!"

## Example Runs

### Example 1

```
N: 3
Number 1: 2.5
Number 2: -4
Number 3: 3
Mean = 0.50
SD = 3.91
```

### Example 2

```
N: 5
Number 1: 123.45
Number 2: -70
Number 3: 123456789
Input out of range!
```

## Hints

- You'll need to use an array.
- Array allocation can be done _after_ you know the exact number of inputs.
