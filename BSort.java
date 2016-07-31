/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kevin
 */
public class BSort {
    
    int [] numeros_arr;
    
    public BSort(){
        numeros_arr = new int[2000]
    }
    
    public void setList(int numeros[]){
        numeros_arr = numeros;
    }
    
    public int[] getList(){
        return numeros_arr;
    }
    
    public static void BSort(String[] args) {
    int x = 0;
    int[] array = new int[x];
    int n = array.length;
    int temporal;

    for (int i = 0; i < n; i++) {
        for (int j = 1; j < (n - i); j++) {

            if (array[j - 1] > array[j]) {
                temporal = array[j - 1];
                array[j - 1] = array[j];
                array[j] = temporal;
                }

            }
        }
    }

}
