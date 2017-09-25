package com.ssm.taotao.service;

import com.ssm.taotao.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

public class UserService {
    @Autowired
    private UserService userService;
    @RequestMapping("/login")
    @ResponseBody
    public User getNameById(){
      List<User>list= (List<User>) userService.getNameById();
      if(list!=null ){
          for (User i:list){
              System.out.println( i );
          }
      }
      return (User) list;

    }
}
