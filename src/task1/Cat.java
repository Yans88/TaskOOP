package task1;

public class Cat {

    private int num_of_leg;
    private String full_color;

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setFull_color("Red");
        cat.setNum_of_leg(5);
        cat.show_identity();
    }

    private void show_identity() {
        System.out.println("Saya Kucing dengan detail, Warna Bulu : " + this.full_color + " dengan Jumlah Kaki : " + this.num_of_leg);
    }

    public int getNum_of_leg() {
        return num_of_leg;
    }

    public void setNum_of_leg(int num_of_leg) {
        this.num_of_leg = num_of_leg;
    }

    public String getFull_color() {
        return full_color;
    }

    public void setFull_color(String full_color) {
        this.full_color = full_color;
    }
}


