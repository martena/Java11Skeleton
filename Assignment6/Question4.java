import java.util.Scanner;
class Question4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        long amount, price, totalPrice;

        System.out.println("What is the price per ticket?");
        price = scan.nextInt();
        
        System.out.println("How many tickets are you buying?");
        amount = scan.nextInt();

        totalPrice = price * amount;

        System.out.println ( "Your total price is " + totalPrice + "$.");
    }
}
