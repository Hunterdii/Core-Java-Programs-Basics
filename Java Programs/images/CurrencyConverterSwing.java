import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CurrencyConverterSwing {

    private JTextField amountField;
    private JComboBox<String> baseCurrencyComboBox;
    private JComboBox<String> targetCurrencyComboBox;
    private JLabel resultLabel;

    private final String[] currencies = {
            "INR", "USD", "EUR", "GBP", "JPY", "AUD", "CAD", "CHF", "CNY", "SEK", "NZD", "NOK", "SGD", "BRL", "ZAR", "TRY"
    };

    private final Map<String, String> currencyNames = new HashMap<>();

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new CurrencyConverterSwing().createAndShowGUI();
        });
    }

    private void createAndShowGUI() {
        JFrame frame = new JFrame("Currency Converter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Populate currency names
        populateCurrencyNames();

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        // Create UI components
        amountField = new JTextField(10);
        baseCurrencyComboBox = new JComboBox<>(currencies);
        targetCurrencyComboBox = new JComboBox<>(Arrays.copyOfRange(currencies, 1, currencies.length)); // Exclude INR from target
        resultLabel = new JLabel();

        // Add UI components to the panel
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(5, 5, 5, 5);
        panel.add(new JLabel("Amount:"), gbc);

        gbc.gridx = 1;
        panel.add(amountField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(new JLabel("Base Currency (INR):"), gbc);

        gbc.gridx = 1;
        panel.add(baseCurrencyComboBox, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(new JLabel("Target Currency:"), gbc);

        gbc.gridx = 1;
        panel.add(targetCurrencyComboBox, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        panel.add(new JLabel("Result:"), gbc);

        gbc.gridx = 1;
        panel.add(resultLabel, gbc);

        // Add conversion button
        JButton convertButton = new JButton("Convert");
        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                convertCurrency();
            }
        });

        gbc.gridx = 1;
        gbc.gridy = 4;
        gbc.anchor = GridBagConstraints.EAST;
        panel.add(convertButton, gbc);

        frame.getContentPane().add(BorderLayout.CENTER, panel);
        frame.setSize(400, 250);
        frame.setVisible(true);
    }

    private void populateCurrencyNames() {
        // You can add more currency names as needed
        currencyNames.put("INR", "Indian Rupee");
        currencyNames.put("USD", "United States Dollar");
        currencyNames.put("EUR", "Euro");
        currencyNames.put("GBP", "British Pound Sterling");
        currencyNames.put("JPY", "Japanese Yen");
        currencyNames.put("AUD", "Australian Dollar");
        currencyNames.put("CAD", "Canadian Dollar");
        currencyNames.put("CHF", "Swiss Franc");
        currencyNames.put("CNY", "Chinese Yuan");
        currencyNames.put("SEK", "Swedish Krona");
        currencyNames.put("NZD", "New Zealand Dollar");
        currencyNames.put("NOK", "Norwegian Krone");
        currencyNames.put("SGD", "Singapore Dollar");
        currencyNames.put("BRL", "Brazilian Real");
        currencyNames.put("ZAR", "South African Rand");
        currencyNames.put("TRY", "Turkish Lira");
    }

    private void convertCurrency() {
        try {
            String baseCurrency = "INR";
            String targetCurrency = (String) targetCurrencyComboBox.getSelectedItem();
            double amount = Double.parseDouble(amountField.getText());

            // Fetch exchange rate from API
            String apiUrl = "https://api.exchangerate-api.com/v4/latest/" + baseCurrency;
            URL url = new URL(apiUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line;
            StringBuilder response = new StringBuilder();

            while ((line = reader.readLine()) != null) {
                response.append(line);
            }

            reader.close();
            connection.disconnect();

            // Parse the JSON response
            double exchangeRate = Double.parseDouble(response.toString().split("\"" + targetCurrency + "\":")[1]
                    .split(",")[0].replace("}", "").trim());

            // Perform currency conversion
            double result = amount * exchangeRate;

            // Display the result with full currency names
            String baseCurrencyName = currencyNames.get(baseCurrency);
            String targetCurrencyName = currencyNames.get(targetCurrency);
            resultLabel.setText(String.format("%.2f %s (%s) is %.2f %s (%s)",
                    amount, baseCurrencyName, baseCurrency, result, targetCurrencyName, targetCurrency));
        } catch (Exception ex) {
            resultLabel.setText("Error converting currency. Please check your input.");
        }
    }
}
