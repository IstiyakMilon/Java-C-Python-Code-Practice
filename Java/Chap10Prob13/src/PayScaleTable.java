import java.util.*;
import java.text.*;
public class PayScaleTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[][] payScaleTable
		= { {10.50, 12.00, 14.50, 16.75, 18.00},
		{20.50, 22.25, 24.00, 26.25, 28.00},
		{34.00, 36.50, 38.00, 40.35, 43.00},
		{50.00, 60.00, 70.00, 80.00, 99.99} };
		double sum=0.0;
		double gradeAverage[]=new double[payScaleTable.length];
		double stepAverage[]=new double[payScaleTable[0].length];
		int numOfGrade=payScaleTable.length;
		int numOfStep=payScaleTable[0].length;
		for(int i=0;i<numOfGrade;i++) {
			for(int j=0;j<numOfStep;j++) {
				sum+=payScaleTable[i][j];
			}
			gradeAverage[i]=sum/numOfStep;
			sum=0.0;
		}
		for(int i=0;i<gradeAverage.length;i++) {
			System.out.println("Average pay for "+i+" Grade Level is: "+gradeAverage[i]);
		}
		
		for(int i=0;i<numOfStep;i++) {
			for(int j=0;j<numOfGrade;j++) {
				sum+=payScaleTable[j][i];
			}
			stepAverage[i]=sum/numOfGrade;
			sum=0.0;
		}
		for(int i=0;i<stepAverage.length;i++) {
			System.out.println("Average pay for "+i+" Step is: "+stepAverage[i]);
		}

	}

}
