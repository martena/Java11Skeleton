public class Question3 {
    public static void main(String[] args) {
        double ticketprice = 23.45;
        double people = 8;
        double total = 0;
        double tax = 1.12;
        double totaltax = 0;
        double finaltax;
        
        total = ticketprice * people;
        totaltax = ticketprice * people * tax;
        finaltax = totaltax - total;
        
        
        

        
        System.out.println("overall price = "+"$"+totaltax);
        System.out.println("tax = "+"$"+finaltax);
    }
}

