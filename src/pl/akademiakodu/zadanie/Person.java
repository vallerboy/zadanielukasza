package pl.akademiakodu.zadanie;

import java.util.Date;

public class Person {

	private String name; 
	private Date birthday;
	private int id;
	
	private Person[] parents; 
	private Person child;
	
	private Person married;
	
	public Person(String name, Date birthday, int id) {
		super();
		this.name = name;
		this.birthday = birthday;
		this.id = id;
		parents = new Person[2];
	}

	public void setMarried(Person person) { 
		// tutaj sprawdzasz czy jest tylko jedna osoba ( w naszym przypadku i tak nie moze byc wiecej)
		// Sprawdzasz czy Person w agrgumencie jest poslubiony z Tob¹
		// sprawdzasz czy person to nie Ty, albo Twoje dziecko
		married = person;
	}
	
	public Person getMarried(){
		return married;
	}
	
	public Person[] getParents() { 
		return parents; 
	}
	
	public Person getChild() { 
		return child;
	}
	
	public  void setChild(Person childLocal){ 
		child = childLocal;
	}
	
	public void addParent(Person parent)  {
		// tutaj sprawdzasz czy nie jest czasem wiecej niz dwoch rodziców
		// Sprawdzasz czy wiek rodzica jest wiêkszy ni¿ nasz (aktualnego persona)
		for(int i = 0; i < parents.length; i++) { 
			if(parents[i] == null){ 
				parents[i] = parent;
			}
		}
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	} 
	
	
	
	 
}
