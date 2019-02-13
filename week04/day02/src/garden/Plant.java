package garden;

public class Plant {

    public String color;
    private int currentWaterAmount = 0;
    private int waterNeed;
    private double waterAbsorption;

    public Plant(String color, int waterNeed, double waterAbsorption){

        this.color=color;
        this.waterNeed=waterNeed;
        this.waterAbsorption=waterAbsorption;
    }

    public boolean isThristy(){
        return currentWaterAmount<waterNeed;
    }

    public void addWater(int waterAmount){

        this.currentWaterAmount += waterAbsorption*waterAmount;
    }

    public void showStatus() {

        String needsWater = "";
        if (isThristy()) {
            needsWater = "needs water";
        }else {
            needsWater = "dont needs water";
        }

        System.out.println("The " + color + " " + getClass().getSimpleName() + " " + needsWater);

    }
}
