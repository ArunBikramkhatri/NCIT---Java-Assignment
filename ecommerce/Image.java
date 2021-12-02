

public class Image {
   
    private String dimension;
    private String type;
    private  String color;

    public Image(String dimension , String type , String color){
        this.dimension = dimension;
        this.type = type;
        this.color = color;
    }

    public String get()
    {
        return("\nDimension = "+ this.dimension + "\nType = " + this.type +  "\nColor = " + this.color);
    }
}
