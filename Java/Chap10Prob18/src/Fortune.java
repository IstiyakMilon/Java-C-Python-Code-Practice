import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
public class Fortune {
	List<String> fortuneList = new ArrayList<>();
	public Fortune() {
	fortuneList.add("You will qet 4.0 GPA this semester.");
	fortuneList.add("Happiness is programming.");
	fortuneList.add("Satisfaction follows hard work.");
	fortuneList.add("Patience is virtue.");
	fortuneList.add("Don't loose your hope.");
	fortuneList.add("Time is the best healer");
	fortuneList.add("It will be better.");
	fortuneList.add("Hardwork pays off.");
	fortuneList.add("Time and tide wait for none.");
	fortuneList.add("Evrything will be fine.");
	this.showFortune();
	}
	public void showFortune() {
		int randomNum = ThreadLocalRandom.current().nextInt(0, 9 + 1);
		String fortune = this.fortuneList.get(randomNum);
		System.out.println(fortune);
	}
}