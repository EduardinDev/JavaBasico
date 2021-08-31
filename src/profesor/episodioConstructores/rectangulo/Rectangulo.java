package profesor.episodioConstructores.rectangulo;

public class Rectangulo {

	private int base;
	private int altura;
	
	
	
	public Rectangulo(int base, int altura) {
		this.base = base;
		this.altura = altura;
	}

	public int calcularPerimetro(){
		int perimetro = (2*base)+(2*altura);
		return perimetro;
	}
	
	//calcular el area retorna un int, base*altura
	
	public int calcularArea(){
		int area = (base)*(altura);
		return area;
	}
	
}
