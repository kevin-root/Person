package com.example.demo.dao;

import com.example.demo.entity.Person;

import java.util.List;

public interface PersonMapper {

    public List<Person> findAll();

    public int get(int id);

    public List<Person> update(Person person);

}
