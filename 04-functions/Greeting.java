

public class Greeting {
    public static void main(String[] args) {
        String personalizedGreetings = greet("Ravichandra Mulage");
        System.out.println(personalizedGreetings);
    }
  static String greet(String name){
       String message = "Hello "+name;
        return message;
       // System.out.println("Hello World. ");
    }
}
