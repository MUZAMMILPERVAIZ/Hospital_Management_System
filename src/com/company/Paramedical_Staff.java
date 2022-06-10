package com.company;

public class Paramedical_Staff extends User {
    private int Id;
    private int Salary;
    private String Qualification;
    private int Experience;

    Paramedical_Staff(int Id, int Experience, String Qualification, int Salary, String Name, String Gender, int Age, int CNIC) {
        super(Name, Gender, CNIC, Age);
        setId(Id);
        setSalary(Salary);
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
        return "Paramedical_Staff{"
                + super.toString()+
                ", Id=" + Id +
                ", Salary=" + Salary +
                ", Qualification='" + Qualification + '\'' +
                ", Experience=" + Experience +
                "} " ;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }

    public String getQualification() {
        return Qualification;
    }

    public void setQualification(String qualification) {
        Qualification = qualification;
    }

    public int getExperience() {
        return Experience;
    }

    public void setExperience(int experience) {
        Experience = experience;
    }
}

//    public int salarayCal(){
//        if(this.Qualification.equals("BS") || this.Qualification.equals("bs")){
//            Salary=10000;
//        }
//        else if(this.Qualification.equals("MS") || this.Qualification.equals("ms")){
//            Salary=20000;
//        }
//        return Salary+(Experience*100);
//    }
