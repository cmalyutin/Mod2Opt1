
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class BankBalance extends JFrame {
    private JButton withdrawalButton; //Triggers balance calculation
    private JButton depositButton;
    private JButton balanceButton;
    private JLabel balanceLabel; //Label for balance entered
    private JLabel withdrawalLabel; //FIX
    private JLabel depositLabel;
    private JPanel accountBalance; //Displays account balance
    private JTextField withdrawalField;
    private JTextField depositField;
    private double currentBalance = 0;

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
        withdrawalButton = new JButton("Withdraw");
        withdrawalButton.addActionListener(new ActionListener() {
                                               public void actionPerformed(ActionEvent e) {
                                                   balance = balance - Double.parseDouble(withdrawalField.getText());
                                               }
                                           });
        depositButton = new JButton("Deposit");
        depositButton.addActionListener(new ActionListener(){
            // Override the actionPerformed() method
            public void actionPerformed(ActionEvent e){
                balance = balance + Double.parseDouble(depositField.getText());
            }
        });
        balanceButton = new JButton("Show balance");
        balanceButton.addActionListener(new ActionListener() {
            // Override the actionPerformed() method
            public void actionPerformed(ActionEvent e){
                balanceLabel.setText("Balance: " + balance);
            }
        });

        // Create JTextFields
        JPanel accountBalance = new JPanel();
        balanceLabel = new JLabel("Balance: " + balance);
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

        layoutConst.gridx = 1;
        layoutConst.gridy = 2;
        add(withdrawalField, layoutConst);

        layoutConst.gridx = 0;
        layoutConst.gridy = 2;
        add(withdrawalLabel, layoutConst);

        layoutConst.gridx = 3;
        layoutConst.gridy = 2;
        add(withdrawalButton, layoutConst);

        layoutConst.gridx = 3;
        layoutConst.gridy = 1;
        add(depositButton, layoutConst);

        layoutConst.gridx = 1;
        layoutConst.gridy = 3;
        add(balanceButton, layoutConst);
    }
}
