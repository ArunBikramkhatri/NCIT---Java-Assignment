

public class Main {
    public static void main(String []args) {
        Image img = new Image("800 * 600" , "jpeg" , "colored");
        Product p = new Product("Cat" , 123 , img);
        System.out.println(p.get());
    }
}
