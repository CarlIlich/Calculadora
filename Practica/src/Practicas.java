import java.util.Scanner;
import java.util.regex.Pattern;

public class Practicas {
	
	public static void main (String arg[]) throws Exception {
		
		System.out.println("Calculadora");
		System.out.println("BIENVENIDO, elige una operación");
		
		Scanner entrada = new Scanner(System.in);
		int numA, numB;
		String operacion;
		
		System.out.print("Ingrese el primer numero: ");
		numA = entrada.nextInt();
		
		System.out.print("Ingrese el segundo numero: ");
		numB = entrada.nextInt();
		
		System.out.print("Ingrese la operacion: ");
		operacion = entrada.next();
		
		Operacion oper;
		switch (operacion) {
		case "+":
			oper = new OperSuma(numA, numB);
			break;
		case "-":
			oper = new OperResta(numA, numB);
			break;
		case "*":
			oper = new OperMulti(numA, numB);
			break;
		case "/":
			oper = new OperDiv(numA, numB);
			break;
		default:
			throw new Exception("El parametro de operacion no es valido");
		}
		
		System.out.printf("La operacion es: %d %s %d = %d", numA, operacion, numB, oper.Operar());
	}
	
	
}


