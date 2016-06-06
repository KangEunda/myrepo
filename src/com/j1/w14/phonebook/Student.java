package com.j1.w14.phonebook;

public class Student {
   private String name;
   private int rollNo;
   private int phoneNum;
   private String adress;

   Student(String name, int rollNo, int phoneNum, String adress){
      this.name = name;
      this.rollNo = rollNo;
      this.phoneNum = phoneNum;
      this.adress = adress;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public int getRollNo() {
      return rollNo;
   }

   public void setRollNo(int rollNo) {
      this.rollNo = rollNo;
   }
   public int getPhoneNum(){
     return phoneNum;
   }
   public void setPhoneNum(int phoneNum){
     this.phoneNum = phoneNum;
   }
   public String getAdress(){
     return adress;
   }
   public void setAdress(String adress){
     this.adress = adress;
   }
}