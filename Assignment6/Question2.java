import java.util.Scanner;
class Question2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        long width, height, area, price, totalPrice;
        
        

        System.out.println("Enter the width of the area you're going to paint:");
        width = scan.nextInt();
        
        System.out.println("Enter the height of the area you're going to paint:");
        height = scan.nextInt();
        
        System.out.println("How much does your paint cost per square unit");
        price = scan.nextInt();

        area= width * height;
        totalPrice = area * price;

        System.out.println ( "Your total cost is $" + totalPrice + ".");
    }
}
