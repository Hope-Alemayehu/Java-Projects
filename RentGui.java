package superPack;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.util.Vector;

public class RentGui extends JFrame {
    private final JTable rentTable;
    private DefaultTableModel tableModel;
    private JButton addButton;
    private JButton editButton;
    private JButton deleteButton;

    public RentGui() {
        this.setTitle("Rent Table");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setPreferredSize(new Dimension(600, 400));
        this.tableModel = new DefaultTableModel();
        this.tableModel.addColumn("Rent ID");
        this.tableModel.addColumn("Renter Name");
        this.tableModel.addColumn("Renter Phone");
        this.tableModel.addColumn("Property ID");
        this.tableModel.addColumn("Amount");
        this.tableModel.addColumn("Description");
        this.rentTable = new JTable(this.tableModel);
        JScrollPane scrollPane = new JScrollPane(this.rentTable);
        this.addButton = new JButton("Add");
        this.editButton = new JButton("Edit");
        this.deleteButton = new JButton("Delete");
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(this.addButton);
        buttonPanel.add(this.editButton);
        buttonPanel.add(this.deleteButton);
        this.setLayout(new BorderLayout());
        this.add(scrollPane, BorderLayout.CENTER);
        this.add(buttonPanel, BorderLayout.SOUTH);
        this.editButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                final int selectedRow = RentGui.this.rentTable.getSelectedRow();
                if (selectedRow >= 0) {
                    Vector<String> rowData = new Vector<>();

                    for (int i = 0; i < RentGui.this.tableModel.getColumnCount(); ++i) {
                        rowData.add(RentGui.this.tableModel.getValueAt(selectedRow, i).toString());
                    }

                    final RentInformationForm rentForm = new RentInformationForm(rowData.get(0), rowData.get(1), rowData.get(2), rowData.get(3), Double.parseDouble(rowData.get(4)), rowData.get(5));
                    rentForm.addWindowListener(new java.awt.event.WindowAdapter() {
                        public void windowClosed(java.awt.event.WindowEvent windowEvent) {
                            if (rentForm.isRecordSaved()) {
                                Vector<String> updatedRowData = rentForm.getRentRecord();

                                for (int i = 0; i < RentGui.this.tableModel.getColumnCount(); ++i) {
                                    RentGui.this.tableModel.setValueAt(updatedRowData.get(i), selectedRow, i);
                                }
                            }
                        }
                    });
                } else {
                    JOptionPane.showMessageDialog(RentGui.this, "Please select a row to edit.", "No Row Selected", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        this.deleteButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int selectedRow = RentGui.this.rentTable.getSelectedRow();
                if (selectedRow >= 0) {
                    int option = JOptionPane.showConfirmDialog(RentGui.this, "Are you sure you want to delete this rent record?", "Confirmation", JOptionPane.YES_NO_OPTION);
                    if (option == JOptionPane.YES_OPTION) {
                        RentGui.this.tableModel.removeRow(selectedRow);
                    }
                } else {
                    JOptionPane.showMessageDialog(RentGui.this, "Please select a rent record to delete.", "No Row Selected", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        this.addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                final RentInformationForm rentForm = new RentInformationForm("", "", "", "", 0.0, "");
                rentForm.addWindowListener(new java.awt.event.WindowAdapter() {
                    public void windowClosed(java.awt.event.WindowEvent e) {
                        if (rentForm.isRecordSaved()) {
                            Vector<String> rowData = rentForm.getRentRecord();
                            RentGui.this.tableModel.addRow(rowData);
                        }
                    }
                });
            }
        });
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new RentGui();
            }
        });
    }
}

class RentInformationForm extends JFrame {
    private JTextField rentIdField;
    private JTextField renterNameField;
    private JTextField renterPhoneField;
    private JTextField propertyIdField;
    private JTextField amountField;
    private JTextField descriptionField;
    private JButton saveButton;
    private boolean recordSaved;

    public RentInformationForm(String rentId, String renterName, String renterPhone, String propertyId, double amount, String description) {
        this.setTitle("Rent Information");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(400, 250);
        this.setLayout(new GridLayout(7, 2));

        JLabel rentIdLabel = new JLabel("Rent ID:");
        this.rentIdField = new JTextField(rentId);
        this.rentIdField.setEditable(false);
        JLabel renterNameLabel = new JLabel("Renter Name:");
        this.renterNameField = new JTextField(renterName);
        JLabel renterPhoneLabel = new JLabel("Renter Phone:");
        this.renterPhoneField = new JTextField(renterPhone);
        JLabel propertyIdLabel = new JLabel("Property ID:");
        this.propertyIdField = new JTextField(propertyId);
        JLabel amountLabel = new JLabel("Amount:");
        this.amountField = new JTextField(String.valueOf(amount));
        JLabel descriptionLabel = new JLabel("Description:");
        this.descriptionField = new JTextField(description);

        this.saveButton = new JButton("Save");
        this.saveButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                recordSaved = true;
                dispose();
            }
        });

        this.add(rentIdLabel);
        this.add(this.rentIdField);
        this.add(renterNameLabel);
        this.add(this.renterNameField);
        this.add(renterPhoneLabel);
        this.add(this.renterPhoneField);
        this.add(propertyIdLabel);
        this.add(this.propertyIdField);
        this.add(amountLabel);
        this.add(this.amountField);
        this.add(descriptionLabel);
        this.add(this.descriptionField);
        this.add(new JLabel());
        this.add(this.saveButton);

        this.recordSaved = false;
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public boolean isRecordSaved() {
        return recordSaved;
    }

    public Vector<String> getRentRecord() {
        Vector<String> rowData = new Vector<>();
        rowData.add(rentIdField.getText());
        rowData.add(renterNameField.getText());
        rowData.add(renterPhoneField.getText());
        rowData.add(propertyIdField.getText());
        rowData.add(amountField.getText());
        rowData.add(descriptionField.getText());
        return rowData;
    }
}
