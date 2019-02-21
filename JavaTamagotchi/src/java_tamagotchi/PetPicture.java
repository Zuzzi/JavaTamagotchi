package java_tamagotchi;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class PetPicture extends JPanel {

	public void paintComponent(Graphics g) {

		super.paintComponent(g);
		Image picture = new ImageIcon(this.getClass().getResource("/Mpet1.png")).getImage();

		// male - neutral - 0

		if (Pet.sex.equals("Male") && Pet.status.equals("Neutral") && Pet.position == 0) {

			picture = new ImageIcon(this.getClass().getResource("/Mpet1.png")).getImage();

			g.drawImage(picture, 0, 0, this);

		}

		// male - neutral - 1

		else if (Pet.sex.equals("Male") && Pet.status.equals("Neutral") && Pet.position == 1) {

			picture = new ImageIcon(this.getClass().getResource("/Mpet2.png")).getImage();

			g.drawImage(picture, 0, 0, this);

		}

		// male - happy - 0

		else if (Pet.sex.equals("Male") && Pet.status.equals("Happy") && Pet.position == 0) {

			picture = new ImageIcon(this.getClass().getResource("/Mpet1happy.png")).getImage();

			g.drawImage(picture, 0, 0, this);

		}

		// male - happy - 1

		else if (Pet.sex.equals("Male") && Pet.status.equals("Happy") && Pet.position == 1) {

			picture = new ImageIcon(this.getClass().getResource("/Mpet2happy.png")).getImage();

			g.drawImage(picture, 0, 0, this);

		}

		// male - sad - 0

		else if (Pet.sex.equals("Male") && Pet.status.equals("Sad") && Pet.position == 0) {

			picture = new ImageIcon(this.getClass().getResource("/Mpet1sad.png")).getImage();

			g.drawImage(picture, 0, 0, this);

		}

		// male - sad - 1

		else if (Pet.sex.equals("Male") && Pet.status.equals("Sad") && Pet.position == 1) {

			picture = new ImageIcon(this.getClass().getResource("/Mpet2sad.png")).getImage();

			g.drawImage(picture, 0, 0, this);

		}

		// female - neutral - 0

		else if (Pet.sex.equals("Female") && Pet.status.equals("Neutral") && Pet.position == 0) {

			picture = new ImageIcon(this.getClass().getResource("/Fpet1.png")).getImage();

			g.drawImage(picture, 0, 0, this);

		}

		// female - neutral - 1

		else if (Pet.sex.equals("Female") && Pet.status.equals("Neutral") && Pet.position == 1) {

			picture = new ImageIcon(this.getClass().getResource("/Fpet2.png")).getImage();

			g.drawImage(picture, 0, 0, this);

		}

		// female - happy - 0

		else if (Pet.sex.equals("Female") && Pet.status.equals("Happy") && Pet.position == 0) {

			picture = new ImageIcon(this.getClass().getResource("/Fpet1happy.png")).getImage();

			g.drawImage(picture, 0, 0, this);

		}

		// female - happy - 1

		else if (Pet.sex.equals("Female") && Pet.status.equals("Happy") && Pet.position == 1) {

			picture = new ImageIcon(this.getClass().getResource("/Fpet2happy.png")).getImage();

			g.drawImage(picture, 0, 0, this);

		}

		// female - sad - 0

		else if (Pet.sex.equals("Female") && Pet.status.equals("Sad") && Pet.position == 0) {

			picture = new ImageIcon(this.getClass().getResource("/Fpet1sad.png")).getImage();

			g.drawImage(picture, 0, 0, this);

		}

		// female - sad - 1

		else if (Pet.sex.equals("Female") && Pet.status.equals("Sad") && Pet.position == 1) {

			picture = new ImageIcon(this.getClass().getResource("/Fpet2sad.png")).getImage();

			g.drawImage(picture, 0, 0, this);

		}

	}

}
