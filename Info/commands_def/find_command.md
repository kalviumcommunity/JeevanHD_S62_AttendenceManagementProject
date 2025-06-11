# 🔹 Basic Syntax of `find`

```bash
find [starting_path] [options] [expression] [action]
```

## 🔸 Parameters explained

| Part            | Description                                                      |
| --------------- | ---------------------------------------------------------------- |
| `starting_path` | Directory to start searching from                                |
| `options`       | Filters like `-name`, `-type`, `-size`, etc.                     |
| `expression`    | Conditions to match                                              |
| `action`        | What to do with the results (e.g., `-print`, `-delete`, `-exec`) |

---

## ✅ Commonly Used `find` Options

| Option    | Description                                |
| --------- | ------------------------------------------ |
| `-name`   | Match file name (wildcards allowed)        |
| `-type`   | File type: `f` = file, `d` = directory     |
| `-size`   | File size (e.g., `+1M` = larger than 1 MB) |
| `-mtime`  | Modified in the last _n_ days              |
| `-exec`   | Run a command on found files               |
| `-delete` | Delete matched files                       |
| `-print`  | Print the result (default)                 |

---

## 🔍 Examples of `find`

### 1. 🔹 Find all `.java` files

```bash
find src -name "*.java"
```

🔸 Looks inside the `src/` folder and all subfolders for `.java` files.

---

### 2. 🔹 Find only files (not directories)

```bash
find . -type f -name "*.txt"
```

🔸 Finds all `.txt` files under the current directory.

---

### 3. 🔹 Find all directories named `build`

```bash
find . -type d -name "build"
```

🔸 Looks for folders named `build`.

---

### 4. 🔹 Find files larger than 10MB

```bash
find . -type f -size +10M
```

---

### 5. 🔹 Find and delete `.class` files

```bash
find . -type f -name "*.class" -delete
```

⚠️ Be careful! This will delete all `.class` files.

---

### 6. 🔹 Find `.log` files modified in last 7 days

```bash
find . -name "*.log" -mtime -7
```

🔸 `-mtime -7` = modified within the last 7 days.

---

### 7. 🔹 Find and execute a command on each file

```bash
find . -type f -name "*.java" -exec javac {} \;
```

🔸 `-exec` lets you run a command (`javac`) on each file (`{}` is replaced by filename).

---

### 8. 🔹 Save found paths to a file

```bash
find src -name "*.java" > sources.txt
```

🔸 Output is written into `sources.txt`.

---

### 9. 🔹 Find empty files

```bash
find . -type f -empty
```

---

### 10. 🔹 Find files with case-insensitive name match

```bash
find . -iname "*.JPG"
```

🔸 `-iname` = case-insensitive match (matches `.jpg`, `.JPG`, `.Jpg`, etc.)

---

## 🧠 Tips

- Use `"` around patterns like `"*.java"` to prevent shell globbing.
- Use `-exec` or `xargs` for powerful batch processing.
- Add `-maxdepth 1` to limit how deep it searches.
