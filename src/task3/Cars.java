package task3;

public class Cars extends Vehicles {

    private int wheel_count;
    private String engine_type;

    public Cars(String name, Boolean with_engine) {
        super(name, with_engine);
    }

    public static void main(String[] args) {
        Cars cars = new Cars("Fortuner", true);
        cars.setWheel_count(4);
        cars.setEngine_type("Toyota");
        String is_engine = cars.getWith_engine() ? "ada engine" : "tidak ada engine";
        System.out.print("Cars dengan nama : " + cars.getName() + ", " + is_engine);
        cars.identity_myself();
    }

    public void identity_myself() {
        System.out.println(" dengan Tipe Mesin : " + this.engine_type + " dan Wheel count :" + this.wheel_count);
    }

    public void setWheel_count(int wheel_count) {
        this.wheel_count = wheel_count;
    }

    public void setEngine_type(String engine_type) {
        this.engine_type = engine_type;
    }
}
