package laba4;

import java.util.Date;

public class Efficiency {

	public static double hoara(int[] data) {
		
		hoara h = new hoara();
		
		long time = System.nanoTime();  
		
		
		h.quickSort(data, 0, data.length - 1);
		
		
		time = System.nanoTime() - time;  
		System.out.printf("Elapsed %,9.3f ms\n", time/1_000_000.0);
		
		return (time/1_000_000.0);
	}
	
	public static long selection(int[] data) {
		
		Selection s = new Selection();
		long start = System.nanoTime();
		
		s.selectionSort(data);
		
		long finish = System.nanoTime();
		long elapsed = finish - start;
		return (elapsed / 1000000);
	}
	
	public static long insertion(int[] data) {
		
		Insertion i = new Insertion();
		long start = System.nanoTime();
		
		i.insertionSort(data);
		
		long finish = System.nanoTime();
		long elapsed = finish - start;
		return (elapsed / 1000000);
	}
	
	public static long bubble(int[] data) {
		
		Bubble b = new Bubble();
		long start = System.nanoTime();
		
		b.bubbleSort(data);
		
		long finish = System.nanoTime();
		long elapsed = finish - start;
		return (elapsed / 1000000);
	}
	
	
	public static void printInformation(int [] data, int len) {
		System.out.println("Скорость Хоара с " + len + " элементами = " + hoara(data));
		System.out.println("Скорость Сортировки выбором с " + len + " элементами = " + selection(data));
		System.out.println("Скорость Вставками  с " + len + " элементами = " + insertion(data));
		System.out.println("Скорость Прямого обмена с " + len + " элементами = " + bubble(data));
	}
}
