package profesor.episodioMetodos.calculadora;

public class TestCalculadora {

	public static void main(String[] args) {
		Calculadora c = new Calculadora();
		int resultado = c.sumar(5, 8);
		System.out.println("resultado: "+resultado);
		
		c.imprimir();

	}

}
