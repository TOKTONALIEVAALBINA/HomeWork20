import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        System.out.println("write the day of week : ");
        String word = myScanner.nextLine();
        HomeWork21 homeWork21 = HomeWork21.valueOf(word.toUpperCase());
        System.out.println(homeWork21.getName());
        homeWork21.study();






//        try (Car car = new Car()) {
//            drive();
//        } catch (RuntimeException ignore) {
//        }
//    }
//
//    private static void drive() {
//        System.out.println("the car is went");
//    }
//
//    public static class Car implements AutoCloseable {
//        public void close() {
//            System.out.println("car closes");
//        }
    }
    }
