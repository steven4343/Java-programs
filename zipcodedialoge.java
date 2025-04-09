import javax.swing.JOptionPane;

public class zipcodedialoge {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(null, "What is your zip code?", "Enter your zip code", JOptionPane.QUESTION_MESSAGE);
        if (input != null) {
            try {
                int zipCode = Integer.parseInt(input);
                String message = "The zip code you entered is: " + zipCode;
                JOptionPane.showMessageDialog(null, message);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid zip code.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No input provided.");
        }

    }
}
