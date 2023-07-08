package by.karpovich.jspexample.service;

import by.karpovich.jspexample.model.Person;

import java.util.List;
import java.util.stream.Collectors;

public interface PersonService {
    void save(Person person);
    List<Person> findAll();
    List<Person>findByName(String name);
}