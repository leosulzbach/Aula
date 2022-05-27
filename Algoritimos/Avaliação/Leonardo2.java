/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Avaliação;

/**
 *
 * @author Windows 10
 */
public class Leonardo2 {
    public static void main(String[] args) {
        int n = Entrada.leiaInt("Digite um número: ");
        int pares=0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0){
                pares++;
            }
        }
        System.out.println("Total de numeros pares entre 1 e "+n+": "+pares);
        System.exit(0);
    }
}
