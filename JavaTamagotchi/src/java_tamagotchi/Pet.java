package java_tamagotchi;

public class Pet {

	public static String name;

	public static String sex;

	public static String status = new String("Neutral");

	public static int position = 0;

	public static int gold = 2;

	public static int initialHp = 100;

	public static int initialEnergy = 100;

	public static int initialLove = 100;

	static void load(String p_name, String p_sex, int p_gold, int p_initialHp, int p_initialEnergy, int p_initialLove) {

		name = p_name;
		sex = p_sex;
		gold = p_gold;
		initialHp = p_initialHp;
		initialEnergy = p_initialEnergy;
		initialLove = p_initialLove;

	}

}
