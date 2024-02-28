/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c4t;

import java.awt.*;
import javax.swing.*;

public class TextFieldFrame extends JFrame {
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JPasswordField passwordField;
    
    public TextFieldFrame(){
        super("testando JTextField e JPasswordField");
        setLayout( new FlowLayout());
        
        textField1 = new JTextField(10);
        add( textField1 );
        
        textField2 = new JTextField("coloque um texto:");
        add( textField2 );
        
        textField3 = new JTextField("texto impossível de mudar");
        textField3.setEditable( false );
        add( textField3 );
        
        passwordField = new JPasswordField("texto escondido");
        add (passwordField);
        
        TextFieldHandler handler = new TextFieldHandler();
        textField1.addActionListener( handler);
        textField2.addActionListener( handler);
        textField2.addActionListener( handler);
        passwordField.addActionListener (handler);
        
        
    }
    private class TextFieldHandler implements ActionListener{
        
        public void actionPerformed( ActionListener){
            
            String string = "";
            if (event.getSource() == textField1){
                string = String.format ("textField1: %$", event.getActionCommand());
            }else if (event.getSource() == textField2){
                
                string = String.format ("textField2: %$", event.getActionCommand());
            }else if (event.getSource() == textField3){
                        
                    string = String.format ("textField3: %$", event.getActionCommand());
            }else if (event.getSource() == passwordField){
                    string = String.format( "passwordField: %$", event.getActionCommand());
                    
                    JOptionPane.showMessageDialog( null, String);
            }   
        }
    }
}
