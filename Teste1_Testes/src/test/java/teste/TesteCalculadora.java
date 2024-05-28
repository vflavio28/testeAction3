package teste;

import static org.junit.Assert.*;

import org.junit.Test;

public class TesteCalculadora {
	
	public Calculadora cal = new Calculadora();
	
	@Test
	public void test() {
		double soma = cal.somar(4, 4);
		assertEquals(8.0,soma,0);
	}

}
