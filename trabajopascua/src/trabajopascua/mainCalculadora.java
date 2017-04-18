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
		}while(opc!=0);
	}

}
