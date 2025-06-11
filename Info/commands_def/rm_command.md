# 🗑️ What is `rm`?

The `rm` command **removes (deletes) files or directories** from the file system **permanently** — it does **not move them to Trash/Recycle Bin**.

---

## 📜 Full Syntax

```bash
rm [options] [file_or_directory...]
```

### 🔸 Parameters

| Part                  | Description                       |
| --------------------- | --------------------------------- |
| `[options]`           | Optional flags to change behavior |
| `[file_or_directory]` | One or more targets to delete     |

---

## ✅ Common `rm` Options

| Option       | Description                                                                      |
| ------------ | -------------------------------------------------------------------------------- |
| `-f`         | Force deletion — **do not ask for confirmation**, even for write-protected files |
| `-r` or `-R` | Recursively delete directories and their contents                                |
| `-v`         | Verbose — show what is being deleted                                             |
| `-i`         | Ask for confirmation before each delete                                          |
| `-I`         | Ask for confirmation **once** if more than 3 files or recursive deletion         |

> 🧠 `-rf` is the most common and dangerous combo.

---

## 🧪 Examples

### 1. 🔸 Delete a single file

```bash
rm file.txt
```

---

### 2. 🔸 Force delete a file (no prompt)

```bash
rm -f file.txt
```

---

### 3. 🔸 Delete multiple files

```bash
rm file1.txt file2.txt notes.md
```

---

### 4. 🔸 Delete a folder and all contents

```bash
rm -r myFolder
```

> ❌ Will ask for confirmation if files are write-protected.

---

### 5. 🔸 Force delete folder (no prompt at all)

```bash
rm -rf myFolder
```

> ⚠️ **Be very careful** — this will remove the entire folder immediately.

---

### 6. 🔸 Verbose deletion

```bash
rm -rv old_logs/
```

> Shows each file/directory as it’s deleted.

---

### 7. 🔸 Interactive mode (asks before each delete)

```bash
rm -i important.txt
```

---

### 8. 🔸 Safe cleanup of `out/` build folder

```bash
rm -rf out/
```

Used in Java or Node.js projects to clean build artifacts.

---

## ⚠️ Safety Tips

- Never run `rm -rf /` — it will try to delete your entire system.
- Use `-i` or `-I` for sensitive areas.
- You can alias `rm` to be safer:

```bash
alias rm='rm -i'
```

---

## 📁 How It Works in Git Bash (Windows)

- Fully supports `rm`, `-r`, `-f`, etc.
- You can run all examples from Git Bash on Windows.
- Deletion is **permanent** even in Git Bash (no Recycle Bin).

---

## 🔍 See All Options

```bash
man rm    # Linux/macOS
```

OR

```bash
rm --help  # Works everywhere, including Git Bash
```

---

## 🧠 Summary Table

| Goal                       | Command               |
| -------------------------- | --------------------- |
| Delete file                | `rm file.txt`         |
| Delete folder              | `rm -r folder/`       |
| Force delete folder        | `rm -rf folder/`      |
| Show what’s deleted        | `rm -rv folder/`      |
| Safe prompt before delete  | `rm -i important.txt` |
| Can combine multiple flags | `rm -riv /*`          |
