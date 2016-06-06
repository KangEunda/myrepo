package com.j1.w14.phonebook;

import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDao {
 
   //list is working as a database
   List<Student> students;

   public StudentDaoImpl(){
      students = new ArrayList<Student>();
      Student student1 = new Student("Robert",0,01011112222,"Seoul,Hongje");
      Student student2 = new Student("John",1,01022223333,"Seoul,Jongro");
      Student student3 = new Student("Eunda",2,01033334444,"Jeju,Yeondong");
      students.add(student1);
      students.add(student2);  
      students.add(student3);
   }
   @Override
   public void deleteStudent(Student student) {
      students.remove(student.getRollNo());
      System.out.println("Student: Roll No " + student.getRollNo() + ", deleted from database");
      students.remove(student.getPhoneNum());
      System.out.println("Student: PhoneNumber" + student.getPhoneNum() + ".deleted from database");
      students.remove(student.getAdress());
      System.out.println("Student: Adress" + student.getAdress() + ".deleted from database");
   }

   //retrive list of students from the database
   @Override
   public List<Student> getAllStudents() {
      return students;
   }

   @Override
   public Student getStudent(int rollNo) {
      return students.get(rollNo);
   }

   @Override
   public void updateStudent(Student student) {
      students.get(student.getRollNo()).setName(student.getName());
      System.out.println("Student: Roll No " + student.getRollNo() + ", updated in the database");
      students.get(student.getPhoneNum()).setPhoneNum(student.getPhoneNum());
      System.out.println("Student: Phone Number " + student.getRollNo() + ", updated in the database");
      students.get(Integer.parseInt(student.getAdress())).setAdress(student.getAdress());
      System.out.println("Student: Adress " + student.getAdress() + ", updated in the database");
   }
}