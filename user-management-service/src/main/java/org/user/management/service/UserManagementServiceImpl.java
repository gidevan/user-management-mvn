package org.user.management.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.user.management.api.dao.UserDao;
import org.user.management.api.domain.UserInfo;
import org.user.management.api.service.UserManagementService;

import java.util.List;

/**
 * Created by vano on 23.04.2016.
 */
@Service
public class UserManagementServiceImpl implements UserManagementService {

    @Autowired
    private UserDao userDao;

    private List<UserInfo> users;

    @Override
    public boolean login(String user, String password) {
        return false;
    }


}
