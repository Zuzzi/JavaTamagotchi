package java_tamagotchi;

public class Mover {

	static void move(String item) {

		if (item.equals("Game console") && !GUIgame.nes.isVisible())
			GUIgame.nes.setVisible(true);
		else if (item.equals("Game console") && GUIgame.nes.isVisible())
			GUIgame.nes.setVisible(false);

		else if (item.equals("Painting") && !GUIgame.painting.isVisible())
			GUIgame.painting.setVisible(true);
		else if (item.equals("Painting") && GUIgame.painting.isVisible())
			GUIgame.painting.setVisible(false);

		else if (item.equals("Flower") && !GUIgame.flower.isVisible())
			GUIgame.flower.setVisible(true);
		else if (item.equals("Flower") && GUIgame.flower.isVisible())
			GUIgame.flower.setVisible(false);

		else if (item.equals("Tv") && !GUIgame.tv.isVisible())
			GUIgame.tv.setVisible(true);
		else if (item.equals("Tv") && GUIgame.tv.isVisible())
			GUIgame.tv.setVisible(false);

	}

}
