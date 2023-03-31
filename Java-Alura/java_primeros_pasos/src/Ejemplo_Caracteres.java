
public class Ejemplo_Caracteres {
	public static void main(String[] args) {
		char caracter = 'a';
		System.out.println(caracter);
		
		caracter = 65;
		System.out.println(caracter);
		
		caracter = 65 + 1;
		char segundoCaracter = (char)(caracter + 1);
		System.out.println(segundoCaracter);
		
		String palabra = "ALURA CURSOS ONLINE";
		System.out.println(palabra);
		
		System.out.println(palabra + " 2023");
		
		palabra = palabra + " 2026";
		System.out.println(palabra);
		
	}

}
