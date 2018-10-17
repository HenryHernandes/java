import java.util.Scanner;
public class examen{
public static void main(String args[]){
Scanner teclado = new Scanner(System.in);
double radio,pi,log;
pi=3.1416;
System.out.println("Introduce el radio");
radio = teclado.nextInt();
log = 2 * radio * pi;
System.out.println("La longitud es de: "+log);
}
}