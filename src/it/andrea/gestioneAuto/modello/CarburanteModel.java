package it.andrea.gestioneAuto.modello;

import java.util.ArrayList;
import java.util.List;

public class CarburanteModel {

	private List<Carburante> carburante;
	
	public CarburanteModel (){
		
		carburante = new ArrayList<Carburante>();
	}
	
	public void setCarburante(Carburante carburante){
		
		this.carburante.add (carburante);
	}
	public List<Carburante> getListaCarburante (){
		
		return this.carburante;
	}
	public double getTotCostoCarburante(){
		
		double tot = 0;
		for (int i = 0; i<carburante.size();i++){
			tot = tot + carburante.get(i).getImporto();
		}
		return tot;
	}

	public double getTotLitriCarburante(){
			
			double tot = 0;
			for (int i = 0; i<carburante.size();i++){
				tot = tot + carburante.get(i).getLitri();
			}
			return tot;
		}
}
