package laba4;

import java.util.Scanner;

public class Main {
	
	public static void quickSort(int[] source, int leftBorder, int rightBorder) {
        int leftMarker = leftBorder;
        int rightMarker = rightBorder;
        int pivot = source[(leftMarker + rightMarker) / 2];
        pivot = (pivot%10) + ((pivot%100)/10);
        do {
            
            while ((source[leftMarker]%10 + (source[leftMarker]%100/10)) < pivot) {
                leftMarker++;
            }
         
            while ((source[rightMarker]%10 +(source[rightMarker]%100/10)) > pivot) {
                rightMarker--;
            }
           
            if (leftMarker <= rightMarker) {
                
                if (leftMarker < rightMarker) {
                    int tmp = source[leftMarker];
                    source[leftMarker] = source[rightMarker];
                    source[rightMarker] = tmp;
                }
                
                leftMarker++;
                rightMarker--;
            }
        } while (leftMarker <= rightMarker);

        if (leftMarker < rightBorder) {
            quickSort(source, leftMarker, rightBorder);
        }
        if (leftBorder < rightMarker) {
            quickSort(source, leftBorder, rightMarker);
        }
}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("количество элементов : ");
		int n = scanner.nextInt();
		int [] data = new int[n];
		
		System.out.println("Вводите целые двузначные числа");
		for(int i = 0; i < n; i++) {
			System.out.print("элемент № " + (i+1) + " : ");
			data[i] = scanner.nextInt();
		}
		System.out.println();
		for(int i = 0; i < n; i++) {
			System.out.print(data[i] + " ");
		}
		quickSort(data, 0, n-1);
		System.out.println();
		for(int i = 0; i < n; i++) {
			System.out.print(data[i] + " ");
		}
	}

}
