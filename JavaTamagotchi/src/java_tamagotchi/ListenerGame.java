package java_tamagotchi;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class ListenerGame implements ActionListener {

	static GUIshop shop = new GUIshop();
	static GUIinventory inventory = new GUIinventory();

	@Override
	public void actionPerformed(ActionEvent e) {

		Object source = e.getSource();

		if (source == GUIgame.feed) {

			Monitor.setAndGetEnergy(5);

			ListenerPet.game.energyBar.repaint();

		}

		else if (source == GUIgame.hug) {

			Monitor.setAndGetLove(5);

			ListenerPet.game.loveBar.repaint();

		}

		else if (source == GUIgame.heal) {

			Monitor.setAndGetHp(5);

			ListenerPet.game.hpBar.repaint();

		}

		else if (source == GUIgame.shop) {

			shop.setVisible(true);

		}

		else if (source == GUIgame.inventory) {

			inventory.setVisible(true);
			inventory.buildList();
			inventory.fillList();
			inventory.repaint();

		}

		else if (source == GUIgame.save) {

			String name = Pet.name;
			String sex = Pet.sex;

			int health = Monitor.setAndGetHp(0);
			int energy = Monitor.setAndGetEnergy(0);
			int love = Monitor.setAndGetLove(0);
			int gold = Monitor.setAndGetGold(0);

			String inventory0 = GUIinventory.list.get(0).getText();
			String inventory1 = GUIinventory.list.get(1).getText();
			String inventory2 = GUIinventory.list.get(2).getText();
			String inventory3 = GUIinventory.list.get(3).getText();

			Boolean item0 = Merchant.items[0];
			Boolean item1 = Merchant.items[1];
			Boolean item2 = Merchant.items[2];
			Boolean item3 = Merchant.items[3];

			try {
				Database.connect();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}

			if (Database.isConnected) {

				Boolean tableExistence = false;

				try {
					tableExistence = Database.TableExistence();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}

				if (!tableExistence) {

					try {
						Database.executeQuery(Query.createTable);
					} catch (SQLException e1) {
						e1.printStackTrace();
					}

				}

				try {
					Database.executeQuery(Query.deleteGame);
				} catch (SQLException e2) {
					e2.printStackTrace();
				}

				String query = "insert into GAME values  " + "('" + name + "'," + "'" + sex + "'," + health + ","
						+ energy + "," + love + "," + +gold + "," + "'" + inventory0 + "'," + "'" + inventory1 + "',"
						+ "'" + inventory2 + "'," + "'" + inventory3 + "'," + item0 + "," + item1 + "," + item2 + ","
						+ item3 + ")";

				try {
					Database.executeQuery(query);
				} catch (SQLException e1) {
					e1.printStackTrace();
				}

				infoBox("Game saved succesfully!", "Info");

				try {
					Database.disconnect();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}

		}

		else if (source == GUIgame.exit) {

			int choice;

			String[] options = new String[2];
			options[0] = new String("Yes");
			options[1] = new String("No");

			choice = JOptionPane.showOptionDialog(GUIgame.Cgame, "Are you sure? Unsaved progress will be lost!",
					"Attention", 0, JOptionPane.INFORMATION_MESSAGE, null, options, null);

			if (choice == 0) {

				System.exit(0);

			}

		}

	}

	void addListener(JButton c) {
		c.addActionListener(this);
	}

	static void infoBox(String infoMessage, String location) {
		JOptionPane.showMessageDialog(null, infoMessage, "" + location, JOptionPane.INFORMATION_MESSAGE);

	}

}
