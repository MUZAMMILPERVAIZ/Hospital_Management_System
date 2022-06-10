package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InsertRecordReceptionist extends JFrame implements Objects {
    private JTextField age;
    private JTextField id;
    private JTextField gender;
    private JTextField cnic;
    private JTextField salary;
    private JTextField name;
    private JButton insertRecord;
    private JPanel recpRecord;

    public InsertRecordReceptionist() {
        setContentPane(recpRecord);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("RECEPTIONIST INSERT RECORD");
        setSize(500,700);
        setVisible(true);
        insertRecord.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                User admin= new Receptionist(name.getText(), gender.getText(),Integer.parseInt(age.getText()),Integer.parseInt(cnic.getText()),Integer.parseInt(id.getText()),Integer.parseInt(salary.getText()));
                receptionists.add((Receptionist) admin);
                JOptionPane.showMessageDialog(null,"Record Inserted");
                setVisible(false);
            }
        });
    }
}
