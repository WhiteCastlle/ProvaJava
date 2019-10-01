package com.company;

import java.io.IOException;
import java.util.Scanner;

public class salario {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("informe o seu cargo:");
        System.out.println("1 - Escrituário");
        System.out.println("2 - Secretário");
        System.out.println("3 - Caixa");

        int cargo = sc.nextInt();
        Runtime.getRuntime().exec("cls");

        System.out.println("Informe o seu salário atual:");
        double salario = sc.nextDouble();

        switch (cargo){
            case 1 :
            salario = salario + salario / 100 * 50;
                System.out.println("Escrituários receberam 50% de aumento");
                System.out.println("Seu novo salário é:R$"+salario);
            break;
            case 2 :
                salario = salario + salario / 100 * 35;
                System.out.println("Secretários receberam 35% de aumento");
                System.out.println("Seu novo salário é:R$"+salario);
                break;
            case 3 :
                salario = salario + salario / 100 * 20;
                System.out.println("Caixas receberam 20% de aumento");
                System.out.println("Seu novo salário é:R$"+salario);
                break;

        }
    }
}
