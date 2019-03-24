package com.paloit.interview.service;

import com.paloit.interview.model.Role;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
//@DataJpaTest
public class RoleServiceTest {

    @Autowired
    private RoleService roleService;

    @Test
    public void should_save_role() {
        Role admin = roleService.newRole("admin");

        System.out.println("admin = " + admin);
    }


}