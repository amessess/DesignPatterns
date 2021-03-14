package factory;

import java.util.Scanner;

public class Factory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Logistics transport = null;
        while (transport == null) {
            String logistics = scanner.next();
            if (logistics.equals("truck")) {
                transport = new Truck();
            } else if (logistics.equals("ship")) {
                transport = new Ship();
            } else {
                System.out.println("Error");
            }
        }
        transport.createTransport();
        transport.deliver();
    }
}
