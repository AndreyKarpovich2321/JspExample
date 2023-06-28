package by.karpovich.jspexample.service;

import by.karpovich.jspexample.model.Person;

import java.util.List;
import java.util.stream.Collectors;

public interface PersonService {
    public static void save(Person person){
        persons.add(person);
    }
    public static List<Person> findAll(){
        return persons;
    }
    public static List<Person> findByName(String name){
        return persons.stream().filter(person -> person.getName().equals(name)).collect(Collectors.toList());
    }
}
