package gui;

import java.awt.EventQueue;
import java.io.*;

import javax.imageio.*;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.Timer;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.border.LineBorder;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.Icon;

import java.awt.Cursor;


//Used images in the Code is present in the img folder of the repository !

public class ltriangle implements ActionListener{

	private JFrame frame;
	private JTextField txtp1;
	private JTextField txtp2;
	JLabel lblresult;
	JLabel comment1;
	Timer t;
	JLabel lblLoveLove;
	Timer t1;
	int i;
	String temp="";
	/**
	 * @wbp.nonvisual location=-39,-31
	 */
	private final JTextField textField = new JTextField();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ltriangle window = new ltriangle();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ltriangle() {
		initialize();
		t=new Timer(200, this);
		
	}
	public void actionPerformed(ActionEvent e)
	{
		
		int r=(int )(255*Math.random());
		int g=(int )(255*Math.random());
		int b=(int )(255*Math.random());
		Color c=new Color(r,g,b);
		comment1.setForeground(c);
		String s=" Valentine";
		
		if(i==s.length())
		{
			i=0;
			temp="";
		}
			int r1=(int )(255*Math.random());
			int g1=(int )(255*Math.random());
			int b1=(int )(255*Math.random());
			Color c1=new Color(r1,g1,b1);
			lblLoveLove.setForeground(c1);
			temp+=s.charAt(i);
		 lblLoveLove.setText(temp);
		 i++;
			
		
		
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		textField.setColumns(10);
		frame = new JFrame();
		frame.setTitle("Love Meter");
		frame.setBounds(100, 100, 628, 420);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.getContentPane().setLayout(null);
		
		
		//JPanel panel = new JPanel();

		//image is present in the img folder
		ImagePanel panel = new ImagePanel(new ImageIcon("1.gif").getImage());
		//ImageIcon img=new ImageIcon("bglove.jpg");
		//panel.setBackground(Color.pink);
		panel.setForeground(Color.BLACK);
		panel.setBorder(new LineBorder(Color.PINK, 3));
		panel.setBounds(0, 0, 630, 400);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNameOfst = new JLabel("Your Name !!");
		lblNameOfst.setForeground(Color.BLUE);
		lblNameOfst.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNameOfst.setBounds(51, 111, 161, 19);
		panel.add(lblNameOfst);
		
		txtp1 = new JTextField();
		txtp1.setBorder(null);
		txtp1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtp1.setForeground(Color.BLACK);
		txtp1.setBounds(10, 141, 223, 20);
		panel.add(txtp1);
		txtp1.setColumns(10);
		
		JLabel lblNameOfnd = new JLabel("His /Her Name !!!");
		lblNameOfnd.setForeground(Color.BLUE);
		lblNameOfnd.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNameOfnd.setBounds(368, 111, 155, 19);
		panel.add(lblNameOfnd);
		
		txtp2 = new JTextField();
		txtp2.setBorder(null);
		txtp2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtp2.setForeground(Color.RED);
		txtp2.setColumns(10);
		txtp2.setBounds(344, 141, 256, 20);
		panel.add(txtp2);

		//image is present in the img folder of the repository
		ImageIcon imgcalci=new ImageIcon("btncal.png");
		JButton btnCalculate = new JButton((Icon) null);
		btnCalculate.setBorder(new LineBorder(new Color(255, 20, 147), 2));
		btnCalculate.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCalculate.setText("Calculate!!!");
		btnCalculate.setToolTipText("Click to calculate love Percentage!!!");
		btnCalculate.setForeground(Color.WHITE);
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String s1=txtp1.getText();
				String s2=txtp2.getText();
				int a=0,b=0;
				int c=3;
				String s3=(s1.toLowerCase()).trim();
				String s4=(s2.toLowerCase()).trim();
				for(int i=0;i<s3.length();i++)
				{
				       a+=(int )s3.charAt(i);
				}
				for(int j=0;j<s4.length();j++)
				{
					b+=(int )s4.charAt(j);
				}
				int product=a*b;
				int result=product%100;
				if((s3.indexOf("shivam")!=-1)||(s4.indexOf("shivam")!=-1))
				{
					JOptionPane.showMessageDialog(null,"developer name not allowed");
					lblresult.setText("");
					txtp1.setText("");
					txtp2.setText("");
					comment1.setText("");
					c=4;
				}
				 if(s3==""||s4==""||s3==" "||s4==" ")
				{
					//System.out.println("true");
					JOptionPane.showMessageDialog(null,"please enter the name of both person");
				}
				 if (s3.equals(s4))
				{
					JOptionPane.showMessageDialog(null,"name cannot be the same");
					txtp1.setText("");
					txtp2.setText("");
					c=4;
				    lblresult.setText("");
				}
				
				
			
				 if((s1.toLowerCase()).equals(s2.toLowerCase()))
				{
			  lblresult.setText("");
			  c=4;
				}
				 if(s1==""||s2==""||s1==" "||s2==" ")
				{
					JOptionPane.showMessageDialog(null,"Illegal character");
					lblresult.setText("");
					c=4;
				}
				
				
				
		       if(c==3)
				lblresult.setText(result+" %");
		     //comment 
		       String s5,s6;
		        s1=s1.trim();
		        s2=s2.trim();
		       String arr[]=s1.split(" ");
		       String arr1[]=s2.split(" ");
		       s5=arr[0];
		       s6=arr1[0];
		      // int r=(int )(255*Math.random());
				//int g=(int )(255*Math.random());
				//int d=(int )(255*Math.random());
				
					Color c1=new Color(0,0,0);	
						comment1.setForeground(c1);
				t.start();

				//Please Neglect if offending Naughty comments
				  if(result==0&&c==3)
				  {
					  
					comment1.setText("Please Change your sex!!!");  
					
				  }
				  else if(result>0&&result<=10&&c==3)
				  {
					  comment1.setText("Sorry to say !! "+s5+" but it's one sided Love"); 
				  }
				  else if(result>10&&result<=20&&c==3)
				  {
					  comment1.setText("Try your best "+s5+","+" It seems one sided love"); 
				  }
				  else if(result>20&&result<=30&&c==3)
				  {
					  comment1.setText("Ishq kutta hai ishq kutta hai !!!! leave it and study");
				  }
				  else if(result>30&&result<=40&&c==3)
				  {
					  comment1.setText("You & "+s6+" should think about study & parents");
				  }
				  else if(result>40&&result<=50&&c==3)
				  {
					  comment1.setText("Do not lose patient "+s5+" you can achieve "+s6);
				  }
				  else if(result>50&&result<=60&&c==3)
				  {
					  comment1.setText("Just increase chat with "+s6+" to increase closeness");
				  }
				  else if(result>60&&result<=70&&c==3)
				  {
					  comment1.setText(s6+" & you are good friends but increase ur lust ");
				  }
				  else if(result>70&&result<=80&&c==3)
				  {
					  comment1.setText("Awesome !!! "+s5+" & "+s6+" pairs but remove ur lust");
				  }
				  else if(result>80&&result<=90&&c==3)
				  {
					  comment1.setText("Mind blowing "+s5+" & "+s6+" !!! right time to propose");
				  }
				  else if(result>90&&result<=95&&c==3)
				  {
					  comment1.setText("congratulation "+s5+" & "+s6+" you are girlfriend-boyfriend");
				  }
				  else if(result>95&&result<=99&&c==3)
				  {
					  comment1.setText("Congratulation!! "+s5+" & "+s6+","+" You are in close relation "); 
				  }
				  else if(result==100&&c==3)
				  {
					comment1.setText("Congratulation "+s5+" & "+s6+","+" You are the Future couple"); 
				
				  }
		      
		      /* while(true)
				{		
		  */
				//}
				  
			}
		});
		btnCalculate.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnCalculate.setBackground(Color.MAGENTA);
		btnCalculate.setBounds(168, 233, 119, 41);
		panel.add(btnCalculate);
		
		lblresult = new JLabel("");
		lblresult.setHorizontalAlignment(SwingConstants.CENTER);
		lblresult.setForeground(Color.BLACK);
		lblresult.setFont(new Font("Tahoma", Font.BOLD, 48));
		lblresult.setBounds(203, 172, 190, 50);
		panel.add(lblresult);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnReset.setBorder(new LineBorder(new Color(255, 20, 147), 2));
		btnReset.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnReset.setForeground(Color.WHITE);
		btnReset.setBackground(new Color(255, 105, 180));
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtp1.setText("");
				txtp2.setText("");
				lblresult.setText("");
				comment1.setText("");
			}
		});
		btnReset.setBounds(307, 231, 109, 41);
		panel.add(btnReset);
		
		//image is present in the img folder of the repository
		JLabel lblrevheart = new JLabel(new ImageIcon("rheart.gif"));
		lblrevheart.setBounds(238, 87, 103, 86);
		panel.add(lblrevheart);
		
		comment1 = new JLabel("");
		comment1.setBackground(new Color(255, 0, 255));
		comment1.setFont(new Font("Monotype Corsiva", Font.ITALIC, 27));
		comment1.setHorizontalAlignment(SwingConstants.LEFT);
		comment1.setBounds(20, 307, 580, 33);
		panel.add(comment1);
		
		
		lblLoveLove = new JLabel();
		lblLoveLove.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblLoveLove.setHorizontalAlignment(SwingConstants.CENTER);
		lblLoveLove.setForeground(Color.RED);
		lblLoveLove.setBounds(168, 26, 248, 50);
		panel.add(lblLoveLove);
		
		ImageIcon cupid=new ImageIcon("cupid.png");
		ImageIcon grid=new ImageIcon("daphne.png");
		JLabel lblimg1 = new JLabel(new ImageIcon("cupid.png"));
		lblimg1.setBounds(10, 7, 155, 100);
		panel.add(lblimg1);
		
		JLabel lblimg2 = new JLabel(new ImageIcon("daphne.png"));
		lblimg2.setBounds(445, 7, 155, 100);
		panel.add(lblimg2);
		
		
		JLabel label = new JLabel(new ImageIcon("heart.gif"));
		label.setBounds(10, 173, 146, 123);
		panel.add(label);
		
		
		JLabel label_1 = new JLabel(new ImageIcon("heart.gif"));
		label_1.setBounds(454, 173, 146, 123);
		panel.add(label_1);
		
		JLabel lbldesigner = new JLabel("<html><a href=\"\">designer & developer</a> &nbsp; &copy; 2015 reserved</html> ");
		lbldesigner.setHorizontalAlignment(SwingConstants.CENTER);
		lbldesigner.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lbldesigner.setForeground(Color.BLUE);
		lbldesigner.setBounds(368, 370, 252, 19);
		panel.add(lbldesigner);
		lbldesigner.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				try {
					Runtime.getRuntime().exec("\"C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe\" \"http:\\\\www.facebook.com\\shivamsinghratan\"");
				} catch (IOException e) {
					JOptionPane.showMessageDialog(null,"BROWSER CHROME NOT FOUND FIRSTLY PLEASE INSTALL THE CHROME TO VIEW FULL PROFILE");
				}
				
				
			
				
			}
	});
	}	
}
	class ImagePanel extends JPanel {

		  private Image img;

		  public ImagePanel(String img) {
		    this(new ImageIcon(img).getImage());
		  }

		  public ImagePanel(Image img) {
		    this.img = img;
		    Dimension size = new Dimension(img.getWidth(null), img.getHeight(null));
		    setPreferredSize(size);
		    setMinimumSize(size);
		    setMaximumSize(size);
		    setSize(size);
		    setLayout(null);
		  }

		  public void paintComponent(Graphics g) {
		    g.drawImage(img, 0, 0, null);
		  }

}
