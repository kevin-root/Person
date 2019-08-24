package com.example.demo.servrice;

import com.example.demo.entity.Person;

import java.util.List;

public interface PersonService {

    public List<Person> findAll();

    public int get(int id);

    public List<Person> update(Person person);
}
