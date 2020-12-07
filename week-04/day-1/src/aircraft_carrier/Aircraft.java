package aircraft_carrier;

public class Aircraft {
    public Aircraft(String type){
        if (type.equals("F16")){
            maxAmmo = 8;
            baseDamage = 30;
            this.type = type;
        } else if (type.equals("F35")){
            maxAmmo = 12;
            baseDamage = 50;
            this.type = type;
        }
    }

    private String type;
    private int currentAmmo = 0;
    public int getMaxAmmo() {
        return maxAmmo;
    }

    private int maxAmmo;
    private int baseDamage;

    public int fight(){
        int damage = currentAmmo * baseDamage;
        currentAmmo = 0;
        return damage;
    }
    public int refill(int amountToFill){
        if (amountToFill <= maxAmmo- currentAmmo){
            currentAmmo += amountToFill;
            return 0;
        } else {
            currentAmmo = maxAmmo;
            return amountToFill-(maxAmmo - currentAmmo);
        }
    }
    public String getStatus(){
        return "Type " + type + ", Ammo: " + currentAmmo + ", Base Damage: " + baseDamage + ", All damage: " + (currentAmmo * baseDamage);
    }
    public boolean isPriority(){
        if (type.equals("F35")){
            return true;
        }
        return false;
    }
}
