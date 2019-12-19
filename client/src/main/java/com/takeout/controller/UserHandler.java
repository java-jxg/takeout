package com.takeout.controller;

import com.takeout.entity.User;
import com.takeout.entity.UserVO;
import com.takeout.feign.UserFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/user")
public class UserHandler {

    @Autowired
    private UserFeign userFeign;


    @GetMapping("/findAll")
    @ResponseBody
    public UserVO findAll(@RequestParam("page") int page, @RequestParam("limit") int limit){
        return userFeign.findAll(page, limit);
    }

    @PostMapping("/save")
    public String save(User user){
        userFeign.save(user);
        return "redirect:/user/redirect/user_manage";
    }

    @GetMapping("/deleteById/{id}")
    public String deleteById(@PathVariable("id") long id){
        userFeign.deleteById(id);
        return "redirect:/user/redirect/user_manage";
    }

    @GetMapping("/redirect/{location}")
    public String redirect(@PathVariable("location") String location){
        return location;
    }
}