
import java.util.Scanner;
import java.util.InputMismatchException;

public class Payment{
    private String name;
    private int pinNo;
    //private String bankName;
    private String purpose;
    private int amount;

    Scanner s = new Scanner(System.in);

    public void setData() 
    {
        try {
            System.out.println("\nPlease enter the asked data \n");
            System.out.println("Enter your full name ??");
            this.name = s.next();
            System.out.println("Enter your pin number ??");
            this.pinNo = s.nextInt();
            System.out.println("Enter your purpose for billing ??");
            this.purpose = s.next();
            System.out.println("Enter the amount ??");
            this.amount = s.nextInt();
        } catch (InputMismatchException e) {
            //TODO: handle exception
            System.out.println("Please enter valid information??\n");
            System.out.println(e.getMessage());
        }
       
        
       
    }

    public String getData()
    {
        System.out.println(" \n Transaction Successful");
        System.out.println("\n\nReceipt.....................\n\n");
        return ("Name = Mr." + this.name + "\nPurpose = " + this.purpose + " \namount = Rs."+ amount);
    }


}
