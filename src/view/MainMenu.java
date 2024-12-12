package view;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class MainMenu {
    
    
    public MainMenu() {
        initComponents();
    }
    public void Login(){
        new LoginMenu();
    }
    
    private void initComponents() {
        
        JFrame mainFrame = new JFrame("MAIN MENU");

        mainFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        mainFrame.setSize(300, 150);
        mainFrame.setLocationRelativeTo(null); 
        
        JButton LoginButton = new JButton("Login");
        JButton BookButton = new JButton("Book List");
        JButton exitButton = new JButton("Transaction");
        
        LoginButton.addActionListener(e -> {
            mainFrame.dispose();
            Login();
        });

        BookButton.addActionListener(e -> {
            mainFrame.dispose();
            // new BookDataScreen();
        });

        exitButton.addActionListener(e -> {
            mainFrame.dispose();
        });
        
        JPanel mainPanel = new JPanel(new GridLayout(3, 1, 10, 5));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        mainPanel.add(LoginButton);
        mainPanel.add(BookButton);
        mainPanel.add(exitButton);
        
        mainFrame.getContentPane().add(mainPanel, BorderLayout.CENTER);
        mainFrame.setVisible(true);
    }
}
