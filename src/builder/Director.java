package builder;

public class Director {
    public void constructHouse(Builder builder) {
        builder.setWindows(new Windows(4));
        builder.setDoors(new Doors(3));
        builder.setRooms(new Rooms(2));
    }

    public void constructHouseWithGarage(Builder builder) {
        constructHouse(builder);
        builder.setGarage(new Garage());
    }

    public void constructHouseWithGarden(Builder builder) {
        constructHouse(builder);
        builder.setGarden(new Garden());
    }

    public void constructHouseWithSwimmingPool(Builder builder) {
        constructHouse(builder);
        builder.setSwimmingPool(new SwimmingPool());
    }

    public void constructHouseWithFancyStatues(Builder builder) {
        constructHouse(builder);
        builder.setFancyStatues(new FancyStatue());
    }

    public void constructCompleteHouse(Builder builder) {
        constructHouseWithGarage(builder);
        builder.setFancyStatues(new FancyStatue());
        builder.setSwimmingPool(new SwimmingPool());
        builder.setGarden(new Garden());
    }
}
