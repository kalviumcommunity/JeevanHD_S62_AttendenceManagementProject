# 🌲 What is `tree`?

The `tree` command is used to **visually display the directory structure** of a folder, like a "family tree" of files and directories.

---

## 📜 Full Syntax

```bash
tree [options] [directory]
```

### 🔸 Parameters explained

| Part        | Description                                   |
| ----------- | --------------------------------------------- |
| `directory` | The folder where the tree should start        |
| `options`   | Modify how the tree looks or what it includes |

If no directory is given, it uses the **current directory (`.`)** by default.

---

## ✅ Commonly Used `tree` Options

| Option                         | Description                                                   |
| ------------------------------ | ------------------------------------------------------------- |
| `/f` (Windows) or `-f` (Linux) | Show full path of each file                                   |
| `/a` (Windows) or `-a` (Linux) | Use ASCII characters instead of extended line-drawing symbols |
| `-L n`                         | Limit the depth of the tree (e.g., `-L 2` = show 2 levels)    |
| `-d`                           | Show only directories (not files)                             |
| `-i`                           | No indentation lines (flat list)                              |
| `-h`                           | Show file sizes in human-readable format (Linux only)         |
| `-o file.txt`                  | Output to a file instead of printing on screen (Linux only)   |

---

## 📦 Examples (with Output)

### 1. 🔹 Basic tree of current directory

```bash
tree
```

### 2. 🔹 Show full file paths (Git Bash on Windows)

```bash
tree /f
```

Linux/Mac equivalent:

```bash
tree -f
```

### 3. 🔹 ASCII output (useful for redirecting to `.txt` file)

```bash
tree /f /a > folderStructure.txt
```

This works well in **Git Bash** or **Command Prompt (CMD)**.

---

### 4. 🔹 Limit depth to 2 levels

```bash
tree -L 2
```

> Good for large folders — avoids dumping everything.

---

### 5. 🔹 Show only directories

```bash
tree -d
```

---

### 6. 🔹 No lines/graphics (flat view)

```bash
tree -i
```

---

### 7. 🔹 Output tree to a file (Linux/macOS only)

```bash
tree -a -f -L 3 > output.txt
```

---

## 📁 Example Output

```txt
project/
├── src/
│   ├── com/
│   │   └── school/
│   │       ├── Main.java
│   │       └── Student.java
├── out/
│   └── com/
│       └── school/
│           ├── Main.class
│           └── Student.class
└── README.md
```

---

## 🔄 Windows vs Linux Difference

| Feature                     | Windows (`CMD` / Git Bash) | Linux / macOS Terminal |
| --------------------------- | -------------------------- | ---------------------- |
| ASCII output                | `/a`                       | `-a`                   |
| Show files                  | `/f`                       | `-f`                   |
| Limit depth (not available) | ❌                         | `-L n`                 |

> 🧠 On Windows, `tree` is built-in in CMD, but limited. Git Bash users get better features if they install Unix `tree`.

---

## 📦 Installing `tree` (if missing)

- **Ubuntu/Debian**:

  ```bash
  sudo apt install tree
  ```

- **Mac** (with Homebrew):

  ```bash
  brew install tree
  ```
