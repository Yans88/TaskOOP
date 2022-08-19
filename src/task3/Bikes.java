package task3;

public class Bikes extends Vehicles {
    private int wheel_count;

    public Bikes(String name, Boolean with_engine) {
        super(name, with_engine);
    }

    public static void main(String[] args) {
        Bikes bikes = new Bikes("Sepeda Santai", false);
        bikes.setWheel_count(1);
        String is_engine = bikes.getWith_engine() ? "ada engine" : "tidak ada engine";
        System.out.print("Bikes dengan nama : " + bikes.getName() + ", " + is_engine);
        bikes.identity_myself();
    }

    public void identity_myself() {
        System.out.println(", Wheel count " + this.wheel_count);
    }

    public void setWheel_count(int wheel_count) {
        this.wheel_count = wheel_count;
    }
}
