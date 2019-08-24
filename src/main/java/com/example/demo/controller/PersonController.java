package com.example.demo.controller;

import com.example.demo.servrice.PersonService;
import com.example.demo.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class PersonController {

    @Autowired
    PersonService ps;

    @RequestMapping("/findAll")
    public String find(Model model){

        List<Person> person=ps.findAll();

        model.addAttribute("person",person);

        return "list";
    }

    @RequestMapping("/get")
    public String get(int id,Model m){

        int result=ps.get(id);

        m.addAttribute(result);

        return "update";


    }
}
