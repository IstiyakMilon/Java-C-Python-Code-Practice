import java.text.DecimalFormat;
import java.util.*;
public class TicketPrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner=new Scanner(System.in);
        DecimalFormat df=new DecimalFormat("0.00");
        
        //Variables declaration
        int numberOfA_Seats, numberOfB_Seats, numberOfC_Seats;
        double pricePerA_Seat, pricePerB_Seat, pricePerC_Seat, totalSales;
        
        // Taking value of number of seat sold and their prices
        System.out.println("Number of Seat A sold: ");
        numberOfA_Seats=scanner.nextInt();
        System.out.println("Price per A seat is: ");
        pricePerA_Seat=scanner.nextDouble();
        System.out.println("Number of Seat B sold: ");
        numberOfB_Seats=scanner.nextInt();
        System.out.println("Price per B seat is: ");
        pricePerB_Seat=scanner.nextDouble();
        System.out.println("Number of Seat C sold: ");
        numberOfC_Seats=scanner.nextInt();
        System.out.println("Price per C seat is: ");
        pricePerC_Seat=scanner.nextDouble();
        
        totalSales=numberOfA_Seats*pricePerA_Seat + numberOfB_Seats*pricePerB_Seat + numberOfC_Seats*pricePerC_Seat;
        System.out.print("Total ticket sales of the concert is " + df.format(totalSales));
        
	}

}
