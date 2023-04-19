import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CalculadoraTest {
	
	public Calculadora cal = new Calculadora();
	@Test
	void SubtrairSucesso() {
		int subtrair = cal.subtrair(2, 2);
		assertEquals(0,subtrair);
	}
	
	@Test
	void SomaNumeros() {
		int soma = cal.somar(2, 2);
		assertEquals(4,soma);
	}
	
	@Test
	void MultiplicarNumeros() {
		int multiplicar = cal.multiplicar(2, 2);
		assertEquals(4,multiplicar);
	}
	
	@Test
	void DividirNumeros() {
		double dividir = cal.dividir(2, 2);
		assertEquals(1,dividir);
	}
	
	@Test
	void PotenciarNumeros() {
		double potenciar = cal.potenciar(2, 1);
		assertEquals(2,potenciar);
	}
}