package com.example.adddemoswing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddNum extends JFrame implements ActionListener {
    JLabel label1,label2,label3;
    JTextField text1, text2, text3;
    JButton button;

    public AddNum(){
        super("Add Numbers");

        label1 = new JLabel("First Value: ");
        label2 = new JLabel("Second Value");
        label3 = new JLabel("Result");

        text1 = new JTextField(10);
        text2 = new JTextField(10);
        text3 = new JTextField(10);

        button = new JButton("Add");
        setLayout(new FlowLayout(FlowLayout.LEFT, 150,10));
        add(label1);
        add(label2);
        add(label3);
        add(text1);
        add(text2);
        add(text3);

        add(button);
        button.addActionListener(this);

        setSize(400,300);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int x = Integer.parseInt(text1.getText());
        int y = Integer.parseInt(text2.getText());

        int sum = x + y;
        text3.setText(String.valueOf(sum));
    }

    public static void main(String[] args) {
        new AddNum();
    }
}
