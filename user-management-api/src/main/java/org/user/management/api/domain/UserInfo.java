package org.user.management.api.domain;

import java.util.Date;

/**
 * Created by vano on 23.04.2016.
 */
public interface UserInfo {
    String getUserName();
    void setUserName(String userName);
    Date getLastLogin();
    void setLastLogin(Date lastLogin);
}
