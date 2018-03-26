package it.andrea.gestioneAuto.modello;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import javafx.beans.InvalidationListener;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;

public class AutoModel{

	private List<Auto> lstAuto = new ArrayList<Auto>(); 
	private CarburanteModel carburante;
	
	public AutoModel (){
		
		this.carburante = new CarburanteModel();
	}
	
	public boolean setAuto (Auto auto){
		
		
		if(!lstAuto.contains(auto)){
		lstAuto.add(auto);
		return true;
		}else {
			return false;
		}
	}
	
	//to do funzione che restituisce lista auto
	
	public List<Auto> getLstAuto() {
		return lstAuto;
	}

	

	public void setLstAuto(List<Auto> lstAuto) {
		this.lstAuto = lstAuto;
	}

	public CarburanteModel getCarburante() {
		return carburante;
	}

	public void setCarburante(CarburanteModel carburante) {
		this.carburante = carburante;
	}

	

}
