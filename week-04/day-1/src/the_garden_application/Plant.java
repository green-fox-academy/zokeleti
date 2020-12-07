package the_garden_application;

public class Plant {

    public Plant(String color){
        setColor(color);
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    private String color;

    public double getWaterAmount() {
        return waterAmount;
    }

    public void setWaterAmount(double waterAmount) {
        this.waterAmount = waterAmount;
    }

    private double waterAmount;
    public void water(double n){

    }
    public boolean needsWater(){
        return false;
    }
    public void getState(){

    }
}
