package org.user.management.api.dao;

import org.user.management.api.domain.UserInfo;

/**
 * Created by vano on 23.04.2016.
 */
public interface UserDao {

    UserInfo login(String login, String password) throws IllegalAccessException;
}
