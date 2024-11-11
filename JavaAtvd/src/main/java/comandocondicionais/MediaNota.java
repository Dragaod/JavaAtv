package comandocondicionais;

import java.util.Scanner;

public class MediaNota {
    public static void main(String[] args) {

        Scanner nota = new Scanner(System.in);

        float n1, n2, n3, media;

        System.out.print(" entre com a sua Primeira nota: ");
        n1 = nota.nextFloat();

        System.out.print(" entre com a su Segunda nota: ");
        n2 = nota.nextFloat();

        System.out.print(" entre com a Terceira nota: ");
        n3 = nota.nextFloat();

        media = (n1+n2+n3)/3;
        System.out.printf(" a media das notas é: %.2f", media);

        if (media >= 7) {
            System.out.println(" Parabens você passou! ");
        }
        else if (media >= 5) {
            System.out.println(" Pelo visto você ficou de recuperação");
        }
        else {
            System.out.println(" Não foi dessa vez tenta mais 5 anos! ");
        }


    }

}