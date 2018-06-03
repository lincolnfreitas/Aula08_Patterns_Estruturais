package Exercicio4_2;

import java.util.List;


/**
 * 
 * @author Lincoln de freitas Almeida RA:816119071  SI3ANMCA
 *
 */

public class SomadorExistente {
	public int somaLista(List<Integer> lista) {
		int resultado = 0;
		for (int i : lista)
			resultado += i;
		return resultado;
	}
}
