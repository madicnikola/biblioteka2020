package rs.ac.bg.fon.nprog.mvnbiblioteka2020.biblioteka;

/**
 * Autor knjige ili publikacije.
 * 
 * @author Bojan Tomic
 *
 */
public class Autor {
	
	/**
	 * Ime autora
	 */
	private String ime;
	
	/**
	 * Prezime autora
	 */
	private String prezime;
	
	/**
	 * Vraca ime autora.
	 * 
	 * @return ime autora kao String.
	 */
	public String getIme() {
		return ime;
	}
	
	/**
	 * Postavlja novo ime autora.
	 * 
	 * @param ime novo ime koje treba postaviti
	 * 
	 * @throws java.lang.RuntimeException ako je
	 * uneto ime null ili prazan String.
	 */
	public void setIme(String ime) {
		if (ime == null || ime.isEmpty())
			throw new RuntimeException("Ime autora ne sme biti null niti prazan String");
		
		this.ime = ime;
	}
	
	/**
	 * Vraca prezime autora.
	 * 
	 * @return prezime autora kao String.
	 */
	public String getPrezime() {
		return prezime;
	}
	
	/**
	 * Postavlja novo prezime autora.
	 * 
	 * @param prezime novo prezime koje treba postaviti
	 * 
	 * @throws java.lang.RuntimeException ako je
	 * uneto prezime null ili prazan String.
	 */
	public void setPrezime(String prezime) {
		if (prezime == null || prezime.isEmpty())
			throw new RuntimeException("Prezime autora ne sme biti null niti prazan String");
		
		this.prezime = prezime;
	}
	
	/**
	 * Vraca String sa imenom i prezimenom autora.
	 * 
	 * @return String koji sadrzi ime i prezime autora
	 */
	@Override
	public String toString() {
		return "Autor [ime=" + ime + ", prezime=" + prezime + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ime == null) ? 0 : ime.hashCode());
		result = prime * result + ((prezime == null) ? 0 : prezime.hashCode());
		return result;
	}
	
	/**
	 * Proverava da li su dva autora ista i vraca
	 * true ako jesu a false ako nisu.
	 * 
	 * @return true ako je unet objekat klase Autor
	 * sa istim imenom i prezimenom, inace false.
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Autor other = (Autor) obj;
		if (ime == null) {
			if (other.ime != null)
				return false;
		} else if (!ime.equals(other.ime))
			return false;
		if (prezime == null) {
			if (other.prezime != null)
				return false;
		} else if (!prezime.equals(other.prezime))
			return false;
		return true;
	}
	
}
