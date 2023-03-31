
public class PruebaMetodos {
	public static void main(String[] args) {
		Cuenta cuentaDaniel = new Cuenta();
		cuentaDaniel.saldo = 300;
		cuentaDaniel.depositar(800);
		
		System.out.println(cuentaDaniel.saldo);
		
		cuentaDaniel.retirar(600);
		System.out.println("retiraste " + cuentaDaniel);
		System.out.println(cuentaDaniel.saldo);
	}

}