import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Scanner(System.in);


        System.out.println("What party are you affiliated with? D, R. I, or Other");
        String party;

        if (party == "D") {
            System.out.println("Your a Democratic Donkey.");
        }
        if (party == "R") {
            System.out.println("Your a Republican Elephant.");
        }

        if (party == "I") {
            System.out.println("Your a Republican Elephant.");

        }
        if (party == "Other"){
           System.out.println("Your another weird guy.");
            }

    }
}

