# Person, Scientist, and Doctor Information App (CMD-Based Java Program)

This Java console application collects personal details from the user and determines whether the person is a **Scientist** or a **Doctor**. Based on the input, the program categorizes the profession (e.g., Physicist, Resident) and displays personalized descriptions.

## 🖥️ About the Program

- Written in Java
- Command-line (CMD/Terminal) based
- Interactive: prompts the user for input
- Demonstrates **inheritance**, **conditionals**, and **user input handling** in Java

## 🚀 How It Works

1. The program prompts the user to enter:
   - Height
   - Age status (whether the person is 18 or older)
   - Hair colour
   - Lab coat colour (for Scientist)
   - Years of experience (for Doctor)

2. It then:
   - Identifies the type of **Scientist** based on lab coat colour
   - Determines the **Doctor's ranking** based on years of experience
   - Displays formatted information and a short description for each

## 🧪 Supported Scientist Types

| Lab Coat Colour | Scientist Type   |
|-----------------|------------------|
| Green           | Biologist        |
| Purple          | Physicist        |
| White           | Pharmacist       |
| Blue            | Climatologist    |
| Yellow          | Geneticist       |
| Red             | Zoologist        |
| *Other*         | Unknown Scientist|

## 🩺 Doctor Rankings

| Years of Experience | Ranking          |
|---------------------|------------------|
| 0 - 6               | Medical Student  |
| 7 - 8               | Intern           |
| 9 - 16              | Resident         |
| 17 - 20             | Fellow           |
| 21+                 | Attending        |
| Invalid input       | Unknown Ranking  |

## ✅ Requirements

- Java Development Kit (JDK) 8 or later
- A terminal or command prompt

## 🛠️ How to Run

1. **Compile the code**  
   Open terminal/CMD and run:
```
javac Main.java
```

3. **Run the program**
```
java Main
```

## 📁 Files

- `Main.java` — Main class containing program logic
- `README.md` — This file

## 🧠 Concepts Demonstrated

- Class Inheritance
- Switch statements with `toLowerCase()`
- Conditional logic (`if-else`)
- User input with `Scanner`
- String formatting and output

---

Made with ☕, logic, and way too many lab coats.
