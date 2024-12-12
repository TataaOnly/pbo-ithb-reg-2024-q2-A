package view;

import controller.DBcontroller;
import javax.swing.*;
import model.Users;

public class LoginMenu {
    private JFrame inputFrame;
    private JButton submitButton;

    public LoginMenu() {
        initLogin();
    }

    private void initLogin() {
        inputFrame = new JFrame("Login Menu");
        inputFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        inputFrame.setSize(500, 300);
        inputFrame.setLocationRelativeTo(null);

        JPanel formPanel = new JPanel();
        formPanel.setLayout(null);
        inputFrame.add(formPanel);

        JLabel loginLabel = new JLabel("Email:");
        loginLabel.setBounds(50, 50, 100, 30);
        formPanel.add(loginLabel);

        JTextField loginField = new JTextField();
        loginField.setBounds(150, 50, 300, 30);
        formPanel.add(loginField);

        JLabel passLabel = new JLabel("Password:");
        passLabel.setBounds(50, 100, 100, 30);
        formPanel.add(passLabel);

        JPasswordField  passField = new JPasswordField();
        passField.setBounds(150, 100, 300, 30);
        formPanel.add(passField);

        submitButton = new JButton("SUBMIT");
        submitButton.setBounds(200, 150, 100, 30);
        formPanel.add(submitButton);

        submitButton.addActionListener(e -> {
            if (loginField.getText().trim().isEmpty() || passField.getPassword().length == 0) {
                JOptionPane.showMessageDialog(formPanel, "Please fill out all fields!", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else {
                String email = loginField.getText();
                String password = new String(passField.getPassword());
                Users user = DBcontroller.getEmailUsers(email);
                if (user != null && password.equals(user.getPassword())) {
                    JOptionPane.showMessageDialog(formPanel, "Login Successful!", "SUCCESS", JOptionPane.INFORMATION_MESSAGE);
                    inputFrame.dispose();
                } else {
                    JOptionPane.showMessageDialog(formPanel, "Invalid email or password!", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        inputFrame.setVisible(true);
    }
}