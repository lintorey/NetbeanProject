/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppCuwici;

/**
 *
 * @author user
 */
import java.awt.*;
import java.text.*;
import java.util.*;
import javax.swing.*;

public class MyFrame extends JFrame{
 
 Calendar calendar;
 SimpleDateFormat timeFormat;
 SimpleDateFormat dayFormat;
 SimpleDateFormat dateFormat;
 String toreyFormat;
 JLabel timeLabel;
 JLabel dayLabel;
 JLabel dateLabel;
 JLabel toreyLabel;
 String time;
 String day;
 String date;
 String torey;

     MyFrame(){
         
          this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          this.setTitle("Torey Squished");
          this.setLayout(new FlowLayout());
          this.setSize(350,250);
          this.setResizable(false);

          timeFormat = new SimpleDateFormat("hh:mm:ss a");
          dayFormat = new SimpleDateFormat("EEEE,");
          dateFormat = new SimpleDateFormat("MMMMM dd, yyyy");
          toreyFormat = "Sherrui Torey";

          timeLabel = new JLabel();
          timeLabel.setFont(new Font("Verdana",Font.PLAIN,50));
          timeLabel.setForeground(Color.cyan);
          timeLabel.setBackground(Color.BLACK);
          timeLabel.setOpaque(true);

          dayLabel = new JLabel();
          dayLabel.setFont(new Font("Ink Free",Font.PLAIN,35));

          dateLabel = new JLabel();
          dateLabel.setFont(new Font("Ink Free",Font.PLAIN,30));

          toreyLabel = new JLabel();
          toreyLabel.setFont(new Font("Ink Free",Font.PLAIN,30));

          this.add(timeLabel);
          this.add(dayLabel);
          this.add(dateLabel);
          this.add(toreyLabel);
          this.setVisible(true);

          setTime();
     }

     public void setTime() {
         
          while(true) {
              
              time = timeFormat.format(Calendar.getInstance().getTime());
              timeLabel.setText(time);

              day = dayFormat.format(Calendar.getInstance().getTime());
              dayLabel.setText(day);

              date = dateFormat.format(Calendar.getInstance().getTime());
              dateLabel.setText(date);

              torey = toreyFormat;
              toreyLabel.setText(torey);

              try {
               Thread.sleep(1000);
              } catch (InterruptedException e) {
               // TODO Auto-generated catch block
               e.printStackTrace();
              }
          }
     }
}
