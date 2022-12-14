package laba4;

public class Generator {
	
	public static void createDatas(int [] data20, int[] data500, int[] data1000, int[] data3000, int[] data5000, int [] data10000) {
		generate(data20);
		generate(data500);
		generate(data1000);
		generate(data3000);
		generate(data5000);
		generate(data10000);
	}
	
	public static void createDatas25(int [] data20, int[] data500, int[] data1000, int[] data3000, int[] data5000, int [] data10000) {
		generate25(data20);
		generate25(data500);
		generate25(data1000);
		generate25(data3000);
		generate25(data5000);
		generate25(data10000);
	}
	
	public static void createDatas50(int [] data20, int[] data500, int[] data1000, int[] data3000,int[] data5000, int [] data10000) {
		generate50(data20);
		generate50(data500);
		generate50(data1000);
		generate50(data3000);
		generate50(data5000);
		generate50(data10000);
	}
	
	public static void createDatas75(int [] data20, int[] data500, int[] data1000, int[] data3000, int[] data5000, int [] data10000) {
		generate75(data20);
		generate75(data500);
		generate75(data1000);
		generate75(data3000);
		generate75(data5000);
		generate75(data10000);
	}
	public static void createDatas1(int [] data20, int[] data500, int[] data1000, int[] data3000,int[] data5000, int [] data10000) {
		generate1(data20);
		generate1(data500);
		generate1(data1000);
		generate1(data5000);
		generate1(data10000);
	}

	public static void createDatas2(int [] data20, int[] data500, int[] data1000,int[] data3000 ,int[] data5000, int [] data10000) {
		generate2(data20);
		generate2(data500);
		generate2(data1000);
		generate2(data3000);
		generate2(data5000);
		generate2(data10000);
	}
	public static int [] nums = {
			10,11,12,13,14,15,16,17,18,19,
			20,21,22,23,24,25,26,27,28,29,
			30,31,32,33,34,35,36,37,38,39,
			40,41,42,43,44,45,46,47,48,49,
			50,51,52,53,54,55,56,57,58,59,
			60,61,62,63,64,65,66,67,68,69,
			70,71,72,73,74,75,76,77,78,79,
			80,81,82,83,84,85,86,87,88,89,
			90,91,92,93,94,95,96,97,98,99,
			
	};
	
	public static void generate(int [] data) {
		for(int i = 0; i < data.length; i++) {
			int n = (int)Math.floor(Math.random() * nums.length);
			data[i] = nums[n];
		}
	}
	public static void generate25(int[] data) {
		for(int i = 0; i < data.length * 0.25;i++) {
			data[i] = 10;
		}
		for(int i =  (int) ((int)data.length * 0.25); i < data.length;i++) {
			int n = (int)Math.floor(Math.random() * nums.length);
			data[i] = nums[n];
		}
	}
	public static void generate50(int[] data) {
		for(int i = 0; i < data.length * 0.5;i++) {
			data[i] = 10;
		}
		for(int i =  (int) ((int)data.length * 0.5); i < data.length;i++) {
			int n = (int)Math.floor(Math.random() * nums.length);
			data[i] = nums[n];
		}
	}
	public static void generate75(int[] data) {
		for(int i = 0; i < data.length * 0.75;i++) {
			data[i] = 10;
		}
		for(int i =  (int) ((int)data.length * 0.75); i < data.length;i++) {
			int n = (int)Math.floor(Math.random() * nums.length);
			data[i] = nums[n];
		}
	}
	public static void generate1(int [] data) {
		for(int i = 0; i < data.length; i++) {
			
			data[i] = 00;
		}
	}
	
	public static void generate2(int [] data) {
		for(int i = 0; i < data.length/2; i++) {
			
			data[i] = 99;
		}
		for(int i = data.length/2; i < data.length; i++) {
			
			data[i] = 00;
		}
	}
}
