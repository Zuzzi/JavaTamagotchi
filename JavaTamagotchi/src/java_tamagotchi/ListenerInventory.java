package java_tamagotchi;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ListenerInventory implements ActionListener {

	void addListener(JButton c) {
		c.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		Object source = e.getSource();

		if (source == GUIinventory.add_hide) {

			int k = -1;

			for (int i = 0; i < 4; i++) {

				if (GUIinventory.list.get(i).isSelected())
					k = i;

			}

			if (k >= 0 && !GUIinventory.list.get(k).getText().equals("SLOT"))
				Mover.move(GUIinventory.list.get(k).getText());

		}

	}

}
