package task1;

public class Fish {

    public String type;
    String feed;

    public Fish(String type, String feed) {
        this.type = type;
        this.feed = feed;
    }

    public void show_identity(){
        System.out.println("Saya Ikan dengan detail, Jenis : "+type+" Makanan : "+feed);
    }

    public static void main(String[] args) {
        Fish fish = new Fish("Plankton","Lumba-lumba");
        fish.show_identity();
    }

}


