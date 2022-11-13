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
		
		return(time/1_000_000.0);
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
	
	
	public static void printInformation(int [] data) {
		int[] idata = new int[data.length];
		int[] sdata = new int[data.length];
		int[] bdata= new int[data.length];
		int[] hdata = new int[data.length];
		
		for(int i = 0; i < data.length; i++) {
			idata[i]=data[i];
			sdata[i]=data[i];
			bdata[i]=data[i];
			hdata[i]=data[i];
		}
		int countIter = 0, countComp = 0, countSwap = 0;
		System.out.println("			(сортировка вставками)		(сортировка выбором)		(сортировка обменом)		(сортировка Хоара)");
		System.out.println(data.length+"		  		 "+insertion(idata)+"			"+selection(sdata)+"		 "+bubble(bdata)+"				 "+hoara(hdata));
		System.out.println("кол-во итераций 		"+Insertion.getIter()+" 				"+Selection.getIter()+"      		 "+Bubble.getIter());
		System.out.println("кол-во сравнений 		"+Insertion.getComp()+" 				"+Selection.getComp()+"      		 "+Bubble.getComp());
		System.out.println("кол-во обменов 		       "+Insertion.getSwap()+" 				"+Selection.getSwap()+"       		"+Bubble.getSwap());
		
		Insertion.setIter();Insertion.setComp();Insertion.setSwap();
		Selection.setIter();Selection.setComp();Selection.setSwap();
		Bubble.setIter();Bubble.setComp();Bubble.setSwap();
		
		
	}
}
