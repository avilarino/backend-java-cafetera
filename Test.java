package Cafetera;

public class Test {

	public static void main(String[] args) {
	
		Cafetera cafetera1 = new Cafetera(1000,400);

		
		System.out.println(cafetera1.toString());
		cafetera1.vaciar();
		System.out.println(cafetera1.toString());
		cafetera1.llenar();
		System.out.println(cafetera1.toString());
		cafetera1.servirTaza(10);
		System.out.println(cafetera1.toString());
		cafetera1.agregarCafe(20);
		System.out.print(cafetera1.toString());
		
	}

}
