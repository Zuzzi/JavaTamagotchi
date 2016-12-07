package java_tamagotchi;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;


public class GUIgame extends JFrame {
	
	
	static JButton feed;
	static JButton hug;
	static JButton heal;
	
	static JButton inventory;
	static JButton shop;
	static JButton save;
	static JButton exit;
	
	static JLabel labelName;
	static JLabel labelHp;
	static JLabel labelLove;
	static JLabel labelEnergy;
	static JLabel labelGold;
	
	
	static PetPicture petPicture;
	
	static JProgressBar hpBar;
	static JProgressBar loveBar;
	static JProgressBar energyBar;
	
	static ListenerGame listener;
	
	static JPanel Cgame;
	
	
	
	
	static Nes nes;
	static Painting painting;
	static Flower flower;
	static Tv tv;
	
	
	
	
	public GUIgame () {
		
		
		
		feed = new JButton("Feed");
		hug = new JButton("Hug");
		heal = new JButton("Heal");
		
		inventory = new JButton("Inventory");
		shop = new JButton("Shop");
		save = new JButton("Save");
		exit = new JButton("Exit");
		
		petPicture = new PetPicture();
		
		hpBar = new JProgressBar();
		loveBar = new JProgressBar();
		energyBar = new JProgressBar();
		
		labelName = new JLabel(Pet.name);
		labelLove = new JLabel("Love");
		labelEnergy = new JLabel("Energy");
		labelHp = new JLabel("Health");
		labelGold = new JLabel("Gold : " + Monitor.setAndGetGold(0));
		
		
		nes = new Nes();
		painting = new Painting();
		flower = new Flower();
		tv = new Tv();
		
		
		listener = new ListenerGame();
		
		Cgame = new JPanel();
		
		
		
		
		Cgame.setLayout(null);
		Cgame.setPreferredSize(new Dimension(800,600));
		
		setContentPane(Cgame);
		pack();
		
		
		Cgame.add(feed);
		Cgame.add(hug);
		Cgame.add(heal);
		
		Cgame.add(inventory);
		Cgame.add(shop);
		Cgame.add(save);
		Cgame.add(exit);
		
		Cgame.add(petPicture);
		
		Cgame.add(hpBar);
		Cgame.add(loveBar);
		Cgame.add(energyBar);
		
		Cgame.add(labelName);
		Cgame.add(labelEnergy);
		Cgame.add(labelHp);
		Cgame.add(labelLove);
		Cgame.add(labelGold);
		
		
		Cgame.add(nes);
		Cgame.add(painting);
		Cgame.add(flower);
		Cgame.add(tv);
		
	
		
		
		
		
		heal.setBounds(10,90,120,30);
		feed.setBounds(10,180,120,30);
		hug.setBounds(10,270,120,30);
		
		inventory.setBounds(65,520,120,30);
		shop.setBounds(245,520,120,30);
		save.setBounds(425,520,120,30);
		exit.setBounds(605,520,120,30);
		
		petPicture.setBounds(280,150,395,263);
		
		
		hpBar.setBounds(200,10,100,30);
		energyBar.setBounds(370,10,100,30);
		loveBar.setBounds(540,10,100,30);
		
		labelName.setBounds(40,20,100,20);
		
		labelHp.setBounds(235,45,100,20);
		labelEnergy.setBounds(405,45,100,20);
		labelLove.setBounds(575,45,100,20);
		labelGold.setBounds(700,20,100,20);
		
		
		nes.setBounds(150, 250, 156, 168);
		
		
		tv.setBounds(630,400,180,195);
		
		
		painting.setBounds(660,80,135,180);
		
		
		flower.setBounds(350,410,90,130);
		
		
		
		
		
		
		Cgame.setBackground(Color.white);
		
		
		
		feed.setBackground(Color.white);
		feed.setForeground(Color.red);
		
		hug.setBackground(Color.white);
		hug.setForeground(Color.red);
		
		heal.setBackground(Color.white);
		heal.setForeground(Color.red);
		
		inventory.setBackground(Color.white);
		inventory.setForeground(Color.red);
		
		shop.setBackground(Color.white);
		shop.setForeground(Color.red);
		
		save.setBackground(Color.white);
		save.setForeground(Color.red);
		
		exit.setBackground(Color.white);
		exit.setForeground(Color.red);
		
		
		nes.setBackground(Color.white);
		nes.setVisible(false);
		
		tv.setBackground(Color.white);
		tv.setVisible(false);
		
		painting.setBackground(Color.white);
		painting.setVisible(false);
		
		flower.setBackground(Color.white);
		flower.setVisible(false);
		
		
		
		
		
		hpBar.setMinimum(0);
		hpBar.setMaximum(100);
		hpBar.setValue(Pet.initialHp);
		hpBar.setForeground(Color.red);
		hpBar.setBackground(Color.white);
		
		
		loveBar.setMinimum(0);
		loveBar.setMaximum(100);
		loveBar.setValue(Pet.initialLove);
		loveBar.setForeground(Color.pink);
		loveBar.setBackground(Color.white);
		
		energyBar.setMinimum(0);
		energyBar.setMaximum(100);
		energyBar.setValue(Pet.initialEnergy);
		energyBar.setForeground(Color.blue);
		energyBar.setBackground(Color.white);
		
		
		ThreadFamily.spread();
		
		
		
	
		
		

		Dimension dimWindow = Toolkit.getDefaultToolkit().getScreenSize();
	    setLocation( (dimWindow.width - getWidth())/2,(dimWindow.height - getHeight())/2 );
	    setResizable(false);  
	    setVisible(true);
	    setDefaultCloseOperation( JFrame.DO_NOTHING_ON_CLOSE);
	    addWindowListener(exitListener);
	    
	    
	    setTitle("Java Tamagotchi");
		
		
		
		
		
		
		listener.addListener(feed);
		listener.addListener(hug);
		listener.addListener(heal);
		

		listener.addListener(inventory);
		listener.addListener(shop);
		listener.addListener(save);
		listener.addListener(exit);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	WindowListener exitListener = new WindowAdapter(){
		  @Override
		  public void windowClosing(WindowEvent e) {
			  
			  
			  int choice;
			  
			  String[] options = new String[2];
	    	  options[0] = new String("Yes");
	    	  options[1] = new String("No");
			  
		  	
		    
		      choice = JOptionPane.showOptionDialog(GUIgame.Cgame,"Are you sure? Unsaved progress will be lost!","Attention", 0,JOptionPane.INFORMATION_MESSAGE,null,options,null);
		      if (choice == 0)  System.exit(0);

		  }
		  };
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
