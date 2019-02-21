package java_tamagotchi;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class ListenerPet implements ActionListener {

	static GUIgame game;

	@Override
	public void actionPerformed(ActionEvent e) {

		Object source = e.getSource();

		if (source == GUIpet.start) {

			if (ListenerMenu.pet.name.getText().isEmpty())
				infoBoxError("You must name your pet!", "Error");

			else {

				Boolean match = false;
				int k = -1;

				Pet.name = ListenerMenu.pet.name.getText();

				for (int i = 0; i < ListenerMenu.pet.list.size() && !match; i++)

					if (ListenerMenu.pet.list.get(i).isSelected()) {

						k = i;
						match = true;

					}

				Pet.sex = ListenerMenu.pet.list.get(k).getText();

				game = new GUIgame();

				ListenerMenu.pet.setVisible(false);

			}

		}

		else if (source == GUIpet.male) {

			ListenerMenu.pet.icon.type = "male";

			ListenerMenu.pet.icon.repaint();

		}

		else if (source == GUIpet.female) {

			ListenerMenu.pet.icon.type = "female";

			ListenerMenu.pet.icon.repaint();

		}

	}

	void addListener(JButton c) {
		c.addActionListener(this);
	}

	void addListenerRadio(JRadioButton c) {

		c.addActionListener(this);

	}

	static void infoBoxError(String infoMessage, String location) {
		JOptionPane.showMessageDialog(null, infoMessage, "" + location, JOptionPane.ERROR_MESSAGE);

	}

}
