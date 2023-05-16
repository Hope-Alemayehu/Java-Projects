
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
public class Myframe extends JFrame{
    Calendar calander ;
    SimpleDateFormat timeFormat;
    SimpleDateFormat dayFormat;
    SimpleDateFormat dateFormat; JLabel timeLabel;
    
    JLabel dayLabel;
    JLabel dateLabel;

    String time;
    String day;
    String date;



    Myframe(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("My Beautiful Clock");
        this.setLayout(new FlowLayout());
        this.setSize(350,220);
        //this.getContentPane.setBackground(Color.BLACK);
        Container contentPane = getContentPane();
        contentPane.setBackground(new Color(255, 229, 180));
        this.setResizable(false);

        timeFormat= new SimpleDateFormat("hh:mm:ss a", Locale.US);
        dayFormat= new SimpleDateFormat("EEEE");
        dateFormat= new SimpleDateFormat("MMMMM dd,yyyy");
        


        timeLabel = new JLabel();
        timeLabel.setFont(new Font("Monoid", Font.BOLD,50));
        timeLabel.setForeground(new Color (000,000,000));
        timeLabel.setBackground(new Color(250, 235, 215));
        timeLabel.setOpaque(true);
        
        dayLabel= new JLabel();
        dayLabel.setFont(new Font("Monoid",Font.PLAIN,35));
        dateLabel=new JLabel();
        dayLabel.setBackground(new Color(250, 235, 215));
        dayLabel.setOpaque(true);
        dateLabel.setFont(new Font("Monoid",Font.PLAIN,35));
        dateLabel.setBackground(new Color(250, 235, 215));
        dateLabel.setOpaque(true);

        this.add(timeLabel);
        this.add(dayLabel);
        this.add(dateLabel);
        this.setVisible(true);
        
        //to make the time moves and not get stuck at one point like you on your ex..this actually moves on 
        setTime();



    }
        public void setTime(){
           while (true){
            time= timeFormat.format(calander.getInstance().getTime());
            timeLabel.setText(time);

            day = dayFormat.format(calander.getInstance().getTime());
            dayLabel.setText(day);

            date = dateFormat.format(calander.getInstance().getTime());
            dateLabel.setText(date);


            try{
              Thread.sleep(1000);}
              catch(InterruptedException e){
                e.printStackTrace();
              }
        }
        
    }
}
