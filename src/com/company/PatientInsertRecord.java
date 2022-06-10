package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PatientInsertRecord extends JFrame implements Objects{
    private JTextField age;
    private JTextField id;
    private JTextField gender;
    private JTextField cnic;
    private JTextField disease;
    private JTextField name;
    private JButton insertButton;
    private JPanel patientinsertrecord;

    public PatientInsertRecord() {
        setContentPane(patientinsertrecord);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("PATIENT INSERT RECORD");
        setSize(500,700);
        setVisible(true);

        insertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                User admin = new Patient(Integer.parseInt(id.getText()),disease.getText(),name.getText(), gender.getText(), Integer.parseInt(cnic.getText()),Integer.parseInt(age.getText()));
                patients.add((Patient) admin);
                admin.showRecord();
                JOptionPane.showMessageDialog(null,"Record Inserted");
                setVisible(false);
            }
        });
    }
}
