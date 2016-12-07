package java_tamagotchi;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;


public class GUIinventory extends JFrame {
	
	
	
	
	
	static ArrayList <JRadioButton> list = new ArrayList <JRadioButton>();
	
	
	static JButton add_hide;
	
	
	
	static JPanel Cinventory;
	
	static ListenerInventory listener;
	
	
	


	int screenRes = Toolkit.getDefaultToolkit().getScreenResolution();
	int fontSize = (int)Math.round(14.0 * screenRes / 72.0);
	
	Font font;
	
	
	
	
	
	public GUIinventory () {
		
		font = new Font ("serif", Font.PLAIN, fontSize);
		list = new ArrayList <JRadioButton>();
		Cinventory = new JPanel();
		add_hide = new JButton("Add/Hide");
		listener = new ListenerInventory();
		
		
		
		Cinventory.setLayout(null);
		Cinventory.setPreferredSize(new Dimension(130,200));
		
		
		
		buildList();
		
		fillList();
		
		
		
		Cinventory.add(add_hide);
		
	
		add_hide.setBounds(10, 160, 120, 30);
		
		
		
		Cinventory.setBackground(Color.white);
		
		add_hide.setBackground(Color.white);
		add_hide.setForeground(Color.red);
		
		
		setContentPane(Cinventory);
		pack();
		
		
		
		
		

		Dimension dimWindow = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation( (dimWindow.width - getWidth())/2 - 500,(dimWindow.height - getHeight())/2 - 200 );
		setResizable(false);  
		setVisible(false);
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setTitle(null);
		
		
		listener.addListener(add_hide);
	      
		
		
		
		
		
	}
	
	
	
	
	
	public void buildList() {
		
		int y = 0;
		
		
		ButtonGroup group = new ButtonGroup();
		
		
		for (int i = 0; i<4; i++) {
			
			
			list.add(new JRadioButton("SLOT", false));
			
			Cinventory.add(list.get(i));
			
			group.add(list.get(i));
			
			list.get(i).setBackground(Color.white);
			
			list.get(i).setBounds(10, y += 30, 120, 20);
			
			
			
			
			
			
		}
		
		

		
	}
	
	
	
	
	
	public void fillList() {
		
		
		int j = 0;
		
		
		for (int i = 0; i<4; i++) {
			
			
			if (!Merchant.items[i]) {
				
				
				if (i == 0) {
					
					
					GUIinventory.list.get(j).setText("Game console");
					
					
					
					
				}
				
				
				
				else if (i == 1) {
					
					
					GUIinventory.list.get(j).setText("Painting");
					
					
					
	
				}
				
				
				
				else if (i == 2) {
					
					
					
					GUIinventory.list.get(j).setText("Flower");
					
				
					
					
				}
				
				
				else if (i == 3) {
					
					
					
					
					list.get(j).setText("Tv");
					
					
					
					
					
					
				}
				
				
				j++;
				
				
				
			}
			
			
	
		}
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	public static void  load (String inventory0, String inventory1, String inventory2, String inventory3) {
		
		
		list.add(new JRadioButton(inventory0,false));
		list.add(new JRadioButton(inventory1,false));
		list.add(new JRadioButton(inventory2,false));
		list.add(new JRadioButton(inventory3,false));
		
		
		
		
		
		
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
