package laba4;

//прямым обменом

/*
 * Bubble sort (сортировка обменом) – 
 * данный алгоритм меняет местами два соседних элемента,
 * если первый элемент массива больше второго. 
 * Так происходит до тех пор, пока алгоритм не обменяет местами все неотсортированные элементы. 
 * Сложность данного алгоритма сортировки равна O(n^2).
 */

public class Bubble {
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
	
	public static void bubbleSort(int [] source) {
		
		 for (int i = 0; i < source.length - 1; i++) {
			 countIter++;
	            for (int j = source.length - 1; j > i; j--) {
	            	countIter++;
	            	countComp++;
	                if ((source[j-1]%10 + (source[j-1]%100/10)) > (source[j]%10 + (source[j]%100/10))) {
	                	countSwap++;
	                    int tmp = source[j - 1];
	                    source[j - 1] = source[j];
	                    source[j] = tmp;
	                }
	            }
	        }
	}
}
