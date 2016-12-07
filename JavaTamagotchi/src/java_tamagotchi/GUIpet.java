package java_tamagotchi;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class GUIpet extends JFrame {
	
	
	static JButton start;
	
	static JRadioButton male;
	static JRadioButton female;
	
	static JTextField name;
	
	JPanel Cpet;
	
	PetIcon icon;
	
	static ArrayList<JRadioButton> list;
	
	static JLabel label;
	
	static ListenerPet listener;
	
	

	int screenRes = Toolkit.getDefaultToolkit().getScreenResolution();
	int fontSize = (int)Math.round(14.0 * screenRes / 72.0);
	
	Font font;
	
	
	
	
	
	
	public GUIpet () {
		
		
		
		start = new JButton("Start");
		name = new JTextField();
		Cpet = new JPanel();
		icon = new PetIcon("male");
		label = new JLabel("Name of your pet");
		listener = new ListenerPet();
		font = new Font ("serif", Font.PLAIN, fontSize);
		
		
		
		

		Cpet.setLayout(null);
		Cpet.setPreferredSize(new Dimension(400,310));
		
		
		

		
		
		buildList();
		
		
		
		
		
		
		
		Cpet.add(start);
		Cpet.add(name);
		Cpet.add(icon);
		Cpet.add(label);
		
		Cpet.setBackground(Color.white);
		
		name.setBounds(50, 25, 150, 30);
		label.setBounds(230, 25, 150, 30);
		icon.setBounds(180,100,200,133);
		start.setBounds(140,270,120,30);
		
		
		
		
		
		start.setBackground(Color.white);
		start.setForeground(Color.red);
		
		name.setDocument(new Limit(20));
		
		
		

	      
	      setContentPane(Cpet);
		  pack();
		  
		  
		  
		  
		  
		  
		
		

		Dimension dimWindow = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation( (dimWindow.width - getWidth())/2,(dimWindow.height - getHeight())/2 );
		setResizable(false);  
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Choose your pet");
	      
	      
		listener.addListener(start);
		    
		  
		
	
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	private void buildList() {
		
		
		
		ButtonGroup group = new ButtonGroup();
		
		
		male = new JRadioButton("Male", true);
		female = new JRadioButton("Female", false);
		
		male.setBackground(Color.white);
		female.setBackground(Color.white);
		
		list = new ArrayList<JRadioButton> ();
		
		Cpet.add(male);
		Cpet.add(female);
		
		
		
		group.add(male);
		group.add(female);
		
		
		
		male.setBounds(50,120, 100, 50);
		female.setBounds(50,170,100,50);
		
		
		
		
		list.add(male);
		list.add(female);
		
		
		
		
		listener.addListenerRadio(male);
		listener.addListenerRadio(female);
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
