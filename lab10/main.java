

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import people.Person;
import people.Student;
import people.Teacher;

public class main {
	
	
	
	public static void printDepartment(List<Person> people) {
	       // we print all the people in the department
			for(int i=0; i<=people.size(); i++) {
				System.out.println(people.get(i));
			}
	    }
	 
	    public static void main(String[] args) {
	        List<Person> people = new ArrayList<Person>();
	        people.add( new Teacher("Pekka Mikkola", "Korsontie Street 1 03100 Vantaa", 1200) );
	        people.add( new Student("Olli", "Ida Albergintie Street 1 00400 Helsinki") );
	 
	        printDepartment(people);
	    }
}
