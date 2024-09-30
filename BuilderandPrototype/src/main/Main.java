package main;

import java.util.ArrayList;

import builder.NasiGorengBuilder;
import director.Director;
import model.NasiGoreng;

public class Main {
	ArrayList<NasiGoreng> listNasiGoreng = new ArrayList<>();
	public Main() {
		// TODO Auto-generated constructor stub
		//NasiGoreng nasiGoreng = new NasiGoreng("Nasi Goreng Kecap",true,true,3,new Ayam("Ayam Goreng","Dada"),new Ikan("ikan bakar"));
		NasiGorengBuilder builder = new NasiGorengBuilder();
//		builder.setNamaNasiGoreng("Nasi Goreng Ikan Ayam Bakar!");
//		builder.setAyan(new Ayam("Ayam Bakar","Dada"));
//		builder.setIkan(new Ikan("Ikan Bakar"));
//		builder.setJumlahTelur(2);
//		builder.setPakaiSayur(true);
//		builder.setPedas(true);
		
		Director director = new Director();
		director.createNasiGorengAyamBakar(builder);
		listNasiGoreng.add(builder.getnasiGoreng());
		
		director.createNasiGorengIkanBakar(builder);
		listNasiGoreng.add(builder.getnasiGoreng());
		
		NasiGoreng nasiGoreng = builder.getnasiGoreng();
		System.out.println(nasiGoreng.toString());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
