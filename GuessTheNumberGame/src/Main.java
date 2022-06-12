import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double randomNumber = Math.random();
        int randomNumberBetween0And100 = (int) (randomNumber *100 +1);
        int userNumber;
        boolean flag =false;
        System.out.println("I have randomly chosen a number between 1 and 100");
        System.out.println("Try to guess it.");
        Scanner scanner = new Scanner(System.in);
        for (int i = 10; i >0 ; i--) {
            System.out.println("You have " + i + " guess(es) left:");
            userNumber=scanner.nextInt();
            if (randomNumberBetween0And100 == userNumber){
                System.out.println("Correct ... You Win!");
                flag=true;
                break;
            } else if (randomNumberBetween0And100>userNumber) {
                System.out.println("It's larger than " +userNumber);
            } else {
                System.out.println("It's smaller than " +userNumber);
            }
        }
        if(!flag){
            System.out.println("You lose!!");
        }

    }
}