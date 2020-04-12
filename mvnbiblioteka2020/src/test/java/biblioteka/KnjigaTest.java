package biblioteka;

import biblioteka.Knjiga;
import biblioteka.Autor;
import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class KnjigaTest {

	private Autor a;	
	private Knjiga k;
	
	@Before
	public void setUp() throws Exception {
		a = new Autor();
		a.setIme("Pera");
		a.setPrezime("Peric");
		
		k = new Knjiga();
	}

	@After
	public void tearDown() throws Exception {
		a = null;
		k = null;
	}

	@Test (expected = java.lang.RuntimeException.class)
	public void testSetNaslovNull() {
		k.setNaslov(null);
	}

	@Test (expected = java.lang.RuntimeException.class)
	public void testSetNaslovPrazanString() {
		k.setNaslov("");
	}
	
	@Test 
	public void testSetNaslov() {
		k.setNaslov("Knjiga 1");
		
		assertEquals("Knjiga 1", k.getNaslov());
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetIsbnNull() {
		k.setIsbn(null);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetIsbnDuzinaManjaOd8() {
		k.setIsbn("1234567");
	}

	@Test (expected = java.lang.RuntimeException.class)
	public void testSetIsbnDuzinaOd8do13() {
		k.setIsbn("123456789");
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetIsbnDuzinaOd8do132() {
		k.setIsbn("123456789101");
	}

	@Test (expected = java.lang.RuntimeException.class)
	public void testSetIsbnDuzinaVecaOd13() {
		k.setIsbn("12345678910111");
	}
	
	@Test
	public void testSetIsbnDuzina8() {
		k.setIsbn("12345678");
	}
	
	@Test
	public void testSetIsbnDuzina13() {
		k.setIsbn("1234567891011");
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetAutoriNull() {
		k.setAutori(null);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetAutoriPraznaLista() {
		k.setAutori(new LinkedList<Autor>());
	}
	
	@Test
	public void testSetAutori() {
		LinkedList<Autor> autori = new LinkedList<Autor>();
		
		autori.add(a);
		
		k.setAutori(autori);
		
		assertEquals(autori, k.getAutori());
	}

	@Test (expected = java.lang.RuntimeException.class)
	public void testSetIzdavacNull() {
		k.setIzdavac(null);
	}

	@Test (expected = java.lang.RuntimeException.class)
	public void testSetIzdavacPrazanString() {
		k.setIzdavac("");
	}
	
	@Test 
	public void testSetIzdavac() {
		k.setIzdavac("Izdavac 1");
		
		assertEquals("Izdavac 1", k.getIzdavac());
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetIzdanjeNula() {
		k.setIzdanje(0);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetIzdanjeNegativno() {
		k.setIzdanje(-1);
	}
	
	@Test
	public void testSetIzdanje() {
		k.setIzdanje(1);
		
		assertEquals(1, k.getIzdanje());
	}

	@Test
	public void testToString() {
		k.setNaslov("Naslov 2");
		k.setIzdavac("Izdavac 2");
		k.setIzdanje(13);
		k.setIsbn("87654321");
		
		LinkedList<Autor> autori = new LinkedList<Autor>();
		
		autori.add(a);
		
		k.setAutori(autori);
		
		String s = k.toString();
		
		assertTrue(s.contains("Naslov 2"));
		assertTrue(s.contains("Izdavac 2"));
		assertTrue(s.contains("13"));
		assertTrue(s.contains("87654321"));
	}

	@Test
	public void testEqualsObjectNull() {
		k.setIsbn("12345678");
		
		assertFalse( k.equals(null) );
	}
	
	@Test
	public void testEqualsObjectPogresnaKlasa() {
		k.setIsbn("12345678");
		
		assertFalse( k.equals(new Object() ) );
	}
	
	@Test
	public void testEqualsObjectFalse() {
		k.setIsbn("12345678");
		
		Knjiga k2 = new Knjiga();
		k2.setIsbn("87654321");
		
		assertFalse( k.equals(k2) );
	}
	
	@Test
	public void testEqualsObjectTrue() {
		k.setIsbn("12345678");
		
		Knjiga k2 = new Knjiga();
		k2.setIsbn("12345678");
		
		assertTrue( k.equals(k2) );
	}

}
