package aircraft;

public class Aircraft {

    protected int maxAmmo;
    protected int baseDamage;
    protected int currentAmmoStore = 0;
    protected boolean isPriority;
    protected int allDamage;

    public Aircraft(int maxAmmo, int baseDamage, boolean isPriority){
        this.maxAmmo=maxAmmo;
        this.baseDamage=baseDamage;
        this.isPriority=isPriority;
    }

    public int refill(int carrierAmmoStore){

        int remainingCarrierAmmo = carrierAmmoStore - maxAmmo;
        if (this.currentAmmoStore == 0 && carrierAmmoStore > maxAmmo){
            this.currentAmmoStore = this.maxAmmo;
        }else if (carrierAmmoStore < maxAmmo){
            currentAmmoStore = carrierAmmoStore;
        }return remainingCarrierAmmo;
    }

    public int fight (){

        allDamage = currentAmmoStore * baseDamage;
        this.currentAmmoStore =0;
        return this.allDamage;
    }

    public String  getStatus(){
        String message = "Type: " + getClass().getSimpleName() + ", " + "Ammo: " + currentAmmoStore +
                ", " + "Base Damage: " + baseDamage + ", " + "All Damage: " + allDamage;
        return message;
    }

}
