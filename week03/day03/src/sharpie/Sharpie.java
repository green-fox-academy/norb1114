package sharpie;

public class Sharpie {

    double width;
    String color;
    int inkAmount;

    public Sharpie(String color, double width){
        this.width = width;
        this.color = color;
        inkAmount = 100;
    }
    public void use(){
        inkAmount--;

    }

}

