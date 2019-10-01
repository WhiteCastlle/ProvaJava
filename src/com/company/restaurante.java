package com.company;

import java.util.Scanner;

public class restaurante {
    public static void main(String[] args) {
        String nome;
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe seu nome:");
        nome = sc.nextLine();
        if (nome.length() < 6)
        {
            System.out.println("Que pena! Esse ano o desconto não é para seu nome");
            System.out.println("Mas continue nos prestigiando que sua vez chegará.");
        }
        else
        {
            System.out.println("Parabéns você ganhou 30% de desconto!!!");
            System.out.println("Informe o Valor da sua conta:");
            int valor = sc.nextInt();
            valor = valor - valor / 100 * 30;
            System.out.println("O valor da sua conta com desconto é: "+valor);
        }
    }
}
