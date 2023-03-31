class Empleado {
	
	String nombre;
	String apellido;
	int dni;
	int edad;
	double salario;
	
	public void pago (double dinero) {
		this.salario = this.salario + dinero;
	}
	
	public boolean descuento (double dinero) {
		if (this.salario >= dinero) {
			this.salario = this.salario - dinero;
			return true;
		} else {
			return false;
		}
	}
}
