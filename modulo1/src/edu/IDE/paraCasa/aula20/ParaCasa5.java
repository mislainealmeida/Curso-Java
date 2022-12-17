package edu.paraCasa.aula20;

import java.util.Scanner;

public class ParaCasa5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[][][] compromissos = new String[12][31][8];

        boolean sair = false;
        int opcao;
        while (!sair) {
            System.out.println("Digite 1 para adicionar compromisso.");
            System.out.println("Digite 2 para verificar compromisso.");
            System.out.println("Digite 3 para sair");

            opcao = scan.nextInt();
            switch (opcao) {
                case 1://adicionar o compromisso
                    boolean mesValido = false;
                    int mes = 0;
                    while (!mesValido) {
                        System.out.println("Digite o  mês ");
                        mes = scan.nextInt();
                        if (mes > 0 && mes <= 12) {
                            mesValido = true;
                        } else {
                            System.out.println("Mês inválido, digite novamente.");
                        }
                    }

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
                        if (hora >= 0 && hora <= 8) {
                            horaValida = true;
                        } else {
                            System.out.println("Hora inválida, digite novamente.");
                        }
                    }
                    mes--;
                    dia--;
                    System.out.println("Digite o compromisso");
                    compromissos[mes][dia][hora] = scan.next();
                    break;

                case 2://verificar o compromisso
                    mesValido = false;
                    mes = 0;
                    while (!mesValido) {
                        System.out.println("Digite o mês ");
                        mes = scan.nextInt();
                        if (mes > 0 && mes <= 12) {
                            mesValido = true;
                        } else {
                            System.out.println("Mês inválido, digite novamente.");
                        }
                    }
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
                        if (hora >0 && hora <= 8) {
                            horaValida = true;
                        } else {
                            System.out.println("Hora inválida, digite novamente.");
                        }
                    }
                    mes--;
                    dia--;
                    System.out.println("O compromisso agendado é: ");
                    System.out.println(compromissos[mes][dia][hora]);
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


