package laba4;
//Сортировка вставками


/*
 * Insertion sort (сортировка вставками) – 
 * алгоритм сортирует массив по мере прохождения по его элементам. 
 * На каждой итерации берется элемент и сравнивается с каждым элементом в уже отсортированной части массива, 
 * таким образом находя «свое место», после чего элемент вставляется на свою позицию. 
 * Так происходит до тех пор, пока алгоритм не пройдет по всему массиву. 
 * На выходе получим отсортированный массив. Сложность данного алгоритма равна O(n^2).
 */
public class Insertion {
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
	
	public static void insertionSort(int [] array) {
		for (int left = 0; left < array.length; left++) {
			countIter++;
			int value = (array[left]%10 + array[left]%100/10);
			int i = left - 1;
			for (; i >= 0; i--) {
				countIter++;
				countComp++;
				if (value < (array[i]%10 + array[i]%100/10)) {
					countSwap++;
					array[i + 1] = array[i];
				} else {
					break;
				}
			}
			array[i + 1] = value;
		}
	}
}
