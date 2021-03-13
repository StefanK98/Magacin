package magacin;

import java.util.Date;

public class KucnaHemija extends Artikal {
	private Date rokTrajanja;
	
	public KucnaHemija(Date rokTrajanja) {
		super();
		this.rokTrajanja = rokTrajanja;
	}

	public Date getRokTrajanja() {
		return rokTrajanja;
	}

	public void setRokTrajanja(Date rokTrajanja) {
		this.rokTrajanja = rokTrajanja;
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
		return "KucnaHemija [naziv=" + getNaziv() + ", sifra=" + getSifra() + ", opis=" + getOpis() + ", kolicina=" + getKolicina() + "]";
	}
	
	
}
