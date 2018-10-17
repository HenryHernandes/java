import java.io.*;

public class ejercicio2{

public static void main(String args[]) throws IOException{

InputStreamReader isr = new InputStreamReader(System.in);
BufferedReader br = new BufferedReader(isr);

int num1,num2,sum,res,mul,div;
System.out.println("introduce el primer numero");
num1 = Integer.parseInt(br.readLine());
System.out.println("introduce el segundo numero");
num2 = Integer.parseInt(br.readLine());
sum = num1 + num2;
res = num1 - num2;
mul = num1 * num2;
div = num1 / num2;
System.out.println("La suma es: "+sum);
System.out.println("La resta es: "+res);
System.out.println("La multiplicacion es: "+mul);
System.out.println("La division es: "+div);
}
}
