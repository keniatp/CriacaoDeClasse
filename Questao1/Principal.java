package Questao1;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Program pessoa = new Program();
        System.out.println("Digite seu nome: ");
        pessoa.nome = sc.nextLine();

        System.out.println("Digite sua idade: ");
        pessoa.idade = sc.nextInt();
        String verificacao = pessoa.PodeVotar();
        System.out.println(pessoa.nome + ", "+verificacao);

    }
}