
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class BankBalance extends JFrame implements ActionListener {
    private JButton calcButton; //Triggers balance calculation
    private JLabel balanceLabel; //Label for balance entered
    private JLabel withdrawalLabel; //FIX
    private JLabel depositLabel;
    private JTextField accountBalance; //Displays account balance
    private JTextField withdrawalField;
    private JTextField depositField;

    private double balance = 0.0;


    // Constructor
    BankBalance() {

        // Set frames title
        setTitle("Bank Balance Program");
        setLayout(new GridBagLayout());
        GridBagConstraints layoutConst = new GridBagConstraints();

        // Create labels
        balanceLabel = new JLabel("Enter your current balance):");
        withdrawalLabel = new JLabel("Withdrawal amount");
        depositLabel = new JLabel("Deposit amount");

        // Create button and add action listener
        calcButton = new JButton("Calculate");
        calcButton.addActionListener(this);

        // Create JTextFields
        accountBalance = new JTextField(10);
        accountBalance.setEditable(false);
        withdrawalField = new JTextField(10);
        depositField = new JTextField(10);

        // Grid layout
        layoutConst.gridx = 0;
        layoutConst.gridy = 0;
        layoutConst.insets = new Insets(10, 10, 10, 10);
        add(balanceLabel, layoutConst);

        layoutConst.gridx = 1;
        layoutConst.gridy = 0;
        add(accountBalance, layoutConst);

        layoutConst.gridx = 0;
        layoutConst.gridy = 1;
        add(depositLabel, layoutConst);

        layoutConst.gridx = 1;
        layoutConst.gridy = 1;
        add(depositField, layoutConst);

        layoutConst.gridx = 2;
        layoutConst.gridy = 2;
        add(withdrawalField, layoutConst);

        layoutConst.gridx = 0;
        layoutConst.gridy = 2;
        add(withdrawalLabel, layoutConst);

        layoutConst.gridx = 3;
        layoutConst.gridy = 2;
        add(calcButton, layoutConst);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        double depositAmount = Double.parseDouble(depositField.getText());
        double withdrawalAmount = Double.parseDouble(withdrawalField.getText());
        double currentBalance = 0;

        if (depositAmount >= 0) {
            currentBalance = currentBalance + depositAmount;
        } else {
            JOptionPane.showMessageDialog(this, "Invalid");
        }

        if (withdrawalAmount >= 0) {
            currentBalance -= withdrawalAmount;
        } else {
            JOptionPane.showMessageDialog(this, "Invalid");
        }

    }

}
