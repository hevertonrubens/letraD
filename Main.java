package com.unama;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int Numero1, Numero2, Numero3;
        boolean continuar;
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe três números por favor");
        Numero1 = sc.nextInt();
        Numero2 = sc.nextInt();
        Numero3 = sc.nextInt();
        if (Numero1 <= Numero2 + Numero3) {
            System.out.println("Formar triângulo");
            if ((Numero1 == Numero2) && (Numero1 == Numero3)) {
                System.out.println("equilátero");
            } else if ((Numero1 == Numero2) && (Numero1 == Numero3)) {
                System.out.println("Isósceles");
            } else {
                System.out.println("Escaleno");
            }
        } else {
            System.out.println("Não é um triângulo");
        }
    }
}