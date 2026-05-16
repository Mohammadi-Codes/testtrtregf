package example1.models;

public class IPhone extends Phone {

    private Integer numberOfCameras;

    public IPhone(String cpu, String brand) {
        super(cpu, brand);
    }


    public Integer getNumberOfCameras() {
        return numberOfCameras;
    }

    public void setNumberOfCameras(Integer numberOfCameras) {
        this.numberOfCameras = numberOfCameras;
    }

    @Override
    public void manufacture() {

        System.out.println("Manufacturing IPhone");


    }

}
