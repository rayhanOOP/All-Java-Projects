
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.util.logging.Logger;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;
import javax.swing.text.Document;
//import javax.swing.event.DocumentEvent;
//import javax.swing.event.DocumentListener;
//import javax.swing.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author raycs
 */
public class SampleJFrame extends JFrame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // drawing the Frame
        JFrame newFrame = new JFrame();
        newFrame.setTitle("My First Java Frame");
        newFrame.pack();
        UIManager.put("InternalFrame", new ColorUIResource(Color.orange));
       
        newFrame.setSize(1000, 800);
        
        //newFrame.setResizable(false);
        newFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //newFrame.setForeground(Color.red);
        
        // drawing the panel on the Frame
        JPanel newPanel = new JPanel();
        newPanel.setVisible(true);
        newPanel.setBackground(Color.LIGHT_GRAY);
        
        //create another panel on the Frame
        JPanel newPanel2 = new JPanel();
        newPanel2.setVisible(true);
        newPanel2.setBackground(Color.LIGHT_GRAY);
        
        newFrame.getContentPane().add(newPanel,BorderLayout.NORTH);
        newFrame.getContentPane().add(newPanel2,BorderLayout.SOUTH);
        newFrame.getContentPane().add(new JScrollPane(), BorderLayout.CENTER);
        // adding Label on the panel
        newPanel.add(new JLabel("Massage"));
        newPanel2.add(new JLabel("Comment"));
        
        //Setting the area of text input
        JTextArea textArea = new JTextArea(4, 10);
        textArea.setEditable(true);
        textArea.setText("This is text area where all text will shown");
        // setting the text field to input text
        JTextField textField = new JTextField(14);
        JTextField textField2 = new JTextField(14);
        newPanel.add(textField);
        textField.setVisible(true);
        newPanel2.add(textField2);
        textField2.setVisible(true);
        
        // Setting the document of the text 
        Document textAmount = textField.getDocument();
        
        // creating a button on the Frame
      
        JButton newButton = new JButton("Click here");
        newButton.setLayout(new FlowLayout());
        newFrame.add(newButton);
        
//        String massage = JOptionPane.showInputDialog(newFrame, "Type your name", null);
//        String massage2 = JOptionPane.showInputDialog(newFrame, "Type the password", null);
//        Logger log;
//        log = Logger.getLogger(massage, massage2);
        
        
        newFrame.setVisible(true);
        
    }

}
