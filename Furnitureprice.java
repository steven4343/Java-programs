import javax.swing.JOptionPane;

public class Furnitureprice {
    public static void main(String[] args) {
        // Ask user to input the wood type
        String input = JOptionPane.showInputDialog("Enter wood type:\nP for Pine\nO for Oak\nM for Mahogany");

        // Convert input to uppercase to handle lowercase entries
        if (input != null) {
            input = input.toUpperCase();
            String message;

            // Determine price based on user input
            switch (input) {
                case "P":
                    message = "Pine table costs $100";
                    break;
                case "O":
                    message = "Oak table costs $225";
                    break;
                case "M":
                    message = "Mahogany table costs $310";
                    break;
                default:
                    message = "Invalid input. Please enter P, O, or M.";
                    break;
            }

            // Show result in a dialog box
            JOptionPane.showMessageDialog(null, message);
        } else {
            JOptionPane.showMessageDialog(null, "No input provided.");
        }
    }
}
