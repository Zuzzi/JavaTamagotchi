package java_tamagotchi;
import javax.swing.JOptionPane;


public class Merchant {
	
	
	
	
	static Boolean[] items = new Boolean []  {true,true,true,true};
	
	
	
	
	
	
	
	
	
	
	public static void sell (String product, int price) {
		
		
		
		
		
		
		
		
		ListenerPet.game.labelGold.setText("Gold : " + Monitor.setAndGetGold(-price) );
		ListenerPet.game.labelGold.repaint();
		
		
		
		if (product.equals("Game console (3 gold)")) items[0] = false;
		
		else if (product.equals("Flower (1 gold)")) items[2] = false;
		
		else if (product.equals("Tv (2 gold)")) items[3] = false;
			
		else if (product.equals("Painting (2 gold)")) items[1] = false;
		
		
		
		
		infoBox("Payment completed!", "Info");
			
			
		
		
		
		
		
		
		
		
	}
	
	

	
	
	
	
	
	
	
	
	public static  int findPrice(String value)  {
		
		
		
		int price = 0;
		
		
		if (value.equals("Game console (3 gold)")) price = 3;
		
		else if (value.equals("Flower (1 gold)")) price = 1;
		
		else if (value.equals("Tv (2 gold)")) price = 2;
		
		else if (value.equals("Painting (2 gold)")) price = 2;
		
		
		
		
		return price;
	
		
		
		
		
		
		
		
	}
	
	
	
	
	static void load (Boolean item0, Boolean item1, Boolean item2, Boolean item3) {
		
		
		
		items[0] = item0;
		items[1] = item1;
		items[2] = item2;
		items[3] = item3;
		
		
		
		
		
		
		
	}
	
	
	
	
	
	


	static void infoBoxError(String infoMessage, String location){
	  	JOptionPane.showMessageDialog(null, infoMessage, "" + location,JOptionPane.ERROR_MESSAGE);
		
	}
	
	
	
	

	static void infoBox(String infoMessage, String location){
	  	JOptionPane.showMessageDialog(null, infoMessage, "" + location,JOptionPane.INFORMATION_MESSAGE);
		
	}
	
	
	
	
	

}
