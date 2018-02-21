import java.util.Scanner;
class RectArea {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        long width, height, area;
        

        System.out.println("Enter the width of your rectangle:");
        width = scan.nextInt();
        
        System.out.println("Enter the height of your rectangle:");
        height = scan.nextInt();

        area= width * height;

        System.out.println ( "The area of your rectangle is " + area + ".");
    }
}
