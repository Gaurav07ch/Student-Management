package Clients;

import java.util.List;
import Entity.Student;
import controller.StudentControll;

public class Testcontroller {

	public static void main(String[] args) {

		StudentControll s = new StudentControll();
		System.out.println("*****************************************************************");
		List<Student> db = s.getallStudentscontroller();

		System.out.println(db);
		System.out.println();
		
		System.out.println("*****************************************************************");
		List<Student> db1 = s.getAllStudentMarksAbove90();

		System.out.println(db1);
		System.out.println();
		
		System.out.println("*****************************************************************");
		List<Student> db2 = s.getAllStudentMarksbelow90();

		System.out.println(db2);
		System.out.println();
		
		System.out.println("*****************************************************************");
		List<Student> db3 = s.getAllStudentMarksbelow90andadbove50();

		System.out.println(db3);
		System.out.println();
		
		System.out.println("*****************************************************************");
		List<Student> db4 = s.getAllStudentMaxmarks();

		System.out.println(db4);
		System.out.println();

		System.out.println("*****************************************************************");
		List<Student> db5 = s.getAllStudentMinmarks();

		System.out.println(db5);
		System.out.println();
		
		System.out.println("*****************************************************************");
		List<Student> db6 = s.getAllStudentNamestartwithA();

		System.out.println(db6);
		System.out.println();
		
		System.out.println("*****************************************************************");
		List<Student> db7 = s.getAllStudentNameendwithH();

		System.out.println(db7);
		System.out.println();
		
		System.out.println("*****************************************************************");
		List<Student> db9 = s.getAllStudentsamemarks();

		System.out.println(db9);
		System.out.println();
		
		System.out.println("*****************************************************************");
		List<Student> db10 = s.getallStudentsListnamestartswith("A");

		System.out.println(db10);
		System.out.println();
	}

}