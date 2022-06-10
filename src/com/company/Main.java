// Hospital_Management_System
package com.company;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
        System.out.println("\n\n\t\t\t\t\t\t\t"+calendar.getTime());
        System.out.println();
        System.out.println("\t\t\t\t\t\t\tHOSPITAL MANAGEMENT SYSTEM");

        int  loopCounter = 1;
        int id=0,exp=0, age=0, salary=0, CNIC=0, recordsLimit=0;
        String name =null, qualf=null, gender=null;


        while (loopCounter != 0) {
            System.out.println();
            System.out.println("Enter a number: ");
            System.out.println("0) To Quit ");
            System.out.println("1) For adding Doctor ");
            System.out.println("2) For adding Patient ");
            System.out.println("3) For adding Staff ");
            System.out.println("4) For adding Driver ");
            System.out.println("5) For adding Receptionist ");
            System.out.println("6) For adding Transport ");
            System.out.println("7) For adding Wards ");


            loopCounter = new Scanner(System.in).nextInt();
            switch (loopCounter) {
 //---------------------------DOCTOR MODULE----------------------------------
                case 1:
                    System.out.println("How many record you want to enter:");
                    int recordslength = new Scanner(System.in).nextInt();
                    ArrayList<Doctor> doctors = new ArrayList<>();
                    for (int i = 0; i < recordslength; i++) {
                        System.out.println("record no"+(i+1));
                        loopCounter=90; // some other no than 0 and 8
                        while (loopCounter != 8) {
                            System.out.println("Enter 1 for adding doctor record");
                            System.out.println("Enter 2 for showing doctor record");
                            System.out.println("Enter 3 for showing doctor account info");
                            System.out.println("Enter 8 to quit");
                            loopCounter = new Scanner(System.in).nextInt();
                            switch (loopCounter) {
                                case 1:
                                    System.out.println("---------Enter Record No "+(i+1)+"---------");
                                    System.out.println("Enter the Id of Doctor");
                                    id= new Scanner(System.in).nextInt();
                                    System.out.println("Enter the Name of Doctor");
                                    name=new Scanner(System.in).nextLine();
                                    System.out.println("Enter the Qualification of Doctor");
                                    qualf=new Scanner(System.in).nextLine();
                                    System.out.println("Enter the Gender of Doctor");
                                    gender=new Scanner(System.in).nextLine();
                                    System.out.println("Enter the Age of Doctor");
                                    age=new Scanner(System.in).nextInt();
                                    System.out.println("Enter the Experience of Doctor");
                                    exp=new Scanner(System.in).nextInt();
                                    System.out.println("Enter the salary of Doctor");
                                    salary=new Scanner(System.in).nextInt();
                                    System.out.println("Enter the CNIC of Doctor");
                                    CNIC=new Scanner(System.in).nextInt();
                                    User admin = new Doctor(name, gender,CNIC,age,id,salary,qualf,exp);
                                    doctors.add(i,(Doctor) admin);
                                    break;
                                case 2:
                                    System.out.println("---------Record No "+(i+1)+"---------");
                                    doctors.get(i).showRecord();

                                    break;
                                case 3:
                                    System.out.println("---------Record No "+(i+1)+"---------");
                                    doctors.get(i).accountInfo();

                                    break;


                            }

                        }


                        System.out.println();
                    }

                    break;
 //------------------PATIENT MODULE----------------------------------
                case 2:
                    String Disease;
                    System.out.println("How many record you want to enter:");
                    recordslength = new Scanner(System.in).nextInt();
                    ArrayList<Patient> patients = new ArrayList<>();
                    for (int i = 0; i < recordslength; i++) {
                        System.out.println("record no"+(i+1));
                        loopCounter=90; // some other no than 0 and 8
                        while (loopCounter != 8) {
                            System.out.println("Enter 1 for adding patient record");
                            System.out.println("Enter 2 for showing patient record");
                            System.out.println("Enter 3 for showing patient account info");
                            System.out.println("Enter 8 to quit");
                            loopCounter = new Scanner(System.in).nextInt();
                            switch (loopCounter) {
                                case 1:
                                    System.out.println("---------Enter Record No " + (i + 1) + "---------");
                                    System.out.println("enter id of patient");
                                    id = new Scanner(System.in).nextInt();
                                    System.out.println("enter name of patient");
                                    name = new Scanner(System.in).nextLine();
                                    System.out.println("enter disease of patient");
                                    Disease = new Scanner(System.in).nextLine();
                                    System.out.println("Enter the CNIC of patient");
                                    CNIC = new Scanner(System.in).nextInt();
                                    System.out.println("Enter the gender of patient");
                                    gender = new Scanner(System.in).nextLine();
                                    System.out.println("Enter the age of patient");
                                    age = new Scanner(System.in).nextInt();
                                    User admin = new Patient(id, Disease, name, gender, CNIC, age);
                                    patients.add(i,(Patient) admin);
                                    break;
                                case 2:
                                    System.out.println("---------Record No "+(i+1)+"---------");
                                    patients.get(i).showRecord();
                                    break;
                                case 3:
                                    System.out.println("---------Record No "+(i+1)+"---------");
                                    patients.get(i).accountInfo();
                                    break;

                            }

                        }
                        System.out.println();
                    }
                    break;

 //------------------PARAMEDICAL STAFF MODULE--------------------------------
                case 3:
                    System.out.println("How many record you want to enter:");
                    recordslength = new Scanner(System.in).nextInt();
                    ArrayList<Paramedical_Staff> staffs = new ArrayList<>();
                    for (int i = 0; i < recordslength; i++) {
                        System.out.println("record no"+(i+1));
                        loopCounter=90; // some other no than 0 and 8
                        while (loopCounter != 8) {
                            System.out.println("Enter 1 for adding staff record");
                            System.out.println("Enter 2 for showing staff record");
                            System.out.println("Enter 3 for showing staff account info");
                            System.out.println("Enter 8 to quit");
                            loopCounter = new Scanner(System.in).nextInt();
                            switch (loopCounter) {
                                case 1:
                                    System.out.println("---------Enter Record No " + (i + 1) + "---------");
                                    System.out.println("Enter the Staff_ID ");
                                    id = new Scanner(System.in).nextInt();
                                    System.out.println("Enter the Staff_Name ");
                                    name = new Scanner(System.in).nextLine();
                                    System.out.println("Enter the Staff_experience in years");
                                    exp = new Scanner(System.in).nextInt();
                                    System.out.println("Enter the Staff_Qualification ");
                                    qualf = new Scanner(System.in).nextLine();
                                    System.out.println("Enter the staff_CNIC");
                                    CNIC = new Scanner(System.in).nextInt();
                                    System.out.println("Enter the staff_gender");
                                    gender = new Scanner(System.in).nextLine();
                                    System.out.println("Enter the staff_age");
                                    age = new Scanner(System.in).nextInt();
                                    System.out.println("Enter the staff_salary");
                                    salary = new Scanner(System.in).nextInt();
                                    User admin = new Paramedical_Staff(id, exp, qualf, salary, name, gender, age, CNIC);
                                    staffs.add(i,(Paramedical_Staff) admin);
                                    break;
                                case 2:
                                    System.out.println("---------Record No "+(i+1)+"---------");
                                    staffs.get(i).showRecord();
                                    break;
                                case 3:
                                    System.out.println("---------Record No "+(i+1)+"---------");
                                    staffs.get(i).accountInfo();
                                    break;

                            }

                        }
                        System.out.println();
                    }
                    break;

//------------------DRIVER MODULE----------------------------------
                case 4:
                    System.out.println("How many record you want to enter:");
                    recordslength = new Scanner(System.in).nextInt();
                    ArrayList<Driver> drivers = new ArrayList<>();
                    for (int i = 0; i < recordslength; i++) {
                        System.out.println("record no"+(i+1));
                        loopCounter=90; // some other no than 0 and 8
                        while (loopCounter != 8) {
                            System.out.println("Enter 1 for adding driver record");
                            System.out.println("Enter 2 for showing driver record");
                            System.out.println("Enter 3 for showing driver record");
                            System.out.println("Enter 8 to quit");
                            loopCounter = new Scanner(System.in).nextInt();
                            switch (loopCounter) {
                                case 1:
                                    System.out.println("---------Enter Record No " + (i + 1) + "---------");
                                    System.out.println("Enter the Id of Driver");
                                    id = new Scanner(System.in).nextInt();
                                    System.out.println("Enter the Name of Driver");
                                    name = new Scanner(System.in).nextLine();
                                    System.out.println("Enter the Gender of Driver");
                                    gender = new Scanner(System.in).nextLine();
                                    System.out.println("Enter the Age of Driver");
                                    age = new Scanner(System.in).nextInt();
                                    System.out.println("Enter the Experience of Driver");
                                    exp = new Scanner(System.in).nextInt();
                                    System.out.println("Enter the salary of Driver");
                                    salary = new Scanner(System.in).nextInt();
                                    System.out.println("Enter the CNIC of Driver");
                                    CNIC = new Scanner(System.in).nextInt();
                                    User admin =new Driver(name, gender, CNIC, age, id, salary, exp);
                                    drivers.add(i,(Driver) admin);
                                    break;
                                case 2:
                                    System.out.println("---------Record No "+(i+1)+"---------");
                                    drivers.get(i).showRecord();
                                    break;
                                case 3:
                                    System.out.println("---------Record No "+(i+1)+"---------");
                                    drivers.get(i).accountInfo();
                                    break;

                            }

                        }
                        System.out.println();
                    }
                    break;
//------------------RECEPTIONIST MODULE----------------------------------
                case 5:
                    System.out.println("How many record you want to enter:");
                    recordslength = new Scanner(System.in).nextInt();
                    ArrayList<Receptionist> receptionists = new ArrayList<>();
                    for (int i = 0; i < recordslength; i++) {
                        System.out.println("record no"+(i+1));
                        loopCounter=90; // some other no than 0 and 8
                        while (loopCounter != 8) {
                            System.out.println("Enter 1 for adding receptionist record");
                            System.out.println("Enter 2 for showing receptionist record");
                            System.out.println("Enter 3 for showing receptionist account info");
                            System.out.println("Enter 8 to quit");
                            loopCounter = new Scanner(System.in).nextInt();
                            switch (loopCounter) {
                                case 1:
                                    System.out.println("---------Enter Record No " + (i + 1) + "---------");
                                    System.out.println("Enter the Id of Receptionist");
                                    id = new Scanner(System.in).nextInt();
                                    System.out.println("Enter the Name of Receptionist");
                                    name = new Scanner(System.in).nextLine();
                                    System.out.println("Enter the Gender of Receptionist");
                                    gender = new Scanner(System.in).nextLine();
                                    System.out.println("Enter the Age of Receptionist");
                                    age = new Scanner(System.in).nextInt();
                                    System.out.println("Enter the salary of Receptionist");
                                    salary = new Scanner(System.in).nextInt();
                                    System.out.println("Enter the CNIC of Receptionist");
                                    CNIC = new Scanner(System.in).nextInt();
                                    User admin = new Receptionist(name, gender, CNIC, age, id, salary);
                                    receptionists.add(i,(Receptionist) admin );
                                    break;
                                case 2:
                                    System.out.println("---------Record No "+(i+1)+"---------");
                                    receptionists.get(i).showRecord();
                                    break;
                                case 3:
                                    System.out.println("---------Record No "+(i+1)+"---------");
                                    receptionists.get(i).accountInfo();
                                    break;

                            }

                        }
                        System.out.println();
                    }
                    break;
//------------------TRANSPORT MODULE----------------------------------
                case 6:
                    int Model;
                    int service;
                    System.out.println("How many record you want to enter:");
                    recordslength = new Scanner(System.in).nextInt();
                    ArrayList<Transport> transports = new ArrayList<>();
                    for (int i = 0; i < recordslength; i++) {
                        System.out.println("record no"+(i+1));
                        loopCounter=90; // some other no than 0 and 8
                        while (loopCounter != 8) {
                            System.out.println("Enter 1 for adding transport record");
                            System.out.println("Enter 2 for showing transport record");
                            System.out.println("Enter 3 for showing driver record");
                            System.out.println("Enter 8 to quit");
                            loopCounter = new Scanner(System.in).nextInt();
                            switch (loopCounter) {
                                case 1:
                                    System.out.println("---------Enter Record No " + (i + 1) + "---------");
                                    System.out.println("enter id of transport");
                                    id = new Scanner(System.in).nextInt();
                                    System.out.println("enter name of transport");
                                    name = new Scanner(System.in).nextLine();
                                    System.out.println("enter model of transport");
                                    Model = new Scanner(System.in).nextInt();
                                    System.out.println("enter total service of transport");
                                    service = new Scanner(System.in).nextInt();
                                    System.out.println("Enter the Id of Driver");
                                    id = new Scanner(System.in).nextInt();
                                    System.out.println("Enter the Name of Driver");
                                    name = new Scanner(System.in).nextLine();
                                    System.out.println("Enter the Gender of Driver");
                                    gender = new Scanner(System.in).nextLine();
                                    System.out.println("Enter the Age of Driver");
                                    age = new Scanner(System.in).nextInt();
                                    System.out.println("Enter the Experience of Driver");
                                    exp = new Scanner(System.in).nextInt();
                                    System.out.println("Enter the salary of Driver");
                                    salary = new Scanner(System.in).nextInt();
                                    System.out.println("Enter the CNIC of Driver");
                                    CNIC = new Scanner(System.in).nextInt();
                                    transports.add(i,new Transport(id, name, Model, service,name, gender, CNIC, age, id, salary, exp));
                                    break;
                                case 2:
                                    System.out.println("---------Record No "+(i+1)+"---------");
                                    transports.get(i).showRecord();
                                    break;
                                case 3:
                                    System.out.println("---------Driver Info---------");
                                    System.out.println( transports.get(i).getDriver());
                                    break;
                            }

                        }
                        System.out.println();
                    }
                    break;
//------------------WARDS MODULE----------------------------------
                case 7:
                    String Type;
                    int Beds;
                    System.out.println("How many record you want to enter:");
                    recordslength = new Scanner(System.in).nextInt();
                    ArrayList<Ward> wards = new ArrayList<>();
                    for (int i = 0; i < recordslength; i++) {
                        System.out.println("record no"+(i+1));
                        loopCounter=90; // some other no than 0 and 8
                        while (loopCounter != 8) {
                            System.out.println("Enter 1 for adding ward record");
                            System.out.println("Enter 2 for showing ward record");
                            System.out.println("Enter 3 for adding doctor in ward ");
                            System.out.println("Enter 4 for adding patient in ward ");
                            System.out.println("Enter 5 for viewing doctors in ward ");
                            System.out.println("Enter 6 for viewing patients in ward ");
                            System.out.println("Enter 8 to quit");
                            loopCounter = new Scanner(System.in).nextInt();
                            switch (loopCounter) {
                                case 1:
                                    System.out.println("---------Enter Record No " + (i + 1) + "---------");
                                    System.out.println("enter id of ward1");
                                    id = new Scanner(System.in).nextInt();
                                    System.out.println("enter type of ward1");
                                    Type = new Scanner(System.in).nextLine();
                                    System.out.println("enter no of beds in ward1 ");
                                    Beds = new Scanner(System.in).nextInt();
                                    wards.add(i,new Ward(id, Type, Beds));
                                    break;
                                case 2:
                                    System.out.println("---------Record No "+(i+1)+"---------");
                                    wards.get(i).showRecord();
                                    break;
                                case 3:
                                    System.out.println("Enter the Id of Doctor");
                                    id= new Scanner(System.in).nextInt();
                                    System.out.println("Enter the Name of Doctor");
                                    name=new Scanner(System.in).nextLine();
                                    System.out.println("Enter the Qualification of Doctor");
                                    qualf=new Scanner(System.in).nextLine();
                                    System.out.println("Enter the Gender of Doctor");
                                    gender=new Scanner(System.in).nextLine();
                                    System.out.println("Enter the Age of Doctor");
                                    age=new Scanner(System.in).nextInt();
                                    System.out.println("Enter the Experience of Doctor");
                                    exp=new Scanner(System.in).nextInt();
                                    System.out.println("Enter the salary of Doctor");
                                    salary=new Scanner(System.in).nextInt();
                                    System.out.println("Enter the CNIC of Doctor");
                                    CNIC=new Scanner(System.in).nextInt();
                                    wards.get(i).addDoctor(name, gender,CNIC,age,id,salary,qualf,exp);
                                    break;
                                case 4:
                                    System.out.println("enter id of patient");
                                    id = new Scanner(System.in).nextInt();
                                    System.out.println("enter name of patient");
                                    name = new Scanner(System.in).nextLine();
                                    System.out.println("enter disease of patient");
                                    Disease = new Scanner(System.in).nextLine();
                                    System.out.println("Enter the CNIC of patient");
                                    CNIC = new Scanner(System.in).nextInt();
                                    System.out.println("Enter the gender of patient");
                                    gender = new Scanner(System.in).nextLine();
                                    System.out.println("Enter the age of patient");
                                    age = new Scanner(System.in).nextInt();
                                    wards.get(i).addPatient(id, Disease, name, gender, CNIC, age);
                                    break;
                                case 5:
                                    wards.get(i).showDoctors();
                                    break;
                                case 6:
                                    wards.get(i).showPatients();
                                    break;

                            }

                        }
                        System.out.println();
                    }
                    break;

            }

        }
    }
}


