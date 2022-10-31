package laba4;

//Сортировка выбором

/*
 * Selection sort (сортировка выбором) – 
 * суть алгоритма заключается в проходе по массиву 
 * от начала до конца в поиске минимального элемента массива и перемещении его в начало. 
 * Сложность такого алгоритма O(n2).

 */
public class Selection {
	
	public static void selectionSort(int [] array) {
		
		Swap s = new Swap();
		for (int left = 0; left < array.length; left++) {
			int minInd = left;
			for (int i = left; i < array.length; i++) {
				if ((array[i]%10 + array[i]%100/10) < (array[minInd]%10 + array[minInd]%100/10)) {
					minInd = i;
				}
			}
			s.swap(array, left, minInd);
		}
		
	}
}
