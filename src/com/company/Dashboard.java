package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Dashboard extends JFrame implements Objects{
    private JPanel dashboard;
    private JTabbedPane doctorpane;
    private JButton showRecordDoctor;
    private JButton viewPatient;
    private JButton insertRecordDoctor;

    private JPanel header;
    private JPanel body;
    private JButton insertRecordPatient;

    private JButton showRecordPatient;
    private JButton insertRecordStaff;
    private JButton showRecordStaff;
    private JButton insertRecordRecp;
    private JButton showRecordRecp;
    private JButton insertRecordDriver;
    private JButton showRecordDriver;
    private JButton insertRecordTransport;
    private JButton showRecordTransport;
    private JButton showTransportDriver;
    private JButton insertWardRecord;
    private JButton showWardRecord;
    private JTextArea result;
    private JTextArea patientresult;
    private JTextArea staffresult;
    private JTextArea driverResult;
    private JButton viewDoctorWard;
    private JButton viewPatientWard;
    private JTextArea wardsResult;
    private JTextArea transportResult;
    private JTextArea recpResult;

    Dashboard(){
        setContentPane(dashboard);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dashboard");
        setSize(900,500);
        header.setSize(900,200);
        setVisible(true);

        insertRecordDoctor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new DoctorInsertRecord();

            }
        });
        showRecordDoctor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                result.setText("");
                for (int i = 0; i < doctors.size() ; i++) {

                    result.setText(result.getText()+"\nRecord "+(i+1)+"\n"+doctors.get(i).toString());

                }

            }
        });

        insertRecordPatient.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             new PatientInsertRecord();
            }
        });
        showRecordPatient.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                patientresult.setText("");
                for (int i = 0; i < patients.size() ; i++) {

                    patientresult.setText(patientresult.getText()+"\nRecord "+(i+1)+"\n"+patients.get(i).toString());

                }
            }
        });
        showRecordStaff.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                staffresult.setText("");

                for (int i = 0; i < staffs.size(); i++) {
                    staffresult.setText(staffresult.getText()+"\nRecord "+(i+1)+"\n"+staffs.get(i));
                }
            }
        });



        showWardRecord.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                wardsResult.setText("");
                for (int i = 0; i < wards.size(); i++) {
                    wardsResult.setText(wardsResult.getText()+"\nRecord "+(i+1)+"\n"+wards.get(i));
                }
            }
        });
        viewDoctorWard.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                wardsResult.setText("");

                for (int i = 0; i < doctors.size() ; i++) {

                    wardsResult.setText(wardsResult.getText()+"\nRecord "+(i+1)+"\n"+doctors.get(i).toString());

                }


            }
        });
        viewPatientWard.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                wardsResult.setText("");
                for (int i = 0; i < patients.size() ; i++) {

                    wardsResult.setText(wardsResult.getText()+"\nRecord "+(i+1)+"\n"+patients.get(i).toString());

                }
            }
        });

        showRecordTransport.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                transportResult.setText("");
                for (int i = 0; i < transports.size() ; i++) {

                    transportResult.setText(transportResult.getText()+"\nRecord "+(i+1)+"\n"+transports.get(i).toString());

                }
            }
        });
        showTransportDriver.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                transportResult.setText("");
                for (int i = 0; i < transports.size() ; i++) {

                    transportResult.setText(transportResult.getText()+"\nRecord "+(i+1)+"\n"+transports.get(i).getDriver());

                }
            }
        });
        showRecordDriver.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                driverResult.setText("");
                for (int i = 0; i < transports.size() ; i++) {

                    driverResult.setText(driverResult.getText()+"\nRecord "+(i+1)+"\n"+transports.get(i).getDriver());

                }
            }
        });


        insertRecordRecp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 new InsertRecordReceptionist();
            }
        });
        showRecordRecp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                recpResult.setText("");
                for (int i = 0; i < receptionists.size() ; i++) {

                    recpResult.setText(recpResult.getText()+"\nRecord "+(i+1)+"\n"+receptionists.get(i));

                }
            }
        });
        insertWardRecord.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                new InsertRecordWard();
            }
        });
        insertRecordTransport.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

               new InsertRecordTransport();

            }
        });
        insertRecordStaff.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new InsertStaffRecord();
            }
        });


    }
}
