package Questao4;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        

            Scanner sc = new Scanner(System.in);
            Program program = new Program();
            System.out.print("Insira o 1° número: ");
            program.numero1 = sc.nextInt();
            System.out.print("Insira o 2° número: ");
            program.numero2 = sc.nextInt();

            String resposta = program.verificaDivisao();
            System.out.println(program.numero1 + resposta + " divisivel por " + program.numero2);

                    
    }    
}
