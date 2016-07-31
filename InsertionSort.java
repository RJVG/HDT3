/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rodrigo
 */
public class InsertionSort{
    public static int[] doInsertionSort(int[] numeros){
         
        int revisor;
        for (int i = 1; i < numeros.length; i++) {
            for(int j = i ; j > 0 ; j--){
                if(numeros[j] < numeros[j-1]){
                    revisor = numeros[j];
                    numeros[j] = numeros[j-1];
                    numeros[j-1] = revisor;
                }
            }
        }
        return numeros;
    }
}
