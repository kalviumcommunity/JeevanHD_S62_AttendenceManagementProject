# WC Command Documentation

## What `wc` does

`wc` is a Unix/Linux command that counts lines, words, and characters in text files.

## Basic Syntax

```bash
wc [options] [file(s)]
```

## How it works internally

### 1. **Line Counting (-l)**

- Counts newline characters (`\n`)
- Each `\n` represents the end of a line
- Empty lines are counted too

### 2. **Word Counting (-w)**

- Defines a "word" as any sequence of non-whitespace characters
- Separators include spaces, tabs, newlines
- Uses regex pattern similar to `\S+` (non-whitespace sequences)
- Example "hello world" = 2 words, "hello-world" = 1 word

### 3. **Character Counting (-c or -m)**

- `-c` Counts bytes (each ASCII character = 1 byte)
- `-m` Counts actual characters (handles Unicode properly)
- Includes all characters letters, numbers, spaces, punctuation, newlines

## Default Output Format

```txt
[lines] [words] [characters] [filename]
```

## Common Options

- `-l` Only count lines
- `-w` Only count words
- `-c` Only count bytes/characters
- `-m` Count characters (Unicode-aware)

## Word Detection Algorithm

1. Read file character by character
2. Skip whitespace (spaces, tabs, newlines)
3. When non-whitespace found, start counting a word
4. Continue until next whitespace - that's one complete word
5. Repeat until end of file

## Example of how it processes text

```txt
Text "Hello    world!\nHow are you?"
```

- **Lines** 2 (one `\n` found, plus implicit end)
- **Words** 5 ("Hello", "world!", "How", "are", "you?")
- **Characters** 23 (including spaces and newline)

The algorithm is essentially a simple state machine that toggles between "in word" and "between words" states based on whitespace detection.

## Additional Examples

### Basic Usage

```bash
# Count everything
wc filename.txt

# Count only words
wc -w filename.txt

# Count only lines
wc -l filename.txt

# Count multiple files
wc *.txt
```

### Output Examples

```bash
$ wc example.txt
  15  150  890 example.txt
  # 15 lines, 150 words, 890 characters

$ wc -w example.txt
  150 example.txt
  # Only word count
```
