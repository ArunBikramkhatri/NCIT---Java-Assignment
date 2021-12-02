
import java.util.Scanner;

public class Main {
    public static void main(String []args)
    {
        System.out.println("\n Payment Choice.................... \n\n 1.Simple payment \n 2.Debit Card Payment \n 3.Paypal Payment");
       Scanner s = new Scanner(System.in);
       System.out.println("Enter your payment choice??..");
       int n = s.nextInt();

       switch (n) {
            case 1:
                System.out.println("\n Thanks for choosing Simple payment \n");
                Payment p = new Payment();
                p.setData();
                System.out.println( p.getData());
               break;
            case 2:
                System.out.println("\n Thanks for choosing Debit Card payment \n");
                DebitCard d = new DebitCard();
                d.setData();
                System.out.println(d.getData());
                break;

            case 3:
                System.out.println("\n Thanks for choosing Paypal payment \n");
                Paypal p1 = new Paypal();
                p1.setData();
                System.out.println(p1.getData());
                break;

            default:
                System.out.println("Enter valid number");
                
               break;
       }
    }  
    
   
}
