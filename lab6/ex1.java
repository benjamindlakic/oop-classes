package lab6;

public class ex1 {
    public static int smallest(int[] array) {
        int min= array[0];
        for(int i=1; i<array.length;i++){
            if(array[i]<min){
                min=array[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
       int[] values={6,5,8,7,11};
       System.out.println("smallest: "+ smallest(values));
    }
}
