package java_tamagotchi;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JOptionPane;


public class ListenerMenu implements ActionListener {
	
	
	static GUIpet pet;
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		Object source = e.getSource();
		
		if (source == GUImenu.newPet ) {
			
			
			pet = new GUIpet();
			
			JavaTamagotchi.menu.setVisible(false);
			
			
			
			
			
		}
		
		
		
		
		else if (source == GUImenu.load) {
			
			
			
			
			
			try {
				Database.connect();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			
			
			
			
			Boolean tableExistence = false;
			Boolean gameExistence = false;
			
			
			try {
				tableExistence = Database.TableExistence();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			
			
			
			
			if (!tableExistence) {
				
				
				
				infoBoxError("You need to create your own pet first!","Error");
				
				
				
				
				
			}
			
			
			else {
				
				
				
				try {
					gameExistence = Database.gameExistence();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				
				
				
				
				
				
				if (!gameExistence) {
					
					
					
					infoBoxError("You need to create your own pet first!","Error");
					
					
					
					
				}
				
				
				
				
				else {
					
					
					
					
					
					
					
					
					try {
						Database.load();
					} catch (SQLException e1) {

						e1.printStackTrace();
					}
					
					
					
                    ListenerPet.game = new GUIgame();
					
					JavaTamagotchi.menu.setVisible(false);
					
					
					
					
					
				}
				
				
				
				
				
				
				try {
					Database.disconnect();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				
				
				
				
				
				
				
				
				
				
				
				
			}
			
			
			
			
			
			
			
			
			
			
			
			
		}
		
		
		
		
		else if (source == GUImenu.exit) {
			
			
			System.exit(0);
			
			
		}
		
		
		
		
	}
	
	
	
	
	
	

	void addListener(JButton c){
		c.addActionListener(this);
	}
	
	
	

	
	
	

	static void infoBoxError(String infoMessage, String location){
  	JOptionPane.showMessageDialog(null, infoMessage, "" + location,JOptionPane.ERROR_MESSAGE);
	
}
	
	
	
	
	
	
	
	
	
	
	

}
