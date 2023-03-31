
public class Condicional_IF {
	public static void main(String[] args) {
		int edad = 18;
		
		int cantidadPersonas = 2;
		
		boolean esPareja = cantidadPersonas >1;
		
		boolean puedeEntrar = edad >= 18 && cantidadPersonas >= 2;
		
		System.out.println("El valor de la condicion es: " + esPareja);
		
		if (puedeEntrar) {
			System.out.println("Puedes pasar wajto!!!");
		} else {
			System.out.println("vaya a tomar tu leche");
		}
	}
}
