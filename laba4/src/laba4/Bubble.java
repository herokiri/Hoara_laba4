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
	
	public static void bubbleSort(int [] source) {
		 for (int i = 0; i < source.length - 1; i++) {
	            
	            for (int j = source.length - 1; j > i; j--) {
	                if ((source[j-1]%10 + (source[j-1]%100/10)) >= (source[j]%10 + (source[j]%100/10))) {
	                    int tmp = source[j - 1];
	                    source[j - 1] = source[j];
	                    source[j] = tmp;
	                }
	            }
	        }
	}
}
