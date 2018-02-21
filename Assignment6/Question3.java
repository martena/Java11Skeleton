import java.util.Scanner;
class Question3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        long age, months, days;

        System.out.println("Enter how old you are (in years):");
        age = scan.nextInt();
        
        months = age * 12;
        
       days = age * 365;



        System.out.println ( "You are " + days + " days old or " + months + " months old");
    }
}

