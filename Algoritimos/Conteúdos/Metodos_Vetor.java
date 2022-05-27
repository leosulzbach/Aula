/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conteúdos;

/**
 *
 * @author Windows 10
 */
public class Metodos_Vetor {
    public static void main(String[] args) {
        int[] vet = new int [10];
        int num = 0;
        int oco = 0;
        vet = preencheVetor (vet);
        do {
            num = Entrada.leiaInt("Digite o valor que você deseja procurar (entre 1 e 10): ");
        } while (num <= 0 || num >10);
        oco = procuraNoVetor (num, vet);
        System.out.println("O número "+num+" está presente "+oco+" vezes no vetor.");
        System.exit(0);
    }
    
    public static int [] preencheVetor (int[]v){
        int ind;
        for ( ind = 0; ind < 9; ind++) {
            v [ind] = ((int)(Math.random()*10)+1);
            System.out.println(v[ind]+"  ");
        }
        return v;
    }
    
    public static int procuraNoVetor (int n, int [] v){
        int ind;
        int cont = 0;
        for (ind = 0; ind < 10; ind++) {
            if (n == v[ind]) {
                cont++;
            }
        }
        return cont;
    }
}
