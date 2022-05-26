package Exercicios.java;

public class Main {
    public static void main(String[] args){
        System.out.print("Preço do pão: R$ 0.18");
        System.out.print("Panificadora Pão de Ontem - Tabela de preços");

        for (int i=1; i<=50; i++){
            System.out.println(i + " - R$ " + (0.18*i));
        }
    }
}
