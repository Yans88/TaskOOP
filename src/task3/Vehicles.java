package task3;

public class Vehicles {

    private final String name;
    private final Boolean with_engine;

    public Vehicles(String name, Boolean with_engine) {
        this.name = name;
        this.with_engine = with_engine;
    }

    public String getName() {
        return name;
    }

    public Boolean getWith_engine() {
        return with_engine;
    }


}
