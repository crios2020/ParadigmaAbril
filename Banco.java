class Banco {
	
	// Atributos aquí
	private String nombre;
	private int cantidadDeEmpleados;
	
	//Método constructor
	public Banco(){
		nombre="Nuevo Banco";
		cantidadDeEmpleados=1;
	}
	
	//Método constructor sobrecargado
	public Banco(String nombre, int cantidadDeEmpleados){
		this.nombre=nombre;
		this.cantidadDeEmpleados=cantidadDeEmpleados;
	}
	
	// Métodos aquí
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNombre() {
		return nombre;
	}
	public void setCantidadDeEmpleados(int cantidadDeEmpleados) {
		this.cantidadDeEmpleados = cantidadDeEmpleados;
	}
	public int getCantidadDeEmpleados() {
		return cantidadDeEmpleados;
	}
}
