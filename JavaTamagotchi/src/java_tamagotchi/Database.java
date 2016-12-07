package java_tamagotchi;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;



public class Database {
	
	

	static  final String JDBC_DRIVER = "org.h2.Driver";  
	static  final String DB_URL = "jdbc:h2:./bin/db/";
	static  final String DB_NOME="db";
	static  final String USER = "admin";
	static  final String PASS = "admin";
	static  boolean isConnected;
	static   Statement stmt = null;
	static	Connection conn=null; 
	
	
	
	
	
	

	
	static boolean connect() throws SQLException {


				isConnected = false;
				try {

					Class.forName(JDBC_DRIVER);
					conn=(DriverManager.getConnection(DB_URL+DB_NOME, USER, PASS));
				
					if(conn!=null)
						isConnected = true;
				
				} catch (Exception e) {  
					infoBoxError("An error occurred during the connection, the program will shut down.","Error");
					
					System.exit(0);
						
				}
				
				return isConnected;
			}
	
	
	
	
	
	

	
	static void disconnect() throws SQLException {


				try {
					conn.close();
					isConnected = false;
				} catch (Exception e) { 
					infoBoxError("An error occurred during the connection, the program will shut down.","Error");
					System.exit(0); }finally {
			         if (stmt!= null) { stmt.close(); }
			     	}
			}
	
	
	
	
	
	
	
	
	

	
	static boolean TableExistence() throws SQLException{


				boolean exist=false;
				int count=0;
			
				 String query =
					        "select count(*)as count from information_schema.tables  where table_name ='GAME'";
					       
				stmt=(conn.createStatement());
				try{
					ResultSet rs = stmt.executeQuery(query);
					while(rs.next()){
			            count = rs.getInt("count");
			        }
					if(count>0)
						exist=true;
					
					
				}catch (SQLException e ) {   
					   
					infoBoxError("An error occurred while checking for the table existence, the program will shut down.","Error");
					System.exit(0);
			    	
			    }finally {
			        if (stmt != null) { stmt.close(); }
			    }
				
				
				return exist;
			}
	
	
	
	
	
	
	
	

	
	 static  void executeQuery(String query) throws SQLException {


		

				
				stmt=(conn.createStatement());
				try{
			
					stmt.executeUpdate(query);
				
				
				}catch(SQLException se){
					infoBoxError("An error occurred while executing a query, the program will shut down.","Error");
					
					
					se.printStackTrace();
					System.exit(0);
				}finally {
			        if (stmt != null) { stmt.close(); }
			    }
				
			}
	 
	
	
	
	
	
	 

	 
	 public static  boolean gameExistence() throws SQLException{



		 		boolean exist=false;
		 		int count=0;
		 		String save=
		 				"select count(*)as count FROM GAME;";
		 		
		 		stmt=(conn.createStatement());
		 		try{
		 			ResultSet rs = stmt.executeQuery(save);
		 			while(rs.next()){
		 	            count = rs.getInt("count");
		 	        }
		 			if(count>0)
		 				exist=true;
		 			
		 			
		 		}catch (SQLException e ) {   
		 			   
		 			infoBoxError("An error occurred while checking for a previous game, the program will shut down.","Error");
		 			System.exit(0);
		 	    	
		 	    }finally {
		 	        if (stmt != null) { stmt.close(); }
		 	    }
		 		
		 		
		 		return	exist;
		 	}
			
	 
	 
	 
	 
	 
	 
	 
	

		
		static  void load()throws SQLException{
			
						stmt=(conn.createStatement());
						try{				
						
							ResultSet rs = stmt.executeQuery(Query.load);
							
					
							while (rs.next()) {
								
								
								
								Pet.load(rs.getString("name"), rs.getString("sex"), rs.getInt("gold"), rs.getInt("health"), rs.getInt("energy"), rs.getInt("love"));
								
								Merchant.load(rs.getBoolean("item0"), rs.getBoolean("item1"), rs.getBoolean("item2"), rs.getBoolean("item3"));
								
								GUIinventory.load(rs.getString("inventory0"), rs.getString("inventory1"), rs.getString("inventory2"), rs.getString("inventory3"));
								
								
					
						
					}
							
							
							            
						}catch (SQLException e ) {   
			   
			infoBoxError("Si è verificato un errore durantela stampa della tabella, il programma verrà chiuso.","Errore");
			System.exit(0);
			
						}
						
						
						
						
						finally {
							if (stmt!= null)  stmt.close(); 
							
						}
						
		}
							
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	static void infoBoxError(String infoMessage, String location){
  	JOptionPane.showMessageDialog(null, infoMessage, "" + location,JOptionPane.ERROR_MESSAGE);
	
}
	
	
	
	
	
	
	
	
	
	
	
	

}
