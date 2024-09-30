package model;

public class Ayam {
	private String nama;
	private String bagian;
	
	public Ayam() {
		// TODO Auto-generated constructor stub
	}
	//alt+shift+s o -> contractor
	public Ayam(String nama, String bagian) {
		super();
		this.nama = nama;
		this.bagian = bagian;
	}
	//alt+shift+s r ->getter setter
	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getBagian() {
		return bagian;
	}

	public void setBagian(String bagian) {
		this.bagian = bagian;
	}

}
