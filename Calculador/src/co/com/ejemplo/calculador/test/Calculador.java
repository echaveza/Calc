package co.com.ejemplo.calculador.test;

public class Calculador {

	public static Integer sumar(Integer n1, Integer n2) throws Exception {
		Integer resultado=0;
		try {
			if(n1==null) {
				throw new Exception("Se debe de ingresar el primer n�mero");
			}
			if(n2==null) {
				throw new Exception("Se debe de ingresar el segundo n�mero");
			}
			resultado=n1 + n2;
			
			return resultado;
			
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}
	public static Integer restar(Integer n1, Integer n2) throws Exception {
		Integer resultado=0;
		try {
			if(n1==null) {
				throw new Exception("Se debe de ingresar el primer n�mero");
			}
			if(n2==null) {
				throw new Exception("Se debe de ingresar el segundo n�mero");
			}
			resultado=n1 - n2;
			
			return resultado;
			
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}
	public static Integer multiplicar(Integer n1, Integer n2) throws Exception {
		Integer resultado=0;
		try {
			if(n1==null) {
				throw new Exception("Se debe de ingresar el primer n�mero");
			}
			if(n2==null) {
				throw new Exception("Se debe de ingresar el segundo n�mero");
			}
			resultado=n1 * n2;
			
			return resultado;
			
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}
	public static Integer dividir(Integer n1, Integer n2) throws Exception {
		Integer resultado=0;
		try {
			if(n1==null) {
				throw new Exception("Se debe de ingresar el primer n�mero");
			}
			if(n2==null) {
				throw new Exception("Se debe de ingresar el segundo n�mero");
			}
			if(n2==0) {
				throw new Exception("No se puede dividir entre 0");
			}
			resultado=n1 / n2;
			
			return resultado;
			
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}
	
}
