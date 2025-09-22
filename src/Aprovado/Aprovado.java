package Aprovado;

import java.util.Scanner;

public class Aprovado {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("----------------------");

        System.out.println("Digite o seu Nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite a Primeira Nota: ");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite a Segunda Nota: ");
        double nota2 = scanner.nextDouble();

        System.out.println("Digite a Terceira Nota: ");
        double nota3 = scanner.nextDouble();

        System.out.println("Digite a Quarta Nota: ");
        double nota4 = scanner.nextDouble();

        System.out.println("-------------------------");

        {
            double media = (nota1 + nota2 + nota3 + nota4);
            double soma = media / 4;
            System.out.println(nome + " sua média é: " + soma);



            if (media >= 5.0) {
                System.out.println("Aprovado");
            } else if (media < 4) {
                System.out.println("Reprovado");

            } else {
                System.out.println("Recuperação");
            }


        }
    }


}
