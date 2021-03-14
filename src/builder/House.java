package builder;

public class House {
    private Windows windows;
    private Doors doors;
    private Rooms rooms;
    private Garden garden;
    private Garage garage;
    private SwimmingPool swimmingPool;
    private FancyStatue fancyStatue;

    public House(Windows windows, Doors doors, Rooms rooms, Garden garden, Garage garage, SwimmingPool swimmingPool, FancyStatue fancyStatue) {
        this.windows = windows;
        this.doors = doors;
        this.rooms = rooms;
        this.garden = garden;
        this.garage = garage;
        this.swimmingPool = swimmingPool;
        this.fancyStatue = fancyStatue;
    }

    public Windows getWindows() {
        return windows;
    }

    public void setWindows(Windows windows) {
        this.windows = windows;
    }

    public Doors getDoors() {
        return doors;
    }

    public void setDoors(Doors doors) {
        this.doors = doors;
    }

    public Rooms getRooms() {
        return rooms;
    }

    public void setRooms(Rooms rooms) {
        this.rooms = rooms;
    }

    public Garden getGarden() {
        return garden;
    }

    public void setGarden(Garden garden) {
        this.garden = garden;
    }

    public Garage getGarage() {
        return garage;
    }

    public void setGarage(Garage garage) {
        this.garage = garage;
    }

    public SwimmingPool getSwimmingPool() {
        return swimmingPool;
    }

    public void setSwimmingPool(SwimmingPool swimmingPool) {
        this.swimmingPool = swimmingPool;
    }

    public FancyStatue getFancyStatue() {
        return fancyStatue;
    }

    public void setFancyStatue(FancyStatue fancyStatue) {
        this.fancyStatue = fancyStatue;
    }

    @Override
    public String toString() {
        return "House{" +
                "windows=" + windows +
                ", doors=" + doors +
                ", rooms=" + rooms +
                ", garden=" + garden +
                ", garage=" + garage +
                ", swimmingPool=" + swimmingPool +
                ", fancyStatue=" + fancyStatue +
                '}';
    }
}
