package factory;

public interface Logistics {
    void deliver();

    Logistics createTransport();
}
