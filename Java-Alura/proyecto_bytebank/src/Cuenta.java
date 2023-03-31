class Cuenta {
	
	double saldo;
	int agencia;
	int número;
	String titular;
	
	public void depositar (double valor) {
		
		this.saldo = this.saldo + valor;
	}
	
	public boolean retirar (double valor) {
		if (this.saldo >= valor) {
			this.saldo = this.saldo - valor;
			return true;
		} else {
			return false;
		}
	}
}
