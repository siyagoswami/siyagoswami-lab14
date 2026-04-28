import javax.swing.*; 
import java.awt.*;
import java.awt.event.*;

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

        createSettingsPanel();
        createTextPanel();
        createButtonPanel(); 
    }

    private void createSettingsPanel() {
        JPanel settingsPanel = new JPanel();
        innerRotorBox = new JComboBox<>(new String []{"1", "2", "3", "4", "5"});
        middleRotorBox = new JComboBox<>(new String []{"1", "2", "3", "4", "5"});
        outerRotorBox = new JComboBox<>(new String []{"1", "2", "3", "4", "5"});

        startField = new JTextField("###", 5);

        settingsPanel.add(new JLabel("Inner:"));
        settingsPanel.add(innerRotorBox);

        settingsPanel.add(new JLabel("Middle:"));
        settingsPanel.add(middleRotorBox);

        settingsPanel.add(new JLabel("Outer:"));
        settingsPanel.add(outerRotorBox);

        settingsPanel.add(new JLabel("Start:"));
        settingsPanel.add(startField);

        add(settingsPanel, BorderLayout.NORTH);
    }

    private void createTextPanel() {
        JPanel textPanel = new JPanel(new GridLayout(2, 1));

        inputArea = new JTextArea(8, 40);
        outputArea = new JTextArea(8, 40);

        outputArea.setEditable(false);

        JPanel inputPanel = new JPanel(new BorderLayout());
        inputPanel.add(new JLabel("Input Message:"), BorderLayout.NORTH);
        inputPanel.add(new JScrollPane(inputArea), BorderLayout.CENTER); 

        JPanel outputPanel = new JPanel(new BorderLayout());
        outputPanel.add(new JLabel("Output Message:"), BorderLayout.NORTH);
        outputPanel.add(new JScrollPane(outputArea), BorderLayout.CENTER); 

        textPanel.add(inputPanel);
        textPanel.add(outputPanel);

        add(textPanel, BorderLayout.CENTER);
    }




}