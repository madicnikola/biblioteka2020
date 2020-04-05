package rs.ac.bg.fon.nprog.mvnbiblioteka2020.biblioteka.interfejs;

import java.util.List;

import rs.ac.bg.fon.nprog.mvnbiblioteka2020.biblioteka.Autor;
import rs.ac.bg.fon.nprog.mvnbiblioteka2020.biblioteka.Knjiga;

public interface BibliotekaInterfejs {

	public void dodajKnjigu(Knjiga knjiga);
	
	public void obrisiKnjigu(Knjiga knjiga);
	
	public List<Knjiga> vratiSveKnjige();
	
	public List<Knjiga> pronadjiKnjigu(Autor autor,
			String isbn, String naslov, String izdavac);
	
}
