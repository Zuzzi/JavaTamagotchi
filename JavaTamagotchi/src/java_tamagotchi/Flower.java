package java_tamagotchi;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Flower extends JPanel {

	public void paintComponent(Graphics g) {

		super.paintComponent(g);
		Image picture = new ImageIcon(this.getClass().getResource("/flower.png")).getImage();

		g.drawImage(picture, 0, 0, this);

	}

}
