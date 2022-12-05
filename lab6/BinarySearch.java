package lab6;

public class BinarySearch {
    public static boolean search(int[] array, int searchedValue) {
        int first = 0;
        int last = array.length - 1;
        int mid = (first + last) / 2;
        while (first <= last) {
            if (array[mid] < searchedValue) {
                first = mid + 1;
            } else if (array[mid] == searchedValue) {
                System.out.println("Element is found at index: " + mid);
                break;
            } else {
                last = mid - 1;
            }
            mid = (first + last) / 2;
        }
        if ( first > last ){  
            return false;  
        } return true;
    }
}
