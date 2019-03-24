package com.paloit.interview.service;

import com.paloit.interview.model.Role;
import com.paloit.interview.repository.RoleRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class RoleService {

    private final RoleRepository roleRepository;

    public RoleService(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    public Role newRole(String name) {
        Role role = new Role();
        role.setName(name);
        return doSave(role);
    }

    @Transactional
    Role doSave(Role role) {
        return roleRepository.save(role);
    }
}
