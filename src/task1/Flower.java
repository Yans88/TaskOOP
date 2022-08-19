package task1;

public class Flower {
    protected String nama;
    protected String color;
    protected int num_of_petal;

    public static void main(String[] args) {
        Flower flower = new Flower();
        flower.nama = "Bunga Melati";
        flower.color = "merah";
        flower.num_of_petal = 4;
        flower.show_identity();
    }

    protected void show_identity() {
        System.out.println("Saya Bunga dengan detail, Jenis : " + this.nama + ", color : " + this.color + ", num of petal :" + this.num_of_petal);
    }


}
