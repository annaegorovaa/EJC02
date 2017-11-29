package com.epam.operators.task6;

public class Notepad {
    private NotepadRecord[] records;

    public Notepad() {
        records = new NotepadRecord[0];
    }

    public void addNewRecord(String record) {
        NotepadRecord[] tempArray = new NotepadRecord[records.length + 1];
        System.arraycopy(records, 0, tempArray, 0, records.length);
        tempArray[tempArray.length - 1] = new NotepadRecord(record);
        records = tempArray;
    }

    public void removeRecord(int index) {
        if (index >= records.length) {
            System.out.println("There is no such record");
            return;
        }
        NotepadRecord[] tempArray = new NotepadRecord[records.length - 1];
        System.arraycopy(records, 0, tempArray, 0, index);
        System.arraycopy(records, index + 1, tempArray, index, tempArray.length - index);
        records = tempArray;
    }

    public void removeRecord(String record) {
        for (int i = 0; i < records.length; i++) {
            if (record.equals(records[i].getRecord())) {
                this.removeRecord(i);
                return;
            }
        }
        System.out.println("There is no such record");
    }

    public void editRecord(int index, String newRecord) {
        if (index >= records.length) {
            System.out.println("There is no such record");
            return;
        }
        records[index].setRecord(newRecord);
    }

    public void editRecord(String oldRecord, String newRecord) {
        for (int i = 0; i < records.length; i++) {
            if (oldRecord.equals(records[i].getRecord())) {
                this.editRecord(i, newRecord);
                return;
            }
        }
        System.out.println("There is no such record");
    }

    public void showRecords() {
        if (records.length == 0) {
            System.out.println("There is no records");
        } else {
            for (int i = 0; i < records.length; i++) {
                System.out.println(records[i].showRecord());
            }
            System.out.println("\n");
        }
    }
}
