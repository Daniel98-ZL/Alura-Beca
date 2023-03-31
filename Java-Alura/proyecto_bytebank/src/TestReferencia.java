
public class TestReferencia {
	
	public static void main(String[] args) {
		
		Cuenta primeraCuenta = new Cuenta();
		primeraCuenta.saldo = 200;
		//System.out.println(primeraCuenta.saldo);
		
		Cuenta segundaCuenta = primeraCuenta;
		segundaCuenta.saldo = 100;
		System.out.println("Saldo Primera Cuenta " + primeraCuenta.saldo);
		System.out.println("Saldo Segunda Cuenta " + segundaCuenta.saldo);
		
		segundaCuenta.saldo +=400;
		System.out.println("Saldo Primera Cuenta " + primeraCuenta.saldo);
		
		System.out.println(primeraCuenta);
		System.out.println(segundaCuenta);
		
		if (primeraCuenta == segundaCuenta) {
			System.out.println("Son el mismo objeto");
		} else {
			System.out.println("Son diferentes");
		}
		
	}

}
