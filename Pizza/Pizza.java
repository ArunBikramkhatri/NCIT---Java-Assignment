//package Pizza;
import java.util.Scanner;

public class Pizza{
    public static void main(String []args) 
    {
        int totalPrice;
        Scanner s = new Scanner(System.in);
        System.out.println("Offer offer offer ...Buy 5 get 1 free\n\nEnter your choice ??\n\n 1.Standard Pizza ---- Rs 100 \n 2.Deluxe pizza --- Rs 200 \n " );
        int n = s.nextInt();
        
        switch (n) {
            case 1:
                System.out.println("You hvae chosen Standard pizza..\n enter the no of pizza you want to buy??");
                int no = s.nextInt();
                if(no==5){
                    totalPrice = no * 100;
                    System.out.println("total price = " + totalPrice + "\n here is your "+ ++no + "pizza");
                }
                else{
                    totalPrice = no * 100;
                    System.out.println("total price = " + totalPrice + "\n here is your "+ no + "pizza");
                }

                
                break;

            case 2:
                System.out.println("You hvae chosen Deluxe pizza..\n enter the no of pizza you want to buy??");
                int number = s.nextInt();
                System.out.println("Do you want toppings ...You can add upto 3 toppings each at Rs 20...\n If yes press 1 else press any other number");
                int yes = s.nextInt();

                if(yes == 1)
                {
                    System.out.println("How many toppings do you want??");
                    int toppings = s.nextInt();

                    if(toppings > 3){
                        System.out.println("You cant add more than 3 toppings");
                    }
                    else{
                        if (number == 5) {
                            totalPrice = number * 200 + toppings* 20;
                            System.out.println("Total Price  = "  +  totalPrice);
                            System.out.println("Here is your "+ ++number + "pizza");
                        } else {
                            totalPrice = number * 200 + + toppings* 20;
                            System.out.println("Total Price  = "  +  totalPrice);
                            System.out.println("Here is your "+ number + "pizza");
                        }
                    }
                }
                else{
                    if (number == 5) {
                        totalPrice = number * 200;
                        System.out.println("Total Price  = "  +  totalPrice);
                        System.out.println("Here is your "+ ++number + "pizza");
                    } else {
                        totalPrice = number * 200;
                        System.out.println("Total Price  = "  +  totalPrice);
                        System.out.println("Here is your "+ number + "pizza");
                    }
                }
                break;

            default:
                break;
        }
        
    }
}
