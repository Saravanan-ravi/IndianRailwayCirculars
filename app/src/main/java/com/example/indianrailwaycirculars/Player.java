package com.example.indianrailwaycirculars;

import android.support.v7.app.AppCompatActivity;

public class Player {

    private String cNum;
    private String cSubject;
    private String cDate;
    private String cLink;

    public String getcNum() {
        return cNum;
    }

    public void setcNum(String cNum) {
        this.cNum = cNum;
    }

    public String getcSubject() {
        return cSubject;
    }

    public void setcSubject(String cSubject) {
        this.cSubject = cSubject;
    }

    public String getcDate() {
        return cDate;
    }

    public void setcDate(String cDate) {
        this.cDate = cDate;
    }

    public String getcLink() {
        return cLink;
    }

    public void setcLink(String cLink) {
        this.cLink = cLink;
    }
}
