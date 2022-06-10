package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.InputMismatchException;

public class DoctorInsertRecord  extends JFrame implements Objects {
    private JTextField age;
    private JTextField id;
    private JTextField gender;
    private JTextField cnic;
    private JTextField salary;
    private JTextField exp;
    private JTextField name;
    private JTextField qualf;
    private JButton insertButton;
    private JPanel dinserstrecord;

    public DoctorInsertRecord() {

        setContentPane(dinserstrecord);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("DOCTOR INSERT RECORD");
        setSize(500,700);
        setVisible(true);

        insertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                    Doctor doctor = new Doctor(name.getText(), gender.getText(), Integer.parseInt(cnic.getText()),Integer.parseInt(age.getText()),Integer.parseInt(id.getText()),Integer.parseInt(salary.getText()),qualf.getText(),Integer.parseInt(exp.getText()));
                    doctors.add(doctor);

                    JOptionPane.showMessageDialog(null,"Record Inserted");
                    setVisible(false);


            }
        });
    }
}
