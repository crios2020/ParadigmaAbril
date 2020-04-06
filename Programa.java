import javax.swing.JOptionPane;
public class Programa{
	public static void main(String[] args){
		//punto de entrada del proyecto, es ejecutable
		System.out.println("Hola Mundo!");
		
		System.out.println("-- auto1 --");
		Auto auto1=new Auto();			//creamos el objeto auto1
		auto1.marca="Fiat";
		auto1.modelo="Idea";
		auto1.color="Verde";
		auto1.acelerar();		//10
		auto1.acelerar();		//20
		auto1.acelerar();		//30
		auto1.frenar();			//20
		
		System.out.println(auto1.marca+" "+auto1.modelo+" "+auto1.color+" "+auto1.velocidad);
		
		System.out.println("-- auto2 --");
		Auto auto2=new Auto();
		auto2.marca="WV";
		auto2.modelo="Gol";
		auto2.color="Blanco";
		auto2.acelerar();			//10
		//auto2.acelerar(25);			//35
		auto2.acelerar(20,true);	//75	
	
		System.out.println(auto2.marca+" "+auto2.modelo+" "+auto2.color+" "+auto2.velocidad);
		
		//int x;
		//System.out.println(x); //error las variables deben ser inicializada
		
		
		System.out.println("-- cajaDeAhorro1 --");
		CajaDeAhorro cajaDeAhorro1=new CajaDeAhorro();
		//cajaDeAhorro1.saldo=400000000;
		cajaDeAhorro1.depositarDinero(25000);
		cajaDeAhorro1.extraerDinero(5000);
		//cajaDeAhorro1.informarSaldo();
		System.out.println(cajaDeAhorro1.obtenerSaldo());
		
		JOptionPane.showMessageDialog(null,"Velocidad: "+cajaDeAhorro1.obtenerSaldo());
		
	}
}
