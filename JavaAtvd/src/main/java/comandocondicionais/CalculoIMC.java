package comandocondicionais;
import java.util.Scanner;

public class CalculoIMC {
    public static void main(String[] args) {
        Scanner imc = new Scanner(System.in);


        float altura, peso, resultado;

        System.out.print("Digite a sua altura: ");
        altura = imc.nextFloat();

        System.out.print("Agora seu Peso: ");
        peso = imc.nextFloat();

        resultado = peso / (altura * altura);

        if (resultado <= 18.5) {
            System.out.println("Você esta abaixo do peso ideal");
        }
        else if (resultado >= 18.5 && altura <= 24.9) {
            System.out.println("Você esta com o peso Ideal ");
        }
        else if (resultado >= 25 && altura <= 29.9) {
            System.out.println("Você esta levemente acima do peso ideal");
        }
        else if (resultado >= 30 && altura <= 34.9) {
            System.out.println("Você esta Obesidade grau 1 cuidado");
        }
        else if (resultado >= 35 && altura <= 39.9) {
            System.out.println("Infelizmente Você esta com Obesidade grau 2");
        }
        else {
            System.out.println("É melhor procurar um tratamento Você esta com Obesidade grau 3");
        }
        imc.close();
    }
}
