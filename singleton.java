public class Dog {

    private in hunger;
  
    private Dog() {
        hunger = 100;
    }
  
    private Dog(int initialHunger) {
        hunger = initialHunger;
    }

    private static Dog instance = null;
  
    public static Dog getInstance() {
        if (instance == null) {
            instance = new Dog();
        }
        return instance;
    }
    
}
