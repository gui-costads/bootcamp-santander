package com.apirest.bootcampsantander.domain.service;

import com.apirest.bootcampsantander.domain.model.User;

public interface UserService{
    User findById(Long id);
    User createUser(User user);
    User updateUser(User user, Long id);
    void deleteById(Long id);
}
