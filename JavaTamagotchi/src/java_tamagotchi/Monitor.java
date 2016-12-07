package java_tamagotchi;



public class Monitor {
	
	
	
	public static synchronized  int setAndGetHp(int value) {
		
		
		
		ListenerPet.game.hpBar.setValue(ListenerPet.game.hpBar.getValue() + value);
		
		
		
		return ListenerPet.game.hpBar.getValue();
		
		
		
		
		
	}
	
	
	
	public static synchronized  int setAndGetEnergy(int value) {
		
		
		ListenerPet.game.energyBar.setValue(ListenerPet.game.energyBar.getValue() + value);
		
		
		
		
		return ListenerPet.game.energyBar.getValue();
		
		
		
	}
	
	
	public static synchronized  int setAndGetLove(int value) {
		
		
		ListenerPet.game.loveBar.setValue(ListenerPet.game.loveBar.getValue() + value);
		
		
		return ListenerPet.game.loveBar.getValue();
		
		
		
		
		
		
	}
	
	
	
	public static synchronized int setAndGetGold (int value) {
		
		
		
		Pet.gold = Pet.gold + value;
		
		
		return Pet.gold;
		
		
		
		
		
		
		
	}
	
	
	
	public static synchronized String setAndGetStatus (String value) {
		
		
		if (!value.isEmpty()) {
			
			Pet.status = value;
			
		}
		
		
		
		
		
		
		return Pet.status;
		
		
	}
	
	
	
	
	
	
	
	
	

}
