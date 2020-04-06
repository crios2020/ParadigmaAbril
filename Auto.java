// declaración de clases
public class Auto{
	// atributos
	String marca;
	String modelo;
	String color;
	int velocidad;
	
	// métodos
	void acelerar(){									//acelerar
		velocidad=velocidad+10;
	}
	private void acelerar(int km) {						//acelerarInt
		velocidad = velocidad + km;
	}
	void acelerar(int km, boolean tieneNitro){			//acelerarIntBoolean
		if(tieneNitro == false){
			acelerar(km);
		} else {
			acelerar(km*2);
		}
	}
	void acelerar(int k,int f){							//acelerarIntInt	
		
	}
	void acelerar(boolean bo,int i){					//acelerarBooleanInt
	}
	//Método erroneo
	//int acelerar(int x){								//acelerarInt
	//	return 2;
	//}
	
	void frenar(){
		velocidad=velocidad-10;
	}
}// end class
