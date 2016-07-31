/*
MergeSorting.java
Ordenamiento tipo merge
Gustavo Orellana 15073
27.07.2016
*/

import java.util.*;

public class MergeSorting{
	public MergeSorting(){
	int[] S = new int[2000];
	Sort(S);
	}
	
	public void setS(int numeros[]){
		S = numeros;
	}
	public int[] getS(){
		return S;
	}
	// Ordenar
	public Comparable[] Sort(Comparable[] Num){
		// Si lista vacía no hacer nada
		if (Num.length <= 1 ){
			System.out.println ("Lista vacía");
		//Si lista llena seguir con ordenamiento
		}
		
		//Separar lista original 
		Comparable[] P = new Comparable[Num.length / 2];
		Comparable[] E = new Comparable[Num.length - P.length];
		
		//Enviar primera y segunda parte de la lista al metodo para ordenarlo
		Sort(E);
		Sort(P);
		
		Merge(P,E,Num);
		//Imprimir nueva lista con datos ordenados
		return S;
	}
	
	public void Merge(Comparable [] Primero, Comparable [] Segundo, Comparable [] Nuevo){
	// Crear e iniciar contadores en 0
	int A,B,C = 0;
		// Comparar elementos de la primera y segunda lista y agregarla a una tercera
		while(A < Primero.length && B < Segundo.length){
			// Aumentar contador para ir valor por valor de la ambas listas
			if(Primero[A].compareTo(Segundo[B])<0){
				Nuevo[C] = Primero[A];
				A++;
			}else{
				Nuevo[C] = Segundo[B];
				B++;
			}
			// Aumentar la posicion de la tercera lista para agerar datos
			C++;
		}
	}
}
