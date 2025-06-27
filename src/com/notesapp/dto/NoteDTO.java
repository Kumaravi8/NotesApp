package com.notesapp.dto;

public class NoteDTO {
    private String content;

    public NoteDTO() {}

    public NoteDTO(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}

