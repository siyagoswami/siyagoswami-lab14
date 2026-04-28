import javax.swing.SwingUtilities;

public class EnigmaGUI {
    public static void main(String [] args) {
        SwingUtilities.invokeLater(() -> {
            EnigmaFrame frame = new EnigmaFrame(); 
            frame.setVisible(true);
        });
    }
}