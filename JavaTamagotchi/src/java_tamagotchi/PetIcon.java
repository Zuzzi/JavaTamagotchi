package java_tamagotchi;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class PetIcon extends JPanel {

	String type;

	public PetIcon(String ptype) {

		type = ptype;

	}

	public void paintComponent(Graphics g) {

		super.paintComponent(g);
		Image picture = new ImageIcon(this.getClass().getResource("/MpetIcon.png")).getImage();

		if (type.equals("male")) {

			g.drawImage(picture, 0, 0, this);

		}

		else if (type.equals("female")) {

			picture = new ImageIcon(this.getClass().getResource("/FpetIcon.png")).getImage();

			g.drawImage(picture, 0, 0, this);

		}

	}

}
