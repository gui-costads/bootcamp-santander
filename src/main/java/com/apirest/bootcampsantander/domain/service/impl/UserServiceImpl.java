package com.apirest.bootcampsantander.domain.service.impl;

import com.apirest.bootcampsantander.domain.exception.UserAlreadyExistsException;
import com.apirest.bootcampsantander.domain.exception.UserNotFoundByIdException;
import com.apirest.bootcampsantander.domain.model.User;
import com.apirest.bootcampsantander.domain.repository.UserRepository;
import com.apirest.bootcampsantander.domain.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(() ->
                              new UserNotFoundByIdException("User id not found"));
    }

    @Override
    public User createUser(User userToCreate) {

        if (userToCreate.getId() != null && userRepository.existsById(userToCreate.getId())) {
            throw new UserAlreadyExistsException("User is already exists");
        }
        return userRepository.save(userToCreate);
    }

    @Override
    public User updateUser(User user, Long id) {
        User userToUpdate = userRepository.findById(id).orElseThrow(()
                                           -> new UserNotFoundByIdException("User id not found"));
        userToUpdate.setName(user.getName());
        userToUpdate.setAccount(user.getAccount());
        userToUpdate.setCard(user.getCard());

        return userRepository.save(userToUpdate);
    }

    @Override
    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }
}
