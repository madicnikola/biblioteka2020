package rs.ac.bg.fon.nprog.mvnbiblioteka2020.biblioteka;

import java.util.LinkedList;

/**
 * Predstavlja knjigu iz biblioteke.
 * 
 * @author Bojan Tomic
 *
 */
public class Knjiga {
	
	/**
	 * Naslov knjige
	 */
	private String naslov;
	
	/**
	 * ISBN knjige kao String koji moze imati 8 ili 13
	 * znakova, npr. "97823456"
	 */
	private String isbn;
	
	/**
	 * Lista autora knjige.
	 */
	private LinkedList<Autor> autori;
	
	/**
	 * Naziv izdavaca.
	 */
	private String izdavac;
	
	/**
	 * Izdanje knjige (broj mora biti veci od nule)
	 */
	private int izdanje;
	
	/**
	 * Vraca naslov knjige.
	 * 
	 * @return naslov knjige kao String
	 */
	public String getNaslov() {
		return naslov;
	}
	
	/**
	 * Postavlja naslov knjige.
	 * 
	 * @param naslov nov naslov koji treba postaviti
	 * 
	 * @throws java.lang.RuntimeException ako je
	 * uneti naslov null ili prazan String.
	 */
	public void setNaslov(String naslov) {
		if (naslov == null || naslov.isEmpty())
			throw new RuntimeException("Naslov ne sme biti null niti prazan String");
		
		this.naslov = naslov;
	}
	
	/**
	 * Vraca ISBN knjige kao String od 8 ili 13 znakova.
	 * 
	 * @return ISBN knjige kao String
	 */
	public String getIsbn() {
		return isbn;
	}
	
	/**
	 * Postavlja ISBN knjige.
	 * 
	 * @param isbn nov isbn koji treba postaviti
	 * 
	 * @throws java.lang.RuntimeException ako je
	 * uneti isbn null ili nije duzine tacno 8 ili
	 * 13 znakova.
	 */
	public void setIsbn(String isbn) {
		if (isbn == null || (isbn.length()!= 8 && isbn.length()!= 13))
			throw new RuntimeException("ISBN ne sme biti null i mora biti duzine tacno 8 ili 13 znakova");
		
		this.isbn = isbn;
	}
	
	/**
	 * Vraca listu sa autorima knjige.
	 * 
	 * @return listu autora knjige
	 */
	public LinkedList<Autor> getAutori() {
		return autori;
	}
	
	/**
	 * Postavlja listu autora knjige.
	 * 
	 * @param autori autori knjige koje treba postaviti
	 * 
	 * @throws java.lang.RuntimeException ako je
	 * uneta lista autora null ili prazna lista.
	 */
	public void setAutori(LinkedList<Autor> autori) {
		if (autori == null || autori.isEmpty())
			throw new RuntimeException("Morate uneti listu sa autorima koja nije ni null ni prazna");
		
		this.autori = autori;
	}
	
	/**
	 * Vraca naziv izdavaca knjige.
	 * 
	 * @return naziv izdavaca knjige kao String
	 */
	public String getIzdavac() {
		return izdavac;
	}
	
	/**
	 * Postavlja naziv izdavaca knjige.
	 * 
	 * @param izdavac nov naziv izdavaca koji treba postaviti
	 * 
	 * @throws java.lang.RuntimeException ako je
	 * uneti izdavac null ili prazan String.
	 */
	public void setIzdavac(String izdavac) {
		if (izdavac == null || izdavac.isEmpty())
			throw new RuntimeException("Izdavac ne sme biti null niti prazan String");
		
		this.izdavac = izdavac;
	}
	
	/**
	 * Vraca izdanje knjige (ceo broj veci od nule).
	 * 
	 * @return izdanje knjige
	 */
	public int getIzdanje() {
		return izdanje;
	}
	
	/**
	 * Postavlja izdanje knjige.
	 * 
	 * @param izdanje redni broj izdanja koji treba postaviti
	 * 
	 * @throws java.lang.RuntimeException ako je
	 * uneto izdanje nula ili manje od nule.
	 */
	public void setIzdanje(int izdanje) {
		if (izdanje <=0 )
			throw new RuntimeException("Izdanje mora biti broj veci od nule");
		
		this.izdanje = izdanje;
	}
	
	/**
	 * Vraca String sa svim podacima o knjizi.
	 * 
	 * @return String sa vrednostima svih atributa klase Knjiga.
	 */
	@Override
	public String toString() {
		return "Knjiga [naslov=" + naslov + ", isbn=" + isbn + ", autori=" + autori + ", izdavac=" + izdavac
				+ ", izdanje=" + izdanje + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((isbn == null) ? 0 : isbn.hashCode());
		return result;
	}
	
	/**
	 * Proverava da li su dve knjige iste i vraca
	 * true ako jesu a false ako nisu.
	 * 
	 * @return true ako je unet objekat klase Knjiga
	 * sa istim ISBN-om, inace false.
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Knjiga other = (Knjiga) obj;
		if (isbn == null) {
			if (other.isbn != null)
				return false;
		} else if (!isbn.equals(other.isbn))
			return false;
		return true;
	}
	
	

}
