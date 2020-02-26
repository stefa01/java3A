/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase3;

import java.util.Scanner;

/**
*
*@author Aula1
*/
public class Clase3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a=4,b=4;
        if(a>b){
            System.out.println("El mayor es: "+a);
        }else{
            if(a<b){
                System.out.println("El mayor es: "+b);
            }else{
                if(a==b){
                    System.out.println("Son iguales");
                }
                
            }
        }
        int nl=0;
        float n2=0;
        System.out.println("Digite un numero");
        Scanner reader=new Scanner(System.in);
        n1=reader.nextInt();
        System.out.println("Digite el segundo numero");
        n2=reader.nextInt();
        System.out.println("la suma es: "+(n1+n2));
        
                
        
    }
    
}
