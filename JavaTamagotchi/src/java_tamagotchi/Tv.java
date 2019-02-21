package java_tamagotchi;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Tv extends JPanel {

	public void paintComponent(Graphics g) {

		super.paintComponent(g);
		Image picture = new ImageIcon(this.getClass().getResource("/tv.png")).getImage();

		g.drawImage(picture, 0, 0, this);

	}

}
