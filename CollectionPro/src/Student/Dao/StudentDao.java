 package Student.Dao;

import java.util.ArrayList;
import java.util.List;
import Entity.Student;


public class StudentDao {
	
	
	public List<Student> getallStudent(){

		List<Student> db = new ArrayList<Student>();
		
		db.add(new Student("Jay",1,88));
		db.add(new Student("Ashu",2,93));
		db.add(new Student("Ram",3,87));
		db.add(new Student("Viru",4,75));
		db.add(new Student("Raj",5,88));
		db.add(new Student("Gaurav",6,73));
		db.add(new Student("Jatin",7,92));
		db.add(new Student("Ramesh",8,88));
		db.add(new Student("Aniket",9,86));
		db.add(new Student("Suresh",10,73));
	
		
		return db;	
	}

}
