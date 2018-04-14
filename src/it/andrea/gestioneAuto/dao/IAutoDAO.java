package it.andrea.gestioneAuto.dao;

import java.util.List;
import it.andrea.gestioneAuto.modello.*;

public interface IAutoDAO {

	public List<Auto> ListaAuto();
	public void InserisciAuto (Auto auto);
	public void CancellaAuto (String targa);
	
}
