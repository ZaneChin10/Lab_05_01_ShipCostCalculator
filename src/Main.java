public class Main {
    public static void main(String[] args) {

        double itemPrice = 200.00;
        double shippingCost;
        double totalCosts;

        if (itemPrice >= 100)
        {
            shippingCost = 0;
        }
        else
        {
            shippingCost = itemPrice * .02;
        }

        totalCosts = itemPrice + shippingCost;
        System.out.println("The shipping cost is: " + shippingCost);
        System.out.println("The total cost is: " + totalCosts);
    }
}
