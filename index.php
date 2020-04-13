<?php
	// paquete XAMPP apachefriends.org
	echo '<h1>Hola Mundo!</h1>';


	//declaración de clase
	class Cuenta{
		//atributos
		private $nro;
		private $moneda;
		private $saldo;
		
		//Constructor
		//public function Cuenta() {} //constructor vacio
		public function Cuenta($nro,$moneda){
			$this->nro=$nro;
			$this->moneda=$moneda;
			$this->saldo=0;
		}
		
		//Métodos
		public function depositar($monto){
			$this->saldo+=$monto;
		}
		
		public function debitar($monto){
			if($this->saldo>=$monto){
				$this->saldo-=$monto;
			} else {
				echo '<h3>No Hay Saldo Suficiente.</h3>';
			}
		}
		
		public function imprimirEstado(){
			echo '<h3>'.$this->nro.' '.$this->moneda.' '.$this->saldo.'</h3>';
		}
		
	}//end class Cuenta

	//Objectos simulados de Cuenta
	echo '<h3>-- cuenta1 --</h3>';
	$cuenta1 = new Cuenta(1,'arg$');
	$cuenta1->depositar(35000);
	$cuenta1->depositar(50000);
	$cuenta1->debitar(20000);
	$cuenta1->imprimirEstado();
	
	class Cliente{
		private $nro;
		private $nombre;
		private $cuenta;
		
		//constructor
		public function Cliente($nro,$nombre,$nroCuenta,$moneda){
			$this->nro=$nro;
			$this->nombre=$nombre;
			$this->cuenta=new Cuenta($nroCuenta,$moneda);
		}
		
		public function imprimirEstado(){
			echo '<h3>'.$this->nro.' '.$this->nombre.'</h3>';
		}
		
		public function getCuenta(){
			return $this->cuenta;
		}
		
	}// end class Cliente
	
	//Objeto simulado de cuenta
	echo '<h3> -- cliente1 --</h3>';
	$cliente1=new Cliente(1,'Ana Godoy',10,'arg$');
	$cliente1->getCuenta()->depositar(30000);
	$cliente1->getCuenta()->debitar(10000);
	$cliente1->imprimirEstado();
	$cliente1->getCuenta()->imprimirEstado();
	
?>
