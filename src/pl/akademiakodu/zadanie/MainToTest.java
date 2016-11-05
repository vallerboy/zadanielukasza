package pl.akademiakodu.zadanie;

import java.util.ArrayList;
import java.util.Date;

public class MainToTest {

	
	public ArrayList<Person> registry; 
	
	public static void main(String[] args) {

		 MainToTest registry = new MainToTest();
		 
		 Person p = new Person("Oskar", new Date(), 1);
		 
		 Person p1 = new Person("Wojtek", new Date(), 2);
		 
		 Person p2 = new Person("£ukasz", new Date(), 3);
	}
	
	public MainToTest() { 
		registry = new ArrayList<Person>();
	}
	
	public void createNewPerson(String name, Date birthday, int id){ 
		// Przy dodawaniu sprawdzasz czy id siê czasem nie powatrza, przelatujesz po wszystkich elemetanch w "registry"
		// i sprawdzasz czy id siê nie powtarza
		// Randomem sobie generujesz ID Random.nextInt(); 
	
		registry.add(new Person(name, birthday, id));
	}
	
	public Person getPersonByID(int id){ 
		for(Person p : registry){ 
			if(p.getId() == id){
				return p;
			}
		}
		return null;
	}
	
	public void setChildToParent(Person child, Person parentOne, Person parentTwo) { 
		parentOne.setChild(child);
		parentTwo.setChild(child);
	}
	
	
	
	

}
