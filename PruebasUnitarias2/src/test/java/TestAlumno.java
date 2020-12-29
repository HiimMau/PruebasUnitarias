

import org.junit.Test;

import junit.framework.TestCase;
import static org.junit.Assert.*;


public class TestAlumno  {
	public TestAlumno() {
		
		
	}

	@Test
	public void probarPromedio() {
		
	Prueba2Alumno alumno = new Prueba2Alumno("01","Mauricio", 20.00 , 16.00);
	
	double resultado; //varaible auxiliar
	resultado = alumno.calcularPromedio();
	assertEquals((20.00 + 16.00 /2), resultado, 0.00); //esperado, el resultado , y una variable mas
	//por ser numero real, asse me pide la diferencia maxima entre los 2
	
		
	}

}
