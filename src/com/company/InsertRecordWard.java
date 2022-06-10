package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InsertRecordWard extends JFrame implements Objects {
    private JTextField id;
    private JTextField beds;
    private JTextField type;
    private JButton insertRecord;
    private JPanel wardRecord;

    public InsertRecordWard() {
        setContentPane(wardRecord);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("WARDS INSERT RECORD");
        setSize(500,700);
        setVisible(true);

        insertRecord.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Ward ward= new Ward(Integer.parseInt(id.getText()),type.getText(),Integer.parseInt(beds.getText()));
                wards.add( ward);
                JOptionPane.showMessageDialog(null,"Record Inserted");
                setVisible(false);

            }
        });
    }
}
