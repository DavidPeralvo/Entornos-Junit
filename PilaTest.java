package pila;
/**
 * @autor David Peralvo
 * @version 1.0
 */
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PilaTest {
	@Before
	public void pila(){
		Pila d14pegod;
	}
	
	@Test
	public void testConstructor() {
		Pila pilaNueva=new Pila<Persona>();
		assertEquals(pilaNueva.size(),0);
	}
	@Test
	public void testTop() {
		Persona David =new Persona("David", "Peralvo");
		Persona Rigoberta=new Persona("Rigoberta","Bosques");
		Persona Florencio=new Persona("Florencio","Flores");
		Pila d14pegod=new Pila<Persona>();
		assertEquals(d14pegod.top(),null);
		d14pegod.push(David);
		d14pegod.push(Rigoberta);
		d14pegod.push(Florencio);
		Persona top=(Persona)d14pegod.top();
		assertEquals(d14pegod.top(),Florencio);
		d14pegod.push(null);
		assertEquals(d14pegod.top(),null);
		
	}
	@Test
	public void testPop() {
		Persona David =new Persona("David", "Peralvo");
		Persona Rigoberta=new Persona("Rigoberta","Bosques");
		Persona Florencio=new Persona("Florencio","Flores");
		Pila d14pegod=new Pila<Persona>();
		d14pegod.push(David);
		assertEquals(d14pegod.pop(),David);
		d14pegod.push(Rigoberta);
		d14pegod.push(Florencio);
		assertEquals(d14pegod.pop(),Florencio);
		assertEquals(d14pegod.pop(),Rigoberta);
		assertEquals(d14pegod.pop(),null);	
	
	}
	@Test
	public void TestPush(){
		Persona David =new Persona("David", "Peralvo");
		Persona Rigoberta=new Persona("Rigoberta","Bosques");
		Pila d14pegod=new Pila<Persona>();
		assertEquals(d14pegod.top(),null);
		d14pegod.push(null);
		assertEquals(d14pegod.top(),null);
		assertEquals(d14pegod.size(),1);
		d14pegod.push(David);
		assertEquals(d14pegod.top(),David);
		assertEquals(d14pegod.size(),2);
		d14pegod.push(Rigoberta);
		assertEquals(d14pegod.top(),Rigoberta);
		assertEquals(d14pegod.size(),3);	
		
	}
	@Test
	public void TestisEmpy(){
		Persona David =new Persona("David", "Peralvo");
		Pila d14pegod=new Pila<Persona>();
		assertEquals(d14pegod.IsEmpty(),true);
		d14pegod.push(David);
		assertEquals(d14pegod.IsEmpty(),false);
		d14pegod.pop();
		assertEquals(d14pegod.IsEmpty(),true);
		
		
		
		
	}
	

}
