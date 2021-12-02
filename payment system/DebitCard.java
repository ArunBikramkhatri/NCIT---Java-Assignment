

public class DebitCard extends Payment {
    private int cardNumber;
    private int cvvNumber;
    private String bankName;


    public void setData()
    {
        super.setData();
        System.out.println("Enter debit card number ??");
        this.cardNumber = s.nextInt();
        System.out.println("Enter cvv number ??");
        this.cvvNumber = s.nextInt();
        System.out.println("Enter bank name??");
        this.bankName = s.next();

    }

    public String getData()
    {
        return(super.getData() +  "Bank Name = " + this.bankName);
    }
}
