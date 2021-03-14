package factory;

public class Ship implements SeaLogistics{
    @Override
    public void toSail() {
        System.out.println("The man sailing on a ship");
    }

    @Override
    public void deliver() {
        toSail();
    }

    @Override
    public Logistics createTransport() {
        return new Ship();
    }
}
