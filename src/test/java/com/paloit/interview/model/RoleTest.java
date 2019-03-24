package com.paloit.interview.model;

import org.junit.Test;

import java.util.HashSet;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class RoleTest {

    @Test
    public void shoul_find_admin() {

        var admin = new Role();
        admin.setId(1L);

        var roles = new HashSet<>(List.of(admin));

        admin.setName("ADMINISTRATOR");

        assertThat(
                roles
        ).hasSize(1);

        assertThat(
                roles.contains(admin)
        ).isTrue();

    }


}