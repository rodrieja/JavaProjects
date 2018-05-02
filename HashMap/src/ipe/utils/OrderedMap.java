package ipe.utils;

import java.util.Map;
import java.util.TreeMap;

public class OrderedMap {
	/***
	 * Este m�todo recibe un mapa a ordenar de forma descendente
	 * @param unsortedMap
	 *            mapa a ordenar, se utilza Map para hacerlo gen�rico y no
	 *            depender del tipo de dato
	 * @return
	 */
	public static Map sortMapByValue(Map unsortedMap) {
		Map sortedMap = new TreeMap(new HashMapValueComparator(unsortedMap));
		sortedMap.putAll(unsortedMap);
		return sortedMap;
	}
}
