package laba4;

public class hoara {
	
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
}
