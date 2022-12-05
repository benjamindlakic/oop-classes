package lab6;

public class CounterType {
    private int count;
    public CounterType(int initialCount){
        this.count=initialCount;
    }
    public void setCounter(int newCounter){
        this.count=newCounter;
    }
    public void increaseOne(){
        this.count+=1;
    }
    public void decreaseOne(){ 
        if((this.count-1)>0){
            this.count-=1;
        }
    }
    public int getCount(){
        return this.count;
    }
    public void outputCount(){
        System.out.println(this.count);
    }
}
