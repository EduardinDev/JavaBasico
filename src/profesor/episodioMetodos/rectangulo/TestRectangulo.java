package profesor.episodioMetodos.rectangulo;

public class TestRectangulo {

	public static void main(String[] args) {
		
		Rectangulo r1 = new Rectangulo();
		r1.base = 10;
		r1.altura = 2;
		int perimetro = r1.calcularPerimetro();
		int area = r1.calcularArea();
		
		System.out.println("El perimetro 1 es: "+perimetro);
		System.out.println("El area 1 es: "+area);
		
		System.out.println("************************************");
		
		
		Rectangulo r2 = new Rectangulo();
		r2.base = 12;
		r2.altura = 8;
		int perimetro2 = r2.calcularPerimetro();
		int area2 = r2.calcularArea();
		
		System.out.println("El perimetro 2 es: "+perimetro2);
		System.out.println("El area 2 es: "+area2);
		

	}

}
