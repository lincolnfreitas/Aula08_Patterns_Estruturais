package Exercicio4_1;

import java.util.Iterator;
import java.util.Map;

/**
 * 
 * @author Lincoln de freitas Almeida RA:816119071  SI3ANMCA
 *
 */

public class Main {

	public static void main(String[] args) {
		Object[][] pares = new String[][] { 
			{ "Sun", "IBM", "FSF", "Berkley", "Microsoft", "Apple" },
			{ "Solaris", "OS/2", "GNU/Linux", "BSD", "Windows", "MacOS" } 
		};

		@SuppressWarnings("rawtypes")
		Map mapa = new NovoMapa(pares);
		for (@SuppressWarnings("rawtypes")
		Iterator iter = mapa.entrySet().iterator(); iter.hasNext();) {
			@SuppressWarnings("rawtypes")
			Map.Entry entry = (Map.Entry) iter.next();
			System.out.println(entry.getKey() + " => " + entry.getValue());
		}
	}
}
