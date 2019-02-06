package clonable;

public class Cloneable {
    public static void main(String[] args) {

        Student john = new Student("John", 20, "male", "Bme");
        Student johnTheClone = john.clone();
        johnTheClone.introduce();
        johnTheClone.name = "Zoli";
        john.introduce();

        johnTheClone.introduce();
    }

}
