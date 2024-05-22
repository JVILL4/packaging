import java.util.Scanner;

public class Packaging{

    public static void main(String[] args) throws IOException {
        //created scanner object
        Scanner sc = new Scanner(System.in);

        //converts the number of pounds to be packaged
        int pounds = sc.nextInt();

        double shipping_cost = 0;

        // the calculated shipping cost 
        if(pounds <= 5)
            shipping_cost = 1.20 * pounds;
        else if(pounds > 5 && pounds <= 10)
            shipping_cost = 1.00 * pounds;
        else if(pounds > 10 && pounds <= 20)
            shipping_cost = 0.90 * pounds; 
        else
            shipping_cost = 0.80 * pounds;
        
        //print the shipping cost
        System.out.println("Your package weight is " + pounds + " pounds, the cost od shipping is $" + shipping_cost); 
    }
}