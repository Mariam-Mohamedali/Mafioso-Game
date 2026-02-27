# 🕵️‍♀️ Mafioso Game

A console-based detective game built with Java, where you investigate criminal cases, interrogate suspects, and try to catch the criminal before they escape!

---

## 📖 About the Game

In **Mafioso Game**, you play as a detective presented with real criminal cases. Your job is to study each suspect's motive and alibi, then make your accusation. Choose wisely — the criminal is watching! 🚨

---

## 🎮 How to Play

1. Launch the game and choose a case from the main menu
2. View the list of suspects
3. Interrogate each suspect to learn their **motive** and **alibi**
4. When you're ready, accuse who you think is the criminal
5. Find out if you solved the case — or let the criminal escape!

---

## 🗂️ Cases Available

| # | Case | Description |
|---|------|-------------|
| 1 | 🔪 Murder at the Mansion | A wealthy businessman was found dead in his mansion |
| 2 | 💎 Diamond Theft | A rare diamond was stolen from the museum |

---

## 📁 Project Structure

```
Mafioso-Game/
│
├── Crime.java        # Contains the Suspect and Crime classes (data model)
└── CrimeGame.java    # Contains the main game logic and investigateCrime() method
```

---

## 🧱 Classes Overview

### `Suspect`
Represents a suspect in a case.

| Field | Type | Description |
|-------|------|-------------|
| `name` | String | Suspect's name |
| `motive` | String | Why they might have done it |
| `alibi` | String | Their alibi at the time |
| `isGuilty` | boolean | Whether they are the criminal |

**Method:** `interrogate()` — prints the suspect's name, motive, and alibi.

---

### `Crime`
Represents a criminal case.

| Field | Type | Description |
|-------|------|-------------|
| `title` | String | Name of the case |
| `description` | String | Brief description of what happened |
| `suspects` | Suspect[] | Array of suspects in this case |

**Methods:**
- `showDetails()` — prints the case title and description
- `showSuspects()` — lists all suspects by number

---

### `CrimeGame`
Contains the main game loop and investigation logic.

**Methods:**
- `main()` — sets up all cases and runs the main menu loop
- `investigateCrime(Crime, Scanner)` — handles the investigation sub-menu for a given case

---

## ▶️ How to Run

**Requirements:** Java JDK 8 or higher

```bash
# 1. Compile the files
javac Crime.java CrimeGame.java

# 2. Run the game
java CrimeGame
```

---

## 🖥️ Game Preview

```
=== Welcome to Mafioso Game 🕵️‍♀️ ===
Choose a Case :
1- Murder
2- Theft
3- Exit

> 1

=== Murder at the Mansion ===
A wealthy businessman was found dead in his mansion.

1- View Suspects
2- View Clues
3- Choose the criminal
4- Back

> 2
Choose suspect number: 1
Name: Sarah
Motive: Wants to inherit the fortune
Alibi: She was sleeping

> 3
Who is the criminal? 1
Correct! You solved the case 🕵️‍♀️
```

---

## 👩‍💻 Author

Made with ☕ and Java ,
by Mariam Mohamed.
