import java.util.Scanner;

public class Game {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("CHILDREN MATH GAME");

        int scores = 0;

        for (int i = 1; i <= 10; i++) {
            long Num1 = Math.round((Math.random() * 10) + 1 );
            long Num2 = Math.round((Math.random() * 10) + 1 );

            long correctAnswer = Num1 + Num2;
            System.out.print("\nWhat is the sum of " + Num1 + " and " + Num2 + " : ");
            int answer = scanner.nextInt();

            if (answer == correctAnswer) {
                scores++;
                System.out.println("You're Correct");
            }
            else{
                System.out.println("You're Wrong");
            }
        }

        System.out.println("\nYour score is : " + scores + "/10");
        if (scores >= 0 && scores <= 3) {
            System.out.println("This is very poor performance buckle up next time");
        }
        else if (scores >= 4 && scores <= 6) {
            System.out.println("You tried you can do better next time");
        }
        else{
            System.out.println("Congrats, this is a good result");
        }


        scanner.close();
    }
}