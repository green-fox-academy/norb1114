package counter;

import java.awt.*;

public class Counter {

    int counter;
    int counterCopy = counter;

    public Counter() {
        this.counter = 0;
        counterCopy = counter;

    }

    public Counter(int counter){
        this.counter = counter;
        this.counterCopy = counter;

    }

    public void add(int number){
        counter = counter + number;
    }

    public void add(){
        counter++;
    }

    public int get() {
        return counter;
    }
    public void reset(){
        counter = counterCopy;
    }

}
