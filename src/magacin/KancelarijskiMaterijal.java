package magacin;

public class KancelarijskiMaterijal extends Artikal{
	
	public KancelarijskiMaterijal() {
		super();
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "KancelarijskiMaterijal [naziv=" + getNaziv() + ", sifra=" + getSifra() + ", opis=" + getOpis() + ", kolicina=" + getKolicina() + "]";
	}
	
}
