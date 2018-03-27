package it.andrea.gestioneAuto.modello;

import java.time.LocalDate;

public class Auto {

	private String targa;
	private String marca;
	private String modello;
	private int annoImmatricolazione;
	private int potenzaKW;
	

	public Auto(){
		
	}

	/**
	 * Costruttore della Clase Auto, 
	 * verifica che la targa abbia sette lettere e che i 
	 * parametri marca e modello non siano vuoti
	 * @param targa
	 * @param marca
	 * @param modello
	 */
	public Auto(String targa, String marca, String modello) {
		super();
		if (targa.length()!=7 || marca.length()==0 || modello.length() == 0){
			return  ;
			}
		this.targa = targa;
		this.marca = marca;
		this.modello = modello;
		
	}

	public String getTarga() {
		return targa;
	}

	public void setTarga(String targa) {
		this.targa = targa;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModello() {
		return modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

	public int getAnnoImmatricolazione() {

		return annoImmatricolazione;
	}

	/**
	 * scrive un nuovo parametro Anno Immatricolazione
	 * restituisce true se l'anno è precedente all'anno corrente
	 * false se è maggiore dell'anno corrente
	 * @param annoImmatricolazione
	 * @return true
	 * @return false
	 */
	public boolean setAnnoImmatricolazione(int annoImmatricolazione) {
		if (annoImmatricolazione > LocalDate.now().getYear()){
			return false;
		}
		this.annoImmatricolazione = annoImmatricolazione;
		return true;
	}

	public int getPotenzaKW() {
		return potenzaKW;
	}

	public boolean setPotenzaKW(int potenzaKW) {
		if(potenzaKW>0 ){
		this.potenzaKW = potenzaKW;
		return true;
		}else{
			return false;
		}
	}



	@Override
	public String toString() {
		return "Auto [targa=" + targa + ", marca=" + marca + ", modello=" + modello + ", annoImmatricolazione="
				+ annoImmatricolazione + ", potenzaKW=" + potenzaKW + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((targa == null) ? 0 : targa.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Auto other = (Auto) obj;
		if (targa == null) {
			if (other.targa != null)
				return false;
		} else if (!targa.equals(other.targa))
			return false;
		return true;
	}
	
	
}
