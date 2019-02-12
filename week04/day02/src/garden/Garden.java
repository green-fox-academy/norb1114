package garden;

import java.util.ArrayList;
import java.util.List;

public class Garden {

    List<Plant> plants = new ArrayList<Plant>();

    public Garden(){
        plants.add(new Flower("yellow"));
        plants.add(new Flower("blue"));
        plants.add(new Tree("purple"));
        plants.add(new Tree("Orange"));
    }

    public void showStatus(){

        for (Plant plant :
                plants) {
            plant.showStatus();
        }
        System.out.println();
    }

    public void waterStuff(int waterAmount){

        int numberOfThristyPlants = 0;
        for (Plant plant :
                plants) {
            if (plant.isThristy()){
                numberOfThristyPlants++;
            }
        }
        for (Plant plant :
                plants) {
            plant.addWater(waterAmount / numberOfThristyPlants);
        }
    }
}
