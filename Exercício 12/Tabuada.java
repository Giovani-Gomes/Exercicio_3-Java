        package com.company;

        import java.util.Scanner;

        public class Main {

            public static void main(String[] args) {

                Scanner scan = new Scanner(System.in);

                System.out.print("Entre com o número para gerar a tabuada: ");
                int num = scan.nextInt();

                System.out.println("Tabuada de " + num + ":");

                for (int i=1; i<=10; i++){
                    System.out.println(num + " x " + i + " = " + (num*i));
                }
            }
        }