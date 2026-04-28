import java.awt.BorderLayout;
import javax.swing.*; 

public class EnigmaFrame extends JFrame {
    // three JComboBox features for rotors 
    private JComboBox<String> innerRotorBox; 
    private JComboBox<String> middleRotorBox; 
    private JComboBox<String> outerRotorBox; 

    // JTextField for input characters
    private JTextField startField; 
    
    // JTextAreas for input and output 
    private JTextArea inputArea; 
    private JTextArea outputArea; 

    // JButtons for encrypt and decrypt functions
    private JButton encryptButton; 
    private JButton decryptButton;

    public EnigmaFrame() {
        setTitle("Enigma GUI");
        setSize(700, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        
        /* createRotorPanel();
        createMessagePanel();
        createButtonPanel(); */
    }




}