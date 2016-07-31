/*
MergeSorting.java
Ordenamiento tipo merge
Gustavo Orellana 15073
27.07.2016
*/

import java.util.*;

public class MergeSorting{
	ArrayList S = new ArrayList();
	Sort(S);
	
	// Ordenar
	public Revision[] Sort(Revision[] Num){
		// Si lista vacía no hacer nada
		if (Num.length <= 1 ){
			System.out.println ("Lista vacía");
		//Si lista llena seguir con ordenamiento
		}
		
		//Separar lista original 
		Revision[] P = new Revision[Num.length / 2];
		Revision[] E = new Revision[Num.length - P.length];
		
		//Enviar primera y segunda parte de la lista al metodo para ordenarlo
		Sort(E);
		Sort(P);
		
		Merge(P,E,Num);
		//Imprimir nueva lista con datos ordenados
		return S;
	}
	
	public void Merge(Revision [] Primero, Revision [] Segundo, Revision [] Nuevo){
	// Crear e iniciar contadores en 0
	int A,B,C = 0;
	// Comparar elementos de la primera y segunda lista y agregarla a una tercera
		while(A < Primero.length && B < Segundo.length){
			// Aumentar contador para ir valor por valor de la ambas listas
			if(Primero[A].compareTo(Segundo[B])<0){
				Nuevo[C] = Primero[A];
				A++;
			}else{
				// Ver si valor de la segunda lista entra despeus de un valor de la primera
				Nuevo[C] = Segundo[B];
				B++;
			}
			// Aumentar la posicion de la tercera lista para agerar datos
			C++;
		}
	}
}