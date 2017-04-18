package trabajopascua;
import java.util.*;
public class mainCalculadora {

	public static Scanner lector=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
			
		}while(opc!=0);
	}

}
