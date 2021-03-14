package builder;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        HouseBuilder builder = new HouseBuilder();
        director.constructHouse(builder);
        System.out.println(builder.getHouse());
        director.constructCompleteHouse(builder);
        System.out.println(builder.getHouse());
    }
}
