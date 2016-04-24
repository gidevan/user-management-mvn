package org.user.management.api.service;


import org.user.management.api.domain.UserInfo;

import java.util.List;

public interface UserManagementService {

    UserInfo login(String user, String password) throws IllegalAccessException;

    List<UserInfo> getUsers();
}
