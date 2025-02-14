package Questao2;

public class Program {
    public double celsius;
    public double Fahrenheit;
    public double Kelvin;

    public double transformar(int opcao){
        if (opcao == 1){
            transformarEmFahrenheit(celsius);
            return Fahrenheit;
        }else if(opcao == 2){
            transformarEmKelvin(celsius);
            return Kelvin;
        }else{
            System.out.println("Opcao invalida");
            return -1;
        }
    }

    public void transformarEmFahrenheit(double celsius){
        this.Fahrenheit = (celsius*1.8) + 32;
    }

    public void transformarEmKelvin(double celsius){
        this.Kelvin = celsius+273.15;
    }

}
