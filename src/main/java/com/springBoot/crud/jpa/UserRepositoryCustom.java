package com.springBoot.crud.jpa;

import com.springBoot.crud.model.User;

import java.util.List;

public interface UserRepositoryCustom {
    List<User> findActiveUsers();
}
