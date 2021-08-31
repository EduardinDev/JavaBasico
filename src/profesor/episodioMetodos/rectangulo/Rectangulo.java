package profesor.episodioMetodos.rectangulo;

public class Rectangulo {

	public int base;
	public int altura;
	
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
