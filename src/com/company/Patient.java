package com.company;

import java.util.ArrayList;

public class Patient extends User {
    private int ID;
    private String Disease;
    private int expanses;


    Patient( int ID, String Disease, String Name, String Gender, int CNIC, int Age) {
        super(Name, Gender, CNIC, Age);
        setID(ID);
        setDisease(Disease);
    }
    @Override
    public void showRecord() {
        super.showRecord();
        System.out.println(getID());
        System.out.println(getDisease());
    }

    @Override
    public void accountInfo() {
        if(Disease.equals("corona")){
            setExpanses(10000);
        }
        else if (Disease.equals("cancer")) {
            setExpanses(50000);
        }
        System.out.println("Expenses: "+ getExpanses());
    }

    @Override
    public String toString() {
        return "Patient{" +super.toString()+
                ", ID=" + ID +
                ", Disease='" + Disease + '\'' +
                "} " ;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getDisease() {
        return Disease;
    }

    public void setDisease(String Disease) {
        this.Disease = Disease;
    }

    public int getExpanses() {
        return expanses;
    }

    public void setExpanses(int expanses) {
        this.expanses = expanses;
    }
}
