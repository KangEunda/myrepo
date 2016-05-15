package com.j1.w11.adressbook;

import java.util.ArrayList;
import java.util.List;

public class PersonDaoImp1 implements PersonDao{
  
  List<Person> people;
  
  public PersonDaoImp1(){
    people = new ArrayList<Person>();
    Person person1 = new Person("KangEunda","01011112222");
    Person person2 = new Person("KimJiyoung","01022223333");
    people.add(person1);
    people.add(person2);
  }
  @Override
  public void deletePerson(Person person){
    people.remove(person.getNum());
    System.out.println(person.getName()+" phonenumber : "+ person.getNum()+"delete from database.");
  }
  
  @Override
  public List<Person> getAllPeople(){
    return people;
  }
  
  @Override
  public Person getPerson(String num){
    int numInt = Integer.parseInt(num);
    return people.get(numInt);
  }
  
  @Override
  public void updatePerson(Person person){
    int numInt = Integer.parseInt(person.getNum());
    people.get(numInt).setName(person.getName());
    System.out.println(person.getName() + " phonenumber : "+person.getNum() + "updated in the database");
  }
}