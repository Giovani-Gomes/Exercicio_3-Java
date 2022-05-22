        package com.company;

        import java.util.Scanner;

        public class Main {

            public static void main(String[] args) {

                Scanner scan = new Scanner(System.in);

                System.out.print("Entre com um número: ");
                int num = scan.nextInt();

                boolean primo = true;


                for (int i=2; i<num; i++){
                    if (num % i == 0){
                        System.out.print ("\nNão é primo - divisível por " + i);
                        primo = false;
                        //break;
                    }
                }

                if (primo){
                    System.out.print ("É número primo");
                }
            }
        }