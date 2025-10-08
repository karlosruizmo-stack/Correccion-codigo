import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = (int)(Math.random() * 10 + 1);
        int y = 0;
        while (y != x) {
            y = s.nextInt();
            if (y == x)
                System.out.println("Correcto"); //Acierto
            else if (y > x)
                System.out.println("Incorrecto"); // FaLLO
            else
                System.out.println("a");
        } // es un programa que pide que adivines el numero del 1 al 10 con diferentes resultados dependiendo si aciertas o no.