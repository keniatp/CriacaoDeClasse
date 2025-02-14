package Questao2;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Program temperatura = new Program();
        System.out.print("Digite um valor (em Celsius): ");
        temperatura.celsius = sc.nextDouble();

        System.out.println("Digite 1 para transformar em Fahrenheit \nDigite 2 para transformar em Kelvin");
        int opcao = sc.nextInt();
        
        double tempTransformada = temperatura.transformar(opcao);
        System.out.println("A temperatua final: " + tempTransformada);

    }
}