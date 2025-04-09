import javax.swing.JOptionPane;

public class Demodialog {
    public static void main(String[] args) {
        // Get first name from user
        String firstName = JOptionPane.showInputDialog("Enter your first name:");

        // Get last name from user
        String lastName = JOptionPane.showInputDialog("Enter your last name:");

        // Show entered names
        JOptionPane.showMessageDialog(null, 
            "You entered:\nFirst Name: " + firstName + "\nLast Name: " + lastName);

        // Confirm if the names are correct
        int response = JOptionPane.showConfirmDialog(null, 
            "Are these names correct?", 
            "Confirm Names", 
            JOptionPane.YES_NO_CANCEL_OPTION);

        // Handle user response
        if (response == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "You clicked No. Please restart the program.");
        } else if (response == JOptionPane.CANCEL_OPTION) {
            JOptionPane.showMessageDialog(null, "You clicked Cancel. Exiting the program.");
        } else if (response == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Thank you! Your names have been confirmed.");
        } else {
            JOptionPane.showMessageDialog(null, "No valid option selected. Exiting.");
        }

        // Exit program
        System.exit(0);
    }
}
