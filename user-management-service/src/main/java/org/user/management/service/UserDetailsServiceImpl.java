package org.user.management.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.user.management.api.dao.UserDao;
import org.user.management.api.domain.UserInfo;

import java.util.List;

/**
 * Created by ivan on 3.6.16.
 */
@Service("userDetailsService")
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserDao userDao;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        List<UserInfo> users = userDao.getUsers();
        for(UserInfo user : users) {
            if (user.getUserName().equals(username)) {
                //UserDetails details = new Use
            }
        }
        return null;
    }
}
