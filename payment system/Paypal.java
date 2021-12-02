
public class Paypal extends Payment {
    private String password;
    private String email;

    /*
    public Paypal(String name , int pinNo , String purpose , int amount , String password , String email)
    {
        super(name , pinNo , purpose , amount);
        this.password = password;
        this.email = email;
    } */



     public void setData()
    {
        super.setData();
        try {
            System.out.println("Enter your email");
            this.email = s.next();
            System.out.println("Enter the password");
            this.password = s.next();
        } catch (InputMismatchException e) {
            //TODO: handle exception
        }
      
    } 

    public String getData()
    {
        

        return (super.getData()  );
    }
}
