package laba4;

public class Swap {
	public void swap(int[] array, int ind1, int ind2) {
	    int tmp = array[ind1];
	    array[ind1] = array[ind2];
	    array[ind2] = tmp;
	}
}
