/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Avaliação;

/**
 *
 * @author Windows 10
 */
public class Leonardo3 {
    public static void main(String[] args) {
        
        String palavra =Entrada.leiaString("Jogador 1 digite a palavra da forca: ");
        String[] chute=new String[6];
        
        for (int i = 0; i < chute.length; i++) {
            chute[i]=Entrada.leiaString("Jogador 2 de um chute: ");
            System.out.println(chute[i]);
            for (int j = 0; j < palavra.length(); j++) {
                if (chute[i].charAt(j)==palavra.charAt(j)) {
                    System.out.println("A letra "+chute[i].charAt(j)+" esta na posição ("+(j+1)+") correta.");
                }
            }
            if (chute[i].equalsIgnoreCase(palavra)) {
                System.out.println("Parabéns jogador 2 você venceu!!!!");
                i=7;
            }else if (i==5){
                System.out.println("Parabéns jogador 1 você venceu!!!!");
            }
        }
        System.exit(0);
        
    }
}
