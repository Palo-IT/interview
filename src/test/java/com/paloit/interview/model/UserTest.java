package com.paloit.interview.model;

import org.junit.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static java.util.stream.Collectors.toSet;
import static org.assertj.core.api.Assertions.assertThat;

public class UserTest {


    @Test
    public void should_find_bob() {
        var users = List.of(new User(1L, "Bob"));

        assertThat(
                users
        ).contains(
                new User(1L, "Bob")
        );
    }

    @Test
    public void should_remove_dupes() {
        var users = asList(
                new User(1L, "Bob"),
                new User(1L, "Bob")
        );

        assertThat(
                users
        ).hasSize(2);

        var users2 = users.stream().collect(toSet());

        assertThat(
                users2
        ).hasSize(1);
    }
}