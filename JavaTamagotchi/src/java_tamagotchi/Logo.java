package java_tamagotchi;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;


public class Logo extends JPanel {
	
	
	

	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Image logo = new ImageIcon(this.getClass().getResource("/logo.png")).getImage();
		
		g.drawImage(logo,0, 0, this);
		
	
		
		
	}
	
	
	
	
	
	

}
