package laba4;

public class Main {
	
	public static void main(String[] args) {
		Generator generator = new Generator();
		hoara h = new hoara();
		Efficiency e = new Efficiency();
		
		int[] array20 = new int[20];
		int[] array500 = new int[500];
		int[] array1000 = new int[1000];
		int[] array3000 = new int[3000];
		int[] array5000 = new int[5000];
		int[] array10000 = new int[10000];
		
		generator.generate(array20);
		generator.generate(array500);
		generator.generate(array1000);
		generator.generate(array3000);
		generator.generate(array5000);
		generator.generate(array10000);
		
		
		for(int i = 0; i < 20; i++) {
			System.out.print(array20[i] + " ");
		} System.out.println();
		
		h.quickSort(array20, 0, 19);
		
		for(int i = 0; i < 20; i++) {
			System.out.print(array20[i] + " ");
		} System.out.println();
		
		e.printInformation(array20, 20);
		e.printInformation(array1000, 500);
		e.printInformation(array1000, 1000);
		e.printInformation(array1000, 3000);
		e.printInformation(array1000, 5000);
		e.printInformation(array1000, 10000);
		
		generator.generate25(array20);
		generator.generate25(array500);
		generator.generate25(array1000);
		generator.generate25(array3000);
		generator.generate25(array5000);
		generator.generate25(array10000);
		
		
		System.out.println();
		System.out.println("25% сортировка");
		
		e.printInformation(array20, 20);
		e.printInformation(array1000, 500);
		e.printInformation(array1000, 1000);
		e.printInformation(array1000, 3000);
		e.printInformation(array1000, 5000);
		e.printInformation(array1000, 10000);
		
		
		System.out.println();
		System.out.println("50% сортировка");
		
		generator.generate50(array20);
		generator.generate50(array500);
		generator.generate50(array1000);
		generator.generate50(array3000);
		generator.generate50(array5000);
		generator.generate50(array10000);
		
		e.printInformation(array20, 20);
		e.printInformation(array1000, 500);
		e.printInformation(array1000, 1000);
		e.printInformation(array1000, 3000);
		e.printInformation(array1000, 5000);
		e.printInformation(array1000, 10000);
		
		System.out.println();
		System.out.println("75% сортировка");
		
		generator.generate75(array20);
		generator.generate75(array500);
		generator.generate75(array1000);
		generator.generate75(array3000);
		generator.generate75(array5000);
		generator.generate75(array10000);
		
		e.printInformation(array20, 20);
		e.printInformation(array1000, 500);
		e.printInformation(array1000, 1000);
		e.printInformation(array1000, 3000);
		e.printInformation(array1000, 5000);
		e.printInformation(array1000, 10000);
		
		System.out.println();
		System.out.println("Отсортированный");
		
		generator.generate1(array20);
		generator.generate1(array500);
		generator.generate1(array1000);
		generator.generate1(array3000);
		generator.generate1(array5000);
		generator.generate1(array10000);
		
		e.printInformation(array20, 20);
		e.printInformation(array1000, 500);
		e.printInformation(array1000, 1000);
		e.printInformation(array1000, 3000);
		e.printInformation(array1000, 5000);
		e.printInformation(array1000, 10000);
		
		System.out.println();
		System.out.println("Отсортированный в обратном порядке");
		
		generator.generate2(array20);
		generator.generate2(array500);
		generator.generate2(array1000);
		generator.generate2(array3000);
		generator.generate2(array5000);
		generator.generate2(array10000);
		
		e.printInformation(array20, 20);
		e.printInformation(array1000, 500);
		e.printInformation(array1000, 1000);
		e.printInformation(array1000, 3000);
		e.printInformation(array1000, 5000);
		e.printInformation(array1000, 10000);
		
		
		
		
	}

}
