package org.wayfarr.webwayfarr.Services;

import org.wayfarr.webwayfarr.Entity.User;

public interface UserServices {

    User createUser(User user);
    User listUserForId(Integer id);
    User editUser(User user);
    void deleteUser(Integer id);

}
