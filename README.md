# 🎮 Number Guessing Game — Java

**DecodeLabs Java Internship | Project 1 | Batch 2026**

---

## 📌 About the Project

A console-based Number Guessing Game built in Java.  
The program generates a **random number between 1 and 100** and challenges the user to guess it.  
After every guess, the program gives instant feedback — **Too High** or **Too Low** — until the correct number is found.

---

## ✨ Features

- 🎲 Random number generation using `java.util.Random`
- ⌨️ Real-time user input using `java.util.Scanner`
- 📢 Instant High/Low feedback after every guess
- 🏆 Attempt counter — tracks how many guesses taken
- ⚠️ Attempt limit — Game Over after 10 wrong guesses
- 🔄 Loop continues until correct number is guessed

---

## 🛠️ Tech Stack

| Technology | Usage |
|------------|-------|
| Java | Core programming language |
| java.util.Random | Random number generation |
| java.util.Scanner | User input handling |
| While Loop | Game loop logic |
| If-Else | High/Low feedback logic |

---

## 🧠 Key Concepts Used

- `Random` class — `nextInt(100) + 1` for 1-100 range
- `Scanner` class — taking real-time user input
- `while` loop — runs until correct guess
- `if-else if-else` — comparing guess with target
- Attempt counter using `attempts++`
- Game Over condition using `attempts < 10`

---

## 🚀 How to Run

**Step 1 — Clone the repository**
```bash
git clone https://github.com/aniketwebdev1/DecodeLabs--internship
```

**Step 2 — Compile the Java file**
```bash
javac DecodeLabs_Java_P1.java
```

**Step 3 — Run the program**
```bash
java DecodeLabs_Java_P1
```

---

## 🎯 How to Play

```
Number Guessing Game!
10 chances hain — 1 se 100 ke beech guess karo:

> 50
Too High! 9 chances bache!

> 25
Too Low! 8 chances bache!

> 37
Correct! 3 attempts mein guess kiya!
```

---

## 📁 Project Structure

```
DecodeLabs--internship/
│
└── DecodeLabs_Java_P1.java    # Main Java file
└── README.md                  # Project documentation
```

---

## 👨‍💻 Author

**Aniket Chaudhary**  
Java Programming Intern — Decode Labs Batch 2026  
GitHub: [github.com/aniketwebdev1](https://github.com/aniketwebdev1) 

---

## 📜 License

This project is part of the **DecodeLabs Industrial Training Program 2026.**
