package edu.paraCasa.aula36.paraCasa2;

import java.util.Scanner;

public class Dio {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Digite um número inteiro. ");
        int n = scan.nextInt();

        int menor = Integer.MAX_VALUE;

            if (Math.sqrt(n) % 1 == 0) {
                for(int i=0; i < n; i++){
                    if (n < menor) {
                        menor = n;
                    }
                }

            }
        System.out.println(menor+" ");

        }
    }

