package lab6;

public class ex3 {
    public static int indexOfSmallestStartingFrom(int[] array, int indexin) {
        int min= array[indexin];
        int index=indexin;
        for(int i=indexin; i<array.length;i++){
            if(array[i]<min){
                min=array[i];
                index=i;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int[] values={-1, 6, 9, 8, 12};
        System.out.println(indexOfSmallestStartingFrom(values, 1));
        System.out.println(indexOfSmallestStartingFrom(values, 2));
        System.out.println(indexOfSmallestStartingFrom(values, 4));
    }
}
