package trabajopascua;
import java.util.*;
public class mainCalculadora {
	/*
	 * Metodo de suma y multiplicacion 
	 * Programador Junior ALain
	 */
	
	public static void Suma(double a,double b){
		System.out.println("La suma de "+a+" y "+ b+":"+(a+b));
	}
	public static void Multiplicacion(double a,double b){
			System.out.println("La Multiplicacion de "+a+" y "+b+":"+(a*b));
		
	}
	

	public static Scanner lector=new Scanner(System.in);
	public static void main(String[] args) {
		

		int opc=0;
		do{
			System.out.println("Dime el primer valor:");
			 	double a=lector.nextDouble();
			 	lector.nextLine();
		 	System.out.println("Dime el segundo valor:");
		 	 	double b=lector.nextDouble();
		 	 	lector.nextLine();
			System.out.println("===MENÚ===");
			System.out.println("1.-SUMA");
			System.out.println("2.-RESTA");
			System.out.println("3.-MULTIPLICA");
			System.out.println("4.-DIVIDE");
			System.out.println("0.-SALIR DEL PROGRAMA");
			System.out.println("===ELIGE UNA OPCIÓN===");
			  	opc=lector.nextInt();
			  	lector.nextLine();
			  	switch(opc){
			  	case 1:
			  		Suma(a,b);//metodo greado por Programador Junio Alain
			  		break;
			  	case 2:
			  		
			  		break;
			  	case 3:
			  		Multiplicacion(a, b);//metodo greado por Programador Junio Alain
			  		break;
			  	case 4:
			  		break;
			  	case 0:
			  		System.out.println("PROGRAMA FINALIZADO!!!");
			  		break;
		  		default:
		  			System.out.println("Opción incorrecta, vuelve a probar...");
			  	}
		}while(opc!=0);
	}

}
