package garden;

public class Main {

    public static void main(String[] args) {

        Garden garden = new Garden();
        garden.showStatus();
        garden.waterStuff(40);
        garden.showStatus();
        garden.waterStuff(70);
        garden.showStatus();

    }
}
