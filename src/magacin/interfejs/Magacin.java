package magacin.interfejs;

import java.util.LinkedList;

import magacin.Artikal;

public class Magacin implements MagacinInterface {
	
	private LinkedList<Artikal> artikli=new LinkedList<Artikal>();

	@Override
	public void dodajArtikal(Artikal artikal) {
		if(artikal==null)
			return;
		for (Artikal art : artikli) {
			if(art.getSifra()==artikal.getSifra()) {
				art.setKolicina(art.getKolicina()+1);
				return;
			}
		}
		artikli.add(artikal);
	}

	@Override
	public void izbaciArtikal(Artikal artikal) {
	}

	@Override
	public Artikal vratiArtikal(int sifra) {
		return null;
	}

}
