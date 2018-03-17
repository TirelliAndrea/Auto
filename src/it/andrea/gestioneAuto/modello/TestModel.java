package it.andrea.gestioneAuto.modello;

import java.text.DateFormat;
import java.time.LocalDate;

public class TestModel {

	public static void main(String[] args) {

		AutoModel a = new AutoModel();
		AutoModel b = new AutoModel();
		
		
		
		
		a.setAuto(new Auto("AF631AK","Seat","Ibiza"));
		a.getCarburante().setCarburante(new Carburante(LocalDate.now(),65,25.65,150000));
		
		b.setAuto(new Auto("DP862RG","Fiat","Punto"));
		b.getCarburante().setCarburante(new Carburante(LocalDate.of(2017, 11, 20),10,25.65,1650000));
		b.getCarburante().setCarburante(new Carburante(LocalDate.of(2017,10,1),100,30.58,100000));
		
		System.out.println(a.getCarburante().getListaCarburante().size());
		System.out.println(a.toString());
		System.out.println(a.getCarburante().getTotCostoCarburante());
		System.out.println(a.getCarburante().getTotLitriCarburante());
		
		System.out.println(b.getCarburante().getListaCarburante().get(1).getDataRifornimento());
		System.out.println(b.getCarburante().getTotCostoCarburante());
		System.out.println(b.getCarburante().getTotLitriCarburante());
	}
}