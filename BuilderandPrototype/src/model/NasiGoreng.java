package model;

public class NasiGoreng {
	private String namaNasiGoreng;
	private Boolean pedas;
	private Boolean pakaiSayur;
	private Integer jumlahTelur;
	private Ayam ayam;
	private Ikan ikan;

	public NasiGoreng() {
		// TODO Auto-generated constructor stub
	}
	
	public NasiGoreng(String namaNasiGoreng, Boolean pedas, Boolean pakaiSayur, Integer jumlahTelur, Ayam ayam,
			Ikan ikan) {
		super();
		this.namaNasiGoreng = namaNasiGoreng;
		this.pedas = pedas;
		this.pakaiSayur = pakaiSayur;
		this.jumlahTelur = jumlahTelur;
		this.ayam = ayam;
		this.ikan = ikan;
	}

	public String getNamaNasiGoreng() {
		return namaNasiGoreng;
	}

	public void setNamaNasiGoreng(String namaNasiGoreng) {
		this.namaNasiGoreng = namaNasiGoreng;
	}

	public Boolean getPedas() {
		return pedas;
	}

	public void setPedas(Boolean pedas) {
		this.pedas = pedas;
	}

	public Boolean getPakaiSayur() {
		return pakaiSayur;
	}

	public void setPakaiSayur(Boolean pakaiSayur) {
		this.pakaiSayur = pakaiSayur;
	}

	public Integer getJumlahTelur() {
		return jumlahTelur;
	}

	public void setJumlahTelur(Integer jumlahTelur) {
		this.jumlahTelur = jumlahTelur;
	}

	public Ayam getAyan() {
		return ayam;
	}

	public void setAyan(Ayam ayam) {
		this.ayam = ayam;
	}

	public Ikan getIkan() {
		return ikan;
	}

	public void setIkan(Ikan ikan) {
		this.ikan = ikan;
	}

	//alt shift s s
	@Override
	public String toString() {
		return "NasiGoreng [namaNasiGoreng=" + namaNasiGoreng + ", pedas=" + pedas + ", pakaiSayur=" + pakaiSayur
				+ ", jumlahTelur=" + jumlahTelur + ", ayam=" + ayam + ", ikan=" + ikan + "]";
	}
	
}
