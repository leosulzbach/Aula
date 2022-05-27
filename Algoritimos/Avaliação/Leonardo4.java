/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Avaliação;

/**
 *
 * @author Windows 10
 */
public class Leonardo4 {
    public static void main(String[] args) {
        int quantidade = 254;
        String aux="";
        String[] ipsl=new String[quantidade];
        String[] ipso=new String[quantidade];
        String type = Entrada.leiaString("Digite a classe de Ip's: \n"
                + "Exemplo: 170.10.0");
        
        for (int i = 0; i < ipso.length; i++) {
            ipso[i]="Ip ocupado";
        }
        for (int i = 0; i < ipsl.length; i++) {
            ipsl[i]=(type+"."+(i+1));
        }
        int choice=0;
        int b=0;
        int ip;
        while (choice!=3){
            choice=Entrada.leiaInt("[1] Pegar um Ip \n"
                    + "[2] Devolver um Ip \n"
                    + "[3] Sair do sistema");
            
            if (choice == 1) {
                while  (choice == 1){
                    ip=Entrada.leiaInt("Endereço de Ip desejado: ");
                for (int i = 0; i < ipsl.length; i++) {
                    if (ipsl[i].equals(type+"."+ip)) {
                        System.out.println("Endereço de IP entregue. Agora você é o: "+ipsl[i]);
                        choice=0;
                        aux = ipso[i];
                        ipso[i]=ipsl[i];
                        ipsl[i]=aux;
                    }
                }
                if (choice!=0){
                    System.out.println("Este Ip esta em uso ou é inexitente. Tente outro. ");
                    choice=1;
                }
                }
            }
            ip=0;
            if (choice == 2) {
                while (choice == 2){
                    ip=Entrada.leiaInt("Endereço de Ip a ser devolvido: ");
                    for (int i = 0; i < ipso.length; i++) {
                    if (ipso[i].equals(type+"."+ip)) {
                        System.out.println("Endereço de IP Devolvido.");
                        choice=0;
                        aux = ipsl[i];
                        ipsl[i]=ipso[i];
                        ipso[i]=aux;
                    }
                }
                    if (choice!=0){
                    System.out.println("Este Ip não esta em sua posse!");
                    choice=2;
                }
                }
            }
        }
        int contl=0, conto=0;
        System.out.println("-----------------------------------------------------");
        System.out.println("Listagem: ");
        System.out.println("Ip's LIVRES:");
        for (int i = 0; i <ipsl.length ; i++) {
            if (ipsl[i].equalsIgnoreCase(type+"."+(i+1))) {
                System.out.println(ipsl[i]);
                contl++;
            }
        }
        System.out.println("Quantidade de Ip's Livres: "+contl);
         System.out.println("-----------------------------------------------------");
        System.out.println("Ip's OCUPADOS:");
        for (int i = 0; i <ipsl.length ; i++) {
            if (ipso[i].equalsIgnoreCase(type+"."+(i+1))) {
                System.out.println(ipso[i]);
                conto++;
            }
        }
        System.out.println("Quantidade de Ip's Ocupados: "+conto);
         System.out.println("-----------------------------------------------------");
        
        System.exit(0);
    }
}
