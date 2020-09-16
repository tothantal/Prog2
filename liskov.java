public class Liskov {

    public static class Vehicle() {
        System.out.println("Vehicle");
    
        public void start() {
            System.out.println("Starting Vehicle");
        }        
    }
    
    public static class Car extends Vehicle {
        System.out.println("Car");
    
        @Override
        public void start() {
            System.out.println("Starting Car");
        }        
    }
    
    public static class Supercar extends Car {
        System.out.println("Supercar");
    
        @Override
        public void start() {
            System.out.println("Starting Supercar");
        }   
    }    
}

public static class Main() {
    public static void main(String[] args) {
        Vehicle stuff = new Supercar();
    }
}
