package lab7;

public class Counter {
    private boolean overflow;
    private int topCount;
    private int count;

    public Counter(int initialCount){
        this.topCount=initialCount;
        this.overflow=false;
        this.count=0;
    }

    @Override
    public String toString() {
        return "Counter [count=" + count + "]";
    }

    public void reset(){
        this.count=0;
        this.overflow=false;
    }

    public void incr1(int digit){
        count+=1*digit;
        if(count>topCount){
            count=topCount;
            overflow=true;
        }
    }
    
    public void incr10(int digit){
        count+=10*digit;
        if(count>topCount){
            count=topCount;
            overflow=true;
        }
    }
    public void incr100(int digit){
        count+=100*digit;
        if(count>topCount){
            count=topCount;
            overflow=true;
        }
    }
    public void incr1000(int digit){
        count+=1000*digit;
        if(count>topCount){
            count=topCount;
            overflow=true;
        }
    }
    public Boolean overflow(){
        if(overflow==true){
            return true;
        }
        else{
            return false;
        }
    }
}
