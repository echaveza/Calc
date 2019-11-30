package co.com.ejemplo.calculador.test;

import static org.junit.Assert.fail;

import org.junit.Test;

@SuppressWarnings("unused")
class CalculadorTest {
	
	public static final Integer NUMERO_1=10;
	public static final Integer NUMERO_2=5;

	
	@Test
	void sumar() {
		try {
			Integer resultado = Calculador.sumar(NUMERO_1,NUMERO_2);
			System.out.println("La suma es "+ resultado);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test
	void restar() {
		try {
			Integer resultado = Calculador.restar(NUMERO_1,NUMERO_2);
			System.out.println("La resta es "+ resultado);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test
	void multiplicar() {
		try {
			Integer resultado = Calculador.multiplicar(NUMERO_1,NUMERO_2);
			System.out.println("La multiplicación es "+ resultado);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test
	void dividir() {
		try {
			Integer resultado = Calculador.dividir(NUMERO_1,NUMERO_2);
			System.out.println("La división es "+ resultado);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
