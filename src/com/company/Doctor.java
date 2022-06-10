package com.company;

import java.util.ArrayList;

public class Doctor extends User{
   private int Id;
   private int salary;
   private String Qualification;
   private int Experience;


    Doctor(String Name, String Gender, int CNIC, int Age, int Id, int salary, String  Qualification, int Experience) {
        super(Name, Gender, CNIC, Age);
        setId(Id);
        setSalary(salary);
        setQualification(Qualification);
        setExperience(Experience);

    }



    @Override
    public void showRecord() {
        super.showRecord();
        System.out.println(getId());
        System.out.println(getSalary());
        System.out.println(getQualification());
        System.out.println(getExperience());
    }

    @Override
    public void accountInfo() {
        System.out.println("Salary: "+getSalary());
    }


    @Override
    public String toString() {
        return "Doctor{" +
                "Id=" + Id +
                ", salary=" + salary +
                ", Qualification='" + Qualification + '\'' +
                ", Experience=" + Experience +
                  super.toString()+" } ";
    }


    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getQualification() {
        return Qualification;
    }

    public void setQualification(String Qualification) {
        this.Qualification = Qualification;
    }

    public int getExperience() {
        return Experience;
    }

    public void setExperience(int Experience) {
        this.Experience = Experience;
    }
}
