package esercizio3;

import java.util.HashMap;
import java.util.Map;

public class RubricaTelefonica {

	public static void main(String[] args) {

		Map<String, String> hmap = new HashMap<String, String>();

		hmap.put("Mario", "3420792382");
		hmap.put("Luigi", "3528565331");
		hmap.put("Wario", "3025564201");
		hmap.put("Waluigi", "32569136478");


		for (String rubrica : hmap.keySet()) {
			System.out.println("Nome: " + rubrica + " - Numero: " + hmap.get(rubrica));
		}
		
		hmap.remove("Andrea");

		String ricerca = null;

		for (String telefono : hmap.keySet()) {
			if ("3420792382".equals(hmap.get(telefono))) {
				ricerca = telefono;
			}
		}
		System.out.println("Ricerca per telefono: " + ricerca);

		ricerca = hmap.get("Mario");
		System.out.println("Ricerca per nome: " + ricerca);


		for (String rubrica : hmap.keySet()) {
			System.out.println("Nome: " + rubrica + " - Numero: " + hmap.get(rubrica));
		}

	}

}
