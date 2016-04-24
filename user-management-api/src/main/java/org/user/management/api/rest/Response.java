package org.user.management.api.rest;

/**
 * Created by vano on 24.04.2016.
 */
public interface Response {

    String getStatus();
    String getMessage();
    Object getObject();
}
