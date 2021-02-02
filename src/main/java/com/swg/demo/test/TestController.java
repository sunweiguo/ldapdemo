package com.swg.demo.test;

import com.swg.demo.bean.Person;
import com.swg.demo.dao.IPersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ldap.core.LdapTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    private IPersonRepo personRepo;


    @RequestMapping("/ldap")
    public List<Person> test(){
        return personRepo.getAllPersons();
    }

}

