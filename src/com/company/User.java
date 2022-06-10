package com.company;
public abstract class User implements RecordOperations {
private String Name;
private String Gender;
private int CNIC;
private int Age;
static String Hospital="CMH";

User(String Name, String Gender, int CNIC, int Age){
    setName(Name);
    setGender(Gender);
    setCNIC(CNIC);
    setAge(Age);
}



    public void showRecord(){
    System.out.println(getName());
    System.out.println(getGender());
    System.out.println(getCNIC());
    System.out.println(getAge());
    System.out.println(getHospital());
}

public abstract void accountInfo();


    @Override
    public String toString() {
        return
                "Name='" + Name + '\'' +
                ", Gender='" + Gender + '\'' +
                ", CNIC=" + CNIC +
                ", Age=" + Age ;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public int getCNIC() {
        return CNIC;
    }

    public void setCNIC(int CNIC) {
        this.CNIC = CNIC;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public static String getHospital() {
        return Hospital;
    }

}
