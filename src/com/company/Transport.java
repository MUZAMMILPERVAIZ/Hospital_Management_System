package com.company;
public class Transport implements RecordOperations{
    private int Id;
    private String Name;
    private int Model;
    private int service;
    static String Hospital="CMH";
    private Driver driver;
    public Transport(int Id, String Name, int Model, int service,String driverName, String driverGender, int driverCNIC, int driverAge, int driverId, int driverSalary, int driverExperience) {
       setId(Id);
       setName(Name);
       setModel(Model);
       setService(service);
       driver= new Driver(driverName,driverGender,driverCNIC,driverAge,driverId,driverSalary,driverExperience);
    }
    public void showRecord(){
        System.out.println(getId());
        System.out.println(getName());
        System.out.println(getModel());
        System.out.println(getService());
        System.out.println(getHospital());
    }

    public Driver getDriver() {
        return driver;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                ", Model=" + Model +
                ", service=" + service +
                '}';
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getModel() {
        return Model;
    }

    public void setModel(int model) {
        Model = model;
    }

    public int getService() {
        return service;
    }

    public void setService(int service) {
        this.service = service;
    }

    public static String getHospital() {
        return Hospital;
    }


}
