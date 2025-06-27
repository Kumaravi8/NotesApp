package com.notesapp.controller;

import com.notesapp.dto.NoteDTO;
import com.notesapp.service.NoteService;

import java.io.IOException;
import java.util.List;

public class NoteController {
    private final NoteService noteService;

    public NoteController() {
        this.noteService = new NoteService();
    }

    public void addNote(String content) {
        NoteDTO note = new NoteDTO(content);
        try {
            noteService.saveNote(note);
            System.out.println("✅ Note saved successfully.");
        } catch (IOException e) {
            System.out.println("❌ Error saving note: " + e.getMessage());
        }
    }

    public void showAllNotes() {
        try {
            List<String> notes = noteService.readAllNotes();
            if (notes.isEmpty()) {
                System.out.println("📭 No notes found.");
            } else {
                notes.forEach(System.out::println);
            }
        } catch (IOException e) {
            System.out.println("❌ Error reading notes: " + e.getMessage());
        }
    }
}

