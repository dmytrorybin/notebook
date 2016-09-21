package ua.epam;

import ua.epam.Entities.NoteRecord;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Dmytro_Rybin on 9/20/2016.
 */
public class Model {

    NoteRecord noteRecord;

    public Model() {
        noteRecord = new NoteRecord();
    }



    public void setNoteRecordName(String name) {
        noteRecord.setName(name);
    }
    public void setNoteRecordSecondName(String name) {
        noteRecord.setSecondName(name);
    }
    public void setNoteRecordThirdName(String name) {
        noteRecord.setThirdName(name);
    }
    public void setNoteRecordNickname(String nickname) {
        noteRecord.setNickname(nickname);
    }
    public void setNoteRecordComment(String comment) {
        noteRecord.setComment(comment);
    }
    public void setNoteRecordGroup(String group) {
        noteRecord.setGroup(group);
    }
    public void setNoteRecordHomeTel(String home) {
        noteRecord.setHomeTel(home);
    }
    public void setNoteRecordCellTel1(String cell1) {
        noteRecord.setCellTel1(cell1);
    }
    public void setNoteRecordCellTel2(String cell2) {
        noteRecord.setCellTel1(cell2);
    }
    public void setNoteRecordSkype(String skype) {
        noteRecord.setSkype(skype);
    }
    public void setNoteRecordEmail(String email) {
        noteRecord.setEmail(email);
    }
    public void setNoteRecordAddress(ArrayList<String> addres) {
        noteRecord.setAddress(addres);
    }
    public void setNoteRecordCreationDate(String date) {
        noteRecord.setCreationDate(date);
    }
    public void setNoteRecordLastChangesDate(String date) {
        noteRecord.setLastChangesDate(date);
    }
}
