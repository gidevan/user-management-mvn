package org.user.management.rest;

import org.user.management.api.rest.Response;

/**
 * Created by vano on 24.04.2016.
 */
public class ResponseImpl implements Response {

    private String status;
    private String message;
    private Object object;

    public ResponseImpl(String status, String message, Object object) {
        this.status = status;
        this.message = message;
        this.object = object;
    }

    @Override
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }
}
