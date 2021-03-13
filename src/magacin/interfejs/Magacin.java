package magacin.interfejs;

import java.util.LinkedList;

import magacin.Artikal;

public class Magacin implements MagacinInterface {
	
	private LinkedList<Artikal> artikli=new LinkedList<Artikal>();
	
	@Override
	public void dodajArtikal(Artikal artikal) {
		if(artikal==null)

			throw new NullPointerException("Artikal ne sme biti null!");
		
		for (Artikal art : artikli) {
			if(art.getSifra()==artikal.getSifra()) {
				art.setKolicina(art.getKolicina()+1); 
				System.out.println("Uvećana količina postojećeg artikla");
				return;
			}
		}
		artikli.add(artikal); //dodavanje novog artikla
		
	}

	@Override
	public void izbaciArtikal(Artikal artikal) { //samo za smanjenje količine artikla
		if(artikal==null)
			throw new NullPointerException("Artikal ne sme biti null!");
		 if(!artikli.contains(artikal)) 
			 throw new RuntimeException("Artikal se trenutno ne nalazi u magacinu!");
		 
		 for (Artikal art : artikli) {
				if(art.getSifra()==artikal.getSifra() && art.getKolicina()>0) {
					art.setKolicina(art.getKolicina()-1); 
					System.out.println("Smanjena količina postojećeg artikla");
					return;
				}
			}
		
			 
	}

	@Override
	public Artikal vratiArtikal(int sifra) {
		if(sifra<=0)
			throw new RuntimeException("Sifra artikla ne sme biti negativna ili 0");
		for (Artikal art : artikli) {
			if(art.getSifra()==sifra)
				return art;
		}
		return null;
	}

}
