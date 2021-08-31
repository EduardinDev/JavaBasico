package profesor.episodioConstructores.persona;

public class TestPersona {

	public static void main(String[] args) {
		Persona p1;
		p1 = new Persona("Juan");
		System.out.println("nombre: "+p1.getNombre());
		System.out.println("edad: "+p1.getEdad());
		System.out.println("estatura: "+p1.getEstatura());
		
		//p1.setNombre("Juan");
		p1.setEstatura(1.75);
		p1.setEdad(20);
		
		System.out.println("nombre: "+p1.getNombre());
		System.out.println("edad: "+p1.getEdad());
		System.out.println("estatura: "+p1.getEstatura());
		
		System.out.println("***************************");
		
		Persona p2;
		p2 = new Persona("Marco");
		System.out.println("nombre: "+p2.getNombre());
		//p2.setNombre("Marco");
		System.out.println("nombre: "+p2.getNombre());
	}

}
