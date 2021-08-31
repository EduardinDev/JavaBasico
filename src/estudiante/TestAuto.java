package estudiante;

public class TestAuto {

	public static void main(String[] args) {
		Auto a1;
		a1 = new Auto();
		
		System.out.println("marca: "+a1.marca);
		System.out.println("precio: "+a1.precio);
		System.out.println("anio: "+a1.anio);
		
		System.out.println("**********************");
		
		a1.marca = "bugati";
		a1.precio = 125.000;
		a1.anio = 2021;
		
		System.out.println("marca: "+a1.marca);
		System.out.println("precio: "+a1.precio);
		System.out.println("anio: "+a1.anio);
		
		System.out.println("**********************");
		
		Auto a2;
		a2 = new Auto();
		
		System.out.println("marca: "+a2.marca);
		
		a2.marca="lamborgini";
		
		System.out.println("marca: "+a2.marca);

	}

}
