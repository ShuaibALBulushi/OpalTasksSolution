# CodingBat Pattern Exercises

This folder contains a Java console program with loop-based pattern-printing exercises. The exercises are collected in [`Pattern.java`](./Pattern.java) and run sequentially from one `main` method.

## Patterns included

The program prints:

1. A hollow square of stars
2. A triangle that repeats each row number
3. A shrinking triangle of numbers counting from 1
4. A filled diamond of stars
5. A hollow diamond of stars
6. An X inside a square
7. An hourglass of stars
8. A triangle of letters counting backward from a letter selected by the input
9. A triangle of consecutive odd numbers
10. A plus sign inside a square

## Run

From the repository root, compile the Java source:

```powershell
javac -d . codingBat\Pattern.java
```

Then run the class using its package-qualified name:

```powershell
java codingBat.Pattern
```

The program asks for ten integer values, one for each pattern, in the order listed above. Enter each value when the `Output for n:` prompt appears. The output for all patterns is printed consecutively.
