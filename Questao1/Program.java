package Questao1;

public class Program {
    public int idade;
    public String nome;

    public String PodeVotar(){
        if (idade >= 16){
            return "você pode votar!";
        }else{
            return "você não pode votar!";
        }
    }
}