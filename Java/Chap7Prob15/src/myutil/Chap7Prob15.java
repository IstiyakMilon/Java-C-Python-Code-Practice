package myutil;
import java.util.*;
public class Chap7Prob15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MealCard meal = new MealCard();
		System.out.println(meal.getBalance);
		meal.addBalance(200);
		System.out.println(meal.getBalance);
		meal.buyFood("Rice");
		System.out.println(meal.getBalance);
		meal.buyFood("Banana");
		System.out.println(meal.getBalance);
		meal.buyFood("Rice");
		System.out.println(meal.getBalance);
		meal.buyFood("Rice");
		System.out.println(meal.getBalance);
		

	}

}


public class Chap7Prob16 {
	public static void main(String[] args) {
		MealCard mealCard1 = new MealCard();
		MealCard mealCard2 = new MealCard();
		System.out.println("Initial point of meal card 1 is: " + mealCard1.getBalance());
		System.out.println("Initial point of meal card 2 is: " + mealCard2.getBalance());

		mealCard1.buyFood("Rice");
		mealCard1.addBalance(500);
		mealCard2.buyFood("Banana");
		mealCard2.addBalance(300);
		System.out.println("point of meal card 1 is: " + mealCard1.getBalance());
		System.out.println("point of meal card 1 is: " + mealCard2.getBalance());
  }
}