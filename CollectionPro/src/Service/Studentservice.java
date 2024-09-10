package Service;

import java.util.ArrayList;
import java.util.List;
import Entity.Student;
import Student.Dao.StudentDao;

public class Studentservice {

	StudentDao dao = null;

	public List<Student> getAllStudentservice() {
		dao = new StudentDao();

		List<Student> db = dao.getallStudent();

		return db;

	}

	public List<Student> getallStudentsListnamestartswith(String ch) {

		List<Student> db1 = new ArrayList<Student>();

		dao = new StudentDao();

		List<Student> db = dao.getallStudent();

		for (Student st : db) {

			if (st.getName().startsWith(ch)) {
				db1.add(st);

			}
		}

		return db1;
	}

	public List<Student> getAllStudentMarksbelow90() {

		List<Student> db2 = new ArrayList<Student>();

		dao = new StudentDao();

		List<Student> db = dao.getallStudent();

		for (Student s : db) {
			if (s.getMarks() < 90) {
				db2.add(s);
			}
		}

		return db2;
	}

	public List<Student> getAllStudentMarksAbove90() {

		List<Student> db3 = new ArrayList<Student>();

		dao = new StudentDao();

		List<Student> db = dao.getallStudent();

		for (Student s : db) {
			if (s.getMarks() > 90) {
				db3.add(s);
			}
		}
		return db3;
	}

	public List<Student> getAllStudentMarksbelow90andadbove50() {

		List<Student> db4 = new ArrayList<Student>();

		dao = new StudentDao();

		List<Student> db = dao.getallStudent();

		for (Student s : db) {
			if (s.getMarks() < 90 && s.getMarks() > 50) {
				db4.add(s);
			}
		}

		return db4;
	}

	public List<Student> getAllStudentNamestartwithA() {

		List<Student> db5 = new ArrayList<Student>();

		dao = new StudentDao();

		List<Student> db = dao.getallStudent();

		for (Student s : db) {
			if (s.getName().startsWith("A")) {
			}
		}

		return db5;
	}

	public List<Student> getAllStudentsamemarks() {

		List<Student> db6 = new ArrayList<Student>();

		dao = new StudentDao();

		List<Student> db = dao.getallStudent();

		for (Student s : db) {
			if (s.getMarks() == 88) {
				db6.add(s);
			}
		}
		return db6;
	}

	public List<Student> getAllStudentNameendwithH() {

		List<Student> db7 = new ArrayList<Student>();

		dao = new StudentDao();

		List<Student> db = dao.getallStudent();

		for (Student s : db) {
			if (s.getName().endsWith("h")) {
			}
		}

		return db7;
	}

//	public List<Student> getAllStudentrollinDesend() {
//
//		List<Student> db8 = new ArrayList<Student>();
//
//		dao = new StudentDao();
//
//		List<Student> db = dao.getallStudent();
//
//		for (Student s : db) {
//			for (int i = 0; i < s.getRoll(); i++) {
//				for (int j = i; j < s.getRoll(); j++) {
//					if(s.getRoll() < s.getRoll()) {
//						
//					}
//
//				}
//
//			}
//		}
//		return db8;
//	}

	public List<Student> getAllStudentMaxmarks() {

		List<Student> db9 = new ArrayList<Student>();

		dao = new StudentDao();

		List<Student> db = dao.getallStudent();

		int max = db.get(0).getMarks();
		for (Student s : db) {
			if (s.getMarks() > max) {
				max = s.getMarks();
			}
		}

		for (Student s : db) {
			if (s.getMarks() == max) {
				db9.add(s);
			}
		}

		return db9;
	}

	public List<Student> getAllStudentMinmarks() {

		List<Student> db10 = new ArrayList<Student>();

		dao = new StudentDao();

		List<Student> db = dao.getallStudent();

		int min = db.get(0).getMarks();
		for (Student s : db) {
			if (s.getMarks() < min) {
				min = s.getMarks();
			}
		}

		for (Student s : db) {
			if (s.getMarks() == min) {
				db10.add(s);
			}
		}

		return db10;
	}
}
