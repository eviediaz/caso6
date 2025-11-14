package com.smartbuild;

import javax.swing.*;
import java.awt.*;

public class SmartCheck {

    // Ejemplo de código inseguro para que SonarQube lo detecte
    private static final String DB_PASSWORD = "admin123"; // Hardcoded credential

    public static void main(String[] args) {
        JFrame frame = new JFrame("SmartBuild - Analizador de Reservas");
        frame.setSize(400, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 1));

        JLabel label = new JLabel("Ingrese nombre del cliente:");
        JTextField inputField = new JTextField();
        JButton analyzeButton = new JButton("Analizar");

        JTextArea resultArea = new JTextArea();
        resultArea.setEditable(false);

        panel.add(label);
        panel.add(inputField);
        panel.add(analyzeButton);

        frame.add(panel, BorderLayout.NORTH);
        frame.add(resultArea, BorderLayout.CENTER);

        analyzeButton.addActionListener(e -> {
            String name = inputField.getText();

            if (name.isEmpty()) {
                resultArea.setText("⚠️ Error: el nombre no puede estar vacío.");
            } else {
                // Simulación de análisis “IA”
                String message = processReservation(name);
                resultArea.setText(message);
            }
        });

        frame.setVisible(true);
    }

    // Función simple simulando un proceso interno
    public static String processReservation(String customerName) {
        return "✔ Reserva procesada para: " + customerName + "\n"
                + "🔍 Análisis automático completado.\n"
                + "(Simulación ML)";
    }
}
