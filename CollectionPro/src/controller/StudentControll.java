package controller;

import java.util.List;
import Entity.Student;
import Service.Studentservice;

public class StudentControll {

	Studentservice Service = null;

	public List<Student> getallStudentscontroller() {

		Service = new Studentservice();

		List<Student> db = Service.getAllStudentservice();

		return db;

	}

	public List<Student> getallStudentsListnamestartswith(String ch) {

		Service = new Studentservice();

		List<Student> db = Service.getallStudentsListnamestartswith(ch);

		return db;

	}

	public List<Student> getAllStudentMarksbelow90() {

		Service = new Studentservice();

		List<Student> db = Service.getAllStudentMarksbelow90();

		return db;

	}

	public List<Student> getAllStudentMarksAbove90() {

		Service = new Studentservice();

		List<Student> db = Service.getAllStudentMarksAbove90();

		return db;

	}

	public List<Student> getAllStudentMarksbelow90andadbove50() {

		Service = new Studentservice();

		List<Student> db = Service.getAllStudentMarksbelow90andadbove50();

		return db;

	}

	public List<Student> getAllStudentNamestartwithA() {

		Service = new Studentservice();

		List<Student> db = Service.getAllStudentNamestartwithA();

		return db;

	}

	public List<Student> getAllStudentsamemarks() {

		Service = new Studentservice();

		List<Student> db = Service.getAllStudentsamemarks();

		return db;

	}

	public List<Student> getAllStudentNameendwithH() {

		Service = new Studentservice();

		List<Student> db = Service.getAllStudentNameendwithH();

		return db;

	}

	public List<Student> getAllStudentMaxmarks() {

		Service = new Studentservice();

		List<Student> db = Service.getAllStudentMaxmarks();

		return db;

	}

	public List<Student> getAllStudentMinmarks() {

		Service = new Studentservice();

		List<Student> db = Service.getAllStudentMinmarks();

		return db;

	}

}
