package director;

import builder.NasiGorengBuilder;
import model.Ayam;
import model.Ikan;

public class Director {

	public Director() {
		// TODO Auto-generated constructor stub
		
	}
	
	public void createNasiGorengAyamBakar(NasiGorengBuilder builder) {
		builder.setNamaNasiGoreng("Nasi Goreng Ayam Bakar");
		builder.setAyan(new Ayam("Ayam Bakar","Dada"));
		builder.setJumlahTelur(2);
		builder.setPakaiSayur(true);
		builder.setPedas(true);
	}
	
	public void createNasiGorengIkanBakar(NasiGorengBuilder builder) {
		builder.setNamaNasiGoreng("Nasi Goreng Ikan Bakar");
		builder.setIkan(new Ikan("Ikan Bakar"));
		builder.setJumlahTelur(2);
		builder.setPakaiSayur(true);
		builder.setPedas(true);
	}
}
