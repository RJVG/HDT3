/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.BufferedReader;
import java.io.FileReader;
/**
 *
 * @author Rodrigo
 */
public class main {
    
     public static void main(String[] args){
        int x=2000;//Cantidad de datos que se van a ordenar
        int[] array = new int[x];
	try{
            BufferedReader numerosRandom = new BufferedReader(new FileReader("falta el nombre del archivo"));
            for (int i=0;i<x;i++) {
                //Se almacenan los numeros en una lista
                array[i] = Integer.parseInt(numerosRandom.readLine());  
            }}
        catch(Exception e){ System.out.println("Archivo no encontrado");}
    

    //envio de la lista al ordenamiento insertion
    //@rodrigo
    InsertionSort lista = new InsertionSort();
    lista.setList(array);
    lista.doInsertionSort();
    
    
    BSort lista1 = new BSort();
    lista.setList(array)lista1.doBSort();
	
	MergeSorting Fall = new MergeSorting();
	Fall.setA(array);
	Fall.Sort();
    
    array = lista.getList();
        for (int i=0; i<x; i++){
            System.out.println(array[i]);
        }
    }
}


