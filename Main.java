import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // declare variables
        int celsius = 0;
        String trash = "";
        double fahrenheit = 0;
        Scanner in = new Scanner(System.in);
        // ask what Celsius is
        System.out.println("What is the degrees in celsius");
        // asks if input is an int
        if(in.hasNextInt())
        {
            celsius = in.nextInt();
            in.nextLine();
            //calculated Fahrenheit and output Fahrenheit and Celsius
            fahrenheit = celsius * 1.8 + 32;
            System.out.println(celsius+" degrees celsius is " + fahrenheit + " degrees fahrenheit");

        }
        // inputs invalid input
        else
        {
            // outputs invalid output
            trash = in.nextLine();
            System.out.println("You entered an invalid input: " + trash);
        }


    }
}