package animal;

public class Animal {

    int hunger;
    int thrust;

    public Animal() {
    this.hunger = 50;
    this.thrust = 50;
}
    public void eat (){
        hunger--;
    }
    public void drink() {
        thrust--;
    }
    public void play() {
        thrust++;
        hunger++;
    }

}
