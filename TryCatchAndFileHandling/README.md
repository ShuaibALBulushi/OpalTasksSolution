# Try-Catch and File Handling

This Java exercise demonstrates reading from and writing to text files with buffered I/O, and handling `IOException` with a `try`/`catch` block.

## What it does

`FileHandler` reads and prints the contents of `text.txt`, then appends that content to `text2.txt`. It reports an I/O error if reading or writing fails.

The output file is opened in append mode, so each run adds another copy of the input content to `text2.txt`.

## Run

From the repository root, compile the class:

```powershell
javac -d . TryCatchAndFileHandling\FileHandler.java
```

Then run it with the exercise directory as the working directory. This is important because the program looks up `text.txt` and `text2.txt` using relative paths:

```powershell
Set-Location TryCatchAndFileHandling
java -cp .. TryCatchAndFileHandling.FileHandler
```

The input and output files are included in this directory. Running the program modifies `text2.txt`.
