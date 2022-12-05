package lab6;

public class ex2 {
    public static int indexOfSmallest(int[] array) {
        int min= array[0];
        int index=0;
        for(int i=1; i<array.length;i++){
            if(array[i]<min){
                min=array[i];
                index=i;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int[] values={6,5,8,7,11};
        System.out.println("smallest: "+ indexOfSmallest(values));
    }
}
