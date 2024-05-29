package Pk;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class org{
    public static void main(String[] args) {
        JFrame frame = new JFrame("Currency Converter");
        frame.setSize(350, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel rupeesLabel = new JLabel("Rupees:");
        rupeesLabel.setBounds(20, 40, 60, 30);

        JLabel dollarsLabel = new JLabel("Dollars:");
        dollarsLabel.setBounds(170, 40, 60, 30);

        JTextField rupeesField = new JTextField("0");
        rupeesField.setBounds(80, 40, 50, 30);

        JTextField dollarsField = new JTextField("0");
        dollarsField.setBounds(240, 40, 50, 30);

        JButton inrButton = new JButton("INR");
        inrButton.setBounds(50, 80, 60, 15);
        inrButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double rupees = Double.parseDouble(rupeesField.getText());
                double dollars = rupees / 65.25;
                dollarsField.setText(String.valueOf(dollars));
            }
        });

        JButton dollarButton = new JButton("Dollar");
        dollarButton.setBounds(190, 80, 60, 15);
        dollarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double dollars = Double.parseDouble(dollarsField.getText());
                double rupees = dollars * 65.25;
                rupeesField.setText(String.valueOf(rupees));
            }
        });

        JButton closeButton = new JButton("Close");
        closeButton.setBounds(150, 150, 60, 30);
        closeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        frame.add(rupeesLabel);
        frame.add(dollarsLabel);
        frame.add(rupeesField);
        frame.add(dollarsField);
        frame.add(inrButton);
        frame.add(dollarButton);
        frame.add(closeButton);

        frame.setLayout(null);
        frame.setVisible(true);
    }
}


