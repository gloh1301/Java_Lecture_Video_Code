package week_8_graphical_user_interfaces.currency_converter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;

public class CurrencyConverter extends JFrame {
    private JTextField dollarsTextField;
    private JButton convertButton;
    private JLabel resultLabel;
    private JPanel mainPanel;
    private JComboBox<String> currencyComboBox;

    private final String EUROS = "Euros";
    private final String POUNDS = "Pounds";

    private Map<String, Double> exchangeRates = Map.of(EUROS, 0.84, POUNDS, 0.75);

    CurrencyConverter() {
        setContentPane(mainPanel);
        setPreferredSize(new Dimension(500, 300));
        pack();
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        getRootPane().setDefaultButton(convertButton);

        currencyComboBox.addItem(EUROS);
        currencyComboBox.addItem(POUNDS);
        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // code
                String dollarString = dollarsTextField.getText();
                try {
                    double dollars = Double.parseDouble(dollarString);
                    String toCurrency = (String) currencyComboBox.getSelectedItem();
                    double exchangeRate = exchangeRates.get(toCurrency);
                    double convertedValue = dollars * exchangeRate;
                    String resultString = String.format("%.2f dollars is equivalent to %.2f %s.",
                            dollars, convertedValue, toCurrency);
                    resultLabel.setText(resultString);
                } catch (NumberFormatException nfe) {
                    JOptionPane.showMessageDialog(CurrencyConverter.this,
                            "Please enter a number with no other characters.");
                }
            }
        });
    }
}
