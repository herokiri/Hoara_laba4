package laba4;

public class Main {
	
	public static void main(String[] args) {
		hoara h = new hoara();
		Efficiency e = new Efficiency();
		
		int[] array20 = new int[20];
		int[] array500 = new int[500];
		int[] array1000 = new int[1000];
		int[] array3000 = new int[3000];
		int[] array5000 = new int[5000];
		int[] array10000 = new int[10000];
		
		Generator.generate(array20);
		
		
		for(int i = 0; i < 20; i++) {
			System.out.print(array20[i] + " ");
		} System.out.println();
		
		h.quickSort(array20, 0, 19);
		
		for(int i = 0; i < 20; i++) {
			System.out.print(array20[i] + " ");
		} System.out.println();
		Generator.createDatas(array20, array500, array1000 , array3000, array5000, array10000);
		
		e.printInformation(array20);
		e.printInformation(array500);
		e.printInformation(array1000);
		e.printInformation(array3000);
		e.printInformation(array5000);
		e.printInformation(array10000);
		
		
		
		
		System.out.println("---------------------------------------------------------------------------------------------------------");
		System.out.println("25% сортировка");
		
		Generator.createDatas25(array20, array500, array1000 , array3000, array5000, array10000);
		
		e.printInformation(array20);
		e.printInformation(array500);
		e.printInformation(array1000);
		e.printInformation(array3000);
		e.printInformation(array5000);
		e.printInformation(array10000);
		
		
		System.out.println("---------------------------------------------------------------------------------------------------------");
		System.out.println("50% сортировка");
		
		Generator.createDatas50(array20, array500, array1000 , array3000, array5000, array10000);
		
		e.printInformation(array20);
		e.printInformation(array500);
		e.printInformation(array1000);
		e.printInformation(array3000);
		e.printInformation(array5000);
		e.printInformation(array10000);
		
		System.out.println("---------------------------------------------------------------------------------------------------------");
		System.out.println("75% сортировка");
		
		Generator.createDatas75(array20, array500, array1000 , array3000, array5000, array10000);
		
		e.printInformation(array20);
		e.printInformation(array500);
		e.printInformation(array1000);
		e.printInformation(array3000);
		e.printInformation(array5000);
		e.printInformation(array10000);
		
		System.out.println("---------------------------------------------------------------------------------------------------------");
		System.out.println("Отсортированный");
		
		Generator.createDatas1(array20, array500, array1000 , array3000, array5000, array10000);
		
		e.printInformation(array20);
		e.printInformation(array500);
		e.printInformation(array1000);
		e.printInformation(array3000);
		e.printInformation(array5000);
		e.printInformation(array10000);
		
		System.out.println("---------------------------------------------------------------------------------------------------------");
		System.out.println("Отсортированный в обратном порядке");
		
		Generator.createDatas2(array20, array500, array1000 , array3000, array5000, array10000);
		
		e.printInformation(array20);
		e.printInformation(array500);
		e.printInformation(array1000);
		e.printInformation(array3000);
		e.printInformation(array5000);
		e.printInformation(array10000);
		
		
		
		
	}

}
