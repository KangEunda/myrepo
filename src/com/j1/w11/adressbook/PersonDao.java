package com.j1.w11.adressbook;

import java.util.List;

public interface PersonDao{
  public List<Person> getAllPeople();
  public Person getPerson(String num);
  public void updatePerson(Person person);
  public void deletePerson(Person person);
}
