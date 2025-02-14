package Questao5;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Program program = new Program();

        System.out.print("Insira a primeira palavra: ");
        program.palavraP = sc.nextLine();
        System.out.print("Insira a segunda palavra: ");
        program.palavraS = sc.nextLine();

        String resposta = program.verifica();
        System.out.println("As palavras " + resposta + " iguais");

    }
}
