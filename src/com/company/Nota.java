package com.company;

import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a nota do Trabalho de Laboratório");
        double trab = sc.nextDouble();
        System.out.println("Informe a nota da Avaliação Semestral");
        double ava = sc.nextDouble();
        System.out.println("Informe a nota do Exame Final");
        double fim = sc.nextDouble();
        double media = (trab * 2 + ava * 3 + fim * 5)/10;

        if ((media<=10) && (media>=8))
        {
            System.out.println("Sua média final foi: "+media);
            System.out.println("Seu conceito é A!!!");
            System.out.println("PARABÉNS!!");
        }
        else if ((media>=7) && (media<8))
        {
            System.out.println("Sua média final foi: "+media);
            System.out.println("Seu conceito é B");
            System.out.println("PARABÉNS");
        }
        else if ((media>=6) && (media<7))
        {
            System.out.println("Sua média final foi: "+media);
            System.out.println("Seu conceito é C");
        }
        else if ((media>=5) && (media<6))
        {
            System.out.println("Sua média final foi: "+media);
            System.out.println("Seu conceito é D");
        }
        else if ((media>=0) && (media<5))
        {
            System.out.println("Sua média final foi: "+media);
            System.out.println("Seu conceito é E");
        }

    }
}
