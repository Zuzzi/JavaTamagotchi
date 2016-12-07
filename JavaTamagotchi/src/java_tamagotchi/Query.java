package java_tamagotchi;

public class Query {
	
	
	
	

	static String createTable = "create table game ( name varchar(20) primary key, sex varchar(10), health int, energy int, love int,"
			+ "gold int, inventory0 varchar(20), inventory1 varchar(20), inventory2 varchar(20), inventory3 varchar(20),"
			+ "item0 boolean, item1 boolean, item2 boolean, item3 boolean);";
	
	
	
	static String deleteGame = "delete from game;";
	
	
	
	
	
	static String load = "select * from game";
	
	
	
	
	
	
	

}
