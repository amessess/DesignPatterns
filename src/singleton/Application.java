package singleton;

public class Application {
    public static void main(String[] args) {
        Database database = Database.getInstance();
        System.out.println(database);
        Database database1 = Database.getInstance();
        System.out.println(database1);
        //they have same address
    }
}
