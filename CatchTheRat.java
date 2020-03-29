import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import java.util.Scanner;
class CatchTheRat extends JFrame
{
// The Rat
JLabel lb;
ImageIcon icon=new ImageIcon("C:\\Users\\Vinay\\Desktop\\tomandjerry1.jpg");
// Move it randomly!
Random r;
 public CatchTheRat(int k)
 {
 // Set frame properties
 setTitle("Catch The Rat");
 setIconImage (icon.getImage());
 setVisible(true);
 setLayout(new FlowLayout());
 setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);  
 setVisible(true);
 // Set the background (just for a good look)
 setContentPane(new JLabel(new ImageIcon("C:\\Users\\Vinay\\Desktop\\background12.jpg")));
 // Set layout to the content pane
 getContentPane().setLayout(new FlowLayout());
 // Create the rat
 lb=new JLabel(new ImageIcon("C:\\Users\\Vinay\\Desktop\\jerry.png"));
 // Add the rat
 getContentPane().add(lb);
 // Create Random object
 r=new Random();
 // Create a timer and call it for every k seconds
 new Timer(k,new ActionListener(){
  public void actionPerformed(ActionEvent ae)
  {
  // Move the rat randomly, subtract 75, so that the rat should not meet the edges
  lb.setLocation(r.nextInt(getWidth()-500),r.nextInt(getHeight()-500));
  }
 }).start();
 // Add mouselistener, notify when user clicks it!
 lb.addMouseListener(new MouseAdapter(){
  public void mouseClicked(MouseEvent me)
  {
  // Create a beep sound when clicked to notify
  Toolkit.getDefaultToolkit().beep();
  // Also print it!
  JFrame f=new JFrame("pop up message");
  f.setSize(100,100);
  f.setVisible(true);
  JLabel label=new JLabel("Rat is Caught!");
  label.setBounds(50,100,250,20);
  f.add(label);
  label.setVisible(true);
  dispose();
 // System.out.println("Caught!");
  }
 });
// Maximize the frame
setExtendedState(MAXIMIZED_BOTH);
 }
 public static void main(String args[])
 {
 // Create Scanner object
 Scanner s=new Scanner(System.in);
 // Let the user enter his capability of catching the rat!
 System.out.println("Enter the speed");
 // Read the input
 int k=s.nextInt();
 // Create the frame and send the value of k
 new CatchTheRat(k);
 }
}
