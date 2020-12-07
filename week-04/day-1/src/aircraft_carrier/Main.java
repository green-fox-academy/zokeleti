package aircraft_carrier;

public class Main {
    public static void main(String[] args) throws Exception {
        Carrier carrier1 = new Carrier(2500, 2400);
        Carrier carrier2 = new Carrier(3200, 2450);
        carrier1.armCarrier();
        carrier2.armCarrier();
        carrier1.fill();
        carrier1.getStatus();
        carrier2.fill();
        carrier2.getStatus();
        carrier1.fight(carrier2);
        carrier1.getStatus();
        carrier2.getStatus();
    }
}
