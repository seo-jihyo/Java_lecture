package quiz2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Controller {

	public static void addPerson(ArrayList<Person> persons, Person ps) {
		// TODO Auto-generated method stub
		persons.add(ps);
	}

	public static void listPerson(ArrayList<Person> persons) {
		// TODO Auto-generated method stub
		for (Person p : persons) {
			System.out.println(persons.indexOf(p) + ":" +p);
		}
	}
	public static void modifyPerson(ArrayList<Person> persons, int i, Person ps2) {
		// TODO Auto-generated method stub
		persons.set(i, ps2);
	}

	public static void removePerson(ArrayList<Person> persons, int i) {
		// TODO Auto-generated method stub
		persons.remove(i);
	}

	public static void savePerson(ArrayList<Person> persons) throws FileNotFoundException, IOException{
		// TODO Auto-generated method stub
		String fileName = "C:\\daebo_th2\\1_Java\\workspace\\day14.io\\src\\quiz2\\BMI.txt";
		File file = new File(fileName);
		
		FileWriter fw = new FileWriter(file,true);
		
		for (Person p: persons) {
			fw.write(p.getName() + "\n");
			fw.write(p.getHeight() + "\n");
			fw.write(p.getWeight() + "\n");
			fw.write(p.getBmi() + "\n");
			fw.write(p.getResult() +"\n");
			System.out.println("------------");
		}
		fw.flush();
		fw.close();
	}

}
