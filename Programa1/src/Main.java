import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int a, b, c;
        double d;
        String z;

        a = x.nextInt(); // Introducir cifra o variable
        b = x.nextInt();
        z = x.next();

        if (z.equals("+")) { // Suma 
            c = a + b;
            System.out.println(c);
        } else if (z.equals("-")) { // Resta
            c = a - b;
            System.out.println(c); // Multiplicación
        } else if (z.equals("*")) { 
            c = a * b;
            System.out.println(c); // División
        } else if (z.equals("/")) {
            d = (double) a / b;
            System.out.println(d);
        } else {
            System.out.println();
        }

        x.close(); // Este programa es una calculadora limitada en 4 operaciones.
    }
}