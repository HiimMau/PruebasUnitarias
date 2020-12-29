import junit.framework.TestCase;

public class TestCalculadora extends TestCase{
	
private  Calculadora calcula;
	
	public void escenario () {
		calcula = new Calculadora(); }
	
	
		
	
	public void testsumar ()
{
		escenario();
	assertTrue(calcula.sumar(4, 5)==(4+5));
		
}
	
	public void testrestar ()
{
		escenario();
		assertEquals(2, calcula.restar(8, 6));
		
}
	
	public void testmultiplicar ()
	
	
{
		escenario();
		assertEquals(48, calcula.multiplicar(8, 6));
		
}
	public void testdividir ()
{
		escenario();
		assertEquals(2, calcula.dividir(16, 8));
		
}

		
		
	}


