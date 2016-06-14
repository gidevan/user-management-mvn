package org.user.management.dao;

import org.springframework.stereotype.Repository;
import org.user.management.api.dao.UserDao;
import org.user.management.api.domain.UserInfo;
import org.user.management.domain.UserInfoImpl;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Repository
public class UserDaoImpl implements UserDao {

    private static final String WRONG_USER_INFO = "Login [{0}] or password [{1}] is wrong";

    private static List<User> users;

    static {
       users = new ArrayList<>();
       users.add(new User("User1", "Pass1", "admin"));
       users.add(new User("User2", "Pass2", "user"));
       users.add(new User("User3", "Pass3", "user"));
    }
    @Override
    public UserInfo login(String login, String password) throws IllegalAccessException {
        for(User user : users) {
            if(user.login.equals(login) && user.password.equals(password)) {
                UserInfo stored = new UserInfoImpl();
                stored.setUserName(user.login);
                stored.setLastLogin(new Date());
                stored.setRole(user.role);
                return stored;
            }
        }
        throw new IllegalAccessException(MessageFormat.format(WRONG_USER_INFO, login, password));

    }

    @Override
    public List<UserInfo> getUsers() {
        List<UserInfo> userInfos = new ArrayList<>();
        for(User user : users) {
            UserInfo userInfo = new UserInfoImpl();
            userInfo.setUserName(user.login);
            userInfo.setRole(user.role);
            userInfo.setPassword(user.password);
            userInfos.add(userInfo);
        }
        return userInfos;
    }

    private static class User {
        private String login;
        private String password;
        private String role;

        private User(String login, String password, String role) {
            this.login = login;
            this.password = password;
            this.role =role;
        }
    }
}
