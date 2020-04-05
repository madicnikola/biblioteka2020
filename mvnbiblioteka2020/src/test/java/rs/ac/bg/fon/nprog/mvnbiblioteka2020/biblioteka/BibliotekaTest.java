package rs.ac.bg.fon.nprog.mvnbiblioteka2020.biblioteka;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BibliotekaTest {
	
	private Biblioteka b;
	private Knjiga k1, k2;

	@Before
	public void setUp() throws Exception {
		b = new Biblioteka();
		
		k1 = new Knjiga();
		k1.setIsbn("12345678");
		k1.setNaslov("Knjiga 1");
		
		k2 = new Knjiga();
		k2.setIsbn("87654321");
		k2.setNaslov("Knjiga 2");
	}

	@After
	public void tearDown() throws Exception {
		b = null;
		k1 = null;
		k2 = null;
	}

	@Test (expected = java.lang.RuntimeException.class)
	public void testDodajKnjiguNull() {
		b.dodajKnjigu(null);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testDodajKnjiguDuplikat() {
		b.dodajKnjigu(k1);
		b.dodajKnjigu(k1);
	}
	
	@Test
	public void testDodajKnjigu() {
		b.dodajKnjigu(k1);
		
		List<Knjiga> sveKnjige = b.vratiSveKnjige();
		
		assertTrue(sveKnjige.size() == 1);
		assertEquals( k1, sveKnjige.get(0) );
	}
	
	@Test
	public void testDodajKnjigu2() {
		b.dodajKnjigu(k1);
		b.dodajKnjigu(k2);
		
		List<Knjiga> sveKnjige = b.vratiSveKnjige();
		
		assertTrue(sveKnjige.size() == 2);
		assertEquals( k1, sveKnjige.get(0) );
		assertEquals( k2, sveKnjige.get(1) );
	}

	@Test (expected = java.lang.RuntimeException.class)
	public void testObrisiKnjiguNull() {
		b.obrisiKnjigu(null);
	}

	@Test
	public void testObrisiKnjigu() {
		b.dodajKnjigu(k1);
		b.dodajKnjigu(k2);
		
		b.obrisiKnjigu(k1);
		
		List<Knjiga> sveKnjige = b.vratiSveKnjige();
		
		assertTrue(sveKnjige.size() == 1);
		assertEquals(k2, sveKnjige.get(0) );
	}
	
	@Test
	public void testVratiSveKnjige() {
		b.dodajKnjigu(k2);
		b.dodajKnjigu(k1);
		
		
		List<Knjiga> sveKnjige = b.vratiSveKnjige();
		
		assertTrue(sveKnjige.size() == 2);
		assertEquals(k2, sveKnjige.get(0) );
		assertEquals(k1, sveKnjige.get(1) );
	}

	@Test
	public void testPronadjiKnjiguNemaKriterijuma() {
		List<Knjiga> rezultat = b.pronadjiKnjigu(null, null, null, null);
		
		assertNull(rezultat);
	}
	
	@Test
	public void testPronadjiKnjigu() {
		b.dodajKnjigu(k1);
		b.dodajKnjigu(k2);
		
		List<Knjiga> rezultat = b.pronadjiKnjigu(null, null, "1", null);
		
		assertTrue(rezultat.size() == 1);
		assertEquals(k1, rezultat.get(0) );
	}

}
