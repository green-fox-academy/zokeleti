package the_garden_application;

public class Tree extends Plant {
    public Tree(String color){
        super(color);
    }

    @Override
    public boolean needsWater(){
        if (getWaterAmount() < 10){
            return true;
        }
        return false;
    }
    @Override
    public void water(double n){
        setWaterAmount(getWaterAmount() + n * 0.4);
    }
    @Override
    public void getState(){
        if (needsWater()){
            System.out.println("The " + getColor() + " Tree needs water");
        } else {
            System.out.println("The " + getColor() + " Tree doesn't need water");
        }
    }
}
