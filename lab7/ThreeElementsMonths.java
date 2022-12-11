package lab7;

import java.util.HashMap;

public class ThreeElementsMonths {
    private char firstLetter;
    private char secondLetter;
    private char thirdLetter;

    public ThreeElementsMonths(String shortMonth){
        this.firstLetter=shortMonth.charAt(0);
        this.secondLetter=shortMonth.charAt(1);
        this.thirdLetter=shortMonth.charAt(2);
    }
    
    @Override
    public String toString() {
        return "ThreeElementsMonths [firstLetter=" + firstLetter + ", secondLetter=" + secondLetter + ", thirdLetter="
                + thirdLetter + "]";
    }
}
