# Tips And Info

## Index

- [Project Folder Structure](#project-folder-structure)
- [Compiling Java Files](#compiling-java-files)
- [Running Java Files](#running-java-files)
- [Recommended Practice](#recommended-practice)
- [Get Folder Structure](#get-folder-structure)

---

### Other Files

- [Folder Structure File](folderStructure.txt)

## Project Folder Structure

```txt
|-- out/
|-- src/
```

- The `out/` folder has the `.class` files (executable files).
- The `src/` folder has the `.java` files (source code).

---

## Compiling Java Files

- To compile a single `.java` file:

  ```sh
  javac -d out *path*/*of*/*java*/*file*/*test.java*
  ```

  **Example:**

  ```sh
  javac -d out src/com/school/Main.java
  ```

- To compile all `.java` files:

  ```sh
  javac -d out src/**/*.java
  ```

  **NOTE:**

  - Java does not automatically check if `.class` files are already up to date.

  - Every `.java` file will be recompiled, even if it hasn't changed.

  - Already compiled files are NOT ignored — they are recompiled every time.

---

## Running Java Files

To run the file:

```sh
java -cp out the.package.name
```

**Example:**

```sh
java -cp out com.school.Main
```

The `-cp` option stands for **"class path"**. It tells Java where to look for compiled `.class` files and libraries.

- `-cp out` means:

  "Look for compiled classes in the out directory."

---

## Recommended Practice

If you want to clear `out/`, do this cleanly:

```sh
rm -rf out/
mkdir out
javac -d out src/**/*.java
```

This ensures no stale or old `.class` files remain.

---

## Get Folder Structure

To get the folder structure, use the command:

```sh
tree /f /a > folderStructure.txt
```

- `/f` : lists all the files too
- `/a` : uses only ASCII characters in the output
