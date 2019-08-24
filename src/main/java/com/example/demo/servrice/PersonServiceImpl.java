package com.example.demo.servrice;

import com.example.demo.dao.PersonMapper;
import com.example.demo.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    PersonMapper pm;


    @Override
    public List<Person> findAll() {
        return pm.findAll();
    }

    @Override
    public int get(int id) {
        return pm.get(id);
    }

    @Override
    public List<Person> update(Person person) {
        return pm.update(person);
    }


}
