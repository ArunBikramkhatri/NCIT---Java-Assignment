import java.util.Scanner;

public class Payment{
    private String name;
    private int pinNo;
    //private String bankName;
    private String purpose;
    private int amount;

    Scanner s = new Scanner(System.in);

    public void setData()
    {
       System.out.println("\nPlease enter the asked data \n");
        System.out.println("Enter your full name ??");
        this.name = s.next();
        System.out.println("Enter your pin number ??");
        this.pinNo = s.nextInt();
        System.out.println("Enter your purpose for billing ??");
        this.purpose = s.next();
        System.out.println("Enter the amount ??");
        this.amount = s.nextInt();
        
       
    }

    public String getData()
    {
        System.out.println(" \n Transaction Successful");
        System.out.println("\n\nReceipt.....................\n\n");
        return ("Name = Mr." + this.name + "\nPurpose = " + this.purpose + " \namount = Rs."+ amount);
    }


}
