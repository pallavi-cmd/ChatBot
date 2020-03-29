import java.awt.BorderLayout;  
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import calci;
import TTT1;
import java.util.Date;
public class newchat extends JFrame{
	private JTextArea chatarea=new JTextArea();
    private JTextField chatbox=new JTextField();
    public newchat() {
    	final JFrame frame=new JFrame("Chatbot");
    	final JButton b=new JButton(new ImageIcon("C:\\Users\\Vinay\\Desktop\\ttt.jpg"));
    	final JButton br=new JButton(new ImageIcon("C:\\Users\\Vinay\\Desktop\\calci.jpg"));
    	final JButton brr=new JButton(new ImageIcon("C:\\Users\\Vinay\\Desktop\\tomandjerry1.jpg"));
    	ImageIcon icon=new ImageIcon("C:\\Users\\Vinay\\Desktop\\icon4.jpg");
    	//final ImageIcon img=new ImageIcon("C:\\Users\\Vinay\\Desktop\\background14.jpg");
    	final ImageIcon img1=new ImageIcon("C:\\Users\\Vinay\\Desktop\\background3.jpg");
    	final JLabel background1=new JLabel("",img1,JLabel.CENTER);
    	//final JLabel background=new JLabel("",img,JLabel.CENTER);
    	setDefaultCloseOperation(EXIT_ON_CLOSE);
    	frame.setSize(600,600);
    	frame.setVisible(true);
    	frame.setResizable(false);
    	frame.setLayout(null);
    	frame.setIconImage (icon.getImage());
    	setVisible(true);
    	frame.add(background1);
    	background1.setBounds(0,0,600,600);
    	setVisible(true);
    	chatbox.setBackground(Color.WHITE);
    	setVisible(true);
    	frame.add(b);
    	b.setBounds(400,500,60,60);b.setVisible(true);
    	frame.add(br); 
    	br.setBounds(475,500,60,60);br.setVisible(true);
    	frame.add(brr);
    	brr.setBounds(325,500,60,60);brr.setVisible(true);
    	frame.add(chatarea);
    	setVisible(true);
    	frame.add(chatbox);
    	setVisible(true);
    	chatarea.setSize(550,450);
    	chatarea.setLocation(2,2);
    	chatbox.setSize(300,30);
    	chatbox.setLocation(2,500);
    	setVisible(true);
    	final SimpleDateFormat formatt=new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		final Date date=new Date();
    	//chatarea.add(background);
    	//background.setBounds(0,0,600,600);
    	//setVisible(true);
    	 chatbox.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e) {
				final String gtext=chatbox.getText();
				chatarea.append("YOU:" +gtext +"\n");
				chatbox.setText("");
				if(gtext.contains("Hi")||gtext.contains("hi")||gtext.contains("Hai")||gtext.contains("hai")||gtext.contains("Hello")||gtext.contains("Hola")) {
		 			int r=(int)(Math.random()*3+1);
		 			if(r==1) {
						newchat("Hi");
					}
					else if(r==2){
						newchat("Hola");
					}
					else if(r==3) {
						newchat("Hello");
					}
				}
				else if(gtext.contains("Good Morning")||gtext.contains("good morning")||gtext.contains("gud mrng")||gtext.contains("good mrng")||gtext.contains("gud morning")) {
					newchat("Good Morning.Have a Nice Day");
				}
				else if(gtext.contains("want to calculate")||gtext.contains("need ur help in calculation")||gtext.contains("can u help me to calculate?")||gtext.contains("i need to do calculate")||gtext.contains("calculation please?")) {
					newchat("Sure.I can help u to calculate ur problem");
					newchat("Click below calculator button for simple calculations");
				}
				else if(gtext.contains("How are you?")||gtext.contains("how are you?")||gtext.contains("How r u?")||gtext.contains("how r you?")){
					int r=(int)(Math.random()*3+1);
					if(r==1) {
						newchat("i'm fine and u?");
					}
					else if(r==2){
						newchat("Doing well and u?");
					}
					else if(r==3) {
						newchat("i'm great and u?");
					}
				}
				else if(gtext.contains("fine")||gtext.contains("doing well")||gtext.contains("great")) {
					newchat("Great to hear");
				}
				else if(gtext.contains("sad")||gtext.contains("not doing well")||gtext.contains("not feeling well")) {
					newchat("sorry to hear");
				}
				else if(gtext.contains("what is your occupation?")||gtext.contains("what are you doing?")||gtext.contains("how can u help me?")) {
					newchat("Chatting with u");
					newchat("One of my calculator button can help u with calculations");
					newchat("can provide entertainment through the below games");
				}
				else if(gtext.contains("em doing?")||gtext.contains("what are you doing now?")||gtext.contains("what r u doing now?")) {
					newchat("Chatting with u");
				}
				else if(gtext.contains("Are u free to chat?")||gtext.contains("can u chat with me?")||gtext.contains("want to chat with u")) {
					newchat("yes");
					newchat("Sure i'm always ready to accompany u");
				}
				else if(gtext.contains("Thank you")||gtext.contains("thank u")||gtext.contains("thank u so much")) {
					newchat("you are my friend");
				}
				else if(gtext.contains("Bye")||gtext.contains("bye bye")||gtext.contains("i'm going")) {
					newchat("Bye");
					newchat("Take Care");
				}
				else if(gtext.contains("Good Night")||gtext.contains("good night")||gtext.contains("going to sleep")) {
					newchat("Good Night");
					newchat("sleep tight");
				}
				else if(gtext.contains("What's the time now?")||gtext.contains("time please?")||gtext.contains("what time is it?")) {
					newchat(formatt.format(date));
				}
				else {
					int r=(int)(Math.random()*3+1);
					if(r==1) {
						newchat("I don't understand");
					}
					else if(r==2){
						newchat("please come again");
					}
					else if(r==3) {
						newchat("shut up");
					}
					
				}
				
			}
			
			private void newchat(String str) {
				chatarea.append("BOT:" +str +"\n");
			}	
    	});
    
    br.addActionListener(new ActionListener(){

		public void actionPerformed(ActionEvent f) {
			calci c=new calci();
			c.setVisible(true);
		}
    });
    b.addActionListener(new ActionListener() {

		public void actionPerformed(ActionEvent j) {
			TTT1 t=new TTT1();
			t.setVisible(true);
		}
    	
    });
    brr.addActionListener(new ActionListener() {

		public void actionPerformed(ActionEvent arg0) {
			CatchTheRat CTR=new CatchTheRat(getDefaultCloseOperation());
			CTR.setVisible(true);
			setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);  
		}
    	
    });
    }
	public static void main(String[] args) {
		new newchat();
	}

}
