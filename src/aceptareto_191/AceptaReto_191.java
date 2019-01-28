/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aceptareto_191;
import java.util.*;
/**
 *
 * @author irone
 */
public class AceptaReto_191 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);//utilizamos el escaner como método de salida por pantalla
        
        int numero = sc.nextInt();//casos
        int compartimentos;//el número de compartimentos
        int llenado;//la capacidad del acuario en litros
        int diferencia;//en litros la diferencia entre los compartimentos
        int litros;//unidad de medida
        
        //inicializamos el bucle
        
        for(int i=0; i<numero; i++){
        compartimentos = sc.nextInt();
        llenado = sc.nextInt();
        diferencia = sc.nextInt();
        litros = llenado;
        llenado = llenado - diferencia;
        
        //inicializamos un segundo bucle para que nos de en los compartimentos su llenado y diferencia
        
        for(int a=0; a<compartimentos-1; a++){
        litros = litros+llenado;
        llenado = llenado-diferencia;
        }
        
        //System para que nos saque los litros de las peceras
        System.out.println(litros);
    }
    }
   
}