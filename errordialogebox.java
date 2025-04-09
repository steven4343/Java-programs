import javax.swing.JOptionPane;
public class errordialogebox {
    public static void main(String[] args) {
        int response;
        JOptionPane.showConfirmDialog(null, "Error reading file. Do you want to try again?", "File Input Error", JOptionPane.ERROR_MESSAGE);

        
    }
    
}
