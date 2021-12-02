import java.util.InputMismatchException;

public class DebitCard extends Payment {
    private int cardNumber;
    private int cvvNumber;
    private String bankName;


    public void setData()
    {
        super.setData();
        try {
            System.out.println("Enter debit card number ??");
            this.cardNumber = s.nextInt();
            System.out.println("Enter cvv number ??");
            this.cvvNumber = s.nextInt();
            System.out.println("Enter bank name??");
            this.bankName = s.next();
        } catch (InputMismatchException e) {
            //TODO: handle exception
            System.out.println("Please enter valid information\n");
            System.out.println(e.getMessage());
        }
        

    }

    public String getData()
    {
        return(super.getData() +  "Bank Name = " + this.bankName);
    }
}
