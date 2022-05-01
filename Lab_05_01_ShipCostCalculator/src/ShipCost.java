public class ShipCost {
    public static void main(String[] args) {

        double itemPrice = 102; //simulated user input
        double shipCost = 0;
        double totalPrice = 0;
        double SHIPPING_PERCENT = .02;

        System.out.println("Please enter your items price.");
        //user enters price

        if(itemPrice >= 100.00){
            totalPrice = itemPrice + shipCost;
            System.out.println("Your item was $" + totalPrice + ", since that's over $100, you get free shipping! Your total cost is $" +itemPrice + ".");
        }
        else{
            shipCost = SHIPPING_PERCENT * itemPrice;
            totalPrice = itemPrice + shipCost;
            System.out.println("Your item was $" + itemPrice + ", with shipping of $" + shipCost + ", your total cost is $" + totalPrice + ".");

        }
    }
}

