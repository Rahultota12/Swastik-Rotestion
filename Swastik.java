import java.awt.*;
import java.util.*;
import javax.swing.*;

public class Swastik extends JFrame { 
    JFrame frame = new JFrame();

    public static void main(String[] args) {
        Swastik obj = new Swastik();
    }

    public Swastik() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        // center on screen
        frame.setLocationRelativeTo(null);
        this.setSize(1200, 750);
        this.setVisible(true);
    }

    public void paint(Graphics g) {
        Graphics2D Rahul = (Graphics2D) g;
        // visually smooth the lines
       Rahul.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
       Rahul.setStroke(new BasicStroke(5.0f));
       Rahul.translate(250, 250);
        Scanner sc = new Scanner(System.in);
        float a = 0 ;   
        int c = 0 ; 
        
        do {
           Rahul.clearRect(-500, -500, 71000, 1000);
           Rahul.setBackground(Color.white); 
           Rahul.rotate(Math.toRadians(a));
           Rahul.setPaint(Color.blue); 
           Rahul.drawLine(-100, 0, 0, 0);    
           Rahul.setPaint(Color.blue);  
           Rahul.drawLine(100, 0, 0, 0); 
           Rahul.setPaint(Color.blue);  
           Rahul.drawLine(0, 100, 0, 0); 
           Rahul.setPaint(Color.blue);  
           Rahul.drawLine(0, -100, 0, 0); 
           Rahul.setPaint(Color.blue);  
           Rahul.drawLine(100, 0, 100, 100); 
           Rahul.setPaint(Color.blue);  
           Rahul.drawLine(-100, 0, -100, -100); 
           Rahul.setPaint(Color.red);  
           Rahul.drawLine(0, -100, 100, -100); 
           Rahul.setPaint(Color.blue);  
           Rahul.drawLine(-110, 100, 0, 100); 
           Rahul.setPaint(Color . black);  
           Rahul.rotate(Math.toRadians(a));

            System.out.print("Enter a angle - : ");
            a = sc.nextFloat();
        } while (c == 0);
    }
}