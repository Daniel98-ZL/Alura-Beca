
public class CrearEmpleaado {
	public static void main(String[] args) {
		
		Empleado primerEmpleado = new Empleado();
		primerEmpleado.nombre = "Daniel";
		primerEmpleado.apellido = "Zapana";
		primerEmpleado.edad = 24;
		primerEmpleado.dni = 12345678;
		System.out.println("Nombre: " + primerEmpleado.nombre);
		System.out.println("Apelldio: " + primerEmpleado.apellido);
		System.out.println("Edad: " + primerEmpleado.edad + " años");
		System.out.println("DNI: " + primerEmpleado.dni);
		
		System.out.println();
		
		Empleado segundoEmpleado = new Empleado();
		segundoEmpleado.nombre = "Luzvi";
		segundoEmpleado.apellido = "Mamani";
		segundoEmpleado.edad = 22;
		segundoEmpleado.dni = 87654321;
		
		System.out.println("Nombre: " + segundoEmpleado.nombre);
		System.out.println("Apelldio: " + segundoEmpleado.apellido);
		System.out.println("Edad: " + segundoEmpleado.edad + " años");
		System.out.println("DNI: " + segundoEmpleado.dni);
		
		System.out.println();
		
		System.out.println("Nombre: " + primerEmpleado.nombre);
		System.out.println("Apelldio: " + primerEmpleado.apellido);
		System.out.println("Edad: " + primerEmpleado.edad + " años");
		System.out.println("DNI: " + primerEmpleado.dni);
		
		System.out.println();
		System.out.println(primerEmpleado);
		System.out.println(segundoEmpleado);
		System.out.println();
		
		if (primerEmpleado == segundoEmpleado) {
			System.out.println("estan guardados en el mismo lugar");
		} else {
			System.out.println("Guardados en diferentes lugares");
		}
	}

}
