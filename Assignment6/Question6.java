
import java.util.Scanner;
class Question6 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String feature, name, animal;
        
        System.out.println("Enter someone's name:");
        name = scan.nextLine();

        System.out.println("Enter a physical feature:");
        feature = scan.nextLine();
        
        System.out.println("Enter the name of an animal:");
        animal = scan.nextLine();
        
        

        

        System.out.println (name+" has a "+feature+" like a(n) "+animal+".");
    }
}