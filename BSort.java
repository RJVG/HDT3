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
    //envio de la lista al ordenamiento insertion
    //@rodrigo
    InsertionSort lista = new InsertionSort();
    lista.setList(array);
    lista.doInsertionSort();
    
    array = lista.getList();
        for (int i=0; i<x; i++){
            System.out.println(array[i]);
        }
        }
}

}
