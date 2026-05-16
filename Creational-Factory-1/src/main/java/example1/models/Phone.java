package example1.models;

public abstract class Phone {

    String brand = "";
    String cpu = "";

    public Phone(String cpu, String brand) {
        this.cpu = cpu;
        this.brand = brand;
    }

    public abstract void manufacture();


}
