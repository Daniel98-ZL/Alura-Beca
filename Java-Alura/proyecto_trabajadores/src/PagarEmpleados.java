
public class PagarEmpleados {
	public static void main(String[] args) {
		
		Empleado empleadoDaniel = new Empleado();
		
		empleadoDaniel.salario = 500;
		empleadoDaniel.pago(1000);
		System.out.println(empleadoDaniel.salario);
		
		empleadoDaniel.descuento(300);
		System.out.println(empleadoDaniel.salario);
	}

}
