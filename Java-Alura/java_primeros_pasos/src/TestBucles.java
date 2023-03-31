
public class TestBucles {
	
	public static void main(String[] args) {
		
		for (int multiplicando = 1; multiplicando <=12; multiplicando++ ) {
			System.out.println("La tabla del número " + multiplicando);
			for (int multiplicador = 0; multiplicador <= 10; multiplicador++) {
				
				System.out.println("El producto de " + multiplicando + " * " + multiplicador + " es = " + multiplicando * multiplicador);
				
			}
			System.out.println();
		}
	}

}
