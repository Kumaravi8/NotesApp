package com.notesapp.service;

import com.notesapp.dto.NoteDTO;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class NoteService {
    private static final String FILE_PATH = "D:\\Java Notes App\\data\\notes.txt";

    public void saveNote(NoteDTO note) throws IOException {
    	File file=new File(FILE_PATH);
    	 System.out.println("File Saved At :"+file.getAbsolutePath());
        try (FileWriter writer = new FileWriter(FILE_PATH, true)) {
            writer.write(note.getContent() + System.lineSeparator());
           
            writer.write("---------------------------\n");
        }
    }

    public List<String> readAllNotes() throws IOException {
        List<String> notes = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                notes.add(line);
            }
        }
        return notes;
    }
}
