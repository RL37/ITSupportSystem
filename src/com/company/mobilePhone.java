package com.company;

public class mobilePhone extends Device{
    private String phoneMake;

    public mobilePhone(String identificationCode, String makeAndModel, String owner, String problemDescription, String repairNotes, int priority) {
        super(identificationCode, makeAndModel, owner, problemDescription, repairNotes, priority);
    }
}
