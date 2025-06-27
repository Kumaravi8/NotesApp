package com.mainapp;

import com.notesapp.controller.NoteController;
import java.util.Scanner;

public class Launch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NoteController controller = new NoteController();
        int choice;

        do {
            System.out.println("\n=== Notes App ===");
            System.out.println("1. Write a new note");
            System.out.println("2. View all notes");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            try {
                choice = Integer.parseInt(scanner.nextLine());

                switch (choice) {
                    case 1 : {
                        System.out.println("Enter your note (type 'exit' to save):");
                        StringBuilder content = new StringBuilder();
                        String line;
                        while (!(line = scanner.nextLine()).equalsIgnoreCase("exit")) {
                            content.append(line).append(System.lineSeparator());
                        }
                        controller.addNote(content.toString());
                        break;
                    }
                    case 2 :{
                    	controller.showAllNotes();
                    	break;
                    }
                    case 3 :{
                    	System.out.println(" Thank You!! Exiting...");
                    	break;
                    }
                    default : {
                    	System.out.println("Invalid choice!");
                    	break;
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
                choice = -1;
            }
        } while (choice != 3);

        scanner.close();
    }
}

