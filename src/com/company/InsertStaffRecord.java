package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InsertStaffRecord extends JFrame implements Objects{

    private JButton insertRecord;
    private JPanel staffrecord;
    private JTextField gender;
    private JTextField cnic;
    private JTextField name;
    private JTextField age;
    private JTextField id;
    private JTextField salary;
    private JTextField qualf;
    private JTextField exp;

    InsertStaffRecord(){
        setContentPane(staffrecord);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("STAFF INSERT RECORD");
        setSize(500,700);
        setVisible(true);

        insertRecord.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                User admin= new Paramedical_Staff(Integer.parseInt(id.getText()),Integer.parseInt(exp.getText()),qualf.getText(),Integer.parseInt(salary.getText()),name.getText(), gender.getText(),Integer.parseInt(age.getText()),Integer.parseInt(cnic.getText()));
                staffs.add((Paramedical_Staff) admin);
                JOptionPane.showMessageDialog(null,"Record Inserted");
                setVisible(false);
            }
        });
    }
}
