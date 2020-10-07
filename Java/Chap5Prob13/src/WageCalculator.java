import java.util.*;
public class WageCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		
		
		
		final double HOURLYWAGE=7.25;
		double totalSales, hoursWorked, overTime, totalWages, regularWorkHour;
		
		System.out.print("Please enter the value of total Sales:");
		totalSales=scanner.nextDouble();
		System.out.print("Please enter hours worked: ");
		hoursWorked=scanner.nextDouble();
		
		if(hoursWorked<160.00) {
			overTime=0.00;
			regularWorkHour=hoursWorked;
		} else {
			overTime=hoursWorked%160.00;
			regularWorkHour=hoursWorked-overTime;
		}
		
		
		
		if(totalSales>=1.00 && totalSales<=99.99) {
			totalWages=totalSales*0.05 + overTime*1.5*HOURLYWAGE +regularWorkHour*HOURLYWAGE;
			
			System.out.print("Total wage of the month is "+totalWages+"$");
		} else if(totalSales>=100.00 && totalSales<=299.99) {
			totalWages=totalSales*0.1 + overTime*1.5*HOURLYWAGE +regularWorkHour*HOURLYWAGE;
			
			System.out.print("Total wage of the month is "+totalWages+"$");
		} else if(totalSales>=300.00) {
			totalWages=totalSales*0.15 + overTime*1.5*HOURLYWAGE +regularWorkHour*HOURLYWAGE;
			
			System.out.print("Total wage of the month is "+totalWages +"$");
		}

	}

}
