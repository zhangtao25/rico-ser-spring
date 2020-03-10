package com.rico.ser.form;

import lombok.Data;

@Data
public class NoteForm {
    private String noteType;
    private String noteTitle;
    private String noteDescription;
    private String noteContent;
    private String imageUrl;
}
