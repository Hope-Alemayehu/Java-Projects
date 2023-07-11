//package superPack;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

public class MeetingTableGui extends JFrame {
    private final JTable meetingTable;
    private DefaultTableModel tableModel;
    private JButton addButton;
    private JButton editButton;
    private JButton deleteButton;

    public MeetingTableGui() {
        this.setTitle("Meeting Table");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setPreferredSize(new Dimension(600, 400));
        this.tableModel = new DefaultTableModel();
        this.tableModel.addColumn("Meeting Number");
        this.tableModel.addColumn("Date");
        this.tableModel.addColumn("Location");
        this.tableModel.addColumn("Title");
        this.tableModel.addColumn("Description");
        this.meetingTable = new JTable(this.tableModel);
        JScrollPane scrollPane = new JScrollPane(this.meetingTable);
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
                final int selectedRow = MeetingTableGui.this.meetingTable.getSelectedRow();
                if (selectedRow >= 0) {
                    Vector<String> rowData = new Vector<>();

                    for (int i = 0; i < MeetingTableGui.this.tableModel.getColumnCount(); ++i) {
                        rowData.add(MeetingTableGui.this.tableModel.getValueAt(selectedRow, i).toString());
                    }

                    final MeetingInformationForm meetingForm = new MeetingInformationForm(rowData.get(0), rowData.get(1), rowData.get(2), rowData.get(3), rowData.get(4));
                    meetingForm.addWindowListener(new java.awt.event.WindowAdapter() {
                        public void windowClosed(java.awt.event.WindowEvent windowEvent) {
                            if (meetingForm.isRecordSaved()) {
                                Vector<String> updatedRowData = meetingForm.getMeetingRecord();

                                for (int i = 0; i < MeetingTableGui.this.tableModel.getColumnCount(); ++i) {
                                    MeetingTableGui.this.tableModel.setValueAt(updatedRowData.get(i), selectedRow, i);
                                }
                            }
                        }
                    });
                } else {
                    JOptionPane.showMessageDialog(MeetingTableGui.this, "Please select a row to edit.", "No Row Selected", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        this.deleteButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int selectedRow = MeetingTableGui.this.meetingTable.getSelectedRow();
                if (selectedRow >= 0) {
                    int option = JOptionPane.showConfirmDialog(MeetingTableGui.this, "Are you sure you want to delete this meeting record?", "Confirmation", JOptionPane.YES_NO_OPTION);
                    if (option == JOptionPane.YES_OPTION) {
                        MeetingTableGui.this.tableModel.removeRow(selectedRow);
                    }
                } else {
                    JOptionPane.showMessageDialog(MeetingTableGui.this, "Please select a meeting record to delete.", "No Row Selected", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        this.addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                final MeetingInformationForm meetingForm = new MeetingInformationForm("", "", "", "", "");
                meetingForm.addWindowListener(new java.awt.event.WindowAdapter() {
                    public void windowClosed(java.awt.event.WindowEvent e) {
                        if (meetingForm.isRecordSaved()) {
                            Vector<String> rowData = meetingForm.getMeetingRecord();
                            MeetingTableGui.this.tableModel.addRow(rowData);
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
                new MeetingTableGui();
            }
        });
    }
}

class MeetingInformationForm extends JFrame {
    private JTextField meetingNumberField;
    private JTextField dateField;
    private JTextField locationField;
    private JTextField titleField;
    private JTextField descriptionField;
    private JButton saveButton;
    private boolean recordSaved;

    public MeetingInformationForm(String meetingNumber, String date, String location, String title, String description) {
        this.setTitle("Meeting Information");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(400, 200);
        this.setLayout(new GridLayout(6, 2));

        JLabel meetingNumberLabel = new JLabel("Meeting Number:");
        this.meetingNumberField = new JTextField(meetingNumber);
        this.meetingNumberField.setEditable(false);
        JLabel dateLabel = new JLabel("Date:");
        this.dateField = new JTextField(date);
        JLabel locationLabel = new JLabel("Location:");
        this.locationField = new JTextField(location);
        JLabel titleLabel = new JLabel("Title:");
        this.titleField = new JTextField(title);
        JLabel descriptionLabel = new JLabel("Description:");
        this.descriptionField = new JTextField(description);

        this.saveButton = new JButton("Save");
        this.saveButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                recordSaved = true;
                dispose();
            }
        });

        this.add(meetingNumberLabel);
        this.add(this.meetingNumberField);
        this.add(dateLabel);
        this.add(this.dateField);
        this.add(locationLabel);
        this.add(this.locationField);
        this.add(titleLabel);
        this.add(this.titleField);
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

    public Vector<String> getMeetingRecord() {
        Vector<String> rowData = new Vector<>();
        rowData.add(meetingNumberField.getText());
        rowData.add(dateField.getText());
        rowData.add(locationField.getText());
        rowData.add(titleField.getText());
        rowData.add(descriptionField.getText());
        return rowData;
    }
}
