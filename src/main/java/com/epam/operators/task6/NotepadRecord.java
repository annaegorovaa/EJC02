package com.epam.operators.task6;

import java.time.LocalDateTime;

public class NotepadRecord {
    private String record;
    private LocalDateTime dateOfCreation;

    public NotepadRecord(String record) {
        this.record = record;
        dateOfCreation = LocalDateTime.now();
    }

    public String getRecord() {
        return record;
    }

    public void setRecord(String record) {
        this.record = record;
    }

    public String showRecord() {
        return record + " :\t" + dateOfCreation;
    }
}
