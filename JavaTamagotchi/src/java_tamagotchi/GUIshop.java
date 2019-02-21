package java_tamagotchi;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class GUIshop extends JFrame {

	static JButton buy;

	Nes nes;
	Painting painting;
	Flower flower;
	Tv tv;

	static JRadioButton radioNes;
	static JRadioButton radioPainting;
	static JRadioButton radioFlower;
	static JRadioButton radioTv;

	ArrayList<JRadioButton> list;

	JPanel Cshop;

	ListenerShop listener;

	public GUIshop() {

		buy = new JButton("Buy");
		nes = new Nes();
		painting = new Painting();
		flower = new Flower();
		tv = new Tv();

		Cshop = new JPanel();

		listener = new ListenerShop();

		Cshop.setLayout(null);
		Cshop.setPreferredSize(new Dimension(480, 600));

		buildList();

		Cshop.add(buy);
		Cshop.add(nes);
		Cshop.add(painting);
		Cshop.add(flower);
		Cshop.add(tv);

		buy.setBounds(180, 550, 120, 30);

		nes.setBounds(20, 0, 156, 168);
		painting.setBounds(300, 0, 135, 180);
		flower.setBounds(20, 300, 90, 130);
		tv.setBounds(270, 280, 180, 195);

		setContentPane(Cshop);
		pack();

		Cshop.setBackground(Color.white);

		nes.setBackground(Color.white);
		painting.setBackground(Color.white);
		flower.setBackground(Color.white);
		tv.setBackground(Color.white);

		buy.setBackground(Color.white);
		buy.setForeground(Color.red);

		Dimension dimWindow = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation((dimWindow.width - getWidth()) / 2, (dimWindow.height - getHeight()) / 2);
		setResizable(false);
		setVisible(false);
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setTitle("Shop");

		listener.addListener(buy);

	}

	private void buildList() {

		ButtonGroup group = new ButtonGroup();

		radioNes = new JRadioButton("Game console (3 gold)", false);
		radioPainting = new JRadioButton("Painting (2 gold)", false);
		radioFlower = new JRadioButton("Flower (1 gold)", false);
		radioTv = new JRadioButton("Tv (2 gold)", false);

		radioNes.setBackground(Color.white);
		radioPainting.setBackground(Color.white);
		radioFlower.setBackground(Color.white);
		radioTv.setBackground(Color.white);

		list = new ArrayList<JRadioButton>();

		Cshop.add(radioNes);
		Cshop.add(radioPainting);
		Cshop.add(radioFlower);
		Cshop.add(radioTv);

		group.add(radioNes);
		group.add(radioPainting);
		group.add(radioFlower);
		group.add(radioTv);

		radioNes.setBounds(20, 200, 200, 50);
		radioPainting.setBounds(300, 200, 200, 50);
		radioFlower.setBounds(20, 460, 200, 50);
		radioTv.setBounds(300, 460, 200, 50);

		list.add(radioNes);
		list.add(radioPainting);
		list.add(radioFlower);
		list.add(radioTv);

	}

}
