package java_tamagotchi;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;



public class GUImenu extends JFrame {
	
	
	static JButton newPet;
	static JButton load;
	
	static JButton exit;
	
	static Logo logo;
	
	
	
	static JPanel Cmenu;
	
    ListenerMenu listener;
    
    
	
	int screenRes = Toolkit.getDefaultToolkit().getScreenResolution();
	int fontSize = (int)Math.round(14.0 * screenRes / 72.0);
	
	Font font;
	
	
	
	
	
	
	
	
	
	
	public GUImenu () {
		
		newPet = new JButton("New Pet");
		load = new JButton("Continue");
		
		exit = new JButton("Exit");
		logo = new Logo();
		Cmenu = new JPanel();
		listener = new ListenerMenu();
		font = new Font ("serif", Font.PLAIN, fontSize);
		
		
		Cmenu.setLayout(null);
		Cmenu.setPreferredSize(new Dimension(500,260));
		
		
		
		Cmenu.add(newPet);
		Cmenu.add(load);
		Cmenu.add(exit);
		Cmenu.add(logo);
		
		
		logo.setBounds(0,0,500,169);
		load.setBounds(30,210,120,30);
		newPet.setBounds(190,210,120,30);
		exit.setBounds(350,210,120,30);
		
		
		
		
		
		
		Cmenu.setBackground(Color.white);
		
		newPet.setBackground(Color.white);
		newPet.setForeground(Color.red);
		
		load.setBackground(Color.white);
		load.setForeground(Color.red);

		
		exit.setBackground(Color.white);
		exit.setForeground(Color.red);
		
		
		
		
		
		
		
		setContentPane(Cmenu);
		pack();
		
		
		
		
		
		Dimension dimWindow = Toolkit.getDefaultToolkit().getScreenSize();
	    setLocation( (dimWindow.width - getWidth())/2,(dimWindow.height - getHeight())/2 );
	    setResizable(false);  
	    setVisible(true);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setTitle("menu");
		
		
		
		
		
		
		listener.addListener(newPet);
		listener.addListener(load);
		listener.addListener(exit);
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
