package it.andrea.gestioneAuto.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnessioneDB {
	
	private static Connection connessione= null;
	private String dbURL = "jdbc:ucanaccess://AutoDB.accdb";
	
	public ConnessioneDB (){
		
		try{
			Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
			connessione = DriverManager.getConnection(dbURL);
			} catch (SQLException e) {
				
				e.printStackTrace();
			} catch (ClassNotFoundException e){
				e.printStackTrace();
			}
		
	
	}
	
	public static Connection getConnessione (){
		return connessione;
	}
}
