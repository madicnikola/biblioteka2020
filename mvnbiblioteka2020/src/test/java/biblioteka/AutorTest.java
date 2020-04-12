package biblioteka;

import biblioteka.Autor;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AutorTest {
	
	private Autor a;

	@Before
	public void setUp() throws Exception {
		a = new Autor();
	}

	@After
	public void tearDown() throws Exception {
		a = null;
	}

	@Test
	public void testSetIme() {
		a.setIme("Pera");
		
		assertEquals("Pera", a.getIme() );
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetImeNull() {
		a.setIme(null);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetImePrazanString() {
		a.setIme("");
	}

	@Test
	public void testSetPrezime() {
		a.setPrezime("Peric");
		
		assertEquals("Peric", a.getPrezime());
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetPrezimeNull() {
		a.setPrezime(null);
	}

	@Test (expected = java.lang.RuntimeException.class)
	public void testSetPrezimePrazanString() {
		a.setPrezime("");
	}
	
	@Test
	public void testToString() {
		a.setIme("Mika");
		a.setPrezime("Zikic");
		
		String s = a.toString();
		
		assertTrue( s.contains("Mika") );
		assertTrue( s.contains("Zikic") );
	}

	@Test
	public void testEqualsObjectNull() {
		assertFalse( a.equals(null) );
	}
	
	@Test
	public void testEqualsObjectDrugaKlasa() {
		assertFalse( a.equals( new Object() ) );
	}
	
	@Test
	public void testEqualsObjectNisuIsti() {
		a.setIme("Pera");
		a.setPrezime("Peric");
		
		Autor a2 = new Autor();
		a2.setIme("Mika");
		a2.setPrezime("Mikic");
		
		assertFalse( a.equals( a2 ) );
	}
	
	@Test
	public void testEqualsObjectNisuIstiIme() {
		a.setIme("Pera");
		a.setPrezime("Peric");
		
		Autor a2 = new Autor();
		a2.setIme("Mika");
		a2.setPrezime("Peric");
		
		assertFalse( a.equals( a2 ) );
	}
	
	@Test
	public void testEqualsObjectNisuIstiPrezime() {
		a.setIme("Pera");
		a.setPrezime("Zikic");
		
		Autor a2 = new Autor();
		a2.setIme("Pera");
		a2.setPrezime("Peric");
		
		assertFalse( a.equals( a2 ) );
	}
	
	@Test
	public void testEqualsObjectJesuIsti() {
		a.setIme("Pera");
		a.setPrezime("Peric");
		
		Autor a2 = new Autor();
		a2.setIme("Pera");
		a2.setPrezime("Peric");
		
		assertTrue( a.equals( a2 ) );
	}

}
