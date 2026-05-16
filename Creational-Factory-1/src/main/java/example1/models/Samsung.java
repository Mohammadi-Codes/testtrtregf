package example1.models;

public class Samsung extends Phone {


    public Samsung(String cpu, String brand) {
        super(cpu, brand);
    }

    @Override
    public void manufacture() {


        System.out.println("Manufacturing Samsung");


    }

}
