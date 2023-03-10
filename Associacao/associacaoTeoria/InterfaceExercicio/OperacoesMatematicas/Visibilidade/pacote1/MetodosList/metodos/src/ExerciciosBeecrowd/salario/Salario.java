package ExerciciosBeecrowd.salario;

import java.util.Locale;
import java.util.Scanner;

public class Salario{
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner scan = new Scanner(System.in);
        int numero = scan.nextInt();
        int horastrabalhadas = scan.nextInt();
        Double valorRecebido = scan.nextDouble();

        Double valorTotal = horastrabalhadas * valorRecebido;


        System.out.println("NUMBER = " + numero);
        System.out.printf("SALARY = U$ %.2f \n", (valorTotal));
      
        scan.close();
    }

    
}   