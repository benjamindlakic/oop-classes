package lab6;

public class Fraction {
    private int denominator;
    private int numerator;
    public Fraction(int initialNum, int initialDen){
        this.denominator=initialDen;
        this.numerator=initialNum;
    }
    public void setDenominator(int newDen){
        this.denominator=newDen;
    }
    public void setNumerator(int newNumer){
        this.numerator=newNumer;
    }
    public double returnFraction(){
        return this.numerator/this.denominator;
    }
    public void lowestTerm(){
        int gcd;
        int newNum, newDen;
        if(this.numerator<this.denominator){
            gcd=this.numerator;
        }
        else{
            gcd=this.denominator;
        }
        newNum=this.numerator/gcd;
        newDen=this.denominator/gcd;
        System.out.println(newNum+"/"+newDen);        
    }
}
