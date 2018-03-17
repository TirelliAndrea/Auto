package it.andrea.gestioneAuto.modello;

import java.time.LocalDate;

public class Carburante {

	private LocalDate dataRifornimento;
	private double importo;
	private double litri;
	private double km;
	
	public Carburante(LocalDate dataRifornimento, double importo, double litri, double km) {
		super();
		
		if (dataRifornimento.isAfter(LocalDate.now()) || importo <= 0 || litri <=0 || km <=0){
			return ;
		}
		this.dataRifornimento = dataRifornimento;
		this.importo = importo;
		this.litri = litri;
		this.km = km;
	}

	public LocalDate getDataRifornimento() {
		return dataRifornimento;
	}

	/**
	 * Setta una data di rifornimento
	 * @param dataRifornimento
	 * @return true se la data inserita è prima della data di adesso
	 */
	public boolean setDataRifornimento(LocalDate dataRifornimento) {
		if(dataRifornimento.isBefore(LocalDate.now())){
				this.dataRifornimento = dataRifornimento;
				return true;
		}else{
			return false;
		}
	}

	public double getImporto() {
		return importo;
	}

	public void setImporto(double importo) {
		this.importo = importo;
	}

	public double getLitri() {
		return litri;
	}

	public void setLitri(double litri) {
		this.litri = litri;
	}

	public double getKm() {
		return km;
	}

	public void setKm(double km) {
		this.km = km;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dataRifornimento == null) ? 0 : dataRifornimento.hashCode());
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
		Carburante other = (Carburante) obj;
		if (dataRifornimento == null) {
			if (other.dataRifornimento != null)
				return false;
		} else if (!dataRifornimento.equals(other.dataRifornimento))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Carburante [dataRifornimento=" + dataRifornimento + ", importo=" + importo + ", litri=" + litri
				+ ", km=" + km + "]";
	}
	
	
}
