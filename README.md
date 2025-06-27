# 📝 Notes Manager Application – Internship Task 4

This is a **Java-based console (CLI) application** created as part of the **Java Developer Internship at Elevate Lab**.  
It allows users to **write** and **view** text-based notes using **Java File I/O**, while demonstrating proper exception handling and modular OOP structure.

---

## 🏢 Internship Info

> 🔧 **Internship Task 4**  
> 📍 **Elevate Lab** – Skill-Based Java Training Program  
> 🧑‍💻 Author: **Abhishek Kumar**  
> 🎓 BCA Final Year, Oxford Business College (2025)
## 📁 Project Structure


NotesApp/
├── notes.txt                      
└── src/
    ├── com/
        ├── mainapp/
        │   └── Launch.java         
        ├── notesapp/
            ├── controller/
            │   └── NoteController.java  
            ├── dto/
            │   └── NoteDTO.java         
            └── service/
                └── NoteService.java     


## 🔧 Technologies Used

- Java  
- File I/O (`FileWriter`, `FileReader`, `BufferedReader`)  
- `try-with-resources` for exception handling  
- Scanner for CLI interaction  
- Multi-class, multi-package OOP design  
- Git & GitHub for version control

---

## 🚀 Features

- 📝 Write multi-line notes and save to file (`notes.txt`)
- 📖 View all saved notes in a readable format
- ✅ Uses `FileWriter` in append mode to avoid overwriting
- 🛡️ Exception handling for all file operations
- 📦 Clean code with proper Java packaging and modular classes

---

## ▶️ How to Run

1. Clone or download this project from GitHub.
2. Open in Eclipse / IntelliJ / VS Code.
3. Create the following packages:
   - `com.notesapp.dto`
   - `com.notesapp.service`
   - `com.notesapp.controller`
   - `com.notesapp.launcher`
4. Paste the `.java` files into their respective packages.
5. Compile and run the `AppLauncher.java` file.

### 🔨 Manual Compile & Run (Terminal):
```bash
javac -d out src/com/notesapp/**/*.java
java -cp out com.notesapp.launcher.AppLauncher
💡 Sample Output
mathematica
Copy
Edit
=== Notes App ===
1. Write a new note
2. View all notes
3. Exit
Enter your choice: 1

Enter your note (type 'exit' to save):
Hi! This is Abhishek.
exit
✅ Note saved successfully.

Enter your choice: 2
=== Saved Notes ===
Hi! This is Abhishek.

---------------------------
🧠 Java Concepts Used
Concept	Implementation Example
File I/O	FileWriter, BufferedReader, FileReader
Exception Handling	try-with-resources, IOException
Encapsulation	NoteDTO with private fields and accessors
Separation of Concerns	Controller → Service → DTO structure
Modular Design	Code is split into DTO, Service, Controller, Launcher
👨‍💻 Author
Abhishek Kumar
BCA Final Year | Oxford Business College
Internship Project | Java Developer – Elevate Lab (2025)
![image](https://github.com/user-attachments/assets/6207a0ac-2007-4e50-9862-b7b27aa4e246)
![image](https://github.com/user-attachments/assets/d5181a4d-25f3-472a-ad63-c1b8ad5c669d)
