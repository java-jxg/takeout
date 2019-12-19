package com.takeout.repository;

import com.takeout.entity.User;

public interface UserRepository {
    public User login(String username, String password);
}
