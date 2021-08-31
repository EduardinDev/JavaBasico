package profesor.episodioClases;

public class TestPersona {

	public static void main(String[] args) {
		Persona p1;
		p1 = new Persona();
		System.out.println("nombre: "+p1.nombre);
		System.out.println("edad: "+p1.edad);
		System.out.println("estatura: "+p1.estatura);
		
		p1.nombre = "Juan";
		p1.estatura = 1.75;
		p1.edad = 20;
		
		System.out.println("nombre: "+p1.nombre);
		System.out.println("edad: "+p1.edad);
		System.out.println("estatura: "+p1.estatura);
		
		System.out.println("***************************");
		
		Persona p2;
		p2 = new Persona();
		System.out.println("nombre: "+p2.nombre);
		p2.nombre = "Marco";
		System.out.println("nombre: "+p2.nombre);
	}

}
