package devcalc;

import java.util.Scanner;

public class Calc {
    //Atributos
    static Scanner entrada = new Scanner(System.in);
    int resultado;

    //Métodos e Funções
    public static void main(String[] args) {
        System.out.println(">>Calculadora");
        System.out.println("(1) Somar");
        System.out.println("(2) Subtrair");
        System.out.println("(3) Multiplicar");
        System.out.println("(4) Dividir");
        System.out.println("Escolha o numero desejado");

        int opcao = entrada.nextInt();
        int num1=0;
        int num2=0;


        if (opcao>= 1 && opcao <= 4) {
            System.out.println("Entre com primeiro numero: ");
            num1 = entrada.nextInt();
            System.out.println("Entre com segundo numero: ");
            num2 = entrada.nextInt();
            System.out.print("Resultado= ");
        }
            switch (opcao) {
                case 1:
                    System.out.println(somarDoisNumeros(num1, num2));
                    break;
                default:
                    System.out.println("opção invalida");
                    break;
            }
        }

        public static int somarDoisNumeros ( int num1, int num2){
            return num1 + num2;

        }
            }
