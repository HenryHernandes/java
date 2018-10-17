import java.io.*;
public class ejemplo2_lectura{

public static void main(String args[]) throws IOException{

InputStreamReader isr = new InputStreamReader(System.in);
BufferedReader br = new BufferedReader(isr);
String nombre;
int edad;
System.out.println("como te llamas? ");
nombre = br.readLine();
System.out.println("cual es tu edad? ");
edad = Integer.parseInt(br.readLine());
System.out.println("Tu nombre es "+ nombre);
System.out.println("Tu edad es "+ edad);
}
}

