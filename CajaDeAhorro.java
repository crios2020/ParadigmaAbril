class CajaDeAhorro {
	// Atributos aquí
	private float saldo;
	private float extraccionMaxima=5000;
	
	// Métodos aquí
	public void depositarDinero(float unMonto) {
		// Actualiza el valor del atributo saldo
		saldo = saldo + unMonto;
	}
	
	public void extraerDinero(float unMonto){
		// Actualiza el valor del atributo saldo, NO controla si monto > saldo
		if(saldo>=unMonto && unMonto<=extraccionMaxima){
			saldo = saldo - unMonto;
		}else{
			System.out.println("No Hay Saldo Sufiente!!");
		}
	}

	void informarSaldo() {
		// Imprime el atributo saldo
		System.out.println(saldo);
	}
	
	float obtenerSaldo(){
		// Retorna el saldo
		return saldo;
	}
}
