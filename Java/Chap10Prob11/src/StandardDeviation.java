import java.util.*;
import java.text.*;
public class StandardDeviation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		DecimalFormat df=new DecimalFormat("0.00000");
		int num;
		
		System.out.print("Please enter N: ");
		num=scanner.nextInt();
		int[] numArray=new int[num];
		
		for(int i=0;i<num;i++) {
			numArray[i]=i+1;
		}
		
		double standardDeviation=getStandardDeviation(numArray);
		System.out.print("Standard Deviation: "+df.format(standardDeviation));

	}
	
	public static double getStandardDeviation(int numArr[]) {
		int arrLength=numArr.length;
		double sum=0;
		double totalDeviation = 0.0;
		double standardDeviation;
		for(int i=1;i<=arrLength;i++) {
			sum+=i;
		}
		double avg=sum/arrLength;
		for(int num:numArr) {
			totalDeviation+=Math.pow(num-avg, 2);
		}
		standardDeviation=Math.sqrt(totalDeviation/arrLength);
		return standardDeviation;
	}

}
