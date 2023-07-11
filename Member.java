import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Member extends JFrame implements ActionListener {
    private JPanel cardPanel, buttonPanel;
    private CardLayout cardLayout;
    private JButton profileButton, groupButton, notificationButton, dependentButton, punishmentButton;

    public Member() {
        cardLayout = new CardLayout();
        cardPanel = new JPanel(cardLayout);
        buttonPanel = new JPanel(new BorderLayout());

        // Create the card panels
        JPanel profilePanel = createCardPanel("Profile");
        JPanel groupPanel = createCardPanel("Group List");
        JPanel notificationPanel = createCardPanel("Notification");
        JPanel punishmentPanel = createCardPanel("Punishment");
        JPanel dependentPanel = createCardPanel("Dependent");

        cardPanel.add(profilePanel, "profilePanel");
        cardPanel.add(groupPanel, "groupPanel");
        cardPanel.add(notificationPanel, "notificationPanel");
        cardPanel.add(punishmentPanel, "punishmentPanel");
        cardPanel.add(dependentPanel, "dependentPanel");

        // Create the buttons
        profileButton = createButton("Profile", profilePanel);
        groupButton = createButton("Group List", groupPanel);
        notificationButton = createButton("Notification", notificationPanel);
        punishmentButton = createButton("Punishment", punishmentPanel);
        dependentButton = createButton("Dependent", dependentPanel);

        // Add buttons to the button panel
        JPanel buttonContainerPanel = new JPanel(new GridLayout(5, 1));
        buttonContainerPanel.setBackground(Color.BLACK);
        buttonContainerPanel.add(profileButton);
        buttonContainerPanel.add(groupButton);
        buttonContainerPanel.add(notificationButton);
        buttonContainerPanel.add(punishmentButton);
        buttonContainerPanel.add(dependentButton);

        // Add button container panel with preferred width
        buttonPanel.add(buttonContainerPanel, BorderLayout.CENTER);
        buttonPanel.setPreferredSize(new Dimension(200, buttonContainerPanel.getPreferredSize().height));
        buttonPanel.setBackground(Color.BLACK);

        // Set panel colors
        cardPanel.setBackground(Color.WHITE);

        // Add panels to the frame
        add(cardPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.WEST);

        setTitle("Member");
        setSize(900, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public JPanel createCardPanel(String labelText) {
        JPanel panel = new JPanel(new BorderLayout());
        JLabel label = new JLabel(labelText);
        label.setFont(new Font("Arial", Font.BOLD, 18));
        label.setForeground(Color.BLACK);
        panel.add(label, BorderLayout.NORTH);
        panel.setBackground(Color.WHITE);
        return panel;
    }

    public JButton createButton(String buttonText, JPanel targetPanel) {
        JButton button = new JButton(buttonText);
        button.setFont(new Font("Arial", Font.BOLD, 16));
        button.setBackground(Color.BLACK);
        button.setForeground(Color.WHITE);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, targetPanel.getName());
            }
        });
        targetPanel.setName(buttonText.toLowerCase().replace(" ", "") + "Panel");
        return button;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Member();
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
