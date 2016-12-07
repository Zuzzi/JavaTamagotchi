package java_tamagotchi;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;


public class ListenerShop implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		Object sorgente = e.getSource();
		
		
		
		
		
		if (sorgente == GUIshop.buy) {
			
			
			int k = -1;
			
			
			
			
			for (int i = 0; i< 4; i++) 
				if (ListenerGame.shop.list.get(i).isSelected()) k = i;
			
			
			
			if ( k >= 0) {
				
				
				
				
				String product = ListenerGame.shop.list.get(k).getText();
				int price = Merchant.findPrice(product);
				
				
				
				
				
				if (k >= 0 && Monitor.setAndGetGold(0) >= price && Merchant.items[k]) {
					
					
					
					
					Merchant.sell(product,price);
					
					ListenerGame.shop.setVisible(false);
					
					if (ListenerGame.inventory.isVisible()) {
						

				    	   ListenerGame.inventory.setVisible(true);
				    	   ListenerGame.inventory.buildList();
				    	   ListenerGame.inventory.fillList();
				    	   ListenerGame.inventory.repaint();
				    	   
					}
					

					
					
				}
				
				
				
				
				
				else if (k >= 0 && Monitor.setAndGetGold(0) < price ) {
					
					
					
					
					Merchant.infoBoxError("You don't have enough money!", "Sorry");
					
					
		
					
				}
				
				
				
				else {
					
					
					Merchant.infoBoxError("You've already bought this item!", "Error");
					
					
					
				}
				
	
				
			}
			
			
			
			
			
			else {
				
				
				
				Merchant.infoBoxError("You didn't select any item!", "Error");
				
				
				
			}
	
			
		}
		
	}
	
	
	
	

	

	void addListener(JButton c){
		c.addActionListener(this);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
