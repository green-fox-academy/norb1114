/*
package aircraft;

import java.util.ArrayList;
import java.util.List;

public class Carrier {

    List<Aircraft> planes;
    int healtPoints;
    int carrierAmmoStore;

    public Carrier(int healtPoints, int carrierAmmoStore) {

        this.healtPoints = healtPoints;
        this.carrierAmmoStore = carrierAmmoStore;
        this.planes = new ArrayList<>();
    }

    public void add(Aircraft aircraft) {

        this.planes.add(aircraft);
    }

    public void fill() {

        if (carrierAmmoStore <= 0) {
            throw new IllegalArgumentException("The carrier has no ammo");
        }
        for (Aircraft aircraft :
                this.planes) {
            if (aircraft.isPriority) {
                this.carrierAmmoStore = aircraft.refill(this.carrierAmmoStore);
            }
        }
        for (Aircraft aircraft :
                this.planes) {
            if (!aircraft.isPriority) {
                this.carrierAmmoStore = aircraft.refill(this.carrierAmmoStore);
            }

        }
    }

    public void fight(Carrier anotherCarrier) {

        for (Aircraft aircraft : this.planes) {
            anotherCarrier.healtPoints -= aircraft.allDamage();
        }
        if (anotherCarrier.healtPoints <= 0) {
            anotherCarrier.healtPoints = 0;
        }
    }

    public int totalDamage() {

        int totalDamage = 0;
        for (Aircraft aircraft : this.planes) {
            totalDamage += aircraft.allDamage;
        }
        return totalDamage;
    }

    public void getStatus() {

        if (this.healtPoints <= 0) {
            System.out.println("it's dead Jim");
        } else {
            System.out.println("Hp: " + this.healtPoints + ", " + "Aircraft count: " +
                    this.planes.size() + ", " + "Ammo storage: " + this.carrierAmmoStore + " " +
                    "Total Damage: " + totalDamage());

            for (Aircraft aircraft : this.planes) {
                System.out.println(aircraft.getStatus());

            }

        }
    }
}

*/
