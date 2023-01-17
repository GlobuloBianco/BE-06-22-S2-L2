package esercizio1;


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Esercizio1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        System.out.print("Scegli il numero di parole: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        Set<String> parole = new HashSet<>();
        Set<String> duplicate = new HashSet<>();

        for (int i = 0; i < n; i++) {
            System.out.print("Inserisci la parola " + (i + 1) + ": ");
            String p = scanner.nextLine();
            if (!parole.add(p)) {
            	duplicate.add(p);
            }
        }

        System.out.println("Parole duplicate: " + duplicate);
        System.out.println("Numero di parole distinte: " + parole.size());
        System.out.println("Elenco parole distinte: " + parole);
    }

}
