package comandocondicionais;
import java.util.Scanner;

public class CalculoSalario {
    public static void main(String[] args) {
        Scanner banco = new Scanner(System.in);

        float credito1, credito2, credito3, credito4, credito5, credito6;
        System.out.print("Digite o 1º salario: ");
        credito1 = banco.nextFloat();
        System.out.print("Digite o 2º salario: ");
        credito2 = banco.nextFloat();
        System.out.print("Digite o 3º salario: ");
        credito3 = banco.nextFloat();
        System.out.print("Digite o 4º salario: ");
        credito4 = banco.nextFloat();
        System.out.print("Digite o 5º salario: ");
        credito5 = banco.nextFloat();
        System.out.print("Digite o 6º salario: ");
        credito6 = banco.nextFloat();

        float saldo = (credito1 + credito2 + credito3 + credito4 + credito5 + credito6) / 6;


        if (saldo <= 500) {
            System.out.println("Não tem tenhum credito.");
        } else if (saldo >= 501 && saldo <= 1000) {
            saldo = saldo + (saldo * 0.3f);
            System.out.println(saldo);
        }
        {
            System.out.println("Esta com o Saldo negativo");
        }
    }
}