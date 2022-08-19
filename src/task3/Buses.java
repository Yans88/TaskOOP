package task3;

public class Buses extends Vehicles {

    private int wheel_count;
    private Boolean private_bus;

    public Buses(String name, Boolean with_engine) {
        super(name, with_engine);
    }

    public static void main(String[] args) {
        Buses buses = new Buses("Kargo", true);
        buses.setWheel_count(4);
        buses.setPrivate_bus(false);
        String is_engine = buses.getWith_engine() ? "ada engine" : "tidak ada engine";
        System.out.print("Bus dengan nama : " + buses.getName() + ", " + is_engine);
        buses.identity_myself();
    }

    public void identity_myself() {
        String is_private = this.private_bus ? "Private Bus" : "tidak Private Bus";
        System.out.println(" Wheel count " + this.wheel_count + ", " + is_private);
    }

    public void setWheel_count(int wheel_count) {
        this.wheel_count = wheel_count;
    }

    public void setPrivate_bus(Boolean private_bus) {
        this.private_bus = private_bus;
    }
}
