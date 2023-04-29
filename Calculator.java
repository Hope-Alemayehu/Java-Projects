import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Calculator implements ActionListener{
    //declar everything
    //Jfram provides window on screen
    JFrame frame;
    JTextField textField;
    JButton[] numberButtons =new JButton[10];
    JButton[] functionButtons = new JButton[8];
    JButton addButton,subButton,mulButton,divButton;
    // decButton - decimal button,equButton - equal Button
    
    JButton decButton,equButton,delButton,clrButton;
    //Panel is a container to group components toget
    JPanel panel;
    Font myFont = new Font (" Ink Free ",Font.BOLD,30);

    double num1=0,num2=0,result=0;
    //to hold these characters + - * /
    char operator;

    
    Calculator(){
        frame=new JFrame("Calculator");
        //allows us to close out of the program
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 550);
        frame.setLayout(null);
        
        textField= new JTextField();
        
        textField.setBounds(50,25,300, 50);
        textField.setFont(myFont);
        textField.setEditable(false);
        
        addButton =new JButton("+");
        subButton =new JButton("-");
        mulButton =new JButton("*");
        divButton =new JButton("/");
        decButton =new JButton(".");
        equButton =new JButton("=");
        delButton =new JButton("Delete");
        clrButton =new JButton("Clear");

        functionButtons[0]= addButton;
        functionButtons[1]= subButton;
        functionButtons[2]= mulButton;
        functionButtons[3]= divButton;
        functionButtons[4]= decButton;
        functionButtons[5]= equButton;
        functionButtons[6]= delButton;
        functionButtons[7]= clrButton;
        //functionButtons[8]= negButton;

        for (int i =0;i<8;i++){
            functionButtons[i].addActionListener(this);
            functionButtons[i].setFont(myFont);
            functionButtons[i].setFocusable(false);
        }
        for (int i =0;i<10;i++){
            numberButtons[i]=new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(this);
            numberButtons[i].setFont(myFont);
            numberButtons[i].setFocusable(false);
        }
        delButton.setBounds(50, 430, 145, 50);
        clrButton.setBounds(205, 430, 145, 50);
       
        panel = new JPanel();
        panel.setBounds(50, 100, 300, 300);
        panel.setLayout(new GridLayout(4, 4,10,10));
        //panel.setBackground(Color.PINK );
        
        panel.add(numberButtons[1]);
        panel.add(numberButtons[2]);
        panel.add(numberButtons[3]);
        panel.add(addButton);
        panel.add(numberButtons[4]);
        panel.add(numberButtons[5]);
        panel.add(numberButtons[6]);
        panel.add(subButton);
        panel.add(numberButtons[7]);
        panel.add(numberButtons[8]);
        panel.add(numberButtons[9]);
        panel.add(mulButton);
        panel.add(decButton);
        panel.add(mulButton);
        panel.add(numberButtons[0]);
        panel.add(equButton);
        panel.add(divButton);


        frame.add(panel);
        frame.add(delButton);
        frame.add(clrButton);
        frame.add(textField);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
       Calculator calc = new Calculator();

    }

    public void actionPerformed(ActionEvent e){
        for(int i=0;i<10;i++){
            if (e.getSource()== numberButtons[i]){
                textField.setText(textField.getText().concat(String.valueOf(i)));    
            }
        }
            if (e.getSource()== decButton){
                textField.setText(textField.getText().concat("."));    
            }
            if (e.getSource()== addButton){
                num1 = Double.parseDouble(textField.getText());
                operator='+';
                textField.setText("");
            }
            
            
            if (e.getSource()== subButton){
                num1 = Double.parseDouble(textField.getText());
                operator='-';
                textField.setText("");
            }
            if (e.getSource()== mulButton){
                num1 = Double.parseDouble(textField.getText());
                operator='*';
                textField.setText("");
            }
            if (e.getSource()== divButton){
                num1 = Double.parseDouble(textField.getText());
                operator='/';
                textField.setText("");
            }
            if (e.getSource()== equButton){
                num2 = Double.parseDouble(textField.getText());
                switch  (operator){
                    case '+':
                        result=num1+num2;
                        break;
                    case '-':
                        result=num1-num2;
                        break;
                    case '*':
                        result=num1*num2;
                        break;
                    case '/':
                        result=num1/num2;
                        break;
                }
                textField.setText(String.valueOf(result));
                num1=result;

            }
            if (e.getSource()== clrButton){
                textField.setText("");
            }
            if (e.getSource()== delButton){
                String string =textField.getText();
                textField.setText("");
                for (int i =0;i< string.length()-1;i++){
                    textField.setText(textField.getText()+ string.charAt(i));
                }
            }
        }



    }








