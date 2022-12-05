package lab6;

public class ex5 {
    public static void main(String[] args) {
        int[] array={-3,2,3,4,7,8,12};
        int searchedValue=99;
        boolean result= BinarySearch.search(array, searchedValue);
        if(result==true){
            System.out.println("Value "+ searchedValue + " is in the array.");
        }else{
            System.out.println("Value "+ searchedValue + " is not in the array.");
        }
    }
}
