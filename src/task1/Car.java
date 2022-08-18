package task1;

public class Car {
    private String type;
    protected int num_of_tire;
    public String color;

    public static void main(String[] args) {
        Car car = new Car();
        car.setType("Sedan");
        car.num_of_tire=4;
        car.color="Abu-abu";
        car.show_identity();
    }

    public void show_identity(){
        System.out.println("Saya Mobil dengan detail, Type : "+this.type+" color : "+this.color+", num of tire : "+this.num_of_tire);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
