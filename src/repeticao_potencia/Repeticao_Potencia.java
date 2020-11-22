/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repeticao_potencia;

import java.util.Scanner;

/**
 *
 * @author João Gabriel
 */
public class Repeticao_Potencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int num, result,i;
         System.out.print("Digite um número: ");
         num = entrada.nextInt();
         System.out.println("potência de 0 a 15 de um número");
         i=0;
         while(i<=15)
         {
             result = (int)Math.pow(num,i);
             System.out.println(num+"^"+i+"="+result);
             i+=1;
         }
         
    }
    
}
