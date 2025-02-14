package Questao3;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Program grupo = new Program();
        System.out.println("Digite um numero: ");
        grupo.numero = sc.nextInt();

        char letra = grupo.verificaGrupo();
        System.out.println("O numero pertence ao grupo: " + letra);
        
    }
}
