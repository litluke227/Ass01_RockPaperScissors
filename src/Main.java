import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input;

        do {
            String A;
            do {
                System.out.println("Player A, make your move: R, P, or S");
                A = in.nextLine();
            } while (!A.equalsIgnoreCase("R") && !A.equalsIgnoreCase("P") && !A.equalsIgnoreCase("S"));

            String B;
            do {
                System.out.println("Player B, make your move: R, P, or S");
                B = in.nextLine();
            } while (!B.equalsIgnoreCase("R") && !B.equalsIgnoreCase("P") && !B.equalsIgnoreCase("S"));

            if (A.equalsIgnoreCase(B)) {
                System.out.println("It's a tie!");
            } else if (A.equalsIgnoreCase("R") && B.equalsIgnoreCase("P")) {
                System.out.println("Paper covers rock, Player B wins!");
            } else if (A.equalsIgnoreCase("R") && B.equalsIgnoreCase("S")) {
                System.out.println("Rock breaks scissors, Player A wins!");
            } else if (A.equalsIgnoreCase("P") && B.equalsIgnoreCase("R")) {
                System.out.println("Paper covers rock, Player A wins!");
            } else if (A.equalsIgnoreCase("P") && B.equalsIgnoreCase("S")) {
                System.out.println("Scissors cuts paper, Player B wins!");
            } else if (A.equalsIgnoreCase("S") && B.equalsIgnoreCase("R")) {
                System.out.println("Rock breaks scissors, Player B wins!");
            } else if (A.equalsIgnoreCase("S") && B.equalsIgnoreCase("P")) {
                System.out.println("Scissors cuts paper, Player A wins!");
            }

            System.out.println("Would you like to play again? If so, press y for yes.");
            input = in.nextLine();

        } while (input.equalsIgnoreCase("Y"));

        in.close();
    }
}
