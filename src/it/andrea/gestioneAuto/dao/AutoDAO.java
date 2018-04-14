package it.andrea.gestioneAuto.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import it.andrea.gestioneAuto.modello.Auto;

public class AutoDAO implements IAutoDAO {
	
	private PreparedStatement pst = null;
	private Statement st = null;
	private ResultSet rs = null;
	private String strElencoAuto = "Select * from Auto";
	
	@Override
	public List<Auto> ListaAuto() {
		List<Auto> lstAuto = new ArrayList<Auto>();
		try {
			st = ConnessioneDB.getConnessione().createStatement();
			rs = st.executeQuery(strElencoAuto);
			while(rs.next()){
				Auto a = new Auto(rs.getString("Targa"), 
						          rs.getString("Marca"), 
						          rs.getString("Modello"),
						          rs.getInt("AnnoImmatricolazione"), 
						          rs.getInt("PotenzaKW"));
				lstAuto.add(a);
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		try {
			ConnessioneDB.getConnessione().close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lstAuto;
	}

	@Override
	public void InserisciAuto(Auto auto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void CancellaAuto(String targa) {
		// TODO Auto-generated method stub
		
	}
	
}
