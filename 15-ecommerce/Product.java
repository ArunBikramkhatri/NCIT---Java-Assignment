public class Product {
    private String name;
    private int id;
    private Image img;

    public Product(String name , int id , Image img)
    {
        this.name = name;
        this.id  = id;
        this.img = img;
        
    }

    public String get()
    {
        return("Name = " + this.name + "\nId = " + this.id + img.get());
    }
}
