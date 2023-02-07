import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        try (Car car = new Car()) {
            drive();
        } catch (RuntimeException ignore) {
        }
    }

    private static void drive() {
        System.out.println("the car is went");
    }

    public static class Car implements AutoCloseable {
        public void close() {
            System.out.println("car closes");
        }
    }
    }
