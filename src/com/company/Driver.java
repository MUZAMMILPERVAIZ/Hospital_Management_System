package com.company;
public class Driver extends User{
   private int Id;
   private int salary;
   private int Experience;
    Driver(String Name, String Gender, int CNIC, int Age, int id, int salary, int Experience) {
        super(Name, Gender, CNIC, Age);
        setId(Id);
        setSalary(salary);
        setExperience(Experience);
    }
    @Override
    public void showRecord() {
        super.showRecord();
        System.out.println(getId());
        System.out.println(getSalary());
        System.out.println(getExperience());
    }

    @Override
    public void accountInfo() {
        System.out.println("Salary: "+getSalary());
    }


    @Override
    public String toString() {
        return "Driver{"
                + super.toString()+
                ", Id=" + Id +
                ", salary=" + salary +
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
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getExperience() {
        return Experience;
    }

    public void setExperience(int experience) {
        Experience = experience;
    }
}
