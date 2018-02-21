import java.util.Scanner;
class Question5 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        long eggs, dozen, leftOver;

        System.out.println("How many eggs do you have:");
        eggs = scan.nextInt();

        dozen = eggs / 12;
        leftOver = eggs % 12;
        
        
      

        System.out.println (" You have " + dozen + " dozen and " + leftOver + " eggs." );
    }
}