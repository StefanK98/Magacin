package magacin;

public class Artikal {
	private String naziv;
	private int sifra;
	private String opis;
	private int kolicina;
	
	public Artikal() {
	}
	public Artikal(String naziv, int sifra, String opis, int kolicina) {
		this.naziv = naziv;
		this.sifra = sifra;
		this.opis = opis;
		this.kolicina = kolicina;
	}


	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public int getSifra() {
		return sifra;
	}
	public void setSifra(int sifra) {
		this.sifra = sifra;
	}
	public String getOpis() {
		return opis;
	}
	public void setOpis(String opis) {
		this.opis = opis;
	}
	public int getKolicina() {
		return kolicina;
	}
	public void setKolicina(int kolicina) {
		this.kolicina = kolicina;
	}
	
}
