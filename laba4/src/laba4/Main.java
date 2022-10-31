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
		generator.generate(array1000);
		
		for(int i = 0; i < 20; i++) {
			System.out.print(array20[i] + " ");
		} System.out.println();
		
		h.quickSort(array20, 0, 19);
		
		for(int i = 0; i < 20; i++) {
			System.out.print(array20[i] + " ");
		} System.out.println();
		
		e.printInformation(array20, 20);
		e.printInformation(array1000, 1000);
	}

}
