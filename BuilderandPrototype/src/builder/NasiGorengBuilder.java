package builder;

import model.Ayam;
import model.Ikan;
import model.NasiGoreng;

public class NasiGorengBuilder {
	private NasiGoreng nasiGoreng;
	
	public NasiGorengBuilder() {
		// TODO Auto-generated constructor stub
		nasiGoreng = new NasiGoreng();
	}
	
	public void setNamaNasiGoreng(String namaNasiGoreng) {
		nasiGoreng.setNamaNasiGoreng(namaNasiGoreng);
	}

	public void setPedas(Boolean pedas) {
		nasiGoreng.setPedas(pedas);
	}

	public void setPakaiSayur(Boolean pakaiSayur) {
		nasiGoreng.setPakaiSayur(pakaiSayur);
	}

	public void setJumlahTelur(Integer jumlahTelur) {
		nasiGoreng.setJumlahTelur(jumlahTelur);
	}
	
	public void setAyan(Ayam ayam) {
		nasiGoreng.setAyan(ayam);
	}

	public void setIkan(Ikan ikan) {
		nasiGoreng.setIkan(ikan);
	}
	
	public NasiGoreng getnasiGoreng() {
		return nasiGoreng;
	}
}