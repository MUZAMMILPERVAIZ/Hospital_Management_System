package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InsertRecordTransport extends JFrame implements Objects {
    private JTextField age;
    private JTextField id;
    private JTextField gender;
    private JTextField cnic;
    private JTextField salary;
    private JTextField exp;
    private JTextField name;
    private JButton insertRecord;
    private JTextField T_name;
    private JTextField T_id;
    private JTextField T_model;
    private JTextField T_service;
    private JPanel transportRecord;

    public InsertRecordTransport() {
        setContentPane(transportRecord);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("TRANSPORT INSERT RECORD");
        setSize(500,700);
        setVisible(true);
        insertRecord.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               Transport transport=new Transport(Integer.parseInt(T_id.getText()), T_name.getText(), Integer.parseInt(T_model.getText()),Integer.parseInt(T_service.getText()) ,name.getText(), gender.getText(), Integer.parseInt(cnic.getText()), Integer.parseInt(age.getText()), Integer.parseInt(id.getText()), Integer.parseInt(salary.getText()), Integer.parseInt(exp.getText()));
                transports.add(transport);
                JOptionPane.showMessageDialog(null,"Record Inserted");
                setVisible(false);

            }
        });
    }
}
