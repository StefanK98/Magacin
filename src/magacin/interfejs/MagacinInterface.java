package magacin.interfejs;

import java.util.LinkedList;

import magacin.Artikal;

public interface MagacinInterface {
	public void dodajArtikal(Artikal artikal);
	public void izbaciArtikal(Artikal artikal);
	public Artikal vratiArtikal(int sifra);
}
