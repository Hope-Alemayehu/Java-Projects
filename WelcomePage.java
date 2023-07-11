import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WelcomePage {
    private static JFrame welcomeFrame;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    private static void createAndShowGUI() {
        welcomeFrame = new JFrame("Welcome");
        welcomeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        welcomeFrame.setSize(900, 664);
        welcomeFrame.setLocationRelativeTo(null);
        welcomeFrame.getContentPane().setBackground(new Color(73, 80, 87));
        ImageIcon icon = new ImageIcon("logo4.png",);
        Image image = icon.getImage();
        Image resizedImage = image.getScaledInstance(300, 300, java.awt.Image.SCALE_SMOOTH);
        ImageIcon resizedIcon = new ImageIcon(resizedImage);
        welcomeFrame.setIconImage(resizedIcon.getImage());

        JPanel mainPanel = new JPanel(new BorderLayout());

        JPanel northPanel = new JPanel(new BorderLayout());
        northPanel.setBackground(new Color(20, 33, 61));
        northPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        JLabel imageLabel = new JLabel(resizedIcon);
        northPanel.add(imageLabel, BorderLayout.NORTH);

        JLabel welcomeLabel = new JLabel("Welcome To Idir Management System");
        welcomeLabel.setFont(new Font("Myriad Pro", Font.BOLD, 45));
        welcomeLabel.setForeground(new Color(252,163,17));
        northPanel.add(welcomeLabel, BorderLayout.CENTER);

        mainPanel.add(northPanel, BorderLayout.NORTH);

        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 140, 60));

        centerPanel.setAlignmentX(Component.CENTER_ALIGNMENT);

        JButton memberButton = new JButton("Member");
        memberButton.setFocusable(false);
        memberButton.setForeground(Color.WHITE);
        memberButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        memberButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                openMemberLoginFrame();
                welcomeFrame.dispose();
            }
        });

        JButton adminButton = new JButton("Admin");
        adminButton.setFocusable(false);
        adminButton.setForeground(Color.WHITE);
        adminButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        adminButton.setBackground(new Color(252,163,17));
        adminButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                openAdminLoginFrame();
                welcomeFrame.dispose();
            }
        });

        memberButton.setPreferredSize(new Dimension(100, 50));
        memberButton.setBackground(new Color(252,163,17));
        adminButton.setPreferredSize(new Dimension(100, 50));

        centerPanel.setBackground(new Color(20, 33, 61));

        centerPanel.add(memberButton);
        centerPanel.add(adminButton);

        mainPanel.add(centerPanel, BorderLayout.CENTER);

        welcomeFrame.add(mainPanel);
        welcomeFrame.setVisible(true);
    }

    private static void openMemberLoginFrame() {
        JFrame memberFrame = new JFrame("Member Login");
        memberFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        memberFrame.getContentPane().setBackground(new Color(73, 80, 87));

        JLabel idLabel = new JLabel("Member ID:");
        idLabel.setFont(new Font("Helvetica", Font.PLAIN, 20));
        idLabel.setForeground(Color.WHITE);

        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setFont(new Font("Helvetica", Font.PLAIN, 20));
        passwordLabel.setForeground(Color.WHITE);

        JTextField idField = new JTextField(20);
        idField.setPreferredSize(new Dimension(idField.getPreferredSize().width, 30));
        JPasswordField passwordField = new JPasswordField(20);
        passwordField.setPreferredSize(new Dimension(passwordField.getPreferredSize().width, 30));

        JButton backButton = new JButton("Back");
        backButton.setBackground(new Color(252,163,17));
        backButton.setFocusable(false);
        backButton.setForeground(Color.WHITE);
        backButton.setPreferredSize(new Dimension(100, 50));
        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                memberFrame.dispose();
                welcomeFrame.setVisible(true);
            }
        });

        JButton loginButton = new JButton("Login");
         loginButton.setBackground(new Color(252,163,17));
        loginButton.setFocusable(false);
        loginButton.setForeground(Color.WHITE);
        loginButton.setPreferredSize(new Dimension(100, 50));
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String id = idField.getText();
                char[] password = passwordField.getPassword();

                // TODO: Implement member login logic

                // Clear the input fields after login attempt
                idField.setText("");
                passwordField.setText("");
            }
        });

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        buttonPanel.setBackground(new Color(20, 33, 61));
        buttonPanel.add(backButton);
        buttonPanel.add(loginButton);

        JPanel mainPanel = new JPanel(new GridBagLayout());
        mainPanel.setBackground(new Color(20, 33, 61));
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(10, 10, 10, 10);
        constraints.anchor = GridBagConstraints.WEST;

        constraints.gridx = 0;
        constraints.gridy = 0;
        mainPanel.add(idLabel, constraints);

        constraints.gridx = 1;
        mainPanel.add(idField, constraints);

        constraints.gridx = 0;
        constraints.gridy = 1;
        mainPanel.add(passwordLabel, constraints);

        constraints.gridx = 1;
        mainPanel.add(passwordField, constraints);

        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridwidth = 2;
        mainPanel.add(buttonPanel, constraints);

        memberFrame.add(mainPanel);
        memberFrame.pack();
        memberFrame.setSize(900,664);
        memberFrame.setLocationRelativeTo(null);
        memberFrame.setVisible(true);
    }

    private static void openAdminLoginFrame() {
        JFrame adminFrame = new JFrame("Admin Login");
        adminFrame.setSize(900,664);
        adminFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        adminFrame.getContentPane().setBackground(new Color(73, 80, 87));

        JLabel adminIdLabel = new JLabel("Admin ID:");
        adminIdLabel.setFont(new Font("Helvetica", Font.PLAIN, 20));
        adminIdLabel.setForeground(Color.WHITE);

        JLabel roleIdLabel = new JLabel("Role ID:");
        roleIdLabel.setFont(new Font("Helvetica", Font.PLAIN, 20));
        roleIdLabel.setForeground(Color.WHITE);

        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setFont(new Font("Helvetica", Font.PLAIN, 20));
        passwordLabel.setForeground(Color.WHITE);

        JTextField adminIdField = new JTextField(20);
        adminIdField.setPreferredSize(new Dimension(adminIdField.getPreferredSize().width, 30));

        JTextField roleIdField = new JTextField(20);
        roleIdField.setPreferredSize(new Dimension(roleIdField.getPreferredSize().width, 30));

        JPasswordField passwordField = new JPasswordField(20);
        passwordField.setPreferredSize(new Dimension(passwordField.getPreferredSize().width, 30));
        
        JButton backButton = new JButton("Back");
        backButton.setBackground(new Color(252,163,17));
        backButton.setFocusable(false);
        backButton.setForeground(Color.WHITE);
        backButton.setPreferredSize(new Dimension(100, 50));
        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                adminFrame.dispose();
                welcomeFrame.setVisible(true);
            }
        });

        JButton loginButton = new JButton("Login");
        loginButton.setBackground(new Color(252,163,17));
        loginButton.setFocusable(false);
        loginButton.setForeground(Color.WHITE);
        loginButton.setPreferredSize(new Dimension(100, 50));
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = adminIdField.getText();
                String roleId = roleIdField.getText();
                char[] password = passwordField.getPassword();

                // TODO: Implement admin login logic

                // Clear the input fields after login attempt
                adminIdField.setText("");
                roleIdField.setText("");
                passwordField.setText("");
            }
        });

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        buttonPanel.setBackground(new Color(20, 33, 61));
        buttonPanel.add(backButton);
        buttonPanel.add(loginButton);

        JPanel mainPanel = new JPanel(new GridBagLayout());
        mainPanel.setBackground(new Color(20, 33, 61));
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(10, 10, 10, 10);
        constraints.anchor = GridBagConstraints.WEST;

        constraints.gridx = 0;
        constraints.gridy = 0;
        mainPanel.add(adminIdLabel, constraints);

        constraints.gridx = 1;
        mainPanel.add(adminIdField, constraints);

        constraints.gridx = 0;
        constraints.gridy = 1;
        mainPanel.add(roleIdLabel, constraints);

        constraints.gridx = 1;
        mainPanel.add(roleIdField, constraints);

        constraints.gridx = 0;
        constraints.gridy = 2;
        mainPanel.add(passwordLabel, constraints);

        constraints.gridx = 1;
        mainPanel.add(passwordField, constraints);

        constraints.gridx = 0;
        constraints.gridy = 3;
        constraints.gridwidth = 2;
        mainPanel.add(buttonPanel, constraints);

        adminFrame.add(mainPanel);
        adminFrame.pack();
        adminFrame.setSize(900,664);
        adminFrame.setLocationRelativeTo(null);
        adminFrame.setVisible(true);
    }
}
