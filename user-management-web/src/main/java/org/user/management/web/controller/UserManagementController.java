package org.user.management.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.user.management.api.domain.UserInfo;
import org.user.management.api.rest.Response;
import org.user.management.api.rest.ResponseStatus;
import org.user.management.api.service.UserManagementService;
import org.user.management.rest.ResponseImpl;

import java.util.List;

@Controller
@RequestMapping("/")
public class UserManagementController {

    @Autowired
    private UserManagementService userManagementService;

    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }

    @RequestMapping("/login/{user}/{password}")
    @ResponseBody
    public Response login(@PathVariable String user, @PathVariable String password) {
        try {
            UserInfo userInfo = userManagementService.login(user, password);
            return createResponse(ResponseStatus.SUCCESS, userInfo);
        } catch (IllegalAccessException e) {
            return createResponse(ResponseStatus.ACCESS_ERROR, e.getMessage());
        }
    }

    @RequestMapping("/users")
    @ResponseBody
    public Response getUsers() {
        return  createResponse(ResponseStatus.SUCCESS, userManagementService.getUsers());
    }

    private Response createResponse(ResponseStatus status, Object object) {
        Response response = new ResponseImpl(status.toString(), status.toString(), object);
        return response;
    }
}
