package ua.epam.Entities;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Dmytro_Rybin on 9/20/2016.
 */
public class NoteRecord {
    private String name;
    private String secondName;
    private String thirdName;
    private String nickname;
    private String comment;
    private String group;
    private String homeTel;
    private String cellTel1;
    private String cellTel2;
    private String email;
    private String skype;
    private ArrayList<String> address;

    private String creationDate;
    private String lastChangesDate;
//    private Date creationDate;
//    private Date lastChangesDate;

    public String getName() {
        return name;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getThirdName() {
        return thirdName;
    }

    public String getNickname() {
        return nickname;
    }

    public String getComment() {
        return comment;
    }

    public String getGroup() {
        return group;
    }

    public String getHomeTel() {
        return homeTel;
    }

    public String getCellTel1() {
        return cellTel1;
    }

    public String getCellTel2() {
        return cellTel2;
    }

    public String getEmail() {
        return email;
    }

    public String getSkype() {
        return skype;
    }

    public ArrayList<String> getAddress() {
        return address;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public String getLastChangesDate() {
        return lastChangesDate;
    }

//    public Date getCreationDate() {
//        return creationDate;
//    }
//
//    public Date getLastChangesDate() {
//        return lastChangesDate;
//    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setThirdName(String thirdName) {
        this.thirdName = thirdName;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setHomeTel(String homeTel) {
        this.homeTel = homeTel;
    }

    public void setCellTel1(String cellTel1) {
        this.cellTel1 = cellTel1;
    }

    public void setCellTel2(String cellTel2) {
        this.cellTel2 = cellTel2;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSkype(String skype) {
        this.skype = skype;
    }

    public void setAddress(ArrayList<String> address) {
        this.address = address;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public void setLastChangesDate(String lastChangesDate) {
        this.lastChangesDate = lastChangesDate;
    }

//    public void setCreationDate(Date creationDate) {
//        this.creationDate = creationDate;
//    }
//
//    public void setLastChangesDate(Date lastChangesDate) {
//        this.lastChangesDate = lastChangesDate;
//    }

    @Override
    public String toString() {
        return "NoteRecord{" +
                "name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                ", thirdName='" + thirdName + '\'' +
                ", nickname='" + nickname + '\'' +
                ", comment='" + comment + '\'' +
                ", group='" + group + '\'' +
                ", homeTel='" + homeTel + '\'' +
                ", cellTel1='" + cellTel1 + '\'' +
                ", cellTel2='" + cellTel2 + '\'' +
                ", email='" + email + '\'' +
                ", skype='" + skype + '\'' +
                ", address=" + address +
                ", creationDate=" + creationDate +
                ", lastChangesDate=" + lastChangesDate +
                '}';
    }
}
