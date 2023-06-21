import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
    JFrame frame;
    JPanel panel;
    JLabel lengthLabel, widthLabel, areaLabel, perimeterLabel;
    JTextField lengthField, widthField, areaField, perimeterField;
    JButton calcbutton;

    public App() {
        frame = new JFrame("Area and Perimeter Calculator ");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel = new JPanel();
        lengthLabel = new JLabel("Length");
        widthLabel = new JLabel("Width");
        areaLabel = new JLabel("Area:");
        perimeterLabel = new JLabel("Perimeter");
        widthField = new JTextField(10);
        lengthField = new JTextField(10);
        areaField = new JTextField(10);
        perimeterField = new JTextField(10);

        calcbutton = new JButton("Calculate");
        //tomake the button do something
        calcbutton.addActionListener(new ActionListener() {
            //override the actionPerformed methood in the ActionListener Interface
            public void actionPerformed(ActionEvent e) {
                //to get the value in the tetFields 
                double length = Double.parseDouble(lengthField.getText());
                double width = Double.parseDouble(widthField.getText());

                Rectangle rect = new Rectangle(length, width);
                rect.calculateArea();
                rect.calculatePerimeter();

                // Update the area and perimeter text fields with the calculated values
                areaField.setText(Double.toString(rect.getArea()));
                perimeterField.setText(Double.toString(rect.getPerimeter()));
            }
        });

        panel.add(lengthLabel);
        panel.add(lengthField);
        panel.add(widthLabel);
        panel.add(widthField);
        panel.add(areaLabel);
        panel.add(areaField);
        panel.add(perimeterLabel);
        panel.add(perimeterField);
        panel.add(calcbutton);

        frame.add(panel);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new App();
    }
}

