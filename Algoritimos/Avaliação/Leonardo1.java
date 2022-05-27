/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Avaliação;

/**
 *
 * @author Windows 10
 */
public class Leonardo1 {
    public static void main(String[] args) {
        String[] nomes = new String[4];
        int ia=0, fs=0;
        for (int i = 0; i <nomes.length; i++) {
            nomes[i] = Entrada.leiaString("Digite um nome: ");
               if (nomes[i].charAt(0)=='a' || nomes[i].charAt(0)=='A') { 
                   ia++;
                }
                if ((nomes[i].charAt(nomes[i].length()-1)=='s' || nomes[i].charAt(nomes[i].length()-1)=='S')) {
                    fs++;
                }       
        }
        System.out.println("Quantidade de nomes que iniciam com A: "+ia);
        System.out.println("Quantidade de nomes que terminam com S: "+fs);
        System.exit(0);
    }
}

