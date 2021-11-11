import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int i = 1;

        while (i < 2) {

            System.out.print("First number: ");
            Scanner numScanner1 = new Scanner(System.in);
            float numFloat1;
            numFloat1 = numScanner1.nextFloat();
            // first number scanner

            System.out.print("Second number: ");
            Scanner numScanner2 = new Scanner(System.in);
            float numFloat2;
            numFloat2 = numScanner2.nextFloat();
            // second number scanner

            System.out.println("======[Choose action]======");
            System.out.println("+");
            String plus = "+";
            System.out.println("-");
            String minus = "-";
            System.out.println("*");
            String multiply = "*";
            System.out.println("/");
            String divide = "/";
            // an action that been selected by the user

            Scanner numDoScanner1 = new Scanner(System.in);
            String numDo;
            numDo = numDoScanner1.nextLine();
            // written action scanner

            if (numDo.equals(plus)) {
                float firstF = numFloat1 + numFloat2;
                System.out.println("Your answer: " + firstF);
            } else if (numDo.equals(minus)) {
                float secondInt = numFloat1 - numFloat2;
                System.out.println("Your answer: " + secondInt);
            } else if (numDo.equals(multiply)) {
                float thirdInt = numFloat1 * numFloat2;
                System.out.println("Your answer: " + thirdInt);
            } else if (numDo.equals(divide)) {
                float fourthInt = numFloat1 / numFloat2;
                System.out.println("Your answer: " + fourthInt);
            } else {
                System.out.println("Some error, sry.");
            }
        }
    }
}