package com.company;
public class Receptionist extends User{
    private int Id;
    private int salary;

    Receptionist(String Name, String Gender, int CNIC, int Age,  int id, int salary) {
        super(Name, Gender, CNIC, Age);
        setId(Id);
        setSalary(salary);
    }
    @Override
    public void showRecord() {
        super.showRecord();
        System.out.println(getId());
        System.out.println(getSalary());
    }

    @Override
    public void accountInfo() {
        System.out.println("Salary: "+getSalary());
    }

    @Override
    public String toString() {
        return "Receptionist{" + super.toString()+
                ", Id=" + Id +
                ", salary=" + salary +
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
}
