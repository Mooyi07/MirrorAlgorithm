# 🔄 Mirror Alphabet Converter (Java)

This is a simple Java program that takes an input string or reads from a text file and outputs its **mirrored version** of the alphabet.

## ✨ Features
- Converts **uppercase letters** to their mirrored counterparts  
  - Example: `A → Z`, `B → Y`, `C → X`, etc.  
- Converts **lowercase letters** to uppercase before mirroring  
  - Example: `a → Z`, `b → Y`, `c → X`  
- Keeps **numbers, spaces, and symbols unchanged**  
- Can **read multiple lines from a text file (`inputs.txt`)** and mirror each line

## 📌 Example
```
Input (from inputs.txt):
WRXG
JAVA
237WGASG
xlwv123

Output:
Input string: WRXG
Mirrored string: DICT

Input string: JAVA
Mirrored string: QZEV

Input string: 237WGASG
Mirrored string: 237DTZHT

Input string: xlwv123
Mirrored string: CDOE123
```

## 🛠️ How to Run
1. Clone this repository or copy the code.
2. Compile the Java file:
   ```bash
   javac Main.java
   ```
3. Run the program:
   ```bash
   java Main
   ```
4. Prepare an `inputs.txt` file in the same directory with the text you want mirrored.

## 📂 File Structure
```
.
├── Main.java     # Source code
├── inputs.txt    # Sample input file
└── README.md     # Project documentation
```

## 🏷️ Tags
`java`, `string-manipulation`, `beginner-project`, `alphabet`, `mirror`, `text-processing`, `console-app`

## 📜 License
This project is open-source and free to use.
