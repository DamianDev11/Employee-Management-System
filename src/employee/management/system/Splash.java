
package employee.management.system;

import javax.swing.*;
import java.awt.*;      //used for color class
import java.awt.event.*;    //used for actionlistener - to perform some action


public class Splash extends JFrame implements ActionListener {
    
    Splash() {
        
        getContentPane().setBackground(Color.WHITE);        //color class contains in awt package
        
        setLayout(null);
        
        JLabel heading = new JLabel("EMPLOYEE MANAGEMENGT SYSTEM");
        heading.setBounds(80,30,1200,60);
        heading.setFont(new Font("serif",Font.PLAIN,55));
        heading.setForeground(Color.RED);
        add(heading);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/front.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1100, 700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(50,100,1050,500);
        add(image);
        
        JButton clickhere = new JButton("Click here to continue");
        clickhere.setBounds(400,400,300,70);
        clickhere.setForeground(Color.WHITE);
        clickhere.setBackground(Color.BLACK);
        clickhere.addActionListener(this);
        image.add(clickhere);           //adding button wrt imag
        
        
        setSize(1170,700);      //size of the window
        setLocation(200,50);        //places window in the center
        //setBounds(900,900,600,600);
        setVisible(true);               //makes window visible
        
        
        while(true){                            //this loops is for dipper display
            heading.setVisible(false);
            try{
                Thread.sleep(500);  
                
            }   catch(Exception e){
                System.out.println(e);
            }
            
            heading.setVisible(true);
            try{
                Thread.sleep(500);
                
            }   catch(Exception e){
                System.out.println(e);
            }
        }
    }
    
    public void actionPerformed(ActionEvent ae){        //need to override function or else it will give error
        setVisible(false);
        new Login();        //connects to another class(new page opens up
    }
    
    public static void main(String args[]){
        new Splash();
    }
    
}
