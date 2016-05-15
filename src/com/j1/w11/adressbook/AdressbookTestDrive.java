package com.j1.w11.adressbook;

public class AdressbookTestDrive{
  public static void main(String[] args){
    PersonDao personDao = new PersonDaoImp1();
    
    for (Person person : personDao.getAllPeople()){
      System.out.println("Person : [phoneNumber : " + person.getNum()+", Name : " + person.getName()+" ]");
    }
    
    Person person = personDao.getAllPeople().get(0);
    person.setName("ParkSujin");
    personDao.updatePerson(person);
    
    personDao.getPerson("ParkSujin");
    System.out.println("Person : [PhoneNumber : " + person.getNum() + ", Name : " + person.getName()+" ]");
  }
}