

import javax.swing.*;
import java.awt.*;

public class loginUI {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Apex Bank Login");
        frame.setSize(400, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);

        // Background Panel
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.RED);
        panel.setBounds(0, 0, 400, 500);
        frame.add(panel);

        // Title
        JLabel title = new JLabel("APEX BANK");
        title.setForeground(Color.BLACK);
        title.setFont(new Font("Arial", Font.BOLD, 24));
        title.setBounds(120, 50, 200, 40);
        panel.add(title);

        // Username Label
        JLabel userLabel = new JLabel("Username");
        userLabel.setForeground(Color.BLACK);
        userLabel.setBounds(70, 150, 100, 25);
        panel.add(userLabel);

        // Username TextField
        JTextField usernameField = new JTextField();
        usernameField.setBounds(70, 180, 250, 30);
        panel.add(usernameField);

        // Password Label
        JLabel passLabel = new JLabel("Password");
        passLabel.setForeground(Color.BLACK);
        passLabel.setBounds(70, 230, 100, 25);
        panel.add(passLabel);

        // Password Field
        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(70, 260, 250, 30);
        panel.add(passwordField);

        // Login Button
        JButton loginButton = new JButton("Login");
        loginButton.setBackground(Color.WHITE);
        loginButton.setForeground(Color.BLACK);
        loginButton.setBounds(70, 320, 110, 35);
        panel.add(loginButton);

        // Register Button
        JButton registerButton = new JButton("Register");
        registerButton.setBackground(Color.WHITE);
        registerButton.setForeground(Color.BLACK);
        registerButton.setBounds(210, 320, 110, 35);
        panel.add(registerButton);

        frame.setVisible(true);
    }
}