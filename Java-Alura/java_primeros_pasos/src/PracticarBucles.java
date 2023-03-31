
public class PracticarBucles {
	public static void main(String[] args) {
		
		int num1 = 1;
		int num2 = 0;
		
		while (num1 <= 10) {
			while (num2 <=10) {
				int total = num1 +num2;
				System.out.println(num1 + " + " + num2 + " = " + total);
				num2++;
			}
			System.out.println();
			num2=0;
			num1++;
			
		}
		
		
		
		/*for (int dividendo = 1; dividendo <= 10; dividendo++) {
			System.out.println("la tabla de suma del numero " + dividendo);
			System.out.println();
			for (int divisor = 0; divisor <= 10; divisor++) {
				int residuo = dividendo + divisor;
				System.out.println("la suma de " + dividendo + " + " + divisor + " es = " + residuo);
			}
			System.out.println();
		}*/
	}

}
