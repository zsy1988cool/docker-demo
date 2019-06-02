package com.dockertest.demo.web;

import com.dockertest.demo.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = "test")
public class DemoController {

    @RequestMapping(value = "demo")
    public String demo() {
        return "demo";
    }

    @RequestMapping("/list")
    public String  listUser(Model model) {
        List<User> userList = new ArrayList<>();
        for (int i = 0; i <10; i++) {
            userList.add(new User(i,"张三"+ String.valueOf(i),20+i,"中国广州"));
        }

        model.addAttribute("users", userList);
        return "list";
    }
}
