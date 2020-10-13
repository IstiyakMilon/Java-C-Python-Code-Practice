import java.util.*;
public class AddressBook {
	public void addPerson(HashSet<String> nameSet, HashSet<Integer> ageSet, HashSet<String> getnderSet) {
		Object[] nameArray = nameSet.toArray();
		Object[] ageArray = ageSet.toArray();
		Object[] genderArray = getnderSet.toArray();
		for(int i=0; i<nameArray.length; i++) {
		String name = nameArray[i].toString();
		int age = Integer.parseInt(ageArray[i].toString());
		String gender = genderArray[i].toString();
		Person p = new Person(name, age, gender);
		}
		}

}
