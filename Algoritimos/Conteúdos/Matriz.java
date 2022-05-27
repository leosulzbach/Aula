/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conteúdos;

/**
 * Matrizes = Vetor de 2 dimensões.
 * -Linhas.
 * -Colunas.
 * Armazenamento em linha e colunas. Fazendo a junção delas para selecionar o
 * ponteiro.
 * 
 * Ex: mat1[0][0]=5.
 * armazenando o numero 5 na linha 0 coluna 0.
 * 
 * Ex2: mat1 [1] [2] = 10.
 * armazendando o numero 10 na linha 1 coluna 2.
 * 
 * para iniciar uma matriz: int[][] mat1 = new int[l][c];
 * 
 * @author Windows 10
 */
public class Matriz {
    public static void main(String[] args) {
        int[][] num = new int[4][5];
        int i;
        for ( i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                num[i][j] = Entrada.leiaInt("Linha: "+i+" Coluna: "+j);
            }
        }
        i=0;
        while ( i < 4){
            for (int j = 0; j < 5; j++) {
                System.out.print(num[i][j]+"\t");
            }
            System.out.println();
            i++;
        }
        System.exit(0);
    }
}
