package pila;
/**
 * @author David Peralvo
 * @version 1.1
 */

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PilaTest {
	Pila d14pegod;
	Persona david;
	Persona rigoberta;
	Persona florencio;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		d14pegod=new Pila<Persona>();
		florencio=new Persona("Florencio","Flores");
		rigoberta=new Persona("Rigoberta","Bosques");
		david =new Persona("David", "Peralvo");
	
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testPila() {
		Pila pilaNueva=new Pila<Persona>();
		assertTrue(pilaNueva.IsEmpty());
	}

	@Test
	public void testPush() {
		assertNull(d14pegod.top());
		d14pegod.push(null);
		assertEquals(null,d14pegod.top());
		assertEquals(d14pegod.size(),1);
		d14pegod.push(david);
		assertEquals(david,d14pegod.top());
		assertEquals(2,d14pegod.size());
		d14pegod.push(rigoberta);
		assertEquals(rigoberta,d14pegod.top());
		assertEquals(3,d14pegod.size());	
	}

	@Test
	public void testPop() {
		d14pegod.push(david);
		assertEquals(david,d14pegod.pop());
		d14pegod.push(rigoberta);
		d14pegod.push(florencio);
		assertEquals(florencio,d14pegod.pop());
		assertEquals(rigoberta,d14pegod.pop());
		assertNull(d14pegod.pop());	
	}

	@Test
	public void testTop() {
		assertNull(d14pegod.top());
		d14pegod.push(david);
		d14pegod.push(rigoberta);
		d14pegod.push(florencio);
		assertEquals(florencio,d14pegod.top());
		d14pegod.push(null);
		assertNull(d14pegod.top());
	}

	@Test
	public void testIsEmpty() {
		assertTrue(d14pegod.IsEmpty());
		d14pegod.push(david);
		assertFalse(d14pegod.IsEmpty());
		d14pegod.pop();
		assertTrue(d14pegod.IsEmpty());
	}


}
