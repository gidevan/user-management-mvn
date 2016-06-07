package org.user.management.domain;

import org.user.management.api.domain.UserInfo;

import java.util.Date;

/**
 * Created by vano on 23.04.2016.
 */
public class UserInfoImpl implements UserInfo {

    private String userName;
    private Date lastLogin;
    private String role;


    @Override
    public String getUserName() {
        return userName;
    }

    @Override
    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public Date getLastLogin() {
        return lastLogin;
    }

    @Override
    public void setLastLogin(Date lastLogin) {
        this.lastLogin = lastLogin;
    }

    @Override
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
