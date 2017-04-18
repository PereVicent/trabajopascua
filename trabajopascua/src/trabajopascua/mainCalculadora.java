package trabajopascua;
import java.util.*;
public class mainCalculadora {
	
	public static void restar(double a, double b){
		System.out.println("La resta de los dos numeros son"+(a-b));
	}
	public static Scanner lector=new Scanner(System.in);
	public static void main(String[] args) {
		
		//loco
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
			  		break;
			  	case 2:
			  		restar(a,b);
			  		break;
			  	case 3:
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
