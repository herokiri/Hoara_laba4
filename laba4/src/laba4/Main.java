package laba4;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
	
	/**
	 * @param method метод для замера
	 * @param timeUnit единица измерения
	 * @return время работы
	 */
	private static long timer(Runnable method, TimeUnit timeUnit) {
	    long time = System.nanoTime();
	    method.run();
	    time = System.nanoTime() - time;
	    return TimeUnit.NANOSECONDS.convert(time, timeUnit);
	}
	
	public static void standartSort(int [] source) {
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
		int [] data2 = new int[n];
		
		System.out.println("Вводите целые двузначные числа");
		for(int i = 0; i < n; i++) {
			System.out.print("элемент № " + (i+1) + " : ");
			data[i] = scanner.nextInt();
			data2[i] = data[i];
		}
		
		
		
		
		System.out.println("Исходный ряд : ");
		for(int i = 0; i < n; i++) {
			System.out.print(data[i] + " ");
		}System.out.println();
		System.out.println();
		System.out.println();
		
		
		
		System.out.println("Метод Хоара : ");
		quickSort(data, 0, n-1);
		for(int i = 0; i < n; i++) {
			System.out.print(data[i] + " ");
		}System.out.println();
		System.out.println();
		System.out.println();

		
		System.out.println("Метод Пузырька : ");
		standartSort(data2);
		for(int i = 0; i < n; i++) {
			System.out.print(data2[i] + " ");
		}System.out.println();
		System.out.println();
		System.out.println();
		
		fun();
	}
	
	
	public static void fun() {
		int [] nums =  {
				11,12,13,15,16,17,18,19,
				20,21,22,23,24,25,26,27,28,29,
				30,31,33,34,35,36,37,38,39,40,
				41,42,43,44,45,46,47,48,49,50,
				51,52,53,54,55,56,57,58,59,60
				};
		
		
		int [] bigdata = new int[1000];
		int [] bigdata2 = new int[1000];
		
		for(int i = 0; i < 1000; i++) {
			int n = (int)Math.floor(Math.random() * nums.length);
			bigdata[i] = nums[n];
			bigdata2[i] = nums[n];
		}
		
		
		
		long start = System.nanoTime();
		
		quickSort(bigdata, 0, 1000-1);
		long finish = System.nanoTime();
		long elapsed = finish - start;
		System.out.println("Прошло времени Хоара с 1000 элементами , мс: " + elapsed / 1000000);
		
		start = System.nanoTime();
		
		standartSort(bigdata2);
		finish = System.nanoTime();
		elapsed = finish - start;
		System.out.println("Прошло времени Пузырька с 1000 элементами , мс: " + elapsed / 1000000);
		
	}

}
