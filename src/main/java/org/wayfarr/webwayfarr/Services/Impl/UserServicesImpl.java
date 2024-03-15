package org.wayfarr.webwayfarr.Services.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.wayfarr.webwayfarr.Entity.User;
import org.wayfarr.webwayfarr.Repositories.UserRepository;
import org.wayfarr.webwayfarr.Services.UserServices;

@Service
public class UserServicesImpl implements UserServices {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User listUserForId(Integer id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public User editUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public void deleteUser(Integer id) {
        userRepository.deleteUser(id);
    }
}
