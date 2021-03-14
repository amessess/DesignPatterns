package builder;

public class HouseBuilder implements Builder{
    private Windows windows;
    private Doors doors;
    private Rooms rooms;
    private Garage garage;
    private Garden garden;
    private SwimmingPool swimmingPool;
    private FancyStatue fancyStatue;

    @Override
    public void setWindows(Windows windows) {
        this.windows = windows;
    }

    @Override
    public void setDoors(Doors doors) {
        this.doors = doors;
    }

    @Override
    public void setRooms(Rooms rooms) {
        this.rooms = rooms;
    }

    @Override
    public void setGarage(Garage garage) {
        this.garage = garage;
    }

    @Override
    public void setSwimmingPool(SwimmingPool swimmingPool) {
        this.swimmingPool = swimmingPool;
    }

    @Override
    public void setFancyStatues(FancyStatue fancyStatue) {
        this.fancyStatue = fancyStatue;
    }

    @Override
    public void setGarden(Garden garden) {
        this.garden = garden;
    }

    public House getHouse() {
        return new House(windows, doors, rooms, garden, garage, swimmingPool, fancyStatue);
    }
}
