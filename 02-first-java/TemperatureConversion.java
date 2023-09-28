import java.util.Scanner;
class TemperatureConversion{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature in celcius: ");
        float tempC = sc.nextFloat();

        float tempF = (tempC * 9/5) + 32;

        System.out.println("The Temperature in Fahrenheit is: "+ tempF);

    }
}