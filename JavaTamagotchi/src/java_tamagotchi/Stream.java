package java_tamagotchi;

public class Stream implements Runnable {

	public String type;

	public Stream(String p_type) {

		type = p_type;

	}

	@Override
	public void run() {

		if (type.equals("hp")) {

			while (true) {

				Monitor.setAndGetHp(-1);

				ListenerPet.game.hpBar.repaint();

				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {

					e.printStackTrace();
				}

			}

		}

		else if (type.equals("energy")) {

			while (true) {

				Monitor.setAndGetEnergy(-1);

				ListenerPet.game.energyBar.repaint();

				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {

					e.printStackTrace();
				}

			}

		}

		else if (type.equals("love")) {

			while (true) {

				Monitor.setAndGetLove(-1);

				ListenerPet.game.loveBar.repaint();

				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {

					e.printStackTrace();
				}

			}

		}

		else if (type.equals("pet")) {

			while (true) {

				Pet.position = (Pet.position + 1) % 2;

				ListenerPet.game.petPicture.repaint();

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

		}

		else if (type.equals("gold")) {

			while (true) {

				try {
					Thread.sleep(300000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				ListenerPet.game.labelGold.setText("Gold : " + Monitor.setAndGetGold(1));
				ListenerPet.game.labelGold.repaint();

			}

		}

		else if (type.equals("emotion")) {

			while (true) {

				int valueHp = Monitor.setAndGetHp(0);
				int valueEnergy = Monitor.setAndGetEnergy(0);
				int valueLove = Monitor.setAndGetLove(0);

				if (valueHp > 75 && valueEnergy > 75 && valueLove > 75) {

					Monitor.setAndGetStatus("Happy");

				}

				else if (valueHp < 50 || valueEnergy < 50 || valueLove < 50) {

					Monitor.setAndGetStatus("Sad");

				}

				else
					Monitor.setAndGetStatus("Neutral");

			}

		}

	}

}
