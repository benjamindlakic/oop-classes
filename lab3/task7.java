package lab3;

import java.util.ArrayList;

public class task7 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Hallo");
        list.add("Moi");
        list.add("adadada");
        list.add("DADADAD");
        ArrayList<Integer> lenghts = lenghts(list);
        System.out.println(lenghts);
    }
    private static ArrayList<Integer> lenghts(ArrayList<String> list) {
        ArrayList<Integer> listLenght = new ArrayList<>();
        for (String name : list) {
            listLenght.add(name.length());
        }
        return listLenght;
        
    }
}
