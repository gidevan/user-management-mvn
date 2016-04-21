package org.user.management.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class UserManagementController {

    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }
}
