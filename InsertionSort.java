/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rodrigo
 */
/** porgramacion basada en:
 * http://www.java2novice.com/java-sorting-algorithms/insertion-sort/
 * @author Rodrigo
 */
public class InsertionSort{
    int [] numeros_arr;
    
    public InsertionSort(){
        numeros_arr = new int[2000];
    }
    
    public void setList(int numeros[]){
        numeros_arr = numeros;
    }
    
    public int[] getList(){
        return numeros_arr;
    }
    
    public void doInsertionSort(){
         //variable para comparar el numero siguiente con el anterior.
        int revisor;
        //ciclo para comparar cada casilla del array
        for (int i = 1; i < numeros_arr.length; i++) {
            //modificador de posiciones.
            for(int j = i ; j > 0 ; j--){
                if(numeros_arr[j] < numeros_arr[j-1]){
                    revisor = numeros_arr[j];
                    numeros_arr[j] = numeros_arr[j-1];
                    numeros_arr[j-1] = revisor;
                }
            }
        }
    }
}
