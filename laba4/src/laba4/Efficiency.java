package laba4;

import java.util.Date;

public class Efficiency {

	public static double hoara(int[] data) {
		
		hoara h = new hoara();
		
		long time = System.nanoTime();  
		
		
		h.quickSort(data, 0, data.length - 1);
		
		
		time = System.nanoTime() - time;  
		
		return (time/1_000_000.0);
	}
	
	public static double selection(int[] data) {
		
		Selection s = new Selection();
		long time = System.nanoTime();  
		
		
		s.selectionSort(data);
		
		
		time = System.nanoTime() - time;  
		
		return (time/1_000_000.0);
	}
	
	public static double insertion(int[] data) {
		
		Insertion i = new Insertion();
		long time = System.nanoTime();  
		
		
		i.insertionSort(data);
		
		
		time = System.nanoTime() - time;  
		
		return (time/1_000_000.0);
	}
	
	public static double bubble(int[] data) {
		
		Bubble b = new Bubble();
		long time = System.nanoTime();  
		
		
		b.bubbleSort(data);
		
		
		time = System.nanoTime() - time;  
		
		return (time/1_000_000.0);
	}
	
	
	public static void printInformation(int [] data, int len) {
		System.out.println("		(сортировка вставками)	(сортировка выбором)	(сортировка обменом)	(сортировка Хоара)");
		System.out.println(len+"		   "+insertion(data)+"			"+selection(data)+"		"+bubble(data)+"		"+hoara(data));
	}
}
