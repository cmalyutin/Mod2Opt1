import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class BankBalance extends JFrame implements ActionListener {
    private JButton enterBalance; //Triggers balance calculation
    private JLabel balanceLabel; //Label for balance entered
    private JTextField accountBalance; //Displays account balance
    private JTextField balanceField; // Holds balance input

    // Constructor creates GUI components and adds GUI components using a GridBagLayout.
    BankBalance() {
        // Used to specify GUI component layout
        GridBagConstraints layoutConst = null;

        // Set frame's title
        setTitle("Bank Balance Program");

        // Create label
        balanceLabel = new JLabel("Distance (miles):");

        // Create button and add action listener
        enterBalance = new JButton("Calculate");
        enterBalance.addActionListener(this);

        // Create account balance
        accountBalance = new JTextField(5);
        accountBalance.setEditable(false);

        // Use a GridBagLayout
        setLayout(new GridBagLayout());

        // Specify component's grid location
        layoutConst = new GridBagConstraints();
        layoutConst.insets = new Insets(10, 10, 10, 1);
        layoutConst.gridx = 0;
        layoutConst.gridy = 0;
        add(balanceLabel, layoutConst);

        layoutConst = new GridBagConstraints();
        layoutConst.insets = new Insets(10, 1, 10, 10);
        layoutConst.gridx = 1;
        layoutConst.gridy = 0;
        add(accountBalance, layoutConst);

        layoutConst = new GridBagConstraints();
        layoutConst.insets = new Insets(10, 5, 10, 10);
        layoutConst.gridx = 2;
        layoutConst.gridy = 0;
        add(enterBalance, layoutConst);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        String userInput;
        double currentBalance;

        // Get value from accountBalance
        userInput = balanceField.getText();

        currentBalance = Integer.parseInt(userInput);



        // Check if miles input is positive
        if (currentBalance >= 0.0) {

            System.out.println(currentBalance);
        }
        else {
            // Show failure dialog
            JOptionPane.showMessageDialog(this, "Enter a positive distance value!");
        }

    }



}
