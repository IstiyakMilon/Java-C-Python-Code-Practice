import java.util.*;
public class RomanNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int year;
		String romanYear="";
		System.out.print("Please enter the year: ");
		year=scanner.nextInt();
		while(year>=1000) {
			romanYear=romanYear+"M";
			year-=1000;
		}
		while(year>=900){
			romanYear=romanYear+"CM";
			year-=900;
		}
		while(year>=500){
			romanYear=romanYear+"D";
			year-=500;
		}
		while(year>=400){
			romanYear=romanYear+"CD";
			year-=400;
		}
		while(year>=100){
			romanYear=romanYear+"C";
			year-=100;
		}
		while(year>=90){
			romanYear=romanYear+"XC";
			year-=90;
		}
		while(year>=50){
			romanYear=romanYear+"L";
			year-=50;
		}
		while(year>=40){
			romanYear=romanYear+"XL";
			year-=40;
		}
		while(year>=10){
			romanYear=romanYear+"X";
			year-=10;
		}
		while(year>=9){
			romanYear=romanYear+"IX";
			year-=9;
		}
		while(year>=5){
			romanYear=romanYear+"V";
			year-=5;
		}
		while(year>=4){
			romanYear=romanYear+"IV";
			year-=4;
		}
		while(year>=1){
			romanYear=romanYear+"I";
			year-=1;
		}
	    System.out.print("The year in roman number is: "+romanYear);

	}

}
