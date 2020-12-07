package the_garden_application;

public class Flower extends Plant {
    public Flower(String color) {
        super(color);
    }

    @Override
    public boolean needsWater(){
        if (getWaterAmount() < 5){
            return true;
        }
        return false;
    }
    @Override
    public void water(double n){
        setWaterAmount(getWaterAmount() + n * 0.75);
    }

    @Override
    public void getState() {
        if (needsWater()){
            System.out.println("The " + getColor() + " Flower needs water");
        } else {
            System.out.println("The " + getColor() + " Flower doesn't need water");
        }
    }
}
