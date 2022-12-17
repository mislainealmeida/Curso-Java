package edu.paraCasa.aula20;

import java.util.Scanner;

public class ParaCasa4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[][] compromissos = new String[31][24];

        boolean sair = false;
        int opcao;
        while (!sair) {
            System.out.println("Digite 1 para adicionar compromisso.");
            System.out.println("Digite 2 para verificar compromisso.");
            System.out.println("Digite 3 para sair");

            opcao = scan.nextInt();
            switch (opcao) {
                case 1://adicionar o compromisso
                    boolean diaValido = false;
                    int dia = 0;
                    while (!diaValido) {
                        System.out.println("Digite o dia do mês ");
                        dia = scan.nextInt();
                        if (dia > 0 && dia <= 31) {
                            diaValido = true;
                        } else {
                            System.out.println("Dia inválido, digite novamente.");
                        }
                    }

                    boolean horaValida = false;
                    int hora = 0;
                    while (!horaValida) {
                        System.out.println("Digite a hora do compromisso ");
                        hora = scan.nextInt();
                        if (hora >= 1 && hora <= 24) {
                            horaValida = true;
                        } else {
                            System.out.println("Hora inválida, digite novamente.");
                        }
                    }
                    dia--;
                    System.out.println("Digite o compromisso");
                    compromissos[dia][hora] = scan.next();
                    break;

                case 2://verificar o compromisso
                    diaValido = false;
                    dia = 0;
                    while (!diaValido) {
                        System.out.println("Digite o dia do mês ");
                        dia = scan.nextInt();
                        if (dia > 0 && dia <= 31) {
                            diaValido = true;
                        } else {
                            System.out.println("Dia inválido, digite novamente.");
                        }
                    }

                    horaValida = false;
                    hora = 0;
                    while (!horaValida) {
                        System.out.println("Digite a hora do compromisso ");
                        hora = scan.nextInt();
                        if (hora >= 1 && hora <= 24) {
                            horaValida = true;
                        } else {
                            System.out.println("Hora inválida, digite novamente.");
                        }
                    }
                    dia--;
                    System.out.println("O compromisso agendado é: ");
                    System.out.println(compromissos[dia][hora]);
                    break;
                case 3://sair
                    sair = true;
                    System.out.println("SAIR");
                    break;
                default:
                    System.out.println("Opção inválida, digite novamente.");

            }
        }
    }
}
