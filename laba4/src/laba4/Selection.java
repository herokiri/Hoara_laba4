package laba4;

//Сортировка выбором

/*
 * Selection sort (сортировка выбором) – 
 * суть алгоритма заключается в проходе по массиву 
 * от начала до конца в поиске минимального элемента массива и перемещении его в начало. 
 * Сложность такого алгоритма O(n2).

 */
public class Selection {
	private static int countIter = 0;
	private static int countComp = 0;
	private static int countSwap = 0;
	
	public static int getIter() {
		return countIter;
	}
	public static int getComp() {
		return countComp;
	}
	public static int getSwap() {
		return countSwap;
	}
	public static void setIter() {
		countIter = 0;
	}
	public static void setComp() {
		countComp = 0;
	}
	public static void setSwap() {
		countSwap = 0;
	}
	public static void selectionSort(int [] array) {
		
		Swap s = new Swap();
		for (int left = 0; left < array.length; left++) {
			countIter++;
			int minInd = left;
			for (int i = left; i < array.length; i++) {
				countIter++;
				countComp++;
				if ((array[i]%10 + array[i]%100/10) < (array[minInd]%10 + array[minInd]%100/10)) {
					minInd = i;
				}
			}
			countSwap++;
			s.swap(array, left, minInd);
		}
		
	}
}
