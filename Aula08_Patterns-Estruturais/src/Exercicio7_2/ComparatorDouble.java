package Exercicio7_2;

import java.util.Comparator;


/**
 * 
 * @author Lincoln de freitas Almeida RA:816119071  SI3ANMCA
 *
 */
public class ComparatorDouble implements Comparator<Double> {
	public int compare(Double d1, Double d2) {
		Double d1z = d1 - Math.floor(d1);
		Double d2z = d2 - Math.floor(d2);
		return d1z.compareTo(d2z);
	}
}
