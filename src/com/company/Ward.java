package com.company;

import java.util.ArrayList;

public class Ward implements RecordOperations {
    private int Id;
    private String Type;
    private int Beds;
    static String Hospital="CMH";
    private ArrayList<Doctor> doctorsList = new ArrayList<>();
    private ArrayList<Patient> patientsList = new ArrayList<>();
    private Doctor doctor;
    private Patient patient;

    public Ward(int Id, String Type, int Beds) {
        setId(Id);
        setType(Type);
        setBeds(Beds);
    }
    public void showRecord(){
        System.out.println(getId());
        System.out.println(getType());
        System.out.println(getBeds());
        System.out.println(getHospital());
    }


    @Override
    public String toString() {
        return "Ward{" +
                "Id=" + Id +
                ", Type='" + Type + '\'' +
                ", Beds=" + Beds +
                '}';
    }

    public void  addPatient(int ID, String Disease, String Name, String Gender, int CNIC, int Age){
        patient = new Patient(ID,Disease,Name,Gender,CNIC,Age);
        patientsList.add(patient);
    }

    public void addDoctor(String Name, String Gender, int CNIC, int Age, int Id, int salary, String  Qualification, int Experience){
        doctor = new Doctor(Name,Gender,CNIC,Age,Id,salary,Qualification,Experience);
        doctorsList.add(doctor);
    }

    public void showPatients(){
        for (int i = 0; i < patientsList.size(); i++) {
            System.out.println("Record no"+(i+1));
            System.out.println(patientsList.get(i));
        }
    }

    public void showDoctors(){
        for (int i = 0; i < doctorsList.size(); i++) {
            System.out.println("Record no"+(i+1));
            System.out.println(doctorsList.get(i));
        }

    }



    public int getId() {
        return Id;
    }
    public void setId(int id) {
        Id = id;
    }
    public String getType() {
        return Type;
    }
    public void setType(String type) {
        Type = type;
    }
    public int getBeds() {
        return Beds;
    }
    public void setBeds(int beds) {
        Beds = beds;
    }
    public static String getHospital() {
        return Hospital;
    }
}
