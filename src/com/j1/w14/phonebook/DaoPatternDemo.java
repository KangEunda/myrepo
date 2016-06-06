package com.j1.w14.phonebook;

public class DaoPatternDemo {
   public static void main(String[] args) {
      StudentDao studentDao = new StudentDaoImpl();

      //print all students
      for (Student student : studentDao.getAllStudents()) {
         System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + ", PhoneNumber : " 
                              + student.getPhoneNum() + ", Adress : " + student.getAdress() + " ]");
      }


      //update student
      Student student =studentDao.getAllStudents().get(0);
      student.setName("Jiyoung");
      student.setPhoneNum(44445555);
      student.setAdress("Gyenggi,Icheon");
      studentDao.updateStudent(student);

      //get the student
      studentDao.getStudent(0);
      System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + ", PhoneNumber : " 
                              + student.getPhoneNum() + ", Adress : " + student.getAdress() + " ]");  
   }
}