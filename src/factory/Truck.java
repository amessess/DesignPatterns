package factory;

public class Truck implements RoadLogistics{

    @Override
    public void toDrive() {
        System.out.println("The man drives a truck");
    }

    @Override
    public void deliver() {
        toDrive();
    }

    @Override
    public Logistics createTransport() {
        return new Truck();
    }
}
