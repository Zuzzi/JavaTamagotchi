package java_tamagotchi;



public class ThreadFamily {
	
	

	
	
	
	public static void spread () {
		
		
		
		
		Stream streamHp = new Stream("hp");
		Stream streamLove = new Stream("love");
		Stream streamEnergy = new Stream("energy");
		Stream streamPet = new Stream("pet");
		Stream streamGold = new Stream("gold");
		Stream streamEmotion = new Stream("emotion");
		
		
		
		Thread threadHp = new Thread(streamHp);
		Thread threadLove = new Thread(streamLove);
		Thread threadEnergy = new Thread(streamEnergy);
		Thread threadPet = new Thread(streamPet);
		Thread threadGold = new Thread(streamGold);
		Thread threadEmotion = new Thread(streamEmotion);
		
		
		
		
		
		threadHp.start();
		threadLove.start();
		threadEnergy.start();
		threadPet.start();
		threadGold.start();
		threadEmotion.start();
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

	

}
