package esercizio2;

import java.util.ArrayList;
import java.util.Collections;

public class CrescenteDecrescente {

	public static void ordina(ArrayList<Integer> lista) {
		Collections.sort(lista); // sorta l'array di numeri
		System.out.printf("Lista array ordinato: %s%n", lista);
		
		System.out.printf("Lista array ordinato decrescente: %s%n", reverseSort(lista));// reverseSort
	}
	
	
	public static ArrayList<Integer> reverseSort(ArrayList<Integer> lista) {
		Collections.sort(lista, Collections.reverseOrder());
		return lista;
	}
}
/* Scrivere una funzione che accetti un intero N e restituisca una lista ordinata di N interi casuali da 0 a 100.  */

/*  Scrivere una seconda funzione che accetti una lista e restituisca una nuova lista composta dagli elementi della prima lista seguiti dagli stessi elementi disposti in ordine inverso. */

