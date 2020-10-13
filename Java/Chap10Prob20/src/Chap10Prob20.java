import java.util.*;
public class Chap10Prob20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddressBook ab = new AddressBook();
		HashSet<String> names = new HashSet<String>();
		HashSet<Integer> ages = new HashSet<Integer>();
		HashSet<String> genders = new HashSet<String>();
		names.add("Juboraj");
		names.add("Test");
		ages.add(22);
		ages.add(25);
		genders.add("Male");
		genders.add("Female");
		ab.addPerson(names, ages, genders);

	}

}
